/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author HP
 */
public class Senjata {
    // atribut
    String nama;
    int jumlahPeluru;
    
    // method
    void tembak(){
        //..
        // setelah nembak, kurangi peluru
        jumlahPeluru--;
    }

    void reload(){
        //..
        // kalau di-reload maka jumlah peluru diisi ulang
        jumlahPeluru = 300;
    }
}
