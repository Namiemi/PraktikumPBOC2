/* Nama File    : Titik.java
 * Deskripsi    : beisi atribut dan method dalam class Titik 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 19 Februari 2026
*/

public class Titik {
    /**********ATRIBUT**********/
    double absis;
    double ordinat;

    /**********METHOD**********/
    //konstruktor untuk membuat titik (0,0)
    Titik()
    {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis()
    {
        return absis;
    }
    double getOrdinat() 
    {
        return ordinat;
    }

    void setAbsis (double x)
    {
        absis = x;
    }

    void setOrdinat (double y)
    {
        ordinat = y;
    }

    void geser (double x, double y)
    {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik()
    {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}