package meeting;

public class student {

    //Constructor
    //We can initialize the object with constructor
    //The constructor is called when we create the object
    //The constructor has the same name as the class
    //The constructor has no return type
    //The constructor can have parameters
    //The constructor can be overloaded
    public student() {
        System.out.println("Object created");
    }

    public student(String name) {
        this.name = name;
    }
    //Constructor with parameters (overloaded)
    public student(String name, int age) {
        this(name);
        this.age = age;
    }

    //Instance variable
    //When we create an object,
    // the instance variable is created
    //The instance variable is created for each object
    public String name;
    public int age;

    //Instance method
    //Custom method of the class
    public void print() {
        System.out.println("student");
    }

}
