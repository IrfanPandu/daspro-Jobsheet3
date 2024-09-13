import java.util.Scanner;

public class listrik13 {
    public static void main(String[] args) {
        // Tarif listrik per kWh
        final int TARIF_PER_KWH = 1500;

        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah penggunaan listrik dalam kWh
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaanListrik = input.nextDouble();

        // Menghitung total tagihan
        double totalTagihan = penggunaanListrik * TARIF_PER_KWH;

        // Mengecek apakah penggunaan listrik melebihi 500 kWh
        boolean lebihDari500kWh = penggunaanListrik > 500;

        // Menampilkan hasil
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + lebihDari500kWh);
    }
}
