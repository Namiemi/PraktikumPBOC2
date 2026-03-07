/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
 */

public class MataKuliah {

    /********** ATRIBUT **********/

    private String idmatkul;
    private String nama;
    private int sks;

    /********** METHOD **********/

    /* Konstruktur */
    /* Method untuk menginisialisasi objek MataKuliah */
    public MataKuliah() {
        this.idmatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    /* Method untuk menginisialisasi objek MataKuliah dengan parameter */
    public MataKuliah(String idmatkul, String nama, int sks) {
        this.idmatkul = idmatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /* Setter */
    /* Method-method untuk mengubah nilai atribut */
    public void setIdMatkul(String idmatkul) {
        this.idmatkul = idmatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

    /* Getter */
    /* Method-method untuk mengambil nilai atribut */
    public String getIdMatkul() {
        return this.idmatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSKS() {
        return this.sks;
    }

    /* Method untuk menampilkan informasi MataKuliah */
    void printInfo() {
        System.out.println("ID MataKuliah : " + getIdMatkul());
        System.out.println("Nama Matakuliah : " + getNama());
        System.out.println("SKS Matakuliah : " + getSKS());
    }
}