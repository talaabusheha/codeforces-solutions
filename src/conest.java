/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victus
 */import java.util.Scanner;
public class conest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float n1=in.nextFloat();
        
        if(n1>=0&&n1<=25){
            System.out.print("Interval [0,25]");
        }
       else if(n1>25&&n1<=50){
            System.out.print("Interval (25,50]");
        }
       else if(n1>50&&n1<=75){
            System.out.print("Interval (50,75]");
        }
       else if(n1>75&&n1<=100){
            System.out.print("Interval (75,100]");
        }
       else{
            System.out.print("Out of Intervals");
        }
    }
}
    

