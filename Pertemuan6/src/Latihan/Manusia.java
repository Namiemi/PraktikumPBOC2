/* Nama File    : Manusia.java
 * Deskripsi    : Superclass dari PNS, Pengusaha, dan Petani
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Minggu, 29 Maret 2026
*/

package Latihan;

import java.time.LocalDate;

public abstract class Manusia {

    /******* ATRIBUT *******/

    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /******* METHOD *******/

    /* Konstruktor tanpa alamat */
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* Konstruktor dengan alamat */
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* Getter */
    public String getNama() {
        return this.nama;
    }

    public LocalDate getTglKerja() {
        return this.tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public static int getcounterMns() {
        return counterMns;
    }

    /* Setter */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /* Mencetak informasi Manusia */
    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + pendapatan);
    }

    /* Abstract Method, untuk menghitung masa kerja */
    public abstract int hitungMasaKerja();
}
