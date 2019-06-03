package designpattern.adaptorexample.impl;

import designpattern.adaptorexample.Socket;
import designpattern.adaptorexample.SocketAdaptor;
import designpattern.adaptorexample.Volt;
import designpattern.adaptorexample.dataenum.ConversionSign;

public class SocketObjectAdapterImpl implements SocketAdaptor {

    //Using Composition for adapter pattern
    private Socket socket =new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10,ConversionSign.DIVIDE);
    }

    @Override
    public Volt get240Volt() {
        return convertVolt(socket.getVolt(),2,ConversionSign.MULTIPLY);
    }
}
