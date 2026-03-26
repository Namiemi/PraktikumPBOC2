/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize {

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
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    /* Method untuk mengambil nilai keliling */
    @Override
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

    /* IResize Override */
    /* Method untuk mengubah ukuran lingkaran */
    @Override
    public void zoomIn() {
        this.jari *= 1.1;
    }

    /* Method untuk mengurangi ukuran lingkaran */
    @Override
    public void zoomOut() {
        this.jari *= 0.9;
    }

    /* Method untuk mengubah ukuran lingkaran sesuai dengan persentase */
    @Override
    public void zoom(int persentase) {
        jari = jari * persentase / 100.0;
    }
}
