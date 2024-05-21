import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci prima stringa: ");
        String primaStringa =sc.nextLine();
        System.out.println("Inserisci seconda stringa: ");
        String secondaStringa =sc.nextLine();
        System.out.println("Inserisci terza stringa: ");
        String terzaStringa = sc.nextLine();

        System.out.println(primaStringa + " " + secondaStringa + " " + terzaStringa);
        System.out.println(terzaStringa + " " + secondaStringa + " " + primaStringa);
        sc.close();
    }
}
