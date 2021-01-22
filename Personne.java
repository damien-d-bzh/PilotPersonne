package DamiencD;

import java.util.*;

public class Personne{
    Scanner clavier=new Scanner(System.in);
    private String FirstName;
    private String LastName;
    private String DomainName;
    private String E_mail;

    public Personne(){
        setLastName();
        setFirstName();
        setPersoE_mail();
    }

    public void setFirstName(){
        String tempFirstName=null;
        System.out.print("Entrer le prenom de la personne: ");
        tempFirstName=clavier.nextLine();
        while (tempFirstName==null){
            System.out.print("Entrer le prenom de la personne: ");
            tempFirstName=clavier.nextLine();
        }
        // Il faudrait faire appel à des expression régulières pour s'assurer qie la saisie correspond
        // du prenom d'une personne, à mettre ne place par la suite.
        this.FirstName=tempFirstName;
    }

    public String getFirstName(){
        return this.FirstName;
    }

    public void setLastName(){
        String tempLastName=null;
        System.out.print("Entrer le nom de de personne: ");
        tempLastName=clavier.nextLine();
        while (tempLastName==null){
            System.out.print("Entrer le nom de de personne: ");
            tempLastName=clavier.nextLine();
        }
        // Remarque identique à celle ci-dessus pour ce qui est de l'usage des expressions regulières...
        this.LastName=tempLastName;
    }

    public String getLastName(){
        return this.LastName;
    }

    public void setPersoE_mail(){
        System.out.print("Entrer le Doamin Name: ");
        DomainName=clavier.nextLine();
        // La manière dont je vais mettre en place lemail pour chaque personne est un parti pris.
        // même remarque que ci-dessu
        while(DomainName.equals(null)){
            System.out.print("Entrer le Doamin Name: ");
            DomainName=clavier.nextLine();
        }
        this.E_mail= this.FirstName+"."+this.LastName+"@"+this.DomainName+".com";
    }

    public String getE_mail(){
        return this.E_mail;
    }
}