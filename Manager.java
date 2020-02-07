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
public class Manager extends Develpor {

    Manager(int t) {
        super(t);
        
        int i = 0;
        while (i++ < 3)
            Benefits.add("Manager Benefit " + (i));
            
    }
}
