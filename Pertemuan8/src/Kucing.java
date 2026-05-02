/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class Kucing extends Anabul {

    /*********** ATRIBUT ********** */

    private double berat;

    /********** METHOD **********/

    /* Konstruktor Kucing tanpa parameter */
    public Kucing() {
        super();
        this.berat = 0;
    }

    /* Konstruktor Kucing dengan parameter */
    public Kucing(String nama, double berat) {
        super(nama);
        this.berat = berat;
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

    /* Method untuk menampilkan berat */
    public void printBerat() {
        System.out.println("Kucing " + this.getNama() + " berat " + this.berat + " kg.");
    }

    /* Method untuk menampilkan total bobot dari dua kucing */
    public void printBobot2(Kucing kucing1, Kucing kucing2) {
        double sum = kucing1.berat + kucing2.berat;
        System.out.println("Total bobot kedua kucing adalah " + sum + " kg.");
    }
}
