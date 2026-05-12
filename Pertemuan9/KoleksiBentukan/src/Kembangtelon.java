/* Nama File    : Kembangtelon.java
 * Deskripsi    : berisi atribut dan method dalam class Kembangtelon 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class Kembangtelon extends Kucing {

    /********** METHOD **********/

    /* Konstruktor Kembangtelon tanpa parameter */
    public Kembangtelon() {
        super();
    }

    /* Konstruktor Kembangtelon dengan parameter */
    public Kembangtelon(String nama, double berat) {
        super(nama, berat);
    }

    /* Method-Method untuk Inclusion */
    @Override
    public void Gerak() {
        System.out.println("Kembangtelon " + this.getNama() + " bergerak melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Kembangtelon " + this.getNama() + " berbunyi meong.");
    }

}
