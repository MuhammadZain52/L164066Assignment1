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
public class Intern extends Employee {

    Intern(int t) {
        super(t);

        Benefits = new ArrayList<String>();

        int i = 0;
        i = 0;
        while (i++ < 1)
            Benefits.add("Intern Benefit " + (i));
    
    }
}
