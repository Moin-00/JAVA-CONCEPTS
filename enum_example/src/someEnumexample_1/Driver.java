package someEnumexample_1;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Direction values() :"+ Arrays.toString(Direction.values()));
        for (Direction direction : Direction.values()){
            System.out.println(direction.msg);
        }
        System.out.println("\n"+Direction.NORTH.msg);


        System.out.println(Direction.Function()  );
        System.out.println("M"+"O");
        Direction.print();
        System.out.println(Direction.message);




    }
}
