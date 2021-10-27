package FCR_HomeWork;

public class Puppy 
{
    int puppyAge; // Instance Variable
        
    public Puppy(String name) // Constructor which always take the class name and is invoked as soon as object of the class is created
    {
        System.out.println("Puppy Name is : " + name);     
    
    }

    public void setAge (int age) // This is a user defined method which takes the input and return nothing (void)
    // Difference between a method and a constructor is that a method has "void" in the name where a constructor doesn't. As well, a method name can be anything whereas a constuctor has to the take the name of the public class.
    {
        puppyAge = age;  // Takes an input with variable age and set it to variable puppyAge
    }


    public int getAge() //user defined method
    {
        System.out.println("Puppy's age is " + puppyAge);
        return puppyAge;
    }

    
public static void main(String []args)
    {
        Puppy myPuppy = new Puppy("Tommy"); // this is calling constructor
        myPuppy.setAge(2);  // this is calling setAge method
        myPuppy.getAge();   //This is calling getAge method
        System.out.println("Variable value: " + myPuppy.puppyAge); //her object is calling instance variable of the class
    }

}
