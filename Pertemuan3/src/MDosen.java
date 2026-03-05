/* Nama File    : MDosen.java
 * Deskripsi    : untuk menguji class Dosen dengan membuat beberapa objek dosen dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
*/

public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();

        D1.setNama("Agus");
        D1.setNIP("123");
        D1.setProdi("Matematika");

        D1.printInfo();
    }
}
