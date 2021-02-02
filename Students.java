/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class Students {
   
 int rollNo;
 String names;

        public Students(int rollNo, String name) {
            this.rollNo = rollNo;
            this.names = name;
        }

        @Override
        public String toString() {
            return "Student{" + "rollNo=" + rollNo + ", name=" + names + '}';
        }
        
         
}
    

