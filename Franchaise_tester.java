public class Franchaise_tester {
    public static void main(String[] args){
        Franchise f1 = new Franchise();
        Franchise f2 = new Franchise();

        f1.initializeFranchise("Deca Limited", 3, 500.0);
        f2.initializeFranchise("Strikers", 2, 1000.0);

        System.out.println("1 ==========");
        f1.teamDetails();

        System.out.println("2 ==========");
        f2.signPlayer("Rohan", 10, 400.0);
        f2.signPlayer("Qais", 17, 450.0);
        f2.teamDetails();

        System.out.println("3 ==========");
        f2.signPlayer("Rabbi", 5, 100.0);

        System.out.println("4 ==========");
        f1.signPlayer("Roudro", 7, 200.0);
        f1.signPlayer("Ahnas", 7, 150.0);
        f1.signPlayer("Ahnaf", 11, 400.0);

        System.out.println("5 ==========");
        f1.increaseBudget(200.0);
        f1.signPlayer("Ahnaf", 11, 400.0);

        System.out.println("6 ==========");
        f1.teamDetails();
    }
}