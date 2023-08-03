import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("qual a sua idade?: ");
        String b = a.nextLine();
        System.out.println("qual o seu número preferido?: ");
        String c = a.nextLine();
        System.out.println("a soma do seu número preferido com a sua idade é de: " + (Integer.parseInt(b) + Integer.parseInt(c)));
    }
}
