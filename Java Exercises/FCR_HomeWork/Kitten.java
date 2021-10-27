package FCR_HomeWork;

public class  Kitten
{
        String kittenName;
        int kittenAge;    

    public Kitten (int age, String name)
    {
        this.kittenName=name;
        this.kittenAge=age;
        System.out.println("Kitten Name is :" +kittenName);
        System.out.println("Kitten Age is :"+kittenAge);
           
    }

 
    public static void main(String[] args)
    {

        Kitten cat = new Kitten (5,"meow"); //called the constructor for Kitten class

        Puppy myPuppy = new Puppy("Tommy"); // this is calling constructor
        myPuppy.setAge(2);  // this is calling setAge method
        myPuppy.getAge();   //This is calling getAge method
        System.out.println("Variable value: " + myPuppy.puppyAge); //her object is calling instance variable of the class

    }
}