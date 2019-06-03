package designpattern.adaptorexample;

import designpattern.adaptorexample.dataenum.Country;
import designpattern.adaptorexample.impl.SocketClassAdapterImpl;
import designpattern.adaptorexample.impl.SocketObjectAdapterImpl;

public class Client {

    private SocketAdaptor socketClassAdaptor;
    private SocketAdaptor socketObjectAdaptor;

    public Client() {
   socketClassAdaptor=new SocketClassAdapterImpl();
   socketObjectAdaptor = new SocketObjectAdapterImpl();
    }

    public void getVoltBasedOnClientCountry(Country country){

       switch (country){
           case USA:
                  socketObjectAdaptor.get120Volt();
                  socketClassAdaptor.get120Volt();
               break;
           case EGYPT:
               socketObjectAdaptor.get12Volt();
               socketClassAdaptor.get12Volt();
               break;
           case INDIA:
               socketObjectAdaptor.get240Volt();
               socketClassAdaptor.get240Volt();
               break;
       }


    }
}
