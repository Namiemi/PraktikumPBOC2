/* Nama File    : Asersi.java
 * Deskripsi    : Program untuk menunjukkan penggunaan asersi 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

class Lingkaran {
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert (jarijari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);

    }
}
