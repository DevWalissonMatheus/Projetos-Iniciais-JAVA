package Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int valor1;
        int valor2;

        Scanner sc = new Scanner(System.in);

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior");
        }
    sc.close();

    }
}
