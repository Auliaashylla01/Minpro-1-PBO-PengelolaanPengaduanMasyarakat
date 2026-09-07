/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pengelolaanpengaduanmasyarakt;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PengelolaanPengaduanMasyarakt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PengelolaPengaduan pengelola = new PengelolaPengaduan();

        int menu;

        do {

            tampilkanHeader();
            tampilkanMenu();

            menu = ValidasiInput.inputMenu(scanner);

            switch (menu) {
            case 1 -> tambahPengaduan(scanner, pengelola);
            case 2 -> pengelola.lihatPengaduan();
            case 3 -> ubahStatus(scanner, pengelola);
            case 4 -> hapusPengaduan(scanner, pengelola);
            case 5 -> System.out.println("\nTerima kasih telah menggunakan sistem.");
            default -> System.out.println("\nMenu tidak tersedia.");
}
            if (menu != 5) {
                System.out.println("\nTekan ENTER untuk kembali ke menu...");
                scanner.nextLine();
            }

        } while (menu != 5);

        scanner.close();
    }
    // Header
    public static void tampilkanHeader() {

        System.out.println("\n==================================================");
        System.out.println("      SISTEM PENGELOLAAN PENGADUAN MASYARAKAT");
        System.out.println("==================================================");
    }

    // Menu utama
    public static void tampilkanMenu() {

        System.out.println("1. Tambah Pengaduan");
        System.out.println("2. Lihat Pengaduan");
        System.out.println("3. Ubah Status Pengaduan");
        System.out.println("4. Hapus Pengaduan");
        System.out.println("5. Keluar");
        System.out.println("==================================================");
    }
     // Menu 1
    public static void tambahPengaduan(
            Scanner scanner,
            PengelolaPengaduan pengelola) {

        System.out.println("\n==================================================");
        System.out.println("              TAMBAH PENGADUAN");
        System.out.println("==================================================");
    
        
        String id = pengelola.generateId();

        System.out.println("ID Pengaduan : " + id);
        

        String nama = ValidasiInput.inputTidakKosong(
                scanner,
                "Masukkan Nama Pelapor    : ");

       System.out.println("\nJenis Pengaduan:");
       System.out.println("1. Fasilitas Umum");
       System.out.println("2. Kebersihan");
       System.out.println("3. Keamanan");
       System.out.println("4. Jalan");
       System.out.println("5. Pelayanan");

        String jenis;

        while (true) {

            System.out.print("Pilih Jenis Pengaduan : ");
            String pilihanJenis = scanner.nextLine();

            switch (pilihanJenis) {

                case "1":
                    jenis = "Fasilitas Umum";
                    break;

                case "2":
                    jenis = "Kebersihan";
                    break;

                case "3":
                    jenis = "Keamanan";
                    break;

                case "4":
                    jenis = "Jalan";
                    break;

                case "5":
                    jenis = "Pelayanan";
                    break;

                default:
                    System.out.println(
                            "Pilihan jenis pengaduan tidak tersedia."
                    );
                    continue;
            }

    break;
}

        String isi = ValidasiInput.inputTidakKosong(
                scanner,
                "Masukkan Isi Pengaduan   : ");

        String tanggal = ValidasiInput.inputTidakKosong(
                scanner,
                "Masukkan Tanggal         : ");
        
         Pengaduan pengaduan = new Pengaduan(
                id,
                nama,
                jenis,
                isi,
                tanggal
        );

        pengelola.tambahPengaduan(pengaduan);

        System.out.println("\nPengaduan berhasil ditambahkan.");
        System.out.println("Status awal: Menunggu");
    }
     // Menu 3
    public static void ubahStatus(
            Scanner scanner,
            PengelolaPengaduan pengelola) {

        System.out.println("\n==================================================");
        System.out.println("              UBAH STATUS PENGADUAN");
        System.out.println("==================================================");

        String id = ValidasiInput.inputTidakKosong(
                scanner,
                "Masukkan ID Pengaduan : ");

        Pengaduan pengaduan = pengelola.cariPengaduan(id);

        if (pengaduan == null) {

            System.out.println("Pengaduan tidak ditemukan.");
            return;
        }
         System.out.println("\nData ditemukan.");
        System.out.println("Pelapor : " + pengaduan.getNamaPelapor());
        System.out.println("Status saat ini : " + pengaduan.getStatus());

        System.out.println("\nPilih Status Baru:");
        System.out.println("1. Menunggu");
        System.out.println("2. Diproses");
        System.out.println("3. Selesai");

        int pilihanStatus =
                ValidasiInput.inputStatus(scanner);

        String statusBaru;

        switch (pilihanStatus) {

            case 1:
                statusBaru = "Menunggu";
                break;
            case 2:
                statusBaru = "Diproses";
                break;

            case 3:
                statusBaru = "Selesai";
                break;

            default:
                statusBaru = "Menunggu";
        }
        pengelola.ubahStatus(id, statusBaru);

        System.out.println(
                "Status berhasil diubah menjadi "
                + statusBaru + "."
        );
    }
    public static void hapusPengaduan(
            Scanner scanner,
            PengelolaPengaduan pengelola) {

        System.out.println("\n==================================================");
        System.out.println("              HAPUS PENGADUAN");
        System.out.println("==================================================");

        String id = ValidasiInput.inputTidakKosong(
                scanner,
                "Masukkan ID Pengaduan : ");

        Pengaduan pengaduan = pengelola.cariPengaduan(id);

        if (pengaduan == null) {

            System.out.println("Pengaduan tidak ditemukan.");
            return;
        }
        System.out.println("\nData ditemukan:");
        System.out.println("ID      : " + pengaduan.getIdPengaduan());
        System.out.println("Pelapor : " + pengaduan.getNamaPelapor());
        System.out.println("Jenis   : " + pengaduan.getJenisPengaduan());

        System.out.print("\nYakin ingin menghapus data ini? ");

        boolean konfirmasi =
                ValidasiInput.inputKonfirmasi(scanner);

        if (konfirmasi) {

            pengelola.hapusPengaduan(id);

            System.out.println("Pengaduan berhasil dihapus.");

        } else {

            System.out.println("Penghapusan dibatalkan.");
        }
    }
}
