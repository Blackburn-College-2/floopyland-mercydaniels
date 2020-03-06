/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floopyland;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import java.util.ArrayList;
import java.awt.Point;

/**
 * Puts the heroes on the gameboard so they can act
 * @author mercy.daniels
 */
public class ConcreteController extends GameController {

    public ConcreteController() {
    }

    /**
     *Puts the heroes in an arraylist to be added to the gameboard
     * @param arg0 gameboard to put heroes on
     * @param arg1 number of heroes per square
     * @return arraylist of heroes on board
     */
    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard arg0, int arg1) {
        ArrayList<BaseHero> heroList = new ArrayList<>();
        heroList.add(new genericHeroClass(arg0, new Point(1,1)));
        heroList.add(new genericHeroClass(arg0, new Point(2,2)));
        return heroList;
    }

    /**
     * Makes a gameboard
     * @return gameboard
     */
    @Override
    public GameBoard mkGameBoard() {
       
       return new GameBoard();
    }
    
}
