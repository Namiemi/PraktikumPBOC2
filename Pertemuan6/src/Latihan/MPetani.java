/* Nama File    : MPetani.java
 * Deskripsi    : Main class Petani untuk menjalankan program 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;

public class MPetani {
    public static void main(String[] args) {
        Petani p1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        p1.cetakInfo();
    }
}
