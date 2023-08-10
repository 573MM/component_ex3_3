/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package football;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class FootballScore implements Source{
    private final ArrayList<MyObserver> list;
    private String score;
    public FootballScore(){
        this.list = new ArrayList<MyObserver>();
    }
    @Override
    public void notifyO(){
        for(int i = 0; i <list.size() ; ++i){
            list.get(i).update(this);
        }
    }
    @Override
    public void register(MyObserver o){
        list.add(o);
    }
    public void setScore(String score){
        this.score = score;
        notifyO();
    }
    public String getNewScore(){
        return this.score;
    }
}
