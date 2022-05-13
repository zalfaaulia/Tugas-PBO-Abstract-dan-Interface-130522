/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_pbo_130522;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Store myStore = new Store();
        Pen myPen = new Pen();
        Book myBook = new Book();
        InstantNoodle indomie = new InstantNoodle();
        Bread myBread = new Bread();
        
        myStore.addProduct(myPen);
        myStore.addProduct(myBook);
        myStore.addProduct(indomie);
        myStore.addProduct(myBread);
        
        System.out.println("===== How To Use =====");
        myStore.showHowToUse();
        
        System.out.println("===== How To Save =====");
        myStore.showHowToSave();
    }  
}
