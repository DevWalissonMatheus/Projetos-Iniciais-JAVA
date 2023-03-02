package pathex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int idade1=0;
        int idade2=0;

        int dif1;
        int dif2;

        Scanner idd1 = new Scanner(System.in);
        System.out.print("Insira a primeira idade: ");
        idade1 = idd1.nextInt();

        Scanner idd2 = new Scanner(System.in);
        System.out.print("Insira a segunda idade: ");
        idade2 = idd2.nextInt();

        dif1 = idade1 - idade2;
        dif2 = idade2 - idade1;

        if (idade1 > idade2) {
            System.out.println("A diferença é de " + dif1 + " anos");
        } else if (idade2 > idade1) {
            System.out.println("A diferença é de " + dif2 + " anos");
        }


    idd1.close();
    idd2.close();
    }
}
