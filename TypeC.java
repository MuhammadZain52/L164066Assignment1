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
public class TypeC extends CFee {
    TypeC(){
    super();}
    @Override
    void CalculateFee()
    {
        System.out.println("\nTypeC-->Due ");
        System.out.println((5*7200)/2);
        System.out.println("Recieve Amount  ");
        System.out.println((5*7200)/4);
    }
    
    
}
