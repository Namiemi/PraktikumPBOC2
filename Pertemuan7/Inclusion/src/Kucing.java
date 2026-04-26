/* Nama File    : Kucing.java
 * Deskripsi    : berisi method dalam class Kucing 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Kucing extends Anabul {

    /********** METHOD **********/

    /* Konstruktor Kucing tanpa parameter */
    public Kucing() {
        super();
    }

    /* Konstruktor Kucing dengan parameter */
    public Kucing(String nama) {
        super(nama);
    }

    /* Method-Method untuk Inclusion */
    @Override
    public void Gerak() {
        System.out.println("Kucing " + this.getNama() + " bergerak melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Kucing " + this.getNama() + " berbunyi meong.");
    }

}
