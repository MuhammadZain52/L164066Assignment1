/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Zain
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Creature> E = new ArrayList<Creature>();
        ArrayList<Dogs> E1 = new ArrayList<Dogs>();
        ArrayList<Birds> E2 = new ArrayList<Birds>();
        ArrayList<Rabbits> E3 = new ArrayList<Rabbits>();
        int i = 0;
        while (i++ < 2) {
            E.add(new Dogs());
            E1.add(new Dogs());
        }

        i = 0;
        while (i++ < 2) {
            E.add(new Birds());
            E2.add(new Birds());
        }

        i = 0;
        while (i++ < 2) {
            E.add(new Rabbits());
            E3.add(new Rabbits());
        }

        for (int j = 0; j < E.size(); j = j + 2) {
            E.get(j).breath();
            E.get(j).eat();
            System.out.println("\n");
        }

        for (int j = 0; j < E1.size(); j++) {
            E3.get(j).eat();
            E3.get(j).breath();
            E3.get(j).hop();

            E1.get(j).breath();
            E1.get(j).eat();
            E1.get(j).trick();
            E1.get(j).walk();

            E2.get(j).breath();
            E2.get(j).eat();
            E2.get(j).trick();
            E2.get(j).walk();
            E2.get(j).fly();

            System.out.println("\n");
        }
    }
}

}
