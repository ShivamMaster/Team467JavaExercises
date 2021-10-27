package FCR_HomeWork;

import java.util.Scanner;

public class Assignment2


/*
{
    public static void main(String[] args)
    {
        int num = 1 + (int)(Math.random() * 100);
        System.out.println(num);
        int user_guess;
        int tries = 1;
        Scanner sc = new Scanner (System.in);
      
        
        for (user_guess = num; user_guess < 101; user_guess= user_guess + 0)
        {
            System.out.print ("Enter in your guess: ");
            user_guess = sc.nextInt();
            if (user_guess>num)
            {
                System.out.print ("The guess was too HIGH! Please try again");
                tries = tries+1;
            }
            else if (user_guess<num)
            {
                System.out.print ("The guess was too LOW! Please try again");
                tries = tries+1;
            }
            else
            {
                System.out.print ("YOU GOT IT!!");
                System.out.print ("Number of tries " + tries);
                break;

            }
      
        }

sc.close();
 
    }
}
*/

// Advanced Homework



{
    public static void main (final String[] args)
    {
        int Highnum = 100;
        int lownum = 0;
        int botguess  = 50;
        System.out.print ("Enter in your number: ");
        Scanner sc = new Scanner(System.in);
        int secret = sc.nextInt();
        int z = 1;
        //int guessnum = 50;
        for (z = 1; botguess != secret; z++)
        {
            
                    if (botguess<secret)
                    {
                        System.out.println (botguess);
                        System.out.println ("Guessed Number is too Low ");
                        lownum = botguess;
                        botguess = (botguess + Highnum)/2;
                        
                    }

                    else if (botguess>secret)
                    {
                        
                        System.out.println ("Guessed Number is too High ");
                        Highnum = botguess;
                        botguess = (botguess + lownum)/2;
                        
                    }

                    else
                    {
                        System.out.print ("Congrats this is the number");
                    }
        }
        System.out.println (botguess);
        System.out.println ("Congrats this is the number");
        sc.close();
        System.out.println ("The number of tries were: " + z);
    }
    

    
}


