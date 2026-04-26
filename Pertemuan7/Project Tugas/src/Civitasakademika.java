/* Nama File    : Civitasakademika.java
 * Deskripsi    : kelas induk dari kelas Mahasiswa dan Dosen 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public abstract class Civitasakademika {

    /********** ATRIBUT **********/

    private String nama;

    /********** METHOD **********/

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}
