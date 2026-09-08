# Sistem Pengelolaan Pengaduan Masyarakat

## 1. Deskripsi Singkat Program

Sistem Pengelolaan Pengaduan Masyarakatmerupakan program berbasis Java yang digunakan untuk mencatat dan mengelola data pengaduan yang disampaikan oleh masyarakat. Program ini dapat digunakan untuk menangani berbagai laporan, seperti kerusakan fasilitas umum, masalah kebersihan, keamanan, jalan, maupun pelayanan. Setiap data pengaduan memiliki beberapa informasi, yaitu ID Pengaduan, Nama Pelapor, Jenis Pengaduan, Isi Pengaduan, Tanggal Pengaduan, dan Status Pengaduan. ID pengaduan dibuat secara otomatis oleh sistem, jenis pengaduan juga dipilih melalui kategori yang telah disediakan agar data yang tersimpan lebih konsisten. Pengguna dapat mengelola data melalui menu interaktif yang terdiri dari Tambah Pengaduan, Lihat Pengaduan, Ubah Status Pengaduan, Hapus Pengaduan, dan Keluar. Program dibuat dengan konsep Object-Oriented Programming (OOP) dan menggunakan `ArrayList` sebagai media penyimpanan data selama program berjalan.

---

## 2. Tujuan Program

Program ini dibuat untuk menerapkan konsep dasar pemrograman berorientasi objek melalui sebuah sistem CRUD sederhana.

Tujuan utama program adalah:

- Mencatat data pengaduan masyarakat secara terstruktur.
- Menampilkan data pengaduan yang telah tersimpan.
- Mengubah status pengaduan sesuai proses penanganannya.
- Menghapus data pengaduan yang tidak diperlukan.

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

## 4. Menu Program       
Menu utama yang tersedia dalam program adalah:      
```text
==================================================
      SISTEM PENGELOLAAN PENGADUAN MASYARAKAT
==================================================
  1. Tambah Pengaduan
  2. Lihat Pengaduan
  3. Ubah Status Pengaduan
  4. Hapus Pengaduan
  5. Keluar
==================================================
```

## 5. Alur Program
Program dimulai dengan menampilkan menu utama. Pengguna memilih menu menggunakan input angka. Setiap pilihan akan menjalankan proses yang berbeda, kemudian program kembali ke menu utama sampai pengguna memilih Keluar.                                                        
1. Tambah Pengaduan                 
Digunakan untuk menambahkan data pengaduan baru. ID dibuat otomatis oleh sistem, sedangkan pengguna mengisi nama pelapor, jenis pengaduan, isi pengaduan, dan tanggal. Status awal pengaduan adalah Menunggu.          
2. Lihat Pengaduan          
Digunakan untuk menampilkan seluruh data pengaduan yang tersimpan dalam `ArrayList`.               
3. Ubah Status Pengaduan            
Digunakan untuk mengubah status pengaduan berdasarkan ID. Pengguna dapat memilih status Menunggu, Diproses, atau Selesai.           
4. Hapus Pengaduan                                   
Digunakan untuk menghapus data berdasarkan ID. Data ditampilkan terlebih dahulu dan pengguna memberikan konfirmasi sebelum penghapusan dilakukan.                         
5. Keluar                                       
Digunakan untuk menghentikan perulangan menu dan mengakhiri program.                    

**Alur Program**
```text    
Mulai
  ↓
Tampilkan Menu
  ↓
Input Pilihan
  ↓
┌──────────────────────────────┐
│ 1. Tambah Pengaduan          │
│ 2. Lihat Pengaduan           │
│ 3. Ubah Status Pengaduan     │
│ 4. Hapus Pengaduan           │
│ 5. Keluar                    │
└──────────────────────────────┘
  ↓
Jalankan Proses
  ↓
Kembali ke Menu
  ↓
Pilih 5?
 ├── Tidak → Kembali ke Menu
 └── Ya    → Program Selesai
```
