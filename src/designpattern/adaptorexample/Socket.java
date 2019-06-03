package designpattern.adaptorexample;

//(producing constant volts of 120V). so need an adaptor to produce diffrent volt outputs 3 ,12 ,120
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
