public class Dog {
    public String name;
    public int age;
    public String breed; // 3 variables, two strings and an int. All public for initial tests, private is correct.

    public Dog() { // Default state
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    public Dog(String name, int age, String breed) { // Give me all the input right off the bat
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override // Compiler checks to make sure it's actually finding the default setting
    public String toString() { // Our way of printing this object
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
