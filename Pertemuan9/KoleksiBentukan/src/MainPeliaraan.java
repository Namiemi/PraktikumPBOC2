/* Nama File    : MainPeliaraan.java
 * Deskripsi    : main class dari class Peliaraan 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 07 Mei 2026
*/

public class MainPeliaraan {
    public static void main(String[] args) {
        Peliaraan P1 = new Peliaraan();

        P1.enqueueAnabul(new Anjing("Bobo"));
        P1.enqueueAnabul(new Burung("Cicit"));
        P1.enqueueAnabul(new Kucing("Cimmy", 1.3));
        P1.enqueueAnabul(new Kucing("Nula", 2.1));

        System.out.println(P1.getNbelm()); // 4

        System.out.println(P1.isMember(new Anjing("Bobo"))); // true

        System.out.println(P1.getAnabul()); // Anjing

        System.out.println(P1.countKucing()); // 2

        System.out.println(P1.bobotKucing()); // 3.4
        P1.showAnabul();

        System.out.println("Jenis Anabul:");
        P1.showJenisAnabul();

    }
}
