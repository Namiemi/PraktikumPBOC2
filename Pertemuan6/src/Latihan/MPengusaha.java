/* Nama File    : MPengusaha.java
 * Deskripsi    : Main class Pengusaha untuk menjalankan program 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;

public class MPengusaha {
    public static void main(String[] args) {
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        pe1.cetakInfo();
    }
}
