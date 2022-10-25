# Resume Materi KMQE
## _(21) Review Web UI Testing with Serenity_
oleh Cecilia Syadira SIB-3 QA Class A

### Serenity
Serenity adalah Open Source BDD Framework yang membantu penulisan pengujian perangkat lunak otomatis untuk code dalam proses pengembangan agar dapat terstruktur dan terpelihara dengan baik. Bertujuan untuk memperlancar pengembangan dengan menangkap bug lebih cepat dan membantu memastikan rilis produk perangkat lunak akhir yang stabil dan berfungsi penuh.

### Serenity Architecture
1. Requirements, dinyatakan sebagai 'user stories' yang artinya acceptance criteria dibuat berdasarkan sudut pandang pengguna produk
    * Buat file story di direktori pengujian
    * Fitur terdiri dari 3 bagian, yaitu Feature, Scenario dan Gherkin. Syntax Scenario (Given, When, Then)
2. Automate your acceptance criteria (Membuat test class, test steps, page objects)
3. Implement the test, mengimplementasikan acceptance kriteria ke dalam kode, pengujian dipecah agar mudah dipelihara
4. Report on Test Result, hasil tes termasuk waktu eksekusi dan pesan error jika tes gagal

### Serenity Properties
* Webdriver.driver yaitu menentukan browser mana yang akan digunakan untuk menguji
* Ignore.failures.in.stories yaitu mempersiapkan Serenity untuk melanjutkan pengujian skneario berikutnya sekalipun skenario yang sedang berlangsung gagal

### Web UI Keywords
| Keyword | Kegunaan |
| ------ | ------ |
| WebUI.click() | Klik pada sebuah element |
| WebUI.closeBrowser() | Menutup semua browser yang sedang menjalankan automation |
| WebUi.doubleClick() | Klik 2x pada sebuah element |
| WebUI.navigateToUrl() | Navigasi ke Spesifik Website |
| WebUI.openBrowser() | Membuka open browser |
| WebUI.refresh() | Melakukan refresh pada browser |
| WebUI.scrollToElement() | Melakukan scroll sampai di element yang sudah ditentukan |
| WebUI.setText() | Input sebuah value kedalam input field |
| WebUI.verifyTextPresent() | Memverifikasi sebuah text di halaman web |
| WebUI.verifyElementVisible() | Memverifikasi sebuah element muncul di halaman web |
| WebUI.dismissAlert() | Klik cancel pada pop up alert |
| WebUI.takeScreenshot() | Mengambil screenshot pada halaman yang sedang dijalankan |
| WebUI.selectOptionByValue() | Memilih option berdasarkan value |
| WebUI.selectAllOption() | Memilih semua option yang ada |
