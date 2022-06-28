package JavaBasics;

 //this is how we make class by using class keyword
public class CreatingClassMethodObject {
    //this is how we make method,we call this method in the main method.
    void isMethod() {
       
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Created an object 
        CreatingClassMethodObject obj = new CreatingClassMethodObject();
        // Calling the method
        obj.isMethod();
    }
}