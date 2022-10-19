import java.util.Scanner;

class arr_retn{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int b[] = reverse(a);

        System.out.print("Elements of a : ");
        for(int i=0;i<n;i++){
            System.out.print (a[i] + " ");
        }

        System.out.println();

        System.out.print("Elements of b : ");
        for(int i=0;i<n;i++){
            System.out.print (b[i] + " ");
        }

    }

    static int[] reverse(int a[]){
        int n = a.length;
        int b[] = new int[n];

        for(int i=0;i<n;i++){
            b[i] = a[n-i-1];
        }

        return b;
    }
}