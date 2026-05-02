/* Nama File    : Main.java
 * Deskripsi    : berisi program utama 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 30 April 2026
*/

public class Main {

    public static void main(String[] args) {
        Datum<Anabul> data = new Datum<>(new Kucing("Milo", 3.0));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Lora"));

        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Dora", 4.3));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Kembangtelon("Jack", 3.1));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data2.tampilkanAnabul(data2.getIsi());
        System.out.println();

        /* Method Generik */
        /* 3. a. Realisasi Kasus Tukar */
        System.out.println("Prosedur Tukar\n");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kiti", 5.0));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Lora"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.tampilkanAnabul(hewan1.getIsi());
        System.out.println();
        hewan2.tampilkanAnabul(hewan2.getIsi());
        System.out.println();

        /* 3. b. Aplikasi Tukar pada integer, string, dan Anabul */
        /* Integer */
        Datum<Integer> angka1 = new Datum<>(10);
        Datum<Integer> angka2 = new Datum<>(15);

        OperatorGenerik.Tukar(angka1, angka2);
        System.out.println(angka1.getIsi() + "\n");
        System.out.println(angka2.getIsi() + "\n");

        /* String */
        Datum<String> nama1 = new Datum<>("Andi");
        Datum<String> nama2 = new Datum<>("Budi");

        OperatorGenerik.Tukar(nama1, nama2);
        System.out.println(nama1.getIsi() + "\n");
        System.out.println(nama2.getIsi() + "\n");

        /* Anabul */
        Datum<Anabul> hewan3 = new Datum<>(new Anjing("Yami"));
        Datum<Anabul> hewan4 = new Datum<>(new Burung("Titi"));

        OperatorGenerik.Tukar(hewan3, hewan4);
        hewan3.tampilkanAnabul(hewan3.getIsi());
        System.out.println();
        hewan4.tampilkanAnabul(hewan4.getIsi());
        System.out.println();

        /* 3. c. Realisasi dan aplikasi generik Bobot2 */
        Kucing kucing1 = new Kucing("Jojo", 5.0);
        Kucing kucing2 = new Kucing("Lola", 3.0);

        kucing1.printBobot2(kucing1, kucing2);

        /* Larik Generik */
        /* 4. a. Realisasi kelas Data */
        System.out.println("Aplikasi Kelas Data :");
        Data<String> dataNama = new Data<>(new String[0]);
        dataNama.setIsi(1, "Andi");
        dataNama.setIsi(2, "Budi");
        dataNama.setIsi(3, "Cici");

        System.out.println("Isi posisi 1 : " + dataNama.getIsi(1));
        System.out.println("Isi posisi 2 : " + dataNama.getIsi(2));
        System.out.println("Isi posisi 3 : " + dataNama.getIsi(3));
        System.out.println("Isi posisi 10 : " + dataNama.getIsi(10));

        /* 4. b. Realisasi setIsi objek Anabul */
        System.out.println("\nAplikasi setIsi objek Anabul :");
        dataNama.setIsi(1, "Popo");
        System.out.println("Isi posisi 1 : " + dataNama.getIsi(1));

        /* 4. c. Realisasi getIsi objek Anabul */
        System.out.println("\nAplikasi getIsi objek Anabul :");
        System.out.println("Isi posisi 3 : " + dataNama.getIsi(3));

        /* 4. d. Realisasi getSize objek Anabul */
        System.out.println("\nAplikasi getSize objek Anabul: ");
        System.out.println("Size larik dataNama : " + dataNama.getSize());
    }
}
