package staticAndDefaultMethod;
@FunctionalInterface
public interface ExampleInterface {
    int randomCalculate(int a, int b);//method declaration for abstract method

    default void print(int result) {
        System.out.println("Concrete method of Functional Interface Called : "+result);
    }//default method is a concrete method that written in functional interface.
    default void max(){
        System.out.println("Default/Concrete method creation = Max");
    }
    static void showMsg(){
        System.out.println("static showMsg called");
    }

}
