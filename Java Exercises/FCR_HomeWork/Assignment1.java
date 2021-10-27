
package FCR_HomeWork ;

//import javax.lang.model.util.ElementScanner14;

public class Assignment1


// Question 1 (Multipulation Tables)- Solution1

/*
{    
    public static void main (final String[] args) 
     {
  
    
            for (int i=0; i<10; i++) // to provide multiplication number
            {
                {
                    System.out.println ("multiplication table of " + i +":");
                    for ( int j=0 ; j<11 ; j++)
            
                    {
                        int k=i*j;
                        
                        System.out.println ( i +"*" + j +"="+ k);
            
                    }
                    
                }
            }
     
    
    }  

}

*/


// Question 1 (Multipulation Tables)- Solution2
/*
{
    public static void main (final String [] args)
    {
        int a = 0; // Declared variable a, which will act as the left factor
        
        
        for (a = 0; a<11; a++) // This loop will increase the left factor by 1 until 11 
            {   
                System.out.println("Multiplication Table Of " + a);
                int b = 0; // Declared variable b, which will act as right factor
                for (int c = a*b; b<11; b++) // This loop will increase the right factor until 11 and this is done for every left factor number
                {
                    System.out.println (a + "*" + b + "=" + c);

                }
            }
    }    
}
*/



// Question 2 (Buzz Game) - Solution 1

/*
{
    public static void main (final String[] args)
    {
        for (int i=1; i<101; i++)
        {
                int len = String.valueOf(i).length();
            int q=i/10;
            int r=i%10;
            if (len==1)
            {
                if (i%3==0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }
            }
            else if (len == 2)
            {
                if (i%3==0) //Multple of 3
                    {
                            if(q%3==0 && r%3==0 && r!=0) //quotient AND remainder is divisible by 3 but number does not have 0 in unit place. Eg-33,99
                            {
                                System.out.println("BuzzBuzz");
                            }
                            else if(q%3==0 && r%3==0 && r==0) //quotient AND remainder is divisible by 3 but number does HAVE 0 in unit place. Eg-30,60
                            {
                                System.out.println("Buzz"); 
                            }
                            else if(q%3 != 0 || r%3 != 0) //quotient OR remainder is divisible by 3.Eg-54
                            {
                                System.out.println("Buzz");
                            }
                        
                    }
                else  // Number is not a multiple of 3
                    {   
                        if(q%3==0 && r%3==0)
                            {
                                System.out.println("BuzzBuzz"); //i dont think this is possible but just put it
                            }
                        else if (q%3 != 0 && r%3 == 0 && r!=0) // Eg-23
                            {
                                System.out.println(q+ "Buzz");
                            }
                        else if (q%3 == 0 && r%3 != 0 && r!=0) // Eg-67
                            {
                                System.out.println("Buzz"+r);
                            }
                        else
                            {System.out.println(i); // for all rest left condiions print the number itself
                            
                            }
                    
                    }

            } 
            
    else 
        {
            System.out.println(i); // This is for three-digit number (100)
        }
    }
        }
        
}

*/






// Advanced Homework (Factorials)
/*
{        
    public static void main (final String[] args)   
   {
    for (int i = 1; i<31; i++)
        {
        int z =1;  
        for (int j=1; j < (i+1); j++)
        {  
            z = z*j; 
        }
        System.out.println ("Factorial of" + i + "= " + z);
        }
    }

}
*/

/*
{        
    public static void main (final String[] args)   
   {
        int i =24;
        int z =1;  
        for (int j=1; j < (i+1); j++)
        {  
            z = z*j; 
            System.out.println(j);
            System.out.println(z);
        }
       // System.out.println ("Factorial of" + i + "= " + z);
        
    }
    
    
}

*/


// Fize-Buzz Problem


{
    public static void main (final String[] args)
    {
        for (int i = 1; i<101; i++)
        {
        if ((i%15)==0)
         {
            System.out.println ("Fizz Buzz");
         } 
        else if ((i%3)==0)
        {
            System.out.println ("Fizz");
        }
        else if ((i%5)==0)
        {
            System.out.println ("Buzz");
        }
        else 
        {
            System.out.println (i);
        }
        }
        

    }
    
    
}



 


