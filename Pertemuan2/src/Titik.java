/* Nama File    : Titik.java
 * Deskripsi    : beisi atribut dan method dalam class Titik 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 19 Februari 2026
*/

public class Titik {
    /**********ATRIBUT**********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**********METHOD**********/
    //konstruktor untuk membuat titik (0,0)
    public Titik()
    {
        this(0,0);
    }

    public Titik(double x, double y)
    {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik()
    {
        return counterTitik;
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

    double getKuadran()
    {
        if (absis > 0  && ordinat > 0)
        {
            return 1;
        }
        else if (absis > 0 && ordinat < 0)
        {
            return 2;
        }
        else if (absis < 0 && ordinat < 0)
        {
            return 3;
        }
        else if (absis < 0 && ordinat > 0)
        {
            return 4;
        }
        else
        {
            return 0;
        }
    }

    double getJarakPusat()
    {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik t)
    {
        double dx = this.absis - t.absis;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    void refleksiX()
    {
        ordinat = -ordinat;
    }

    void refleksiY()
    {
        absis = -absis;
    }

    Titik getRefleksiX()
    {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY()
    {
        return new Titik(-absis, ordinat);
    }
    
    void printTitik()
    {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}