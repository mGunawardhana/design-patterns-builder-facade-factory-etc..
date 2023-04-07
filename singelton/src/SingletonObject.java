/*
   SINGLETON PATTERN
   is one of the simplest design pattern in java.
   This type of design pattern comes under creational pattern as this pattern
   provides on of the best ways to create an object.

   this pattern involves a single class which is responsible to create
   an objects while making sure that only single object gets created.
   This class provides a way to access its only object which can be accessed
   directly without instantiating the object of the class.
 */

public class SingletonObject {
    private static final SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World !");
    }

}
