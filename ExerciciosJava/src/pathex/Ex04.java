package pathex;

public class Ex04 {
    public static void main(String[] args) {
		double valor; // quantia a ser depositada todo ano
		double capital = 1000; // quantia inicial
		double taxa = 0.05; // taxa de juros
		
		System.out.printf("Valor de depósito inicial %s\n", capital);
		for (int ano = 1; ano <= 10; ano++) {
			valor = capital * Math.pow(1 + taxa, ano);
			System.out.printf( "%4d%,20.2f\n", ano, valor );
		}
    }
}