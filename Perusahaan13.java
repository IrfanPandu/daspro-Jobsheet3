import java.util.Scanner;

public class Perusahaan13 {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah jam kerja dan upah per jam
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();

        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();

        // Menghitung gaji kotor
        double gajiKotor = jamKerja * upahPerJam;

        // Menghitung bonus 10% dari gaji kotor
        double bonus = gajiKotor * 0.10;

        // Menghitung gaji setelah bonus
        double gajiSetelahBonus = gajiKotor + bonus;

        // Menghitung pajak 5% dari gaji setelah bonus
        double pajak = gajiSetelahBonus * 0.05;

        // Menghitung gaji bersih
        double gajiBersih = gajiSetelahBonus - pajak;

        // Menampilkan gaji bersih
        System.out.println("Gaji bersih setelah bonus dan pajak: Rp " + gajiBersih);
    
        input.close();
    }

}
