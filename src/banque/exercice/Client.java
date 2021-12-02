package banque.exercice;

import java.lang.reflect.Array;
import java.util.List;

public class Client {
    private String nom;
    private Compte compte;
    Compte [] comptes = new Compte[100];
    private int nbComptes;

    public Client( String nom) {
        this.nom = nom;
    }

    public Client() {

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public Compte[] getComptes() {
        return this.comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void getSlode(){
        float solde = 0;
        for (int i =0; i<nbComptes; i++){
            solde += this.comptes[i].getSolde();

        }
    }

    public int getNbCompte() {

        return this.nbComptes;
    }

    public void afficherSolde(){

        System.out.println("le solde de votre compte est : " + this.compte.getSolde());
    }



    public void ajouterCompte(){
        comptes[nbComptes] = new Compte();
        nbComptes = nbComptes ++;
    }
    


}
