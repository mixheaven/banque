package banque.exercice;



import java.util.Scanner;

public class Compte {
    private int numero;
    private float solde = 120;


    Compte (){

    }
    // getter and setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    //Methods

    public void depot(float valeur){
        this.solde = valeur + getSolde();

    }
    public void retrait(float valeur){


        this.solde =  getSolde() - valeur;


    }
    public void afficherSolde(){
        System.out.println("le solde de votre compte est : " + this.solde);
    }

    public void virer(float valeur, int destinataire){
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez rentrer le numéro de compte pour le vivrement du client : ");
        destinataire = scanner.nextInt();
        if (destinataire == getNumero()){
            System.out.println("Vous effectuez un virement sur le compte : " + getNumero());
            depot(valeur);

        }else{
            System.out.println("veuillez saisir un commpte existant, ou abandonnez le vivrement : ");

        }

    }
}
