/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N.Adrien
 */
class Student{
  int rollno;
String name;
}
public class ArraysDemo {
    public static void main(String[] args) {
        Student s1=new Student();
          Student s2=new Student();
            Student s3=new Student();
              Student s4=new Student();
              
             Student s[]={s1,s2,s3,s4};
              
        int num[]=new int[4];
        int num2[]={90,10,88,18,199,00,890};
        num[0]=19;
        num[1]=9;
        num[2]=100;
        num[3]=10;
        for(int i=0;i<4;i++){
        System.out.print("\t"+num[i]);
        }
        for(int p=0;p<num2.length;p++){
            System.out.println(num2[p]);
        }
        
    }}

