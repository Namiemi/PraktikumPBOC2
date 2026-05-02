# Konsep Generik (Generic) dalam Pemrograman

## Pengertian

Generik adalah konsep dalam pemrograman yang memungkinkan kita membuat struktur data, fungsi, atau kelas yang dapat bekerja dengan berbagai tipe data tanpa harus menuliskan ulang kode untuk setiap tipe tersebut.

## Cara Kerja

Generik bekerja dengan menggunakan parameter tipe (type parameter) sebagai pengganti tipe data yang sebenarnya. Parameter ini akan ditentukan saat kode digunakan, bukan saat didefinisikan. Dengan demikian, satu implementasi dapat digunakan untuk banyak jenis data.

Sebagai contoh, daripada membuat fungsi terpisah untuk `int`, `float`, atau `string`, kita cukup membuat satu fungsi generik yang dapat menangani semuanya.

## Tujuan dan Manfaat

- **Reusability (Penggunaan Ulang):** Kode dapat digunakan kembali untuk berbagai tipe data.
- **Type Safety:** Kesalahan tipe data dapat dicegah sejak proses kompilasi.
- **Efisiensi Kode:** Mengurangi duplikasi kode yang serupa.
- **Fleksibilitas:** Memungkinkan pembuatan struktur data dan algoritma yang lebih umum.
