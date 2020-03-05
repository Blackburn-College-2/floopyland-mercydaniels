/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import java.util.ArrayList;
import java.awt.Point;

/**
 *
 * @author mercy.daniels
 */
public class ConcreteController extends GameController {

    public ConcreteController() {
    }

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        ArrayList<BaseHero> heroList = new ArrayList<>();
        heroList.add(new genericHeroClass(arg0, new Point(1,1)));
        heroList.add(new genericHeroClass(arg0, new Point(2,2)));
        return heroList;
    }

    @Override
    public GameBoard mkGameBoard() {
       
       return new GameBoard();
    }
    
}
