/* Nama File    : MMataKuliah.java
 * Deskripsi    : untuk menguji class MataKuliah dengan membuat beberapa objek mata kuliah dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
 */

public class MMataKuliah {
    public static void main(String[] args) {
        MataKuliah M1 = new MataKuliah();

        M1.setIdMatkul("001");
        M1.setNama("Pemrograman Berorientasi Objek");
        M1.setSKS(3);

        M1.printInfo();
    }
}
