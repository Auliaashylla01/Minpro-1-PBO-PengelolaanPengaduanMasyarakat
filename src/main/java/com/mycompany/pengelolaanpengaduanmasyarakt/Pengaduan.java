/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pengelolaanpengaduanmasyarakt;

/**
 *
 * @author ASUS
 */
public class Pengaduan {
    private String idPengaduan;
    private String namaPelapor;
    private String jenisPengaduan;
    private String isiPengaduan;
    private String tanggalPengaduan;
    private String status;
    
    // Constructor
    public Pengaduan(String idPengaduan, String namaPelapor,
                     String jenisPengaduan, String isiPengaduan,
                     String tanggalPengaduan) {

        this.idPengaduan = idPengaduan;
        this.namaPelapor = namaPelapor;
        this.jenisPengaduan = jenisPengaduan;
        this.isiPengaduan = isiPengaduan;
        this.tanggalPengaduan = tanggalPengaduan;
        this.status = "Menunggu";
    }
    // Getter
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

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }
}
