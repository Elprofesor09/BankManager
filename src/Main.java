public class Main {
    public static void main(String[] args) {
        // Compte courant
        CheckingAccount checking = new CheckingAccount();
        checking.account = "CC001";
        checking.balance = 250000;
        checking.limit = 50000;

        // Compte épargne
        SavingsAccount savings = new SavingsAccount();
        savings.account = "SA001";
        savings.balance = 150000;
        savings.interestRate = 0.05;

        // Certificat de dépôt
        COD cod = new COD();
        cod.account = "CD001";
        cod.balance = 500000;
        cod.duration = 12;

        // Affichage
        System.out.println("Compte courant : " + checking.account + ", Solde : " + checking.balance + ", Limite : " + checking.limit);
        System.out.println("Compte épargne : " + savings.account + ", Solde : " + savings.balance + ", Taux : " + savings.interestRate);
        System.out.println("COD : " + cod.account + ", Solde : " + cod.balance + ", Durée : " + cod.duration + " mois");
    }
}
