package banque.exercice;

public class Main {
    public static void main(String[] args) {

       Compte client1 = new Compte();
       client1.setNumero(1);
       client1.setSolde(120);

       client1.afficherSolde();
        System.out.println(client1);
    }
}
