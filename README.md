# Sistem Pengelolaan Pengaduan Masyarakat

## 1. Deskripsi Singkat Program

**Sistem Pengelolaan Pengaduan Masyarakat** merupakan program berbasis Java yang digunakan untuk mencatat dan mengelola data pengaduan yang disampaikan oleh masyarakat. Program ini dapat digunakan untuk menangani berbagai laporan, seperti kerusakan fasilitas umum, masalah kebersihan, keamanan, jalan, maupun pelayanan.

Setiap data pengaduan memiliki beberapa informasi, yaitu **ID Pengaduan, Nama Pelapor, Jenis Pengaduan, Isi Pengaduan, Tanggal Pengaduan, dan Status Pengaduan**.

ID pengaduan dibuat secara otomatis oleh sistem dengan format `P001`, `P002`, `P003`, dan seterusnya sehingga pengguna tidak perlu memasukkan ID secara manual. Jenis pengaduan juga dipilih melalui kategori yang telah disediakan agar data yang tersimpan lebih konsisten.

Pengguna dapat mengelola data melalui menu interaktif yang terdiri dari **Tambah Pengaduan, Lihat Pengaduan, Ubah Status Pengaduan, Hapus Pengaduan, dan Keluar**.

Program dibuat dengan konsep **Object-Oriented Programming (OOP)** dan menggunakan `ArrayList` sebagai media penyimpanan data selama program berjalan.

---

## 2. Tujuan Program

Program ini dibuat untuk menerapkan konsep dasar pemrograman berorientasi objek melalui sebuah sistem CRUD sederhana.

Tujuan utama program adalah:

- Mencatat data pengaduan masyarakat secara terstruktur.
- Menampilkan data pengaduan yang telah tersimpan.
- Mengubah status pengaduan sesuai proses penanganannya.
- Menghapus data pengaduan yang tidak diperlukan.
- Menerapkan konsep OOP seperti class, object, constructor, encapsulation, access modifier, ArrayList, percabangan, dan perulangan.

---

## 3. Struktur Program

Program terdiri dari empat class, yaitu:

| Class | Peran |
| --- | --- |
| `PengelolaPengaduanMasyarakat` | Merupakan *entry point* program, menampilkan menu utama, menerima input pengguna, dan mengarahkan proses sesuai pilihan menu. |
| `Pengaduan` | Merupakan class entitas yang merepresentasikan satu data pengaduan beserta atribut dan method untuk mengakses datanya. |
| `PengelolaPengaduan` | Bertugas mengelola kumpulan object `Pengaduan` menggunakan `ArrayList` serta menangani proses CRUD dan pencarian data. |
| `ValidasiInput` | Berisi method untuk melakukan validasi terhadap input pengguna agar data yang dimasukkan sesuai dengan aturan program. |


---
### Struktur folder

```text
src/
└── pengelolaanpengaduan/
    ├── Main.java
    ├── Pengaduan.java
    ├── PengelolaPengaduan.java
    └── ValidasiInput.java
```


---
