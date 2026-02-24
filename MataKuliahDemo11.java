import java.util.Scanner;   
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MataKuliah11[] arrayOfMataKuliah = new MataKuliah11[3];

        String kode, nama, dummy;
        int sks, jumlahJam;
        
      for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data untuk Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = input.nextLine();
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("Sks: ");
            dummy = input.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = input.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            
            arrayOfMataKuliah[i] = new MataKuliah11(kode, nama, sks, jumlahJam);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama: " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS: " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam: " + arrayOfMataKuliah[i].JumlahJam);
            System.out.println("-----------------------------");
        }
        input.close();
    }
}
