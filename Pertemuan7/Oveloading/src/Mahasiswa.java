/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Mahasiswa {

    /********** ATRIBUT **********/

    private String nim;
    private String nama;
    private String prodi;

    /********** METHOD **********/

    /* Konstruktor tanpa parameter */
    public Mahasiswa() {
        this.nim = "N/A";
        this.nama = "-999";
        this.prodi = "N/A";
    }

    /* Konstruktor dengan parameter */
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Setter Prodi tanpa parameter */
    public void setProgramStudi() {
        this.prodi = "";
    }

    /* Setter Prodi dengan parameter */
    public void setProgramStudi(String prodi) {
        this.prodi = prodi;
    }

    /* Setter Prodi dengan parameter mahasiswa lain */
    public void setProgramStudi(Mahasiswa mhs) {
        this.prodi = mhs.prodi;
    }

    /* Method printInfo */
    public void printInfo() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Program Studi : " + this.prodi);
        System.out.println();
    }
}
