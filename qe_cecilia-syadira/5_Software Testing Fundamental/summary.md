# Resume Materi KMQE

## _(5) Software Testing Fundamental_
oleh Cecilia Syadira SIB-3 QA Class A

### How to Important Software Testing

Terdapat 2 peristiwa yang menggambarkan pentingnya pengadaan Software Testing :
1. Dialami oleh Suncorp Bank yang mengalami kegagalan setelah melakukan upgrade versi pada software, menyebabkan hilangnya uang dari rekening bank customer
2. Terjadi pada alat Therac-25 yaitu computer-controlled radiation therapy atau pengolah radiasi yang digunakan pada pengobatan pasien pengidap penyakit kanker. Pada saat itu terdapat bug yang berdampak pada kegagalan fungsional sehinga menjadikan dosis radiasi meningkat. Menyebabkan 3 orang meninggal dan 3 lainnya luka parah

Kesimpulan yang dapat diambil dari 2 peristiwa diatas, dengan adanya pengadaan software testing kita dapat menghemmat uang, menjamin kualitas produk, terjaganya keamanan dan kepuasan customer. Mengapa? sebab bugs pada software memiliki potensi yang membahayakan dari segala aspek.

### Testing Platform

Testing Platform dibedakan menjadi 4 macam :
1. API, Application Programming Interface adalah pengembangan inovasi software yang memungkinkan aplikasi bertukar data dan fungsionalitas. Dapat dikatakan sebagai penghubung antara satu aplikasi dengan aplikasi lainnya atau antara klien dan server
2. Web, Website adalah sekumpulan halaman yang memuat informasi tertentu dan dapat diakses melalui URL atau alamat website dengan menggunakan internet
3. Mobile, Mobile adalah sistem perangkat lunak telekomunikasi yang terbagi menjadi 2 yaitu Android dan iOS, didalamnya terdapat aplikasi
4. Desktop, Desktop adalah tampilan utama didalamnya terdapat aplikasi yang berjalan


### Types of Software Testing

1. Functional Testing yaitu pengujian yang bertujuan untuk memverifikasi apakah fungsi-fungsi pada aplikasi telah berjalan sesuai requirement
  - Manual Testing, pengujian yang dilakukan untuk memeriksa dan memastikan ada atau tidaknya bug dalam sistem software. Proses ini dilakukan oleh software tester dengan mengeksekusi kasus uji dan membuat laporan pengujian
  - Automation Testing, pengujian ini membutuhkan tools dalam eksekusi test case dan bergantung pada code/test script dengan capaian dapat menyelesaikan seluruh pengujian dengan waktu yang relatif singkat
2. Non-Functional Testing yaitu pengujian yang dilakukan setelah Functional Testing untuk memverifikasi aspek non-fungsional suatu aplikasi. Bertujuan untuk memperbesar peluang dalam meningkatkan kualitas perangkat lunak
  - Usability Testing, bertujuan untuk mengetahui seberapa efisien dan efektif suatu aplikasi dalam membantu user mencapai keinginannya, atau dapat disebut dengan User Experience (pengalaman pengguna)
  - Portability Testing, bertujuan untuk menentukan mudah atau sulitnya suatu aplikasi untuk dapat diakses dalam berbagai perangkat dan konektivitasnya
  - Performance Testing, bertujuan untuk memastikan aplikasi dapat bekerja dengan baik di bawah beban kerja yang diharapkan
  - Reliability Testing, dilakukan dengan menjalankan aplikasi untuk menemukan kegagalan, sehingga aplikasi dapat terjamin keandalannya dan terbebas dari kecacatan
  - Security Testing, dilakukan untuk mempertahankan dan menjamin keamanan data pengguna
3. Maintenance Testing yaitu pengujian yang dilakukan setelah aplikasi atau produk perangkat lunak telah dirilis ke pengguna/konsumen. Bertujuan untuk mempertahankan atau meningkatkan kualitas sistem selama masa pakai nya
  - Regression Testing, dilakukan untuk memastikan tidak ada bug muncul akibat dari penambahan fitur atau fungsionalitas baru

### Levels of Testing
Berikut beberapa tahapan pengujian dari awal hingga akhir :
1. Unit Testing, pengujian perangkat lunak yang menguji setiap unit atau komponen dari software yang diuji. Dilakukan pada proses development dari sebuah software oleh developer. Unit yang dimaksud dapat berupa function, method, prosedur, module atau object. Tujuannya memvalidasi setiap unit pada perangkat lunak dapat berjalan sesuai yang diharapkan. Untuk melakukan Unit Testing dapat menggunakan beberapa Automation Tools seperti JUnit, NUnit, JMockit, Emma, PHP Unit dan lainnya
2. Integration Testing, pengujian dari hasil penggabungan unit-unit atau komponen yang berinteraksi pada software. Bertujuan untuk memeriksa kinerja dan struktur program yang telah di rancang
3. System Testing, pengujian yang bertujuan untuk memverifikasi keseluruhan skenario telah berjalan dengan baik dan memenuhi persyaratan, cakupan pengujiannya pada aspek Fungsionl dan Non-Fungsional
4. Acceptance Testing, pengujian dilakukan untuk menentukan apakah sistem perangkat lunak yang di bangun telah memenuhi kebutuhan atau kriteria sebelum di rilis ke pengguna


