/* Nama File    : MKendaraan.java
 * Deskripsi    : untuk menguji class Kendaraan dengan membuat beberapa objek kendaraan dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
 */

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();

        K1.setNoPlat("123");
        K1.setJenis("Mobil");

        K1.printInfo();
    }
}
