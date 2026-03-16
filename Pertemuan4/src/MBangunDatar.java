/* Nama File    : MBangunDatar.java
 * Deskripsi    : untuk menguji class BangunDatar dengan membuat beberapa objek bangun datar dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 12 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar bd1 = new BangunDatar();

        bd1.printInfo();

        BangunDatar bd2 = new BangunDatar(3, "kuning", "merah");

        bd2.printInfo();
    }
}
