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
public class genericHeroClass extends BaseHero {

    GameBoard gameBoard = new GameBoard();

    public genericHeroClass(GameBoard gameBoard, Point location) {
        super(gameBoard, location);
        gameBoard.getGameSquare(location).addHero(this);
    }

    @Override
    public boolean isInBattle() {
        return false;
    }

    @Override
    public String enemy() {
        //BaseHero enemy = gameBoard.getGameSquare(location).getHeroesPresent().get(0);
        return "cool";
    }

    @Override
    public void gameTickAction(long arg0) {
        if (!isInBattle()) {
            int random = (int) (Math.random() * 3) + 1;
            gameboard.getGameSquare(location).removeHero(this);
            switch (random) {
                case 1:
                    location.x = (location.x + 1) % gameboard.getWidth();
                    break;
                case 2:
                    if(location.x-1 >= 0){
                    location.x = (location.x - 1);
                    }
                    else {
                        location.x =gameboard.getWidth()-1;
                    }
                    break;
                case 3:
                    location.y = (location.y + 1) % gameboard.getHeight();
                    break;
                default:
                    if(location.y-1 >= 0){
                    location.y = (location.y - 1);
                    }else {
                        location.y = gameboard.getHeight()- 1;
                    }
                    break;
            }
            gameboard.getGameSquare(location).addHero(this);
        }
    }

    
    @Override
    protected void die() {
    gameboard.getGameSquare(location).removeHero(this);
        System.out.println("Hero has died!");

    }

    @Override
    public boolean isDead() {
        if (hp <= 0) {

            return true;
        } else {
            return false;
        }
    }

}
