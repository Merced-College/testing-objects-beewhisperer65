[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24109566)
# testingObjectsWithJava

Write your answers to your reflection questions here. Write your name, the date and the answers.

Make sure to push your code to your repo!

Brendan Hulse, 6/9/26

Q1: Printing an object that doesn't contain a toString causes the program to use Java's default toString. Which is why you get the object's type @ a hash code. That's what Java will always do if you don't give it its own way to print it.

Q2: name and breed (Strings) were null and age (int) was 0. Primitive types store a specific piece of data of that type. So int is a primitive type that stores an integer. Reference types store a memory location to put stuff in later. String is a reference type, and it contains whatever String you store in that memory spot.

Experiment: The constructor Dog() is undefined. We gave it a way to construct, thereby overriding the default, and then tried to use a default that we can't get to anymore.

Q3: We overrode the java default so we're now using our own default constructor, meaning that null became specific strings (we kept 0 as the int default but we could have done like -1 to show it wasn't set yet.)