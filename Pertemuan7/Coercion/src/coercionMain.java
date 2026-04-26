/* Nama File    : coercionMain.java
 * Deskripsi    : berisi program untuk melakukan konversi tipe data 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class coercionMain {
    public static void main(String[] args) throws Exception {

        /* Nilai */
        int nilai = 65;
        System.out.println("Integer = " + nilai);

        /* Konversi int ke char */
        char karakter = (char) nilai;
        System.out.println("Karakter = " + karakter);

        /* Konversi int ke real */
        double real = nilai;
        System.out.println("Real = " + real);

        /* Konversi real ke int */
        int nilai2 = (int) real;
        System.out.println("Integer2 = " + nilai2);

        /* Konversi String ke int */
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        System.out.println("S = " + S);

        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z = " + Z);

        /* Konversi String ke real */
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        System.out.println("R = " + R);

        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("D = " + D);

        /* Konversi String S ke Integer A */
        int A = Integer.parseInt(S);
        System.out.println("A = " + A);

        /* Konversi Integer A ke String T */
        String T = Integer.toString(A);
        System.out.println("T = " + T);
    }
}
