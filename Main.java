
public class Main {

	public static void main(String[] args) {
                Dog dog1 = new Dog(); // Empty Object

                System.out.println("Print object directly:");
                System.out.println(dog1); // Prints the location (no longer gives location post toString method)

                // Checkpoint 1
                Dog d1 = new Dog();
                System.out.println("\nDefaults for d1 variables"); // Check what the object automatically assigns. (no longer gives java default post constructor)
                System.out.println("name = " + d1.getName()); // null
                System.out.println("age = " + d1.getAge()); // 0
                System.out.println("breed = " + d1.getBreed()); // null

                // Checkpoint 2
                Dog d2 = new Dog(); // Default aka empty constructor
                System.out.println("\nd2 after default constructor:");
                System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

                Dog d3 = new Dog("Rex", 4, "Collie"); // All data constructor
                System.out.println("\nd3 after parameterized constructor:");
                System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

                // Checkpoint 3
                System.out.println("\nPrinting objects after overriding toString():");
                System.out.println("d2 = " + d2);
                System.out.println("d3 = " + d3); // will print the things in the object rather than the memory spot

                // Checkpoint 4
                // Changed whole file from direct mutation and reading to getting and setting.
                System.out.println("\nMutating private fields through getteres and setters:");
                d3.setAge(5); // Now telling Dog objects to do the work and keeping main's fingers out.
                d3.setName("Max");
                System.out.println("After mutation, d3 = " + d3);

                // Checkpoint 5
                System.out.println(); // new line
                // My class and object now

                Book book1 = new Book(); // Empty Object

                System.out.println("Print object directly:");
                System.out.println(book1); // Prints the location (no longer gives location post toString method)

                // Checkpoint 1
                Book b1 = new Book();
                System.out.println("\nDefaults for b1 variables"); // Check what the object automatically assigns. (no longer gives java default post constructor)
                System.out.println("title = " + b1.getTitle()); // null
                System.out.println("pages = " + b1.getPages()); // 0
                System.out.println("author = " + b1.getAuthor()); // null

                // Checkpoint 2
                Book b2 = new Book(); // Default aka empty constructor
                System.out.println("\nb2 after default constructor:");
                System.out.println("title = " + b2.getTitle() + ", pages = " + b2.getPages() + ", author = " + b2.getAuthor());

                Book b3 = new Book("Becoming a Saint by Touching Corpses", 817, "Jiang Shengfan"); // All data constructor
                System.out.println("\nd3 after parameterized constructor:");
                System.out.println("title = " + b3.getTitle() + ", pages = " + b3.getPages() + ", author = " + b3.getAuthor());

                // Checkpoint 3
                System.out.println("\nPrinting objects after overriding toString():");
                System.out.println("b2 = " + b2);
                System.out.println("b3 = " + b3); // will print the things in the object rather than the memory spot

                // Checkpoint 4
                System.out.println("\nMutating private fields through getteres and setters:");
                b3.setPages(676); 
                b3.setTitle("Corpse Saint");
                System.out.println("After mutation, b3 = " + b3);

                // Checkpoint 5

	}

}
