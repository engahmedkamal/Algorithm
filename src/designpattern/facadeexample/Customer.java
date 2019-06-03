package designpattern.facadeexample;

import designpattern.facadeexample.dataenum.MobileType;

public class Customer {

    private MobileShopFacade mobileShopFacade;


    public Customer() {
        mobileShopFacade = new MobileShopFacade();
    }

    public void buyMobile(MobileType mobileType) {

        if (mobileType.equals(MobileType.IPHONE)) {
            mobileShopFacade.buyIPhone();
        } else if (mobileType.equals(MobileType.SAMSOUNG)) {
            mobileShopFacade.buySamsung();
        }

    }
}
