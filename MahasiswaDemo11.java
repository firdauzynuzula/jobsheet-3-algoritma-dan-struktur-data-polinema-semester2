import java.util.Scanner;

public class MahasiswaDemo11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa = new Mahasiswa11[3];
        String dummy;
        
      for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa11();

            System.out.println("Masukkan data untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM: ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Masukkan Nama: ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Masukkan Kelas: ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("Masukkan IPK: ");
            dummy = input.nextLine(); 
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("NIM: " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama: " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
        input.close();


        // Mahasiswa[] myarrayOfMahasiswa = new Mahasiswa[3];
        // myarrayOfMahasiswa[0].nim = "123456";
        // myarrayOfMahasiswa[1].nama = "Budi";
        // myarrayOfMahasiswa[2].kelas = "A";
        // myarrayOfMahasiswa[2].ipk = (float) 3.75;
    }
}