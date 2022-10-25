# Resume Materi KMQE
## _(23) Introduction JMeter and Tutorial Record with JMeter_
oleh Cecilia Syadira SIB-3 QA Class A


### JMeter
JMeter atau The Apache JMeterTM adalah aplikasi open source berbasis Java yang dapat dipergunakan untuk performance test bisa digunakan untuk melakukan load/stress testing.

JMeter bisa dijalankan dengan 2 cara, dengan GUI (berbasis Java Desktop) atau non-GUI (Command Line Interface). 

### Komponen JMeter
| Komponen | Penjelasan |
| ------ | ------ |
| Test Plan | Serangkaian Test yang akan dilakukan |
| Thread Groups | menambahkan trafik/user visitor ke dalam skenario yang mau di test |
| Samplers | Request yang akan dikirimkan ke server |
| Config Elements | Elemen yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server |
| Listeners | Menampilkan proses dan hasil test secara grafis atau bentuk tabel|
| Timers | Menunjukkan waktu yang digunakan pada setiap perform |
| Assertions | Kriteria tambahan digunakan untuk memvalidasi respons permintaan yang telah dikirim ke server |
| Pre-Post Processors | Memproses response data sebelum atau sesudah tes |

### Install & Open JMeter
1. Install JDK (Java Development Kit)
2. Install JMeter
   * Download dan Ekstrak file JMater
   * Buka direktori JMeter dan arahkan ke folder Bin
   * Jalankan JMeter dengan CD
3. Install Plugin (file .jar)
   * Buka direktori JMeter dan arahakan ke direktori lib/ext
   * Pindahkan file plugin yang sudah di download (file. jar) ke dalam lib/ext di JMeter direktori
