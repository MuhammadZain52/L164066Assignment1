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
public class Birds extends Pet {

    void fly() {
        System.out.println("Birds can fly");
    }

    void makenest() {
        System.out.println("Birds can make nests");
    }

    @Override
    void walk() {
        System.out.println("Bird can walk");
    }

    @Override
    void trick() {
        System.out.println("Bird can sing song");
    }

    @Override
    void eat() {
        System.out.println("Birds can eat");
    }

    @Override
    void breath() {
        System.out.println("Birds can breath");
    }
}
