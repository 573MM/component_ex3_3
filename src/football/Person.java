/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package football;

/**
 *
 * @author LENOVO
 */
public class Person implements MyObserver{
    @Override
     public void update(Source o){
         System.out.println("live result:"+ ((FootballScore)o).getNewScore());
    }
}
   
