/* Nama File    : LambdaMap.java
 * Deskripsi    : main class untuk menampilkan penggunaan lambda pada Map
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 04 Juni 2026
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("002", "Bambang");
        mahasiswaMap.put("003", "Cici");
        mahasiswaMap.put("004", "Didi");

        mahasiswaMap.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
