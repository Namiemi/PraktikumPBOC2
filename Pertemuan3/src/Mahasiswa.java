import java.util.ArrayList;
/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
*/

public class Mahasiswa {

    /********** ATRIBUT **********/

    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /********** METHOD **********/

    /* Konstruktor */
    /* Method untuk menginisialisasi objek Mahasiswa */
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    /* Method untuk menginisialisasi objek Mahasiswa dengan parameter */
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    /* Setter */
    /* Method-method untuk mengubah nilai atribut */
    void setNIM(String nim) {
        this.nim = nim;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setProdi(String prodi) {
        this.prodi = prodi;
    }

    void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /* Getter */
    /* Method-method untuk mengambil nilai atribut */
    public String getNIM() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    /* Method untuk menambahkan mata kuliah ke dalam daftar mata kuliah mahasiswa */
    public void addMatkul(MataKuliah newMataKuliah) {
        listMatkul.add(newMataKuliah);
    }

    /* Method untuk menghitung total SKS yang diambil oleh mahasiswa */
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++) {
            totalSKS += listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    /* Method untuk menghitung jumlah mata kuliah yang diambil oleh mahasiswa */
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    /* Method untuk menampilkan informasi Mahasiswa */
    void printMhs() {
        System.out.println("NIM Mahasiswa : " + getNIM());
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("Prodi Mahasiswa : " + getProdi());
    }

    /* Method untuk menampilkan detail informasi Mahasiswa */
    void printDetailMhs() {
        System.out.println("==========Detail Mahasiswa==========");
        System.out.println("NIM Mahasiswa : " + getNIM());
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("Prodi Mahasiswa : " + getProdi());
        System.out.println("Daftar Mata Kuliah yang diambil : ");
        for (int i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + getDosenWali().getNama());
        System.out.println(
                "Kendaraan : " + getKendaraan().getJenis() + " dengan nomor plat " + getKendaraan().getNoPlat());
        System.out.println("====================================");
    }

}