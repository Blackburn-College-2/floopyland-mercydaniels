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
        this.gameBoard = gameBoard;
    }

    public void attack(int dmg) {

    }

    @Override
    public boolean isInBattle() {
        return true;
    }

    @Override
    public String enemy() {
       BaseHero enemy = gameBoard.getGameSquare(location).getHeroesPresent().get(0);
       return enemy.name;
    }

    public BaseHero enemyHero() {
       BaseHero enemy = gameBoard.getGameSquare(location).getHeroesPresent().get(0);
       return enemy;
    }
    @Override
    public void gameTickAction(long arg0) {
        if (isInBattle()) {

        }
    }

    /**
     * drop items removes the hero crie
     */
    @Override
    protected void die() {

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
