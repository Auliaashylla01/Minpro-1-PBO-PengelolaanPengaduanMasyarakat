/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pengelolaanpengaduanmasyarakt;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
//Class PengelolaPengaduan berfungsi untuk mengelola daftar atau kumpulan objek Pengaduan.
public class PengelolaPengaduan {
    //Kumpulan data pengaduan disimpan dalam bentuk ArrayList
    private ArrayList<Pengaduan> daftarPengaduan;

    //Constructor untuk mengatur list pengaduan agar siap digunakan (tidak null)
    public PengelolaPengaduan() {
        daftarPengaduan = new ArrayList<>();}
    
   //Mengecek apakah suatu ID Pengaduan sudah ada di dalam list.
    public boolean idSudahAda(String idPengaduan) {

        for (Pengaduan pengaduan : daftarPengaduan) {

            if (pengaduan.getIdPengaduan().equalsIgnoreCase(idPengaduan)) {
                return true; //ID ditemukan
            }
        }

        return false; // ID belum pernah dipakai
    }
    //Membuat ID Pengaduan otomatis dengan format P001, P002, dan seterusnya.
    public String generateId() {

    int nomor = 1;
    String idBaru;

    do {
        idBaru = String.format("P%03d", nomor); // Format 3 digit angka (P001)
        nomor++;
    } while (idSudahAda(idBaru));

    return idBaru;
}

    //Menambahkan objek Pengaduan baru ke dalam ArrayList.
    public void tambahPengaduan(Pengaduan pengaduan) {
    daftarPengaduan.add(pengaduan);
}

    //Menampilkan seluruh daftar pengaduan yang ada
    public void lihatPengaduan() {
        //Cek apakah daftar masih kosong
        if (daftarPengaduan.isEmpty()) {
            System.out.println("\n[Informasi] Belum ada data pengaduan yang tersimpan.");
            return;
        }

        System.out.println("\n==================================================");
        System.out.println("               DATA PENGADUAN"                       );
        System.out.println("==================================================");
        // Perulangan untuk menampilkan setiap item pengaduan
        for (Pengaduan pengaduan : daftarPengaduan) {

            System.out.println("ID       : " + pengaduan.getIdPengaduan());
            System.out.println("Pelapor  : " + pengaduan.getNamaPelapor());
            System.out.println("Jenis    : " + pengaduan.getJenisPengaduan());
            System.out.println("Isi      : " + pengaduan.getIsiPengaduan());
            System.out.println("Tanggal  : " + pengaduan.getTanggalPengaduan());
            System.out.println("Status   : " + pengaduan.getStatus());

            System.out.println("--------------------------------------------------");
        }
    }
    //Mencari objek Pengaduan berdasarkan ID.
    public Pengaduan cariPengaduan(String idPengaduan) {

        for (Pengaduan pengaduan : daftarPengaduan) {

            if (pengaduan.getIdPengaduan().equalsIgnoreCase(idPengaduan)) {
                return pengaduan;
            }
        }

        return null; //Pengaduan tidak ditemukan
    }

    //Mengubah status pengaduan berdasarkan ID.
    public boolean ubahStatus(String idPengaduan, String statusBaru) {

        Pengaduan pengaduan = cariPengaduan(idPengaduan);

        if (pengaduan != null) {
            pengaduan.setStatus(statusBaru); //Update status lewat method setter di Pengaduan.java
            return true;
        }
         return false;
    }
    
    //Menghapus pengaduan dari ArrayList berdasarkan ID.
    public boolean hapusPengaduan(String idPengaduan) {

        Pengaduan pengaduan = cariPengaduan(idPengaduan);

        if (pengaduan != null) {
            daftarPengaduan.remove(pengaduan); //Hapus objek dari list
            return true;
        }

        return false;
    }
}
