/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
*/
public class Kendaraan {

    /********** ATRIBUT **********/

    private String noplat;
    private String jenis;

    /********** METHOD **********/

    /* Konstruktur */
    /* Method untuk menginisialisasi objek Kendaraan */
    public Kendaraan() {
        this.noplat = "";
        this.jenis = "";
    }

    /* Method untuk menginisialisasi objek Kendaraan dengan parameter */
    public Kendaraan(String noplat, String jenis) {
        this.noplat = noplat;
        this.jenis = jenis;
    }

    /* Setter */
    /* Method-method untuk mengubah nilai atribut */
    void setNoPlat(String noplat) {
        this.noplat = noplat;
    }

    void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /* Getter */
    /* Method-method untuk mengambil nilai atribut */
    public String getNoPlat() {
        return this.noplat;
    }

    public String getJenis() {
        return this.jenis;
    }

    /* Method untuk menampilkan informasi Kendaraan */
    void printInfo() {
        System.out.println("Nomor Plat : " + getNoPlat());
        System.out.println("Jenis Kendaraan : " + getJenis());
    }
}