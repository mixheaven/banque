package banque.exercice;



import java.util.Scanner;

public class Compte {
    private int numero;
    private float solde;

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

    public void depot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez le montant de votre dépôt :");
        float valeur = scanner.nextFloat();
        solde = valeur + getSolde();

        this.solde = solde;
        scanner.close();

    }
    public void retrait(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez le montant de votre retrait :");
        float valeur = scanner.nextFloat();

        solde =  getSolde() - valeur ;
        this.solde = solde;
        scanner.close();

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
            depot();

        }else{
            System.out.println("veuillez saisir un commpte existant, ou abandonnez le vivrement : ");

        }

    }
}
