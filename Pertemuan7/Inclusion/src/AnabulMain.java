/* Nama File    : AnabulMain.java
 * Deskripsi    : untuk menguji polimorfisme Inclusion dalam class Anabul
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 23 April 2026
*/

public class AnabulMain {
    public static void main(String[] args) {
        Anabul Anabul1 = new Kucing("Oman");
        Anabul Anabul2 = new Anjing("Bobby");
        Anabul Anabul3 = new Burung("Pepi");

        Anabul1.Gerak();
        Anabul1.Bersuara();
        System.out.println();

        Anabul2.Gerak();
        Anabul2.Bersuara();
        System.out.println();

        Anabul3.Gerak();
        Anabul3.Bersuara();
    }
}
