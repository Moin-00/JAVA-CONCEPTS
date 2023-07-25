public class WrapperClass {
    /*
    Wrapper classes are mostly used to handle String
    * primitive Data Types
    * 1.int
    * 2.short
    * 3.long
    * 4.char
    * 5.boolean
    * 6.float
    * 7.double
    * 8.byte
    * */
    public static void main(String[] args) {
        int x =10;
        Integer y =x;//autoboxing -->automatically converts from primitive (int) to primitive wrapper Class(Integer)
        int w =y ;
        String q = "69";
        boolean a = true;
        Boolean b =a;
        System.out.println("conversion from String to Boolean Wrapper class "+
                Boolean.valueOf("MMM")+"\n"+
                //while converting from string to boolean the returned boolean is true
                // only when the string is purely written as true or false for every other string
                //the returned boolean value will be false even for null.
                Boolean.parseBoolean("True")+"\n"+
                Boolean.valueOf("true"));

        Integer z =Integer.valueOf("6");//converts string to Integer
        Integer r =Integer.parseInt("15");//converts String to int (primitive data type)
        Integer p =Integer.parseInt(q);
        String s = String.valueOf(x);//converts int to String


        System.out.println("Integer Class :"+y+"\n"+z+"\n"+r+"\n Boolean"+a);
        System.out.println("Min value of Integer CLass :"+Integer.MIN_VALUE);
        System.out.println("Max value of Integer Class :"+ Integer.MAX_VALUE);
        x=y;//automatically converts from primitive wrapper Class(Integer) to primitive (int)
    }
}
