package pathex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        int rest = 0;

        Scanner div1 = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        num1 = div1.nextInt();

        Scanner div2 = new Scanner(System.in);
        System.out.print("Insira o segundo número: ");
        num2 = div2.nextInt();

        double calc = (((double) num1) / num2);
        rest = num1 % num2;

        if (rest == 0) {
            System.out.println("É um divisor!");
        } else
            System.out.println("Não é um divisor!");

        div1.close();
        div2.close();
    }
}
