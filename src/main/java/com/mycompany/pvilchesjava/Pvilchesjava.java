package com.mycompany.pvilchesjava;

import java.util.Scanner;

public class Pvilchesjava {

    public static void main(String[] args) {
        



        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }



        
    }
}