/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 12 Maret 2026
*/

public class Lingkaran extends BangunDatar {

    /********** ATRIBUT **********/

    private double jari;

    /********** METHOD **********/
    /* Konstruktor */
    /* Method untuk menginisialisasi objek Lingkaran */
    public Lingkaran() {
        this.jari = 0.0;
    }

    /* Method untuk menginisialisasi objek Lingkaran dengan parameter */
    public Lingkaran(double jari, String warna, String border) {
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
    }

    /* GETTER */
    /* Method untuk mengambil nilai atribut jari */
    public double getJari() {
        return jari;
    }

    /* Method untuk mengambil nilai luas */
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    /* Method untuk mengambil nilai keliling */
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /* SETTER */
    /* Method untuk mengatur nilai atribut jari */
    public void setJari(double jari) {
        this.jari = jari;
    }

    /* Method untuk menampilkan informasi Lingkaran */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + this.jari);
    }
}
