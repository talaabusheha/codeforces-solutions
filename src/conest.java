/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victus
 */import java.util.Scanner;
 import java.util.Arrays;
public class conest {
    public static void main(String[] args) {
        //problem S
//        Scanner in=new Scanner(System.in);
//        float n1=in.nextFloat();
//        
//        if(n1>=0&&n1<=25){
//            System.out.print("Interval [0,25]");
//        }
//       else if(n1>25&&n1<=50){
//            System.out.print("Interval (25,50]");
//        }
//       else if(n1>50&&n1<=75){
//            System.out.print("Interval (50,75]");
//        }
//       else if(n1>75&&n1<=100){
//            System.out.print("Interval (75,100]");
//        }
//       else{
//            System.out.print("Out of Intervals");
//        }
        
        //problem T
     



// 
//
//        Scanner input = new Scanner(System.in);
//
//        int[] arr = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int[] original = arr.clone();  
//
//        Arrays.sort(arr);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println(); 
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(original[i]);
//        }

        //U
//        Scanner in=new Scanner(System.in);
//        String number =in.next();
//           if (!number.contains(".")) {
//            System.out.println("int " + number);
//    }
//    else{ 
//        String[] parts = number.split("\\.");
//            String integerPart = parts[0];
//            String decimalPart = parts[1];
//        
//        if(Double.parseDouble(decimalPart)==0){
//             System.out.println("int " +integerPart);
//        }
//        else{
//            System.out.println("float " + integerPart + " 0."+ decimalPart);
//            
//        }
//    }

    





//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        String S = in.next();
//        int B = in.nextInt();
//        int C = in.nextInt();
//
//        int result = 0;
//
//        if (S.equals("+")) {
//            result = A + B;
//        } else if (S.equals("-")) {
//            result = A - B;
//        } else if (S.equals("*")) {
//            result = A * B;
//        }
//
//        if (result == C) {
//            System.out.println("Yes");
//        } else {
//            System.out.println(result);
//        }
//           problem `W`
//        Scanner in = new Scanner(System.in);
// 
//        int A = in.nextInt();
//        String S = in.next();
//        int B = in.nextInt();
//        String Q = in.next();
//        int C = in.nextInt();
// 
//        int result = 0;
// 
//        if (S.equals("+")) {
//            result = A + B;
//        } else if (S.equals("-")) {
//            result = A - B;
//        } else if (S.equals("*")) {
//            result = A * B;
//        }
// 
//        if (result == C) {
//            System.out.println("Yes");
//        } else {
//            System.out.println(result);
//        }
                //Y last 2digit
    
//        Scanner in= new Scanner(System.in);
//        int A=in.nextInt()%100;
//        int B=in.nextInt()%100;
//        int C=in.nextInt()%100;
//        int D=in.nextInt()%100;
//        int result = (A*B*C*D)%100;
//        System.out.printf("%02d", result);
//        //Z 
        Scanner in= new Scanner(System.in);
        long A=in.nextLong();
        long B=in.nextLong();
        long C=in.nextLong();
        long D=in.nextLong();
        double right =B * Math.log(A);
        double left =D * Math.log(C);
        
        if(right>left){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        

    }
}
    }
}
    

