//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy.internal;

public abstract class CanteenServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:561:12
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateBooking());
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateCanteen());
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateMenu());
    }

    public static class CreateBooking
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:587:9
            return new com.opensap.mobile.canteen.proxy.Booking(false);
        }
    }

    public static class CreateCanteen
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:597:9
            return new com.opensap.mobile.canteen.proxy.Canteen(false);
        }
    }

    public static class CreateMenu
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:607:9
            return new com.opensap.mobile.canteen.proxy.Menu(false);
        }
    }
}
