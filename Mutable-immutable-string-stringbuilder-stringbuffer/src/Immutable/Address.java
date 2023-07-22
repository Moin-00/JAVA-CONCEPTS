package Immutable;

public final class Address {
    int lineNum;
    String streetName;
    String city;
    int pinCode;
    public Address(int lineNum, String streetName, String city, int pinCode) {
        this.lineNum = lineNum;
        this.streetName = streetName;
        this.city = city;
        this.pinCode = pinCode;
    }
    public int getLineNum() {
        return lineNum;
    }


    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }


//    public void setLineNum(int lineNum) {
//        this.lineNum = lineNum;
//    }

//    public void setStreetName(String streetName) {
//        this.streetName = streetName;
//    }

//    public void setCity(String city) {
//        this.city = city;
//    }

//    public void setPinCode(int pinCode) {
//        this.pinCode = pinCode;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "lineNum=" + lineNum +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
