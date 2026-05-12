/* Nama File    : Peliaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Peliaraan 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 07 Mei 2026
*/

import java.util.LinkedList;

public class Peliaraan {

    /*********** ATRIBUT **********/

    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    /********** METHOD **********/

    /* Konstruktor */
    public Peliaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<Anabul>();
    }

    /* b. Operator tambahan dalam kelas Peliaraan */
    /* Getter */
    public int getNbelm() {
        return this.nbelm;
    }

    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    /* Method untuk Enqueue */
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        this.nbelm += 1;
    }

    /* Method untuk Check Member */
    public boolean isMember(Anabul anabul) {
        return this.Lanabul.contains(anabul);
    }

    /* Method untuk Dequeue */
    public void dequeueAnabul() {
        Lanabul.removeFirst();
        this.nbelm -= 1;
    }

    /* c. Realisasi dan aplikasi prosedur showAnabul */
    /* Method untuk Show Anabul */
    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul.get(i).getNama());
        }
    }

    /* d. Realisasi dan aplikasi prosedur countKucing */
    /* Method untuk Count Kucing */
    public int countKucing() {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i) instanceof Kucing) {
                count += 1;
            }
        }
        return count;
    }

    /* e. Realisasi dan aplikasi prosedur bobotKucing */
    /* Method untuk Menghitung Total Bobot Kucing */
    public double bobotKucing() {
        double sum = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i) instanceof Kucing) {
                sum += ((Kucing) Lanabul.get(i)).getBerat();
            }
        }
        return sum;
    }

    /* f. Realisasi dan aplikasi prosedur showJenisAnabul */
    /* Method untuk Show Jenis Anabul */
    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul.get(i).getNama() + " - " +
                    Lanabul.get(i).getClass().getName());
        }
    }
}
