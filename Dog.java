public class Dog {
    private String name;
    private int age;
    private String breed; // Keep those grubby hands off my private data!

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

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; } // Setters and getters to keep main's fingies out
}
