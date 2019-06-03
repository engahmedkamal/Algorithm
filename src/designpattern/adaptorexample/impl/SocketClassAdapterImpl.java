package designpattern.adaptorexample.impl;

import designpattern.adaptorexample.Socket;
import designpattern.adaptorexample.SocketAdaptor;
import designpattern.adaptorexample.Volt;
import designpattern.adaptorexample.dataenum.ConversionSign;

import java.util.Arrays;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket  implements SocketAdaptor  {


    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 10 ,ConversionSign.DIVIDE);
    }

    @Override
    public Volt get240Volt() {
        return convertVolt(getVolt(), 2,ConversionSign.MULTIPLY);
    }

}
