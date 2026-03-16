/* Nama File    : MLingkaran.java
 * Deskripsi    : untuk menguji class Lingkaran dengan membuat beberapa objek lingkaran dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 12 Maret 2026
*/

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5.0, "biru", "hitam");

        l1.printInfo();

        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
    }

}
