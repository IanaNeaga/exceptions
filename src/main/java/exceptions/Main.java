package exceptions;

import java.net.ConnectException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Deschid conexiune la baza de date");
        //citit dintr-o baza de date
        int numarClienti = 10;

        //citit din raport economic din aplicatia Y
        int profitNetObtinut = 100000;

        System.out.println("Calculez profit per client");
        try {
            if (numarClienti == 0) {
                throw new SQLException("No clients");
            }

            if (profitNetObtinut == 0) {
                throw new ConnectException("Missing connection");
            }
            int profitPerClient = profitNetObtinut / numarClienti;
            System.out.println("Profitul este: " + profitPerClient);
        } catch (SQLException sqle) {
            System.out.println("Ceva nu a mers in conexiunea la db");
            System.out.println("Inchid conexiunea");
        } catch (ConnectException ce){
            System.out.println("Ceva nu a mers in conexiunea cu raportul");
            System.out.println("Inchid conexiune cu raport");
        } catch (Exception e) {
            System.out.println("Ceva a mers foarte prost:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inchid db");
        }

            //acolada de la try
//        } catch (SQLException | ConnectException) {
//
//        }

        System.out.println("Inchei executie");
    }
}