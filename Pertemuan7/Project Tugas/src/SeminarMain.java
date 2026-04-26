public class SeminarMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Agus", "12345");
        Dosen dosen2 = new Dosen("Joko", "67890");

        Mahasiswa mhs1 = new Mahasiswa("Adit", "123", "Agus");
        Mahasiswa mhs2 = new Mahasiswa("Budi", "456", "Joko");
        Mahasiswa mhs3 = new Mahasiswa("Caca", "789", "Agus");
        Mahasiswa mhs4 = new Mahasiswa("Dedi", "321", "Joko");
        Mahasiswa mhs5 = new Mahasiswa("Eren", "654", "Agus");

        Seminar seminar = new Seminar();
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);
        seminar.tampilPeserta();

        System.out.println("\nJumlah Peserta : " + seminar.countPeserta());
        System.out.println("Jumlah Mahasiswa : " + seminar.countMahasiswa());

        mhs1.setWali("Joko");
        mhs1.tampilDataMahasiswa();
    }
}
