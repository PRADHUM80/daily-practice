package JAVA;


class Device {
public void powerOn() {
    System.out.println("Device is powered on.");
 }
} 
class Smartphone extends Device {
    public void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }
}

public class Upcasting17 {
    public static void main(String[] args) {
    Device myDevice = new Smartphone();
    myDevice.powerOn();
    }
}
