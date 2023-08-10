/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package football;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class FootballMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        Person somchai = new Person();
        Person somkit = new Person();
        FootballScore obj = new FootballScore();
        obj.register(somchai);
        obj.register(somkit);
        
        System.out.print("Enter Score -->");
        String str = sc.nextLine();
        
        obj.setScore(str);
        System.out.println("-------------");
        
        while(true){
            System.out.print("Enter Score -->");
            str = sc.nextLine();
            if(str.equals("")){
                break;
            }
            obj.setScore(str);
        }
        
    }
    
    
}
