/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_posttest1pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah List Komik");
            System.out.println("2. Hapus List Komik");
            System.out.println("3. Tampilkan List Komik");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Item newItem = new Item();
                    newItem.addNewItem();
                    itemList.add(newItem);
                    System.out.println("Komik sudah ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan nomor untuk menghapus Komik: ");
                    int removeIndex = input.nextInt();
                    if (removeIndex >= 1 && removeIndex <= itemList.size()) {
                        itemList.remove(removeIndex - 1);
                        System.out.println("Komik berhasil dihapus.");
                    } else {
                        System.out.println("Masukkan Anda tidak valid.");
                    }
                    break;
                case 3:
                    if (itemList.isEmpty()) {
                        System.out.println("List Komik masih kosong.");
                    } else {
                        System.out.println("List Komik:");
                        for (int i = 0; i < itemList.size(); i++) {
                            System.out.println((i + 1) + ". " + itemList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Masukkan yang tidak valid. Mohon masukkan lagi.");
                    break;
            }

            System.out.println(); 

        } while (choice != 4);
    }
}
