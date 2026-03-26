/* Nama File    : IResize.java
 * Deskripsi    : untuk membuat interface IResize 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Maret 2026
*/

public interface IResize {
    /* Menambah ukuran menjadi 10% lebih besar */
    public void zoomIn();

    /* Mengurangi ukuran menjadi 10% lebih kecil */
    public void zoomOut();

    /* Mengubah ukuran sesuai dengan persentase yang ditentukan */
    public void zoom(int persentase);
}
