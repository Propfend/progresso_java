import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        // funções matemáticas:

        Scanner x = new Scanner(System.in);
        System.out.println("digite um número: ");
        String a = x.nextLine();
        System.out.println("digite outro número: ");
        String b = x.nextLine();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println(a + " + " +  b + " = " + (c+d));
        System.out.println(a + " - " +  b + " = " + (c-d));
        System.out.println(a + " x " +  b + " = " + (c*d));
        System.out.println(a + " % " +  b + " = " + (c/d));
        System.out.println(a + " ^ " +  b + " = " + Math.pow(c, d));
        System.out.println(c + " arredondado para cima é: " + Math.ceil(c));
        System.out.println(d + " arredondado para cima é: " + Math.ceil(d));
        System.out.println(c + " arredondado para baixo é: " + Math.ceil(c));
        System.out.println(d + " arredondado para baixo é: " + Math.ceil(d));
        System.out.println("o módulo de "+ c + " é " + Math.abs(c));
        System.out.println("o módulo de "+ d + " é " + Math.abs(d));
    }
}
