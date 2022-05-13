/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_pbo_130522;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class InstantNoodle extends Product implements Idecayable {
    
       @Override
   String howToUse(){
       return "1. Boil some water."+"\n"
               +"2. Prepare your noodle."+"\n"
               +"3. Pour in boiling water.";
   }
    
   @Override
   public String howToSave(){
       return "Let the packs sit in a dark and dry place at room temperature.";
   }
    
}
