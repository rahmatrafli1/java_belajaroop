/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author HP
 */
public class Enemy {
    String name;
    int hp;
    int attackPoin;
    
    Enemy monster = new Enemy();
    Zombie zumbi = new Zombie();
    Pocong hantuPocong = new Pocong();
    Burung garuda = new Burung();

    void attack(){
        System.out.println("Serang!");
    }

}
