/* Nama File    : Datum.java
 * Deskripsi    : berisi atribut dan method dalam class Datum 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class Datum<T> {

    /*********** ATRIBUT ********** */

    private T isi;

    /********** METHOD **********/

    /* Konstruktor Datum */
    public Datum(T isi) {
        this.isi = isi;
    }

    /* Getter dan Setter */
    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    /* Method untuk menampilkan Anabul */
    public void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBerat();
        }
    }

}
