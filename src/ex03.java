import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("qual é a sua idade?: ");
        String b = a.nextLine();
        System.out.println("a sua idade + 1 é " + (1 + Integer.parseInt(b)));
    }
}
