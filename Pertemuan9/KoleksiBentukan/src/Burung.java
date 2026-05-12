/* Nama File    : Burung.java
 * Deskripsi    : berisi method dalam class Burung 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class Burung extends Anabul {

    /********** METHOD **********/

    /* Konstruktor Burung tanpa parameter */
    public Burung() {
        super();
    }

    /* Konstruktor Burung dengan parameter */
    public Burung(String nama) {
        super(nama);
    }

    /* Method-Method untuk Inclusion */
    @Override
    public void Gerak() {
        System.out.println("Burung " + this.getNama() + " sedang terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Burung " + this.getNama() + " berbunyi cuit-cuit.");
    }
}
