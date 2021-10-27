package FCR_HomeWork;
import java.util.Scanner;
public class PetNursery
{

    //Instance or global variables
    String petType;
    String petName;
    int petAge;   

    public PetNursery (String type, String name, int age) //constructr of class. setting values of global variables
    {
        this.petType=type;
        this.petName=name;
        this.petAge=age;
    }
 
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of your pet. eg.puppy or kitten");
        String type = sc.nextLine();
        System.out.println("Enter name of your pet");
        String name = sc.nextLine();
        System.out.println("Enter age of your pet");
        int age = sc.nextInt();
        
        PetNursery pet = new PetNursery(type, name, age);
        // I took user inputs and pass them as parameter while creating object of the class which will call constructor of the class

        pet.describeAnimal();
        //Calling user defined method by using object of the
    }

    public void describeAnimal()
    {
            switch(petType)
                {
                    case("puppy"):
                    System.out.println("Pet is of type puppy");
                    Puppy myPuppy = new Puppy(petName);//it will call constructor  which will print name
                    myPuppy.setAge(petAge);  // this is calling setAge method
                    myPuppy.getAge();
                    break;

                    case("kitten"):
                    System.out.println("Pet is of type kitten");
                    Kitten cat = new Kitten (petAge,petName);
                    break;
                }
    }
             

}
