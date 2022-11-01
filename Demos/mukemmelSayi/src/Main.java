import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int number = scanner.nextInt();
        int remainder;
        int sum=0;


        for (int i=1;i<number;i++) {
            if (number%i==0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}