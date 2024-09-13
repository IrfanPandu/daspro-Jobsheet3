import java.util.Scanner;
public class testing {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("masukkan nama:  ");
        nama = sc.nextLine();
        System.out.print("masukkan NIM:  ");
        nim = sc.nextLine();
        System.out.print("masukkan kelas:  ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("masukkan absen:  ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUjian) / 3;
        System.out.println("Nama: " + nama);
        System.out.println("NIM:" + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Mahasiswa dengan nama " + nama +
                            " (NIM " + nim + ")  kelas " + kelas +
                            " nomor absen " + absen );
        sc.close();
    }
}
