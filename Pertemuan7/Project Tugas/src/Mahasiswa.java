/* Nama File    : Mahasiswa.java
 * Deskripsi    : kelas anak dari kelas Civitasakademika 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Mahasiswa extends Civitasakademika {

    /********** ATRIBUT **********/

    private String nim;
    private String dosenwali;

    /********** METHOD **********/

    public Mahasiswa(String nama, String nim, String dosenwali) {
        super(nama);
        this.nim = nim;
        this.dosenwali = dosenwali;
    }

    public String getNim() {
        return nim;
    }

    public String getDosenWali() {
        return dosenwali;
    }

    public void setWali(String dosenwali) {
        this.dosenwali = dosenwali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void tampilDataMahasiswa() {
        System.out.println("\nNama : " + getNama());
        System.out.println("NIM : " + nim);
        System.out.println("Dosen Wali : " + dosenwali);
    }

}
