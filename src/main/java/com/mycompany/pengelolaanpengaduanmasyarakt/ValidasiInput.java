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
public class ValidasiInput {
     // Input String yang tidak boleh kosong
    public static String inputTidakKosong(Scanner scanner, String pesan) {

        String input;

        while (true) {

            System.out.print(pesan);
            input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input tidak boleh kosong.");
        }
    }
// Input pilihan menu
    public static int inputMenu(Scanner scanner) {

        while (true) {

            System.out.print("Pilih menu: ");
            String input = scanner.nextLine();

            try {

                int menu = Integer.parseInt(input);

                if (menu >= 1 && menu <= 5) {
                    return menu;
                }

                System.out.println("Menu hanya dapat dipilih dari 1 sampai 5.");
                 } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka.");
            }
        }
    }
            // Input pilihan status
           public static int inputStatus(Scanner scanner) {

        while (true) {

            System.out.print("Pilih status: ");
            String input = scanner.nextLine();

            try {

                int status = Integer.parseInt(input);

                if (status >= 1 && status <= 3) {
                    return status;
                }

                System.out.println("Pilihan status hanya 1 sampai 3.");

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka.");
         
           }
        }
           }
        // Input konfirmasi
        public static boolean inputKonfirmasi(Scanner scanner) {

        while (true) {

            System.out.print("Masukkan y untuk ya atau n untuk tidak: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                return true;
            }

            if (input.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Input hanya boleh y atau n.");
        }
    }
    }

