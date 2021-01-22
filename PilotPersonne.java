package DamiencD;

import java.util.*;

public class PilotPersonne {
    public static void main(String[] args) {
        int i, tailleTabPerson, tailleTabClient;
        int ID;
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrer la taille de l'effectif de l'entreprise: ");
        tailleTabPerson=clavier.nextInt();
        Employee [] TabEmployee=new Employee[tailleTabPerson];
        for(i=0; i<TabEmployee.length; ++i){
            TabEmployee[i]=new Employee();
        }
        for(i=0; i<TabEmployee.length; ++i){
            System.out.printf("Nom %S, Prenom %s \n e-mail %s  salaire %.2f \n", TabEmployee[i].getLastName(),
                    TabEmployee[i].getFirstName(), TabEmployee[i].getE_mail(), TabEmployee[i].getSalaire());
        }
        Employee emppA=new Employee(1650);
        System.out.printf("Nom %S, Prenom %s \n e-mail %s  salaire %.2f \n", emppA.getLastName(),
                emppA.getFirstName(), emppA.getE_mail(), emppA.getSalaire());
        System.out.print("Entre le nombre de client: ");
        tailleTabClient=clavier.nextInt();
        Client [] TabClient=new Client[tailleTabClient];
        for(i=0; i<TabClient.length; ++i){
            TabClient[i]=new Client();
        }
        for(i=0; i<TabClient.length; ++i){
            System.out.printf("Client: %d\t Nom: %S, Prenom: %s \n e-mail: %s\n", Client.getID_Client(), TabClient[i].getLastName(),
                    TabClient[i].getFirstName(), TabClient[i].getE_mail());
        }
    }
}
