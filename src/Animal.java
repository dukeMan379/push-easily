abstract class Animal {
    protected String name;

    // Abstract method that must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method that can be used by subclasses
    public void introduce() {
        System.out.println("this is " + name);

    }
}