/* Nama File    : MBangunDatar.java
 * Deskripsi    : untuk menguji class BangunDatar dengan membuat beberapa objek bangun datar dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(7.0, "Merah", "Hitam");
        BangunDatar P2 = new Persegi(7.0, "Biru", "Abu-abu");
        BangunDatar L1 = new Lingkaran(3.0, "Hijau", "Putih");
        BangunDatar L2 = new Lingkaran(3.0, "Kuning", "Coklat");

        System.out.println("Luas P1 == P2 : " + P1.isEqualLuas(P2));
        System.out.println("Keliling P1 == P2 : " + P1.isEqualKeliling(P2));

        System.out.println("Luas L1 == L2 : " + L1.isEqualLuas(L2));
        System.out.println("Keliling L1 == L2 : " + L1.isEqualKeliling(L2));

        System.out.println("Luas P1 == L1 : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1 : " + P1.isEqualKeliling(L1));

        System.out.println("Sisi P1 : " + ((Persegi) P1).getSisi());
        ((Persegi) P1).zoomIn();
        System.out.println("Sisi setelah Zoom In P1 : " + ((Persegi) P1).getSisi());
        ((Persegi) P1).zoomOut();
        System.out.println("Sisi setelah Zoom Out P1 : " + ((Persegi) P1).getSisi());
        ((Persegi) P1).zoom(150);
        System.out.println("Sisi setelah Zoom 150% P1 : " + ((Persegi) P1).getSisi());

        System.out.println("Jari L1 : " + ((Lingkaran) L1).getJari());
        ((Lingkaran) L1).zoomIn();
        System.out.println("Jari setelah Zoom In L1 : " + ((Lingkaran) L1).getJari());
        ((Lingkaran) L1).zoomOut();
        System.out.println("Jari setelah Zoom Out L1 : " + ((Lingkaran) L1).getJari());
        ((Lingkaran) L1).zoom(150);
        System.out.println("Jari setelah Zoom 150% L1 : " + ((Lingkaran) L1).getJari());

    }
}
