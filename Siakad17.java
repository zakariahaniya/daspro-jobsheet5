import java.util.Scanner;
/**
 * Siakad17
 */
public class Siakad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhirAngka;
        String nilaAkhirHuruf = "A", kualifikasi = "A";
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhirAngka = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        if (nilaiAkhirAngka <= 39) {
            nilaAkhirHuruf = "E";
            kualifikasi = "Gagal";
        } else if (nilaiAkhirAngka > 39 && nilaiAkhirAngka <= 50) {
            nilaAkhirHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhirAngka > 50 && nilaiAkhirAngka <= 60) {
            nilaAkhirHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhirAngka > 60 && nilaiAkhirAngka <= 65) {
            nilaAkhirHuruf = "C+";
            nilaAkhirHuruf = "Lebih dari Cukup";
        } else if (nilaiAkhirAngka > 65 && nilaiAkhirAngka <= 73) {
            nilaAkhirHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhirAngka > 73 && nilaiAkhirAngka <= 80) {
            nilaAkhirHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhirAngka > 80 && nilaiAkhirAngka <= 100) {
            nilaAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhirAngka);
        System.out.println("Nilai Akhir Huruf: " + nilaAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }

    
}