/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonjournom;

import aleatoire.*;
/**
 *
 * @author macbookpro 
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person john = new Person(args[0], args[1], 35);
        
        System.out.println("Prenom : " + john.getFirstName());
        
        System.out.println("Nom : " + john.getLastName());
        
        System.out.println("Bonjour " + john.getFirstName() + " " + john.getLastName());
        
        
        // TODO code application logic here
    }
    
}
