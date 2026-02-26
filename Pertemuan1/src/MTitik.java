/* Nama File    : Titik.java
 * Deskripsi    : beisi atribut dan method dalam class Titik 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 19 Februari 2026
*/

public class MTitik 
{
    public static void main(String[] args)
    {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.getAbsis();
        T1.getOrdinat();
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    }
}