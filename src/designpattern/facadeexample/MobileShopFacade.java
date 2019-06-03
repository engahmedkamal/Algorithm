package designpattern.facadeexample;

import designpattern.facadeexample.impl.IPhone;
import designpattern.facadeexample.impl.Samsung;

public class MobileShopFacade {
    //wraper class that wraps the implementation of diffrent subsystems
    //so clint will work with only one interface instead of bunch of classes
    private Samsung samsungMobile;
    private IPhone iPhoneMobile;


    public MobileShopFacade() {
        samsungMobile = new Samsung();
        iPhoneMobile = new IPhone();

    }

    public void buyIPhone() {
        iPhoneMobile.getModelNumber();
        iPhoneMobile.generatePrice();

    }

    public void buySamsung() {
        samsungMobile.getModelNumber();
        samsungMobile.generatePrice();
    }
}
