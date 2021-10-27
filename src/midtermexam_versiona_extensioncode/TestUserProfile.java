/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author yousef
 */
public class TestUserProfile {
    
    public static void main (String[]args){
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        String genre;
        
        System.out.println("What is your name: ");
        name = keyboard.nextLine();
        
        System.out.println("What is your genre: ");
        genre = keyboard.nextLine();
        
        System.out.println("Your account has been made");
        
    }
}
