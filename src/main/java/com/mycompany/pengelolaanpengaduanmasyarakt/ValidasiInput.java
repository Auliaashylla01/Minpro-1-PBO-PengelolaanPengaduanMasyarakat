/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pengelolaanpengaduanmasyarakt;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
//Class ValidasiInput digunakan untuk method untuk memvalidasi input user agar mencegah error program.
public class ValidasiInput {
     //Memastikan input teks dari user tidak kosong/spasi saja.
    public static String inputTidakKosong(Scanner scanner, String pesan) {

        String input;

        while (true) {

            System.out.print(pesan);
            input = scanner.nextLine().trim(); //trim()untuk menghapus spasi di awal/akhir

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("[Error] Input tidak boleh kosong! Silakan isi data dengan benar.");
        }
    }
    //Input Untuk pilihan menu Sistem
    public static int inputMenu(Scanner scanner) {

        while (true) {
            System.out.print("Pilih menu: ");

            //Cek apakah inputan user benar-benar berupa angka
            if (scanner.hasNextInt()) {
                int menu = scanner.nextInt();
                scanner.nextLine();

                if (menu >= 1 && menu <= 5) {
                    return menu; //Kembali ke menu jika angka 1 - 5
                } else {
                    System.out.println("[Error] Pilihan menu hanya dari 1 sampai 5!");
                }
            } else {
                System.out.println("[Error] Input harus berupa angka!");
                scanner.nextLine();
            }
        }
    }
        //Memastikan input pilihan status bernilai angka antara 1 sampai 3.
        public static int inputStatus(Scanner scanner) {

        while (true) {

            System.out.print("Pilih status: ");
            String input = scanner.nextLine();

            try {

                int status = Integer.parseInt(input);

                if (status >= 1 && status <= 3) {
                    return status;
                }

                System.out.println("[Error] Pilihan status hanya angka 1 sampai 3!");

            } catch (NumberFormatException e) {

                System.out.println("[Error] Input harus berupa angka!");
         
           }
        }
        }
        // Input Untuk konfirmasi
        public static boolean inputKonfirmasi(Scanner scanner) {

        while (true) {

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                return true;
            }

            if (input.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("[Error] Input hanya boleh berupa huruf 'y' (ya) atau 'n' (tidak)!");
        }
    }
   }

