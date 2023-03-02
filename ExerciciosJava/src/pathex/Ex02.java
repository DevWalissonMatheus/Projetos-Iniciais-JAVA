package pathex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int valor1;
        int valor2;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        valor1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Insira o segundo número: ");
        valor2 = sc2.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro número é maior!");
        } else {
            System.out.println("O segundo número é maior!");
        }

    sc1.close();
    sc2.close();

    }
}
