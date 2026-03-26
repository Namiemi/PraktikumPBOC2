/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

// final class BangunDatar {
// class ini tidak bisa diturunkan ke class lain, sehingga class Persegi dan Lingkaran tidak bisa extends class BangunDatar

// protected class BangunDatar {
// error "modifier protected not allowed here"

public abstract class BangunDatar {

    /********** ATRIBUT **********/

    private int jmlsisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /********** METHOD **********/

    /* Konstruktor */
    /* Method untuk menginisialisasi objek BangunDatar */
    public BangunDatar() {
        counterBangunDatar++;
    }

    /* Method untuk menginisialisasi objek BangunDatar dengan parameter */
    public BangunDatar(int jmlsisi, String warna, String border) {
        this.jmlsisi = jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* GETTER */
    /* Method untuk mengambil nilai-nilai atribut */
    public int getJmlsisi() {
        return jmlsisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    /* SETTER */
    /* Method untuk mengubah nilai-nilai atribut */
    public void setJmlsisi(int jmlSisi) {
        this.jmlsisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    /* Tambahan abstract */
    public abstract double getLuas();

    public abstract double getKeliling();

    /* Method untuk menampilkan informasi BangunDatar */
    // final void printInfo() {
    // method ini tidak bisa di override oleh class lain

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + this.jmlsisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    /* Method untuk membandingkan luas dua bangun datar */
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    /* Method untuk membandingkan keliling dua bangun datar */
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

}
