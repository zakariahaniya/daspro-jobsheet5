import java.util.Scanner;
/**
 * PemilihanHariDenganIf16
 */
public class PemilihanHariDenganIf16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Input number: ");
        number = sc.nextInt();
        if (number >= 1 && number <= 5) {
            System.out.println("Weekday");
        } else if (number == 6 || number == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}