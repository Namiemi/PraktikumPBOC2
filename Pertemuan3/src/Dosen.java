/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
*/

public class Dosen {

    /********** ATRIBUT **********/

    private String nip;
    private String nama;
    private String prodi;

    /********** METHOD **********/

    /* Konstruktur */
    /* Method untuk menginisialisasi objek Dosen */
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    /* Method untuk menginisialisasi objek Dosen dengan parameter */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Setter */
    /* Method-method untuk mengubah nilai atribut */
    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /* Getter */
    /* Method-method untuk mengambil nilai atribut */
    public String getNIP() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;

    }

    public String getProdi() {
        return this.prodi;
    }

    /* Method untuk menampilkan informasi Dosen */
    public void printInfo() {
        System.out.println("Nama Dosen: " + getNama());
        System.out.println("NIP Dosen: " + getNIP());
        System.out.println("Prodi Dosen: " + getProdi());
    }
}
