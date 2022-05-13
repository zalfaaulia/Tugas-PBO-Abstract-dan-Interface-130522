/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_pbo_130522;

/**
 *
 * @author Lenovo X380 Yoga
 */
import java.util.ArrayList;
public class Store {
    private ArrayList<Product> product = new ArrayList<>();
    private ArrayList<Idecayable> idecayableProduct = new ArrayList<>();
    
    public void addProduct(Product produk){
        if (produk instanceof Idecayable){
            this.idecayableProduct.add((Idecayable) produk);
        }
            this.product.add(produk);
    }
    
    public void showHowToUse(){
        for (Product i: product){
            System.out.println("Product name : " + i.getClass().getSimpleName() +"\n"
                                + "How to use : " + "\n"
                                + i.howToUse() + "\n");
        }
    }
    
    public void showHowToSave(){
        for (Idecayable i : idecayableProduct){
            System.out.println("Product name : " + i.getClass().getSimpleName() + "\n"
                                + "How to save : " + "\n"
                                + i.howToSave() + "\n");
        }
    } 
}
