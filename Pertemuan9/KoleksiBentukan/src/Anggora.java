/* Nama File    : Anggora.java
 * Deskripsi    : berisi atribut dan method dalam class Anggora 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class Anggora extends Kucing {

    /********** METHOD **********/

    /* Konstruktor Anggora tanpa parameter */
    public Anggora() {
        super();
    }

    /* Konstruktor Anggora dengan parameter */
    public Anggora(String nama, double berat) {
        super(nama, berat);
    }

    /* Method-Method untuk Inclusion */
    @Override
    public void Gerak() {
        System.out.println("Anggora " + this.getNama() + " bergerak melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Anggora " + this.getNama() + " berbunyi meong.");
    }

}