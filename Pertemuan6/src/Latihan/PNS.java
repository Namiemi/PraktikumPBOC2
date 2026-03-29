/* Nama File    : PNS.java
 * Deskripsi    : Subclass PNS yang extends Manusia dan implements Pajak
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /******* ATRIBUT *******/

    private String nip;
    private static int counterPns;
    /* A = NIM ke-14 = 8 */
    private static int A = 8;

    /******* METHOD *******/

    /* Konstruktor dengan alamat */
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPns++;
    }

    /* Konstruktor tanpa alamat */
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPns++;
    }

    /* Getter */
    public String getNip() {
        return this.nip;
    }

    public static int getCounterPns() {
        return counterPns;
    }

    /* Setter */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* Method untuk menghitung pajak */
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    /* Method untuk menghitung masa kerja */
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(getTglKerja(), LocalDate.now()).getYears();
        return tahun + A;
    }

    /* Method untuk mencetak informasi */
    @Override
    public void cetakInfo() {
        System.out.println("=== Informasi PNS ===");
        super.cetakInfo();
        System.out.println("NIP                 : " + nip);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("===========================");
    }
}
