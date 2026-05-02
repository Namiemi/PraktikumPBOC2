/* Nama File    : OperatorGenerik.java
 * Deskripsi    : berisi method dalam class OperatorGenerik 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class OperatorGenerik {

    /********** METHOD **********/

    /* Method Tukar */
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
