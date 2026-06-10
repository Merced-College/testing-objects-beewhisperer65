
public class Main {

	public static void main(String[] args) {
        Dog dog1 = new Dog(); // Empty Object

        System.out.println("Print object directly:");
        System.out.println(dog1); // Prints the location

        // Checkpoint 1
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 variables"); // Check what the object automatically assigns. (no longer functions post constructor)
        System.out.println("name = " + d1.name); // null
        System.out.println("age = " + d1.age); // 0
        System.out.println("breed = " + d1.breed); // null

        // Checkpoint 2
        Dog d2 = new Dog(); // Default aka empty constructor
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

        Dog d3 = new Dog("Rex", 4, "Collie"); // All data constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);

        // Checkpoint 3
        

	}

}
