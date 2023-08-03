import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("primeiro número: ");
        String a = p.nextLine();
        System.out.println("segundo número: ");
        String b = p.nextLine();
        JOptionPane.showMessageDialog(null, a + b, "soma de " + a + " e " + b, JOptionPane.INFORMATION_MESSAGE);
    }
}
