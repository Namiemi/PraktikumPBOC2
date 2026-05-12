/* Nama File    : MainTeman.java
 * Deskripsi    : berisi method main dalam class MainTeman 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 07 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman T1 = new Teman();

        T1.addNama("Andi"); // idx = 0
        T1.addNama("Budi"); // idx = 1
        T1.addNama("Cici"); // idx = 2
        T1.addNama("Dudi"); // idx = 3

        System.out.println(T1.getNbelm()); // 4

        T1.setNama(2, "Nana");
        T1.delNama("Budi");

        System.out.println(T1.getNbelm()); // 3

        System.out.println(T1.isMember("Cici")); // false

        T1.gantiNama("Andi", "Ena");

        System.out.println(T1.countNama("Ena")); // 1
        T1.showTeman();
    }
}
