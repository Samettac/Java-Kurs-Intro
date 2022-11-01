import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number==1) {
            System.out.println("Sayı asal değildir.");
            return;
        }
        if (number<1) {
            System.out.println("Hatalı sayı girişi.");
            return;
        }

        for (int i=2; i<number; i++) {
            if (number%i==0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir.");
        }

    }
}