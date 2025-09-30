/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); 

       
        String[] hoTen = new String[n];
        double[] diem = new double[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien thu " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();

            System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // bỏ ký tự xuống dòng
        }

        
        System.out.println("\n=== Danh sach sinh vien ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Xep loai: " + xepLoai(diem[i]));
            System.out.println("----------------------------");
        }

        //  sap xep theo diem tang dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // doi cho diem
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    // doi cho ten theo diem
                    String tempTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempTen;
                }
            }
        }

        
        System.out.println("\n=== Danh sach sinh vien sau khi sap xep ===");
        for (int i = 0; i < n; i++) {
            System.out.println("ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Xep Loai: " + xepLoai(diem[i]));
            System.out.println("----------------------------");
        }

        sc.close();
    }

    
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
}
