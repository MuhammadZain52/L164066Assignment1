/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Zain
 */
public abstract class Employee {

    int c;
    public ArrayList<String> Benefits;

    Employee(int t) {
        
        c = t;
        
    }

    void printBenefits() {
        
        for (int j = 0; j < Benefits.size(); j++) {
            System.out.println(Benefits.get(j));
            System.out.println("\n");
        }
    
    }

    void calculatePay() {
      
        if (c == 1) {
            System.out.println("InternPay");
        } else if (c == 2) {
            System.out.println("DevelporPay");
        } else if (c == 3) {
            System.out.println("ManagerPay");
        }

    }

}
