import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah dosen
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer newline
        
        // Membuat array dosen
        Dosen11[] arrayDosen = new Dosen11[jumlahDosen];
        
        // Input data dosen
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\n--- Input Data Dosen ke-" + (i + 1) + " ---");
            
            System.out.print("Kode Dosen: ");
            String kode = scanner.nextLine();
            
            System.out.print("Nama Dosen: ");
            String nama = scanner.nextLine();
            
            System.out.print("Jenis Kelamin (1=Pria, 0=Wanita): ");
            int jenisKelaminInput = scanner.nextInt();
            boolean jenisKelamin = (jenisKelaminInput == 1);
            
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer newline
            
            arrayDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        }
        
        // Memanggil semua method dari DataDosen11
        DataDosen11.dataSemuaDosen(arrayDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(arrayDosen);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        DataDosen11.infoDosenPalingTua(arrayDosen);
        DataDosen11.infoDosenPalingMuda(arrayDosen);
        
        scanner.close();
    }
}
