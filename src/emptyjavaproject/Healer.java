/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;
import com.pauliankline.floopyconnector.*;
import java.awt.Point;

/**
 *
 * @author mercy.daniels
 */
public class Healer extends genericHeroClass{
    

    public Healer(GameBoard gameBoard, Point location) {
       super(gameBoard,location);
    }

    @Override
    public boolean isInBattle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String enemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameTickAction(long arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void die() {
        System.out.println("Healer has died rip");
    }


    
}
