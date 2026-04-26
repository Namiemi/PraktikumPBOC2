/* Nama File    : Anjing.java
 * Deskripsi    : berisi method dalam class Anjing 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Anjing extends Anabul {

    /********** METHOD **********/

    /* Konstruktor Anjing */
    public Anjing() {
        super();
    }

    /* Konstruktor Anjing dengan parameter */
    public Anjing(String nama) {
        super(nama);
    }

    /* Method-Method untuk Inclusion */
    @Override
    public void Gerak() {
        System.out.println("Anjing " + this.getNama() + " bergerak melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Anjing " + this.getNama() + " bersuara guk-guk.");
    }
}
