/* Nama File    : Petani.java
 * Deskripsi    : Subclass Petani yang extends Manusia dan implements Pajak
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /******* ATRIBUT *******/

    private String asal_kota;
    private static int counterPetani;
    /* C = NIM ke-12 = 0 */
    private static int C = 0;

    /******* METHOD *******/

    /* Konstruktor dengan alamat */
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* Konstruktor tanpa alamat */
    public Petani(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* GETTER */
    public String getAsalKota() {
        return this.asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    /* SETTER */
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    /* Method untuk menghitung pajak */
    @Override
    public double hitungPajak() {
        return 0;
    }

    /* Method untuk menghitung masa kerja */
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(getTglKerja(), LocalDate.now()).getYears();
        return tahun + C;
    }

    /* Method untuk mencetak informasi */
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Petani ===");
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("===========================");
    }
}
