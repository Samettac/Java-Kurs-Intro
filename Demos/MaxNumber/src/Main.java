import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // girilen 3 sayıdan en büyüğü bulma.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayı: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayı: ");
        int c = scanner.nextInt();

        int max;

        if (a>=b && a>=c) {
            max = a;
        }
        else if (b>=a && b>=c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("En büyük sayı: " + max);

    }
}