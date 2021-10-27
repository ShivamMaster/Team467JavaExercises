package FCR_HomeWork ;
import java.util.Scanner;
public class Assignment3


{
    public static void main(String[] args)
    {
        System.out.println ("Enter in any two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println ("Enter the desired opperation (i.e +, -, *, /,compare): ");
        Scanner sc1 = new Scanner(System.in);
        String opp = sc1.nextLine();
       // System.out.println (opp);
       // I have to create another object of scaner class to receive the input from the user. WHy can I not use sc and why do I have to create sc1 or am I correct?

        switch (opp)
        {
            case "+":
            int d = sum (a,b);
            System.out.println ("Sum of two numbers = " + d);
            break;

            case "-":       
            int e = subtraction (a,b);
            System.out.println ("Diff of two numbers = " + e);
            break;
        

            case "*":
            int f = multiply (a,b);
            System.out.println ("Product of two numbers = " + f);
            break;

            case "/":
            int g = divide (a,b);
            System.out.println ("Division of two numbers = " + g);
            break;

            case "compare":
            int c = minFunction (a,b);
            System.out.println ("The Smaller number is: " + c);
            break;
        }

        
        
       
        
    }

    public static int minFunction (int n1, int n2)
    {
        int min;
        if (n1 > n2)
        {
            min = n2;
        }

        else
        {
            min = n1;
        }
        return min;
    }

    public static int sum (int n1, int n2)
        {
        int add;
        add = n1 + n2;
        return add;  
        }
    public static int subtraction (int n1, int n2)
        {
            int subtract;
            subtract = n1 - n2;
            return subtract;
        } 
    public static int multiply (int n1, int n2)
        {
        int multiplication;
        multiplication = n1 * n2;
        return multiplication;
        } 
    public static int divide (int n1, int n2)
    {
        int Division;
        Division = n1 / n2;
        return Division;
    } 



}





/*
{
    public static void main(final String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter any 3 values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println ("Price of Item#1: $" + a);
        System.out.println ("Price of Item#2: $" + b);
        System.out.println ("Price of Item#3: $" + c);
        

        Double sum = a+b+c;
        System.out.println ("Sum of all 3 Items is: $" + sum);
        
        System.out.println ("Enter the money received from the customer");
        double d = sc.nextDouble();
        Double change = Math.round((d -sum )*100.0)/100.0;
        System.out.println ("Change to be returned to the customer: $" + change);
          
        changeReturned(change);
      
        sc.close();            

    }

    
   
   

    public  static void changeReturned (double change)
    {  

        int twenty_dollar_bills= (int) (change/20);
        if (twenty_dollar_bills != 0)
        {
            System.out.println ("twenty_dollar_bills returned to the customer: " + twenty_dollar_bills);
        }
        Double change1 = change - 20*twenty_dollar_bills;
        //System.out.println (change1);

        
        int ten_dollar_bills= (int) (change1/10);
        if (ten_dollar_bills != 0)
        {
           System.out.println ("ten_dollar_bills returned to the customer: " + ten_dollar_bills); 
        }
        Double change2 = change1- 10*ten_dollar_bills;
        //System.out.println (change2);

        
        int five_dollar_bills = (int) (change2/5);
        if (five_dollar_bills !=0)
        {
           System.out.println ("five_dollar_bills returned to the customer: " + five_dollar_bills); 
        }        
        Double change3 = change2- 5*five_dollar_bills;
        //System.out.println (change3);

        
        int one_dollar_bills= (int) (change3/1);
        if (one_dollar_bills != 0)
        {
             System.out.println ("one_dollar_bills returned to the customer: " + one_dollar_bills);
        }
        Double change4 = Math.round((change3- 1*one_dollar_bills)*100.0)/100.0;
        //System.out.println (change4);

        int quarters= (int) (change4/0.25);
        if (quarters != 0)
        {
            System.out.println ("Quarter returned to the customer: " + quarters);
        }
        Double change5 = (change4 - 0.25 * quarters);
        //System.out.println (change5);

        int dimes= (int) (change5/0.10);
        if (dimes != 0)
        {
             System.out.println ("Dimes returned to the customer: " + dimes);
        }
        Double change6 = (change5 - 0.10 * dimes);
        //System.out.println (change6);

        int nickels= (int) (change6/0.05);
        if (nickels != 0)
        {
             System.out.println ("Nickels returned to the customer: " + nickels);
        }
        Double change7 = Math.round((change6 - 0.05 * nickels) * 100.0) / 100.0;
        //System.out.println (change7);

        int pennies= (int) (change7/0.01);
        if (pennies != 0)
        {
            System.out.println ("Pennies returned to the customer: $" + pennies);
        }


    }



}


*/