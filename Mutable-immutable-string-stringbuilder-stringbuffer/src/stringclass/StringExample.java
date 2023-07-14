package stringclass;
/*
* String pool:-A memory is allocated in heap memory to store string literals
* */
//String is non-primitive data type and creates new string objects which immutable.

/*
There are two ways to create String objects.
1. Using new keyword. -> It creates two object. One in heap and one in string constant pool
if string constant pool doesn't contain same string object.
        String name = new String("Vikram");


2. Using string literal.
        String name2 = "Vivek";//"Vivek" is string literal
 */

/*
String constant pool - It is part of heap memory that is created by String class when
this String class is loaded by the classloader, then a part heap memory is reserved for
string constants and stored into it.
 */

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Mark";
        System.out.println(name1);

        String name2 = name1 + "Wryn";
        System.out.println(name2);

        name1=name1+"Wryn";
        System.out.println(name1);

        if (name1.equals(name2)) {
            System.out.println("Same addresses in name1 and name2");
        } else {
            System.out.println("Different addresses in name1 and name2");
        }

        String n1="Moin";
        String n2="Moin";
        if (n1 == n2) {
            System.out.println("Same addresses in n1 and n2");
            System.out.println("n1="+n1+"\nn2="+n2);
        } else {
            System.out.println("Different addresses in n1 and n2");
            System.out.println("n1="+n1+"\nn2="+n2);
        }

        n1="Moin"+"Mulani";//created in SCP
        String n4=n1+"Mulani";//created in heap because we used variable to concat
        String n3="MoinMulani";//created in SCP
        //Why does n3 has diff address and n4  has diff address
        //because the literals are created in different pool one in heap and other in String Constant Pool
        if (n1 == n3) {
            System.out.println("Same addresses in n1 and n3");
            System.out.println("n1="+n1+"\nn3="+n3);
        } else {
            System.out.println("Different addresses in n1 and n3");
            System.out.println("n1="+n1+"\nn3="+n3);
        }

        if (n4 == n3) {
            System.out.println("Same addresses in n4 and n3");
            System.out.println("n4="+n4+"\nn3="+n3);
        } else {
            System.out.println("Different addresses in n4 and n3");
            System.out.println("n4="+n4+"\nn3="+n3);
        }





    }


}
