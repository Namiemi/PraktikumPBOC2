/* Nama File    : Teman.java
 * Deskripsi    : berisi atribut dan method dalam class Teman 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 07 Mei 2026
*/

import java.util.ArrayList;

public class Teman {

    /********** ATRIBUT **********/

    private int nbelm;
    private ArrayList<String> Lnama;

    /********** METHOD **********/

    /* Konstruktor tanpa parameter */
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<String>();
    }

    /* Getter */
    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    /* Setter */
    public void setNama(int indeks, String nama_baru) {
        Lnama.set(indeks, nama_baru);
    }

    /* Method untuk menambahkan nama teman */
    public void addNama(String nama_baru) {
        this.nbelm += 1;
        this.Lnama.add(nama_baru);
    }

    /* Method untuk menghapus nama teman */
    public void delNama(String nama_del) {
        if (this.Lnama.remove(nama_del)) {
            this.nbelm -= 1;
        }
    }

    /* Method untuk mengecek apakah nama teman ada */
    public boolean isMember(String nama) {
        return this.Lnama.contains(nama);
    }

    /* Method untuk mengganti nama */
    public void gantiNama(String nama, String nama_baru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, nama_baru);
        }
    }

    /* Method untuk menghitung jumlah nama teman */
    public int countNama(String nama) {
        int count = 0;

        for (int i = 0; i < this.nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                count += 1;
            }
        }
        return count;
    }

    /* Method untuk menampilkan semua nama teman */
    public void showTeman() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lnama.get(i));
        }
    }

}
