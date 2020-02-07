/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Muhammad Zain
 */
public class Rabbits extends Creature {

    void hop() {
        System.out.println("Rabbits can hop");
    }

    @Override
    void eat() {
        System.out.println("Rabbits can eat");
    }

    @Override
    void breath() {
        System.out.println("Rabbits can breath");
    }
}
