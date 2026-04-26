/* Nama File    : MMahasiswa.java
 * Deskripsi    : untuk menguji class Mahasiswa dengan membuat beberapa objek mahasiswa dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("123", "Budi", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.printInfo();

        mhs2.printInfo();

        mhs3.setProgramStudi(mhs2);
        mhs3.printInfo();

    }
}
