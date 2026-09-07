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
public class PengelolaPengaduan {
    private ArrayList<Pengaduan> daftarPengaduan;

    // Constructor
    public PengelolaPengaduan() {
        daftarPengaduan = new ArrayList<>();}
    
    // Mengecek apakah ID sudah digunakan
    public boolean idSudahAda(String idPengaduan) {

        for (Pengaduan pengaduan : daftarPengaduan) {

            if (pengaduan.getIdPengaduan().equalsIgnoreCase(idPengaduan)) {
                return true;
            }
        }

        return false;
    }
    // Membuat ID Pengaduan otomatis
    public String generateId() {

    int nomor = 1;
    String idBaru;

    do {
        idBaru = String.format("P%03d", nomor);
        nomor++;
    } while (idSudahAda(idBaru));

    return idBaru;
}

    // Menambahkan pengaduan
    public void tambahPengaduan(Pengaduan pengaduan) {
    daftarPengaduan.add(pengaduan);
}

    // Menampilkan semua pengaduan
    public void lihatPengaduan() {

        if (daftarPengaduan.isEmpty()) {
            System.out.println("\nBelum ada data pengaduan.");
            return;
        }

        System.out.println("\n==================================================");
        System.out.println("               DATA PENGADUAN"                       );
        System.out.println("====================================================");

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
     // Mencari pengaduan berdasarkan ID
    public Pengaduan cariPengaduan(String idPengaduan) {

        for (Pengaduan pengaduan : daftarPengaduan) {

            if (pengaduan.getIdPengaduan().equalsIgnoreCase(idPengaduan)) {
                return pengaduan;
            }
        }

        return null;
    }

    // Mengubah status pengaduan
    public boolean ubahStatus(String idPengaduan, String statusBaru) {

        Pengaduan pengaduan = cariPengaduan(idPengaduan);

        if (pengaduan != null) {
            pengaduan.setStatus(statusBaru);
            return true;
        }
         return false;
    }
    
    // Menghapus pengaduan
    public boolean hapusPengaduan(String idPengaduan) {

        Pengaduan pengaduan = cariPengaduan(idPengaduan);

        if (pengaduan != null) {
            daftarPengaduan.remove(pengaduan);
            return true;
        }

        return false;
    }
}
