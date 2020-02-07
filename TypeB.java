/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Muhammad Zain
 */
public class TypeB extends CFee {

    TypeB() {
        super();
    }

    @Override
    void CalculateFee() {
        System.out.println("\nTypeB-->To Pay ");
        System.out.println((5 * 7200));
    }

}
