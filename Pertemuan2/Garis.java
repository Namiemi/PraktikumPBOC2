public class Garis {
    
    /**********ATRIBUT**********/
    Titik titik_awal;
    Titik titik_akhir;
    static int counterGaris = 0;

    /**********METHOD***********/
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



}
