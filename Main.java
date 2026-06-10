
public class Main {

	public static void main(String[] args) {
        Dog dog1 = new Dog(); // Empty Object

        System.out.println("Print object directly:");
        System.out.println(dog1); // Prints the location

        // Checkpoint 1
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 variables"); // Check what the object automatically assigns.
        System.out.println("name = " + d1.name); // null
        System.out.println("age = " + d1.age); // 0
        System.out.println("breed = " + d1.breed); // null

        // Checkpoint 2
        

	}

}
