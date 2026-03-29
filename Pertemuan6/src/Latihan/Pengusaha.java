/* Nama File    : Pengusaha.java
 * Deskripsi    : Subclass Pengusaha yang extends Manusia dan implements Pajak
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {

    /******* ATRIBUT *******/

    private String npwp;
    private static int counterPengusaha;
    /* B = NIM ke-13 = 5 */
    private static int B = 5;

    /******* METHOD *******/

    /* Konstruktor dengan alamat */
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* Konstruktor tanpa alamat */
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* GETTER */
    public String getNpwp() {
        return this.npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /* SETTER */
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /* Method untuk menghitung pajak */
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    /* Method untuk menghitung masa kerja */
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(getTglKerja(), LocalDate.now()).getYears();
        return tahun + B;
    }

    /* Method untuk mencetak informasi */
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi Pengusaha ===");
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("===========================");
    }
}
