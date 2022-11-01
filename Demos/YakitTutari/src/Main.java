import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aracın km'de kaç tl yaktığına göre gittiği km tutarınca ödemesi gereken ücret

        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız km'de kaç TL yakıyor? (Örn. 15,7) : ");
        double yakit = scanner.nextDouble();

        System.out.print("Aracınızla kaç km yol aldınız? (Örn. 38) : ");
        int km = scanner.nextInt();

        System.out.println("AToplam ödemeniz gereken tutar: " + km*yakit);

    }
}