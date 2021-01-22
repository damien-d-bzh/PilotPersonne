package DamiencD;

import java.util.Scanner;

public class Client extends Personne{
    Scanner clavier=new Scanner(System.in);
    private static int ID_Client=0;
    public Client() {
        super();
    }

    public static int getID_Client(){
        return ++ID_Client;
    }
}
