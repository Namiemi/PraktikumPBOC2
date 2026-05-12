/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 07 Mei 2026
*/

public abstract class Anabul {

    /********** ATRIBUT **********/

    private String panggilan;

    /********** METHOD **********/

    /* Konstruktor tanpa parameter */
    public Anabul() {
        this.panggilan = "";
    }

    /* Konstruktor dengan parameter */
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    /* Getter Nama */
    public String getNama() {
        return this.panggilan;
    }

    /* Setter Nama */
    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    /* Method-Method untuk Inclusion */
    public void Gerak() {
        System.out.println("Anabul " + this.getNama() + " bergerak.");
    }

    public void Bersuara() {
        System.out.println("Anabul " + this.getNama() + " bersuara.");
    }
}
