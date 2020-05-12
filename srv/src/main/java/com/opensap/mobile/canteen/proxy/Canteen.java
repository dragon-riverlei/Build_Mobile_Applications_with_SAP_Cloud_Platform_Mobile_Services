//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy;

public class Canteen
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property location = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Location");

    public static final com.sap.cloud.server.odata.Property name = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property serveMenus = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("serveMenus");

    public Canteen()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:186:5
        this(true);
    }

    public Canteen(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:186:5
        super(withDefaults, com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen);
    }

    public com.opensap.mobile.canteen.proxy.Canteen copy()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:171:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.copyEntity());
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:207:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.canteenID));
    }

    public String getLocation()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:220:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.location));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:233:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.name));
    }

    public com.opensap.mobile.canteen.proxy.Canteen getOld()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:166:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getOldEntity());
    }

    public com.opensap.mobile.canteen.proxy.MenuList getServeMenus()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:246:5
        return com.opensap.mobile.canteen.proxy.MenuList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.serveMenus)));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:159:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:176:12
        return new com.sap.cloud.server.odata.EntityKey().with("CanteenID", com.sap.cloud.server.odata.LongValue.of(canteenID));
    }

    public static com.opensap.mobile.canteen.proxy.CanteenList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:181:12
        return com.opensap.mobile.canteen.proxy.CanteenList.share(from);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:212:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Canteen.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setLocation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:225:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Canteen.location, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:238:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Canteen.name, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setServeMenus(final com.opensap.mobile.canteen.proxy.MenuList value)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:251:5
        com.opensap.mobile.canteen.proxy.Canteen.serveMenus.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
