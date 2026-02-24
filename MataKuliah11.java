import java.util.Scanner;

public class MataKuliah11 {
    
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    public MataKuliah11(String kode, String nama, int sks, int JumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;
    }

    public void tambahData(Scanner input) {
        String dummy;
        System.out.print("Kode: ");
        this.kode = input.nextLine();
        System.out.print("Nama: ");
        this.nama = input.nextLine();
        System.out.print("SKS: ");
        dummy = input.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam: ");
        dummy = input.nextLine();
        this.JumlahJam = Integer.parseInt(dummy);
    }

    public void cetakInfo() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("SKS: " + this.sks);
        System.out.println("Jumlah Jam: " + this.JumlahJam);
    }
}
