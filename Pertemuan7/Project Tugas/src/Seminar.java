/* Nama File    : Seminar.java
 * Deskripsi    : berisi atribut dan metode untuk kelas Seminar
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Seminar {

    /********** ATRIBUT **********/

    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    /********** METHOD **********/

    public Seminar() {
        pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        pesertas[banyakpeserta] = peserta;
        banyakpeserta++;
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }

    public void tampilPeserta() {
        System.out.println("\nDaftar Peserta Seminar : ");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println("" + (i + 1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }
}
