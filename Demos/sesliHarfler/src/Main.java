import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        String harf = scanner.nextLine();

        switch (harf.toUpperCase()) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalın sesli harf.");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println("İnce sesli harf.");
                break;
            default:
                System.out.println("Sesli harf giriniz.");
        }

    }
}