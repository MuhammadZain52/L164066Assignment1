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
public class Dogs extends Pet {

    @Override
    void walk() {
        System.out.println("Dogs can walk");
    }

    @Override
    void trick() {
        System.out.println("Dogs can play dead");
    }

    @Override
    void eat() {
        System.out.println("Dogs can eat");
    }

    @Override
    void breath() {
        System.out.println("Dogs can breath");
    }
}
