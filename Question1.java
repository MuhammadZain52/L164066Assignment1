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
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> E = new ArrayList<Employee>();
        int i = 0;
        while (i++ < 3)
        {
            E.add(new Intern(1));
            E.add(new Develpor(2));
            E.add(new Manager(3));
        }

        for (int j = 0; j < E.size(); j++) 
        {
            System.out.println("Employee--> " + j);
            E.get(j).calculatePay();
            E.get(j).printBenefits();
            System.out.println("\n");
        }
    }
    
}
