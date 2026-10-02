import java.util.Random;

// Person class with unique ID, name, age, and Comparable interface for sorting
class Person implements Comparable<Person> {
    private static Random rand = new Random(); // Random Number generator for unique IDs
    int id; // Unique identifier
    String name;
    int age;

    // Constructor to auto generate ID and set name and age
    public Person(String name, int age) {
        id = rand.nextInt(Integer.MAX_VALUE);    // Set the id using the random number generator
        this.name = name;
        this.age = age;         // Set the name and age fields using the constructor parameters


    }

    @Override
    public String toString() {
       String message = "Person ID: " + String.valueOf(id) + "\n" +"Person Name: "+ name + "\n" + "Person Age: "+ String.valueOf(age) + "\n";
        return message;
    }

    // Implement the Comparable<Person> interface to compare Person objects by id
    @Override
    public int compareTo(Person other) {
        int result = Integer.compare(id, other.id);    // Use subtraction or Integer.compare to compare the ids of two Person objects
        //Ref
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        //compareTo Method: Compares the current object with another object.

        //It returns:
        if (result > 0)
            return  1;          //A positive integer if the current object is greater.
        if (result < 0)
            return -1;            //A negative integer if the current object is lesser.
        else
            return 0;//Zero if both objects are equal
    }
}