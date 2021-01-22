package DamiencD;

import java.util.*;

public class Employee extends Personne{
    Scanner clavier=new Scanner(System.in);
    private float salaire;
    private String NomEntreprise;

    Employee(){
        super();
        setNomEntreprise();
        setSalaire();
    }

    Employee(int tempSalaire){
        super();
        this.salaire=tempSalaire;
    }

    public void setNomEntreprise(){
        System.out.print("Entrer le nom de l'entreprise: ");
        NomEntreprise=clavier.nextLine();
    }

    public String getNomEntreprise(){
        return NomEntreprise;
    }

    public float getSalaire() {
        return this.salaire;
    }

    public void setSalaire() {
        float tempSetSalaire=0.0f;
        System.out.print("Entrer le salaire de départ du salarié (doit être superieur à 1500): ");
        tempSetSalaire=clavier.nextFloat();
        while (tempSetSalaire<1500){
            System.out.print("Entrer le salaire de départ du salarié (doit être superieur à 1500): ");
            tempSetSalaire=clavier.nextFloat();
        }
        this.salaire = tempSetSalaire;
    }

    public String getProE_mail(){
        return this.getFirstName()+"."+this.getLastName()+"@"+this.getNomEntreprise()+".com";
    }

}
