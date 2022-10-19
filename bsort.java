import java.util.Scanner;

import java.util.*;

class sort{
    void inp(int a[],int n){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array : ");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
    void print(int a[],int n){
      
        for(int i=0;i<n;i++){
            System.out.print (a[i] + " ");
        }
        System.out.println();
    }
    void bubble(int a[],int n){

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        System.out.println("Sorted array : ");

    }
}


class bsort{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the length of array : ");
        n = sc.nextInt();

        int a[] = new int[n];
    

       sort so = new sort();
       so.inp(a, n);
       so.bubble(a, n);
       so.print(a, n);
    }
}