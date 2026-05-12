package jdbc.program;

/* Nama File    : Program.java
 * Deskripsi    : class program utama 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Selasa, 12 Mei 2026
*/

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import jdbc.utilities.MysqlUtility;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        // INSERT
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // UPDATE
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(6);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Abel");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // DELETE
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) System.out.println(m);
        System.out.println();
    }
}