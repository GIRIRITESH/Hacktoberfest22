import java.util.*;

class bank{

    private double balance = 100236;
    private int pin = 1234;

    void check(int s){
        
        if(s == pin){
            account ac = new account();
            ac.withdraw();
            return;
        }
        System.out.println("You have entered wrong pin.");
       
    }
    class account{
       void withdraw(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the amount to withdraw : ");
            double x = sc.nextDouble();
            if(balance >= x)
                balance = balance-x;
            else{
                System.out.println("you don't have enough balance.");
                return;
            }

            System.out.println("Your new balance is : "+balance);
        }
    }
}

class bnk_acc{

   
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int pin;

        bank b = new bank();

        System.out.println("Enter the atm pin : ");
        pin = sc.nextInt();
        b.check(pin);
    }
        
        
}