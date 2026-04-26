## Polimorfisme dalam Pemrograman Berorientasi Objek

Polimorfisme adalah konsep di mana satu antarmuka atau metode yang sama dapat memiliki perilaku yang berbeda tergantung pada objek yang menggunakannya. Dengan kata lain, pemanggilan metode yang sama dapat menghasilkan aksi yang berbeda karena diimplementasikan secara spesifik oleh masing-masing kelas turunan.

Dalam konteks inheritance, polimorfisme biasanya diwujudkan melalui _method overriding_. Kelas induk mendefinisikan metode secara umum, kemudian setiap subclass mengimplementasikan versi mereka sendiri sesuai kebutuhan.

Sebagai contoh, metode `getNomor()` pada kelas induk dapat digunakan baik oleh objek Dosen maupun Mahasiswa. Walaupun pemanggilannya sama, hasil yang diberikan berbeda karena Dosen mengembalikan NIP, sedangkan Mahasiswa mengembalikan NIM.
