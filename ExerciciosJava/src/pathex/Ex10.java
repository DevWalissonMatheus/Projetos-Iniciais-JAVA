package pathex;

public class Ex10 {
    public static void main(String[] args) {
        int vlr[] = new int[1001];

        for (int i = 0; i < vlr.length; i++) {
            vlr[i] = i + 1000;
        }

        for (int i = 0; i < vlr.length; i++) {
            if (vlr[i] % 11 == 5) {
                System.out.println("Número " + vlr[i] + " resto: " + (vlr[i] % 11));
            }
        }
    }
}