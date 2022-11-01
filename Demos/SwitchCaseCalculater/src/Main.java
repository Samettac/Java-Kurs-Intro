import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "1. İşlem: Toplama\n"
                + "2. İşlem: Çıkarma\n"
                + "3. İşlem: Çarpma\n"
                + "4. İşlem: Bölme";

        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");

        System.out.println("Lütfen bir işlem seçiniz.");
        String islem = scanner.nextLine();

        int a;
        int b;

        switch (islem) {
            case "1" :
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + (a+b));
                break;
            case "2" :
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + (a-b));
                break;
            case "3" :
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + a*b);
                break;
            case "4":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + ((double)a/b));
                break;
            default:
                System.out.println("Hatalı işlem!");
                break;
        }

    }
}