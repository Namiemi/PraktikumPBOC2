public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(new Titik(1,2), new Titik(3,4));
        
        G1.printGarisTitik();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Garis Tengah G1: (" + G1.getGarisTengah().getAbsis() + ", " + G1.getGarisTengah().getOrdinat() + ")");
        
        Garis G2 = new Garis(new Titik(2,3), new Titik(4,5));
        G2.printGarisTitik(); 
        System.out.println("G1 sejajar dengan G2: " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus dengan G2: " + G1.isTegakLurus(G2));

        Garis G3 = new Garis(new Titik(-2, 0), new Titik(0,4));
        G3.printGarisTitik();
        G3.persamaanGradien();

        System.out.println("Jumlah objek garis yang telah dibuat: " + Garis.getCounterGaris());

    }
}
