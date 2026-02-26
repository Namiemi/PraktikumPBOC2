public class Garis {
    
    /**********ATRIBUT**********/
    Titik titik_awal;
    Titik titik_akhir;
    static int counterGaris = 0;

    /**********METHOD***********/
    /*Konstruktor*/
    public Garis(Titik t1, Titik t2)
    {
        this.titik_awal = t1;
        this.titik_akhir = t2;
        counterGaris++;
    }
    
    public Garis()
    {
        this(new Titik(0,0), new Titik(1,1));
    }

    /*Selektor*/
    Titik getTitikAwal()
    {
        return this.titik_awal;
    }

    Titik getTitikAkhir()
    {
        return this.titik_akhir;
    }

    static int getCounterGaris()
    {
        return counterGaris;
    }

    double getPanjang()
    {
        return this.titik_awal.getJarak(this.titik_akhir);
    }

    double getGradien()
    {
        double deltaY = this.titik_akhir.getOrdinat() - this.titik_awal.getOrdinat();
        double deltaX = this.titik_akhir.getAbsis() - this.titik_awal.getAbsis();
        
        double gradien = deltaY / deltaX;
        return gradien;
    }
    
    Titik getGarisTengah()
    {
        double absis = (this.titik_awal.getAbsis() + this.titik_akhir.getAbsis()) / 2;
        double ordinat = (this.titik_awal.getOrdinat() + this.titik_akhir.getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    boolean isSejajar(Garis g)
    {
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g)
    {
        return this.getGradien() * g.getGradien() == -1;
    }

    void printGarisTitik()
    {
        System.out.println("Titik Awal: (" + this.titik_awal.getAbsis() + ", " + this.titik_awal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + this.titik_akhir.getAbsis() + ", " + this.titik_akhir.getOrdinat() + ")");
    }

    void  persamaanGradien()
    {
        double m = this.getGradien();
        double c = this.titik_awal.getOrdinat() - m * this.titik_awal.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
