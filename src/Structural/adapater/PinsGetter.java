package Structural.adapater;

public class PinsGetter {

    private static Pins getPin(SocketAdapter socketAdapter, int x){
        switch (x){
            case 2:  return socketAdapter.get2Pins();
            case 3:  return socketAdapter.get3Pins();
            case 4:  return socketAdapter.get4Pins();
            default: return socketAdapter.get2Pins();
        }
    }

    public static void printPins(){
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Pins p2 = getPin(socketAdapter,2);
        Pins p3 = getPin(socketAdapter,3);
        Pins p4 = getPin(socketAdapter,4);
        System.out.println("Here is the 2 pins outlet:" + p2.getNumberOfPins());
        System.out.println("Here is the 3 pins outlet:" + p3.getNumberOfPins());
        System.out.println("Here is the 4 pins outlet:" + p4.getNumberOfPins());
    }
}
