/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int flag=0;
        System.out.print("Nhap so nguyen: ");
        n=sc.nextInt();
        if(n<2){
            flag=1;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("la so nguyen to");
        }else{
            System.out.println("khong phai la so nguyen to");
        }
        
    }
}
