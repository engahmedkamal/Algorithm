package designpattern.adaptorexample;

import designpattern.adaptorexample.dataenum.ConversionSign;

public interface SocketAdaptor {


    Volt get120Volt();

    Volt get12Volt();

    Volt get240Volt();

    default Volt convertVolt(Volt v, int i, ConversionSign conversionSign) {
        if (conversionSign.equals(ConversionSign.MULTIPLY)) {
            return new Volt(v.getVolts() * i);
        } else if (conversionSign.equals(ConversionSign.DIVIDE)) {
            return new Volt(v.getVolts() / i);
        } else {
            return new Volt(v.getVolts());
        }
    }

}
