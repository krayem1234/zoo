import java.util.Scanner;

class ZooManagement {
    int nbrCages = 20;
    String zooName = "My Zoo";

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " - Cages: " + zm.nbrCages);

        Scanner scanner = new Scanner(System.in);
        ZooManagement zm1 = new ZooManagement();


        System.out.println("Entrez le nombre de cages:");
        zm1.nbrCages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez le nom du zoo:");
        zm1.zooName = scanner.nextLine();
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages + " cages.");
    }
}
