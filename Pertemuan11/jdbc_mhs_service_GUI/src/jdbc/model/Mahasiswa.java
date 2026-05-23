package jdbc.model;

/* Nama File    : Mahasiswa.java
 * Deskripsi    : model class Mahasiswa
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Selasa, 12 Mei 2026
*/

public class Mahasiswa {
    private int id;
    private String nama;

    public Mahasiswa() {}

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    @Override
    public String toString() {
        return "Mahasiswa{id=" + id + ", nama=" + nama + "}";
    }
}