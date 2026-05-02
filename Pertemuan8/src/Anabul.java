/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Anabul {

    /********** ATRIBUT **********/

    private String nama;

    /********** METHOD **********/

    /* Konstruktor tanpa parameter */
    public Anabul() {
        this.nama = "";
    }

    /* Konstruktor dengan parameter */
    public Anabul(String nama) {
        this.nama = nama;
    }

    /* Getter Nama */
    public String getNama() {
        return this.nama;
    }

    /* Setter Nama */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Method-Method untuk Inclusion */
    public void Gerak() {
        System.out.println("Anabul " + this.getNama() + " bergerak.");
    }

    public void Bersuara() {
        System.out.println("Anabul " + this.getNama() + " bersuara.");
    }
}
