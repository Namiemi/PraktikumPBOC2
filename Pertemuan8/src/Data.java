/* Nama File    : Data.java
 * Deskripsi    : berisi atribut dan method dalam class Data 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

import java.util.Arrays;

public class Data<T> {

    /********** ATRIBUT **********/

    private static final int MAX = 100;
    private final T[] ruang;
    private static int banyak;

    /********** METHOD **********/

    /* Konstruktor Data */
    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, MAX);
        this.banyak = 0;
    }

    /* Getter untuk Isi */
    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    /* Getter untuk Size */
    public int getSize() {
        return banyak;
    }

    /* Setter untuk Isi */
    public void setIsi(int posisi, T objek) {
        if (ruang[posisi] == null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
    }

}
