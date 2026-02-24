import java.util.Scanner;   
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data mata kuliah: ");
        int jumlah = Integer.parseInt(input.nextLine());
        
        MataKuliah11[] arrayOfMataKuliah = new MataKuliah11[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data untuk Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah11("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData(input);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
        input.close();
    }
}
