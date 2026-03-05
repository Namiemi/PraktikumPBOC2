/* Nama File    : MMahasiswa.java
 * Deskripsi    : untuk menguji class Mahasiswa dengan membuat beberapa objek mahasiswa dan memanggil method 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 05 Maret 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        MataKuliah JARKOM = new MataKuliah("JARKOM", "Jaringan Komputer", 3);
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("124", "Agus", "Sistem Informasi");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        Kendaraan K2 = new Kendaraan("H5678CD", "Mobil");

        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        System.out.println("\n-------------------------------------------\n");

        Mahasiswa M2 = new Mahasiswa();
        M2.setNIM("235");
        M2.setNama("Budi");
        M2.setProdi("Sistem Informasi");
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);
        M2.addMatkul(ASA);
        M2.addMatkul(JARKOM);
        M2.printMhs();
        M2.printDetailMhs();
    }
}
