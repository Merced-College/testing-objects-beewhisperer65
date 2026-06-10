[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24109566)
# testingObjectsWithJava

# Write your answers to your reflection questions here. Write your name, the date and the answers.

# Make sure to push your code to your repo!

# Brendan Hulse, 6/9/26

# Checkpoint Questions:

# Q1: Printing an object that doesn't contain a toString causes the program to use Java's default toString. Which is why you get the object's type @ a hash code. That's what Java will always do if you don't give it its own way to print it.

# Q2: name and breed (Strings) were null and age (int) was 0. Primitive types store a specific piece of data of that type. So int is a primitive type that stores an integer. Reference types store a memory location to put stuff in later. String is a reference type, and it contains whatever String you store in that memory spot.

# Experiment: The constructor Dog() is undefined. We gave it a way to construct, thereby overriding the default, and then tried to use a default that we can't get to anymore.

# Q3: We overrode the java default so we're now using our own default constructor, meaning that null became specific strings (we kept 0 as the int default but we could have done like -1 to show it wasn't set yet.)

# Q4: Similar to the constructor, since we changed the toString method from the java default, the time we were using it in part one is now showing the same printout as part 4. Overried is a useful but unnecessary flag that notifies the compiler that we were trying to override something from a higher/deeper level. If it throws an error that there's nothing to override, we might have typod something which messes us up.

# Q5: Keeping data private means that it's secure. Other methods can't change it in ways you don't prepare for. This can mean that it both keeps any information you don't want accessed away from any other code for legitimate cybersecurity reasons and it also means that I can't change data through a different method or in main in a way that goes against the boundaries I set for the data. For example I can have the constructor and setters of a certain int make sure it never leaves the range of 0-5. If this is the only way to change that data, it will always stay within 0-5, but if it's public then somebody can directly change it to anything and my "make sure everything doesn't explode if the counter goes above 5" limit isn't enforcable.

# Copied the Dog class to Book and modified it piece by piece to fit. My class made.

# Reflection Questions:

# 1. When we printed the objects before writing our own toString() method, it printed the object type and its location in hash form. This is because that's the toString() method that java has built into itself. So, we overrode the default and made our own way of printing this type of object.

# By adding the default constructor, we told our objects what their values should have if we don't give it anything. Before it was using java's default for each type. So, for int it was 0, for double it was 0.0, for boolean it was false and for reference values it was null. Then, when we added the paramaterized constructor we made a new way to create the object, where rather than our custom default, we would instead give it all the data and not require setting the data in main before using it. Each is a situationally useful way to make these objects.