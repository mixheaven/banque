package banque.exercice;

import java.util.List;

public class Client {
    private String nom;
    private Compte compte;
    private Compte [] comptes;

    public Client( String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }



    public Compte getCompte() {
        return compte;
    }

    public void getSlode(){
        float value = compte.getSolde();
    }

    public void afficherSolde(){

        System.out.println("le solde de votre compte est : " + compte.getSolde());
    }



}
