/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print("Nhap so phan tu cua mang: ");
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        //sap xep mang
        Arrays.sort(a);
        System.out.println("mang sau khi sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // tim phan tu nho nhat
        int min = a[0]; 
        System.out.println("phan tu nho nhat trong mang: " + min);

        // tinh trung binh phan tu chia het cho 3
        int tong = 0;  
        int dem = 0;   

        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong = tong + a[i];
                dem = dem + 1;
            }
        }

        if (dem > 0) {
            double trungBinh = (double) tong / dem;
            System.out.println("trung binh cac phan tu chia het cho 3 la: " + trungBinh);
        } else {
            System.out.println("khong co phan tu trong mang chia het cho 3.");
        }
    }
}
