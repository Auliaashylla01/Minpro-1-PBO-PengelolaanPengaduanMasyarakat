/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pengelolaanpengaduanmasyarakt;

/**
 *
 * @author ASUS
 */
//Class ini digunakan untuk menyimpan atribut dan data dari pengaduan masyarakat.
public class Pengaduan {
    //Data private yang hanya bisa diakses secara langsung dari dalam class ini
    private String idPengaduan;
    private String namaPelapor;
    private String jenisPengaduan;
    private String isiPengaduan;
    private String tanggalPengaduan;
    private String status;
    
    //Constructor dipanggil saat objek Pengaduan baru dibuat. 
    //Digunakan untuk mengisi nilai awal dari atribut pengaduan.
    public Pengaduan(String idPengaduan, String namaPelapor,
                     String jenisPengaduan, String isiPengaduan,
                     String tanggalPengaduan) {

        this.idPengaduan = idPengaduan;
        this.namaPelapor = namaPelapor;
        this.jenisPengaduan = jenisPengaduan;
        this.isiPengaduan = isiPengaduan;
        this.tanggalPengaduan = tanggalPengaduan;
        //Status awal yang di-set otomatis saat pengaduan baru pertama kali dibuat
        this.status = "Pengaduan Kamu sedang Menunggu Konfirmasi...";
    }
    //Penerapan Getter Pada Sistem digunakan untuk mengambil atau membaca nilai atribut
    public String getIdPengaduan() {
        return idPengaduan;
    }

    public String getNamaPelapor() {
        return namaPelapor;
    }

    public String getJenisPengaduan() {
        return jenisPengaduan;
    }

    public String getIsiPengaduan() {
        return isiPengaduan;
    }

    public String getTanggalPengaduan() {
        return tanggalPengaduan;
    }

    public String getStatus() {
        return status;
    }

    // Penerapan Setter Pada Sistem digunakan untuk mengubah nilai atribut status
    public void setStatus(String status) {
        this.status = status;
    }
}
