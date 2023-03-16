package pathex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        int dados[] = new int[10];

        Scanner num = new Scanner(System.in);

        for (int i = 0; i < dados.length; i++) {
            System.out.print("Digite o valor que ficará na posição " + (i + 1) + ": ");

            int temp = num.nextInt();
            if (temp < 0) {
                System.out.println("O valor " + temp + " é negativo então será desconsiderado!");
            } else if (temp == 0) {
                break;
            } else {
                dados[i] = temp;
            }

            dados[i] = temp;
        }
        int maior = 0;
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] > maior) {
                maior = dados[i];
            }
        }
        if (maior == 0) {
            System.out.println("Como você digitou Zero, encerraremos o programa!");
        } else
            System.out.print("O maior valor é " + maior + "\n");

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < dados.length; i++) {
            if ((dados[i] < menor) && (dados[i] != 0)) {
                menor = dados[i];
            }
        }
        if (menor == 0) {
            System.out.println("Como você digitou Zero, encerraremos o programa!");
        } else if (menor == Integer.MAX_VALUE) {
            System.out.print("Você não digitou nenhum valor! \n");
        } else
            System.out.print("O menor valor é " + menor + "\n");

        System.out.print("Programa encerrado.");

        num.close();
    }
}
