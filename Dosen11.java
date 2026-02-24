public class Dosen11 {
    public String nip;
    public String nama;
    public String jenisKelamin;
    public int usia;

    /**
     * Constructor untuk Dosen11
     */
    public Dosen11(String nip, String nama, String jenisKelamin, int usia) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    /**
     * Getter untuk nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * Getter untuk nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Getter untuk jenis kelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * Getter untuk usia
     */
    public int getUsia() {
        return usia;
    }

    /**
     * Method toString untuk menampilkan informasi dosen
     */
    @Override
    public String toString() {
        return "Dosen11{" +
                "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", usia=" + usia +
                '}';
    }
}
