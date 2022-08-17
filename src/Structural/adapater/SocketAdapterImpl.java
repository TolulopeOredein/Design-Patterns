package Structural.adapater;

public class SocketAdapterImpl implements SocketAdapter {

    Socket socket = new Socket();

    @Override
    public Pins get2Pins() {
        Pins pin = socket.getPins();
        return convertPins(pin, 2);
    }

    @Override
    public Pins get3Pins() {
        Pins pin = socket.getPins();
        return convertPins(pin, 2);
    }

    @Override
    public Pins get4Pins() {
        Pins pin = socket.getPins();
        return convertPins(pin, 3);
    }
    public Pins convertPins(Pins pin, int i){

        switch(i){
            case 2: return new Pins(2);
            case 3: return new Pins(3);
            case 4: return new Pins(4);
            default: return new Pins(2);
        }

    }
}
