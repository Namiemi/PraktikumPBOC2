/* Nama File    : Dosen.java
 * Deskripsi    : kelas anak dari kelas Civitasakademika 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Dosen extends Civitasakademika {

    /********** ATRIBUT **********/

    private String nip;

    /********** METHOD **********/

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }

}
