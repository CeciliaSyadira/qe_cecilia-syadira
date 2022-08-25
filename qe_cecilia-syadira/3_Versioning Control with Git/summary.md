# Resume Materi KMQE
## _(3) Versioning Control with Git_
oleh Cecilia Syadira SIB-3 QA Class A


### Versioning
Versioning yaitu sebuah proses yang mengalami perubahan versi. Tools nya terdiri dari :
- Version Control System (VCS) => Single User, Centralized dan Distributed
- Source Code Manager (SCM)
- Revision Control System (RCS)

### GIT
GIT yaitu software berbasis Version Control System (VMS) yang digunakan untuk proses development dengan mengatur dan menyimpan versi dari source code pada repository. Dengan kata lain, setiap orang dapat melakukan uploading dengan adanya sinkronisasi remote server.

| Perintah | Penjelasan |
| ------ | ------ |
| GIT _init_ | digunakan untuk membuat repository pada lokal |
| GIT _clone_ | digunakan untuk mengkloning repository |
| GIT _config_ | digunakan untuk |
| GIT _status_ | digunakan untuk mengetahui status dari repository |
| GIT _add_ | digunakan untuk menambahkan file baru pada repository |
| GIT _commit_ | digunakan untuk menyimpan perubahan, namun tidak pada repository |
| GIT _push_ | digunakan untuk mengirimkan perubahan setelah commit ke repository |
| GIT _checkout_ | digunakan untuk menukar branch |
| GIT _branch_ | digunakan untuk menampilkan semua cabang/branch di repository |
| GIT _merge_ | digunakan untuk menggabungkan cabang |


## Workflow Collaboration

Untuk menciptakan kolaborasi kerja yang optimal dalam _development_ perlu dibuat beberapa branch/percabangan. Yang terdiri dari :

```sh
Branch Master
```
Branch master dapat dikatakan sebagai main repository

```sh
Branch Developmemt
```
Branch development lokasi percabangan yang digunakan untuk pengembangan

```sh
Branch Feature
```
Branch feature yaitu lokasi penambahan feature
