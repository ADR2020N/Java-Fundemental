/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.prepare.com;

import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        Prepare pr= new Prepare();
        int x=pr.add(12, 8);
        System.out.println("Sum is ="+x);
        pr.sub(12, 6);
        pr.mod(12, 7);
        pr.mult(19, 9);
        pr.div(8, 2);
        System.out.println("================================");
        testEvenOrOdd e=new testEvenOrOdd();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number to Chaeck:");
        String str=e.isEven(sc.nextInt());
        System.out.println(str);
    }
    
}
