/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_posttest1pbo;

import java.util.Scanner;

public class Item {
    private String judul;
    private String genre;
    private String status;
    private String author;
    

    public Item() {
    }

    public void addNewItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul: ");
        judul = input.nextLine();
        
        
        System.out.print("Masukkan Genre: ");
        genre = input.nextLine();
        
       
        System.out.print("Masukkan Status: ");
        status = input.nextLine();
        
        
        System.out.print("Masukkan Author: ");
        author = input.nextLine();
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
    
     public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
    

    

    @Override
    public String toString() {
        return judul + " (Genre: " + genre + ", Status: " + status + ", Author: " + author + ")";
    }

    void updateItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
