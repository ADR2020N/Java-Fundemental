/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
public class TwoDimensionDemo {
    public static void main(String[] args) {
        int a[]={1,2,3};
         int b[]={4,5,6};
          int c[]={7,8,9};
        int d[][]={
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10}
        };
       for(int i=0;i<3;i++){
         for(int j=0;j<4;j++){
             System.out.print(" " +d[i][j]);
       }
           System.out.println();
       }
    }
}
