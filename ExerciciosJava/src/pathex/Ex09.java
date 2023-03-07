package pathex;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira o seu peso (kg): ");
        float peso = ent.nextFloat();

        System.out.print("Insira a sua altura (m): ");
        float altura = ent.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);

        ent.close();
    }
}
