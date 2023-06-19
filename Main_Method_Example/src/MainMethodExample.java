public class MainMethodExample {
    /*
    Access Specifier :It is access level of any field
    1.Public: Accessed by any one
    2.Protected:The "protected" access specifier allows access to the class, method, variable, or
      constructor within the same package or subclasses (in any package).
      Protected members are not accessible outside the package unless they are inherited by a subclass.
    3.Private: The "private" access specifier restricts access to the class, method, variable, or constructor
      within the same class only.
      Private members cannot be accessed or inherited by other classes, even if they are in the same package.
    4.Default(no specifier): If no access specifier is specified, it is considered the "default" access specifier.
      The default access allows access to the class, method, variable, or constructor within the same package only.
      It restricts access from classes in other packages.
     */
    static int count;
    public static void main(String[] args) {
        System.out.println("MAin method executed");
        MainMethodExample.Method_1("Moin");
        System.out.println("exited main method");
        System.out.println("Count value is : "+MainMethodExample.count);
        /*
        System -> The System class contains several useful class fields and methods.
        It cannot be instantiated. (Object cannot be created).
        Among the facilities provided by the System class are standard input,
        standard output, and error output streams.
        out -> public static final java.io.PrintStream out
        println() -> this is PrintStream object's method
        */}

        public static void Method_1(String name) {
            System.out.println("hello" + name);
            Motor.rotatemotor();
            System.out.println("say hello exited");
        }



}
class Motor{
    static void rotatemotor(){
        System.out.println("Motor Is Rotating ");
        System.out.println("This MOtotr belongs to");
        System.out.println("Rotate motor exited");
    }
}
