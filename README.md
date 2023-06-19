# JAVA-CONCEPTS
OOPs Concepts
/*
        The getClass() method is a method defined in the Object class, the root class for all Java classes.
        It returns the runtime class of the object on which it is invoked.
        The runtime class represents the actual class of the object at runtime.

        getName() is also defined in "Class" class .
        The getName() method is a method defined in the "Class" class. When called on a Class object,
         it returns the fully qualified name of the class as a String.
        The fully qualified name includes the package name followed by the class name.

        By combining these two methods, getClass().getName() allows you to obtain the fully
         qualified class name of an object at runtime.
         Here's an example to demonstrate the usage:


    public class MyClass {
        public static void main(String[] args) {
             MyClass obj = new MyClass();
             System.out.println(obj.getClass().getName());
         }
    }
    Output:
    com.example.MyClass
    In the example above, obj.getClass() returns the Class object representing the class MyClass. 
    Then, getName() is invoked on that Class object to obtain the fully qualified name of the class.

    This approach is commonly used when you need to dynamically determine the class name of an object at runtime,
    for example, when implementing reflection, logging, or any scenario where you need to work with class names
    programmatically.

    when called using class object of a class it returns the fully qualified name
    of the class . in this case getName() will return HondaCity as object of this class
     is used to invoke getName() Method .
  */
