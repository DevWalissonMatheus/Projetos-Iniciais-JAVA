package pathex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        String M = "M";
        String F = "F";

        System.out.println("Qual o seu sexo?");

        Scanner sx = new Scanner(System.in);
        System.out.print("Insira M para Masculino ou F para Feminino: ");
        String vrf = sx.next();

        if (vrf.equalsIgnoreCase(M)) {
            System.out.println("Sexo Válido!");
        } else if (vrf.equalsIgnoreCase(F)) {
            System.out.println("Sexo Válido!");
        } else {
            System.out.println("Sexo Inválido!");
        }

        sx.close();
    }
}
