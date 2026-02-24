public class DataDosen11 {

    /**
     * Menampilkan data semua dosen
     * @param arrayOfDosen Array yang berisi data dosen
     */
    public void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        if (arrayOfDosen == null || arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        for (int i = 0; i < arrayOfDosen.length; i++) {
            Dosen11 dosen = arrayOfDosen[i];
            System.out.println((i + 1) + ". NIP: " + dosen.nip + ", Nama: " + dosen.nama + ", Jenis Kelamin: " + dosen.jenisKelamin + ", Usia: " + dosen.usia);
        }
        System.out.println("");
    }

    /**
     * Menampilkan jumlah dosen per jenis kelamin
     * @param arrayOfDosen Array yang berisi data dosen
     */
    public void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        if (arrayOfDosen == null || arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahPria++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
        System.out.println("");
    }

    /**
     * Menampilkan rata-rata usia dosen per jenis kelamin
     * @param arrayOfDosen Array yang berisi data dosen
     */
    public void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        System.out.println("=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        if (arrayOfDosen == null || arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        int totalUsiaPria = 0;
        int jumlahPria = 0;
        int totalUsiaWanita = 0;
        int jumlahWanita = 0;

        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            double rerataUsiaPria = (double) totalUsiaPria / jumlahPria;
            System.out.printf("Rata-rata Usia Dosen Pria: %.2f tahun%n", rerataUsiaPria);
        } else {
            System.out.println("Rata-rata Usia Dosen Pria: Tidak ada data");
        }

        if (jumlahWanita > 0) {
            double rerataUsiaWanita = (double) totalUsiaWanita / jumlahWanita;
            System.out.printf("Rata-rata Usia Dosen Wanita: %.2f tahun%n", rerataUsiaWanita);
        } else {
            System.out.println("Rata-rata Usia Dosen Wanita: Tidak ada data");
        }
        System.out.println("");
    }

    /**
     * Menampilkan informasi dosen paling tua
     * @param arrayOfDosen Array yang berisi data dosen
     */
    public void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        System.out.println("=== INFO DOSEN PALING TUA ===");
        if (arrayOfDosen == null || arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen11 dosenPalingTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenPalingTua.usia) {
                dosenPalingTua = arrayOfDosen[i];
            }
        }

        System.out.println("NIP: " + dosenPalingTua.nip + ", Nama: " + dosenPalingTua.nama + ", Jenis Kelamin: " + dosenPalingTua.jenisKelamin + ", Usia: " + dosenPalingTua.usia);
        System.out.println("");
    }

    /**
     * Menampilkan informasi dosen paling muda
     * @param arrayOfDosen Array yang berisi data dosen
     */
    public void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        System.out.println("=== INFO DOSEN PALING MUDA ===");
        if (arrayOfDosen == null || arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen11 dosenPalingMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenPalingMuda.usia) {
                dosenPalingMuda = arrayOfDosen[i];
            }
        }

        System.out.println("NIP: " + dosenPalingMuda.nip + ", Nama: " + dosenPalingMuda.nama + ", Jenis Kelamin: " + dosenPalingMuda.jenisKelamin + ", Usia: " + dosenPalingMuda.usia);
        System.out.println("");
    }
}