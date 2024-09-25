import java.util.Scanner;
/**
 * LatihanIndividu16
 */
public class LatihanIndividu16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        String kategori = "Tidak ada";
        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia > 12 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia > 19 && usia <= 64) {
            kategori = "Dewasa";
        } else if (usia > 64) {
            kategori = "Lansia";
        } else {
            System.out.println("Input tidak valid");
        }
        System.out.println("Usia: " + usia);
        System.out.println("Kategori: " + kategori);
    }
}