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
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(2,2);
        System.out.print("Titik T3: ");
        T3.printTitik();

        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounterTitik());

        Titik T4 = new Titik(5,-5);
        System.out.print("\nTitik T4: ");
        T4.printTitik();
        System.out.println("getKuardran T4: " + T4.getKuadran());
        System.out.println("Jarak Titik dari Pusat: " + T4.getJarakPusat());
        System.out.println("Jarak antara titik T3 dan T4: " + T3.getJarak(T4));

        Titik T5 = new Titik(-3,4);
        System.out.print("\nTitik T5: ");
        T5.printTitik();
        System.out.println("Refleksi terhadap sumbu X: ");
        T5.refleksiX();
        T5.printTitik();
        System.out.println("Refleksi terhadap sumbu Y: ");
        T5.refleksiY();
        T5.printTitik();


        Titik T6 = T5.getRefleksiX();
        System.out.print("\nTitik T6 (refleksi T5 terhadap sumbu X): ");
        T6.printTitik();

        Titik T7 = T5.getRefleksiY();
        System.out.print("\nTitik T7 (refleksi T5 terhadap sumbu Y): ");
        T7.printTitik();
    }
}