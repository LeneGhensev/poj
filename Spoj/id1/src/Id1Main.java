import java.util.Scanner;

public class Id1Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        while (n != 42) {
            System.out.println(n);
            n = ler.nextInt();
        }
    }
}
