public class DataDosen11 {

    // a. Menampilkan data semua dosen
    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        System.out.println("Kode | Nama | Jenis Kelamin | Usia");
        System.out.println("=====================================");
        
        for (Dosen11 dosen : arrayOfDosen) {
            String jenisKelamin = dosen.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(dosen.kode + " | " + dosen.nama + " | " + jenisKelamin + " | " + dosen.usia);
        }
        System.out.println("=====================================");
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        System.out.println("\n========== JUMLAH DOSEN PER JENIS KELAMIN ==========");
        
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
        System.out.println("Total  : " + arrayOfDosen.length);
        System.out.println("===================================================");
    }

    // c. Menampilkan rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        System.out.println("\n========== RATA-RATA USIA DOSEN PER JENIS KELAMIN ==========");
        
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
                totalUsiaPria += dosen.usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += dosen.usia;
            }
        }
        
        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;
        
        System.out.printf("Rata-rata usia Pria   : %.2f tahun\n", rerataUsiaPria);
        System.out.printf("Rata-rata usia Wanita : %.2f tahun\n", rerataUsiaWanita);
        System.out.println("=============================================================");
    }

    // d. Menampilkan data dosen paling tua
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        System.out.println("\n========== DOSEN PALING TUA ==========");
        
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen kosong!");
            return;
        }
        
        Dosen11 dosenTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTua.usia) {
                dosenTua = arrayOfDosen[i];
            }
        }
        
        String jenisKelamin = dosenTua.jenisKelamin ? "Pria" : "Wanita";
        System.out.printf("Kode        : %s\n", dosenTua.kode);
        System.out.printf("Nama        : %s\n", dosenTua.nama);
        System.out.printf("Jenis Kelamin: %s\n", jenisKelamin);
        System.out.printf("Usia        : %d tahun\n", dosenTua.usia);
        System.out.println("=====================================");
    }

    // e. Menampilkan data dosen paling muda
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        System.out.println("\n========== DOSEN PALING MUDA ==========");
        
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen kosong!");
            return;
        }
        
        Dosen11 dosenMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenMuda.usia) {
                dosenMuda = arrayOfDosen[i];
            }
        }
        
        String jenisKelamin = dosenMuda.jenisKelamin ? "Pria" : "Wanita";
        System.out.printf("Kode        : %s\n", dosenMuda.kode);
        System.out.printf("Nama        : %s\n", dosenMuda.nama);
        System.out.printf("Jenis Kelamin: %s\n", jenisKelamin);
        System.out.printf("Usia        : %d tahun\n", dosenMuda.usia);
        System.out.println("=====================================");
    }
}