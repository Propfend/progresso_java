import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("quantos anos você tem?: ");
        String b = a.nextLine();
        System.out.println("quantos meses você tem?: ");
        String c = a.nextLine();
        System.out.println("Quantos dias você tem?: ");
        String d = a.nextLine();
        System.out.println("Você tem "+ (((365 * Integer.parseInt(b)) + 30 * Integer.parseInt(c)) + Integer.parseInt(d)) +" dias de vida");
    }
}
