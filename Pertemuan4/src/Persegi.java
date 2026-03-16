/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 12 Maret 2026
*/

public class Persegi extends BangunDatar {

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
    public double getLuas() {
        return sisi * sisi;
    }

    /* Method untuk mengambil nilai keliling */
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
}
