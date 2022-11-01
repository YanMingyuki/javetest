/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //第一題
//        Scanner num = new Scanner(System.in);
//        System.out.println("輸入正整數");
//
//        double a = num.nextDouble();
//
//        if (a % 1 == 0) {
//            System.out.println("是");
//        } else {
//            System.out.println("否");
//        }
//        

        //第二題
//       Scanner num = new Scanner(System.in);
//       System.out.println("輸入一個度數(正整數)");
//       
//       float price = num.nextFloat();
//       float summer = 0,nonsummer = 0;
//       
//       while(price != 0){
//           if(price>700){
//               summer += (price-700.0)*5.63f;
//               nonsummer += (price-700.0)*4.50f;
//               price=700;
//           }
//           if(price>500){
//               summer += (price-500.0)*4.97f;
//               nonsummer += (price-500.0)*4.01f;
//               price=500;  
//           }
//           if(price>330){
//               summer += (price-330.0)*4.39f;
//               nonsummer += (price-330.0)*3.61f;
//               price=330;  
//           }
//          if(price>120){
//               summer += (price-120.0)*3.02f;
//               nonsummer += (price-120.0)*2.68f;
//               price=120;  
//           }
//           if(price>0){
//               summer += price*2.10f;
//               nonsummer += price*2.10f;
//               price=0;  
//           };
//         }
//        System.out.println("Summer months:"+summer);
//        System.out.println("Summer months:"+nonsummer);
//
        
        //第三題
//         Scanner num = new Scanner(System.in);
//         System.out.println("請輸入西元年分");
////         
//         int year = num.nextInt();
//         
//         String[] animal;
//         animal = new String[12];
//         animal[0] = "猴";
//         animal[1] = "雞";
//         animal[2] = "狗";
//         animal[3] = "豬";
//         animal[4] = "鼠";
//         animal[5] = "牛";
//         animal[6] = "虎";
//         animal[7] = "兔";
//         animal[8] = "龍";
//         animal[9] = "蛇";
//         animal[10] = "馬";
//         animal[11] = "羊";
//         
//         int kk;
//         kk = year%12;
//         if(kk<0){
//            kk +=12;
//          }
//        for(int i = 0;i<animal.length;i++){
//             if(kk==i){
//                 System.out.println(animal[i]);
//             }
//          }

        
        
         //第四題
//        Scanner point1 = new Scanner(System.in) ;
//        System.out.println("X軸座標");
//        int x = point1.nextInt();
//        
//        Scanner point2 = new Scanner(System.in) ;
//        System.out.println("Y軸座標");
//        int y = point2.nextInt();
//        
//        double distance;
//        distance = Math.pow(x, 2)+Math.pow(y, 2);
//        
//        if (x>0){
//            if(y>0){
//                System.out.print("該點位於第一象限，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於第四象限，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於右半平面X軸上，離原點距離為根號"+distance);
//            }
//        }else if(x<0){
//            if(y>0){
//                System.out.print("該點位於第二象限，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於第三象限，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於左半平面X軸上，離原點距離為根號"+distance);
//            }
//        }else{
//            if(y>0){
//                System.out.print("該點位於上半平面Y軸上，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於下半平面Y軸上，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於原點");
//            }
//        }
        
        
        
        //第五題
//        Scanner num = new Scanner(System.in);
//        System.out.println("請輸入階層值M");
//        double M = num.nextDouble();
//        
//        double N = 1 ;
//        double a = 1;
//        while(N<M){
//            N=N*a;
//            a = a+1;
//        }
//        System.out.println("超過M為"+M+"的最小階層N值為:"+(a-1));
        
        
        
        //第八題
        
        
        
        
}
    
}
