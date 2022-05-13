/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_pbo_130522;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Bread extends Product implements Idecayable {
    
   @Override
   String howToUse(){
       return "Just open the wrap and eat it."+"\n"
               +"store your bread if you want to eat it later.";
   }
    
   @Override
   public String howToSave(){
       return "1. Freeze Your Bread."+"\n"
               +"2. Store Your Bread in a Breadbox."+"\n"
               +"3. Don't Refrigerate!";
   }
    
}
