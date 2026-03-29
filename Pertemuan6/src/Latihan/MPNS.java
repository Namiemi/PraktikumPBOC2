/* Nama File    : MPNS.java
 * Deskripsi    : Main class PNS untuk menjalankan program 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;

public class MPNS {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        p1.cetakInfo();
        p2.cetakInfo();
    }
}
