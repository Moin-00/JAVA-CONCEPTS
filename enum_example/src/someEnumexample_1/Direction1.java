package someEnumexample_1;
//
//
//
//
//
//
public enum Direction1 {
    NORTH("NORTH IS COLD"),
    SOUTH("SOUTH IS SEASIDE"),
    WEST("SUN SETS IN WEST"),
    EAST("SUN RISES FROM EAST");






    String msg;

    Direction1(String msg) {
        this.msg = msg;
        System.out.println("Msg from constructor " + msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {

        this.msg = msg;
    }
}
