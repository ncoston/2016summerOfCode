/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Natalie
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int S = 0;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);
        for (int i = 2; i <= 55; i++) {
            if (fibonacci.get(i - 1) + fibonacci.get(i - 2) < 4000000) {
                fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
            } else {
                break;

            }

        }

        for (int i = 0; i < fibonacci.size(); i++) {
            if ((fibonacci.get(i) % 2 == 0) && (fibonacci.get(i) < 4000000)) {
                S = S + fibonacci.get(i);
            } else {
                S = S + 0;
            }
        }
        /*System.out.println(S);
            
         for (Integer fib : fibonacci){
         System.out.println( fib );
         }
         */
        System.out.println(S);
    }

}
