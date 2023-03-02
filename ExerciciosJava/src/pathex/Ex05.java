package pathex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner idd = new Scanner(System.in);
        System.out.print("Insira sua idade -> ");
        int idade = idd.nextInt();
        int dias = idade * 365;
        int horas = dias * 24;
        int min = horas * 60;
        int seg = min * 60;
    
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você viveu " + dias + " dias");
        System.out.println("Você viveu " + horas + " horas");
        System.out.println("Você viveu " + min + " minutos");
        System.out.println("Você viveu " + seg + " segundos");

        
    
    

idd.close();
    }
}
