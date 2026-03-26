/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize {

    /********** ATRIBUT **********/

    private double sisi;

    /********** METHOD **********/

    /* Konstruktor */
    /* Method untuk menginisialisasi objek Persegi */
    public Persegi() {
        setJmlsisi(4);
    }

    /* Method untuk menginisialisasi objek Persegi dengan parameter */
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /* GETTER */
    /* Method untuk mengambil nilai atribut sisi */
    public double getSisi() {
        return sisi;
    }

    /* Method untuk mengambil nilai luas */
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    /* Method untuk mengambil nilai keliling */
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    /* Method untuk mengambil nilai diagonal */
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    /* SETTER */
    /* Method untuk mengubah nilai atribut sisi */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /* Method untuk menampilkan informasi Persegi */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + this.sisi);
    }

    /* IResize Override */
    /* Method untuk mengubah ukuran persegi */
    @Override
    public void zoomIn() {
        this.sisi *= 1.1;
    }

    /* Method untuk mengurangi ukuran persegi */
    @Override
    public void zoomOut() {
        this.sisi *= 0.9;
    }

    /* Method untuk mengubah ukuran persegi sesuai dengan persentase */
    @Override
    public void zoom(int persentase) {
        sisi = sisi * persentase / 100.0;
    }
}
