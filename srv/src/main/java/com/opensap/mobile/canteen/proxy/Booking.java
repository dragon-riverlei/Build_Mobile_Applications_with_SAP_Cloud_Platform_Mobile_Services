//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy;

public class Booking
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookingDate = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("BookingDate");

    public static final com.sap.cloud.server.odata.Property bookingID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("BookingID");

    public static final com.sap.cloud.server.odata.Property menuID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property price = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property status = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("Status");

    public static final com.sap.cloud.server.odata.Property user = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("User");

    public static final com.sap.cloud.server.odata.Property menuBooked = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.getProperty("MenuBooked");

    public Booking()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:35:5
        this(true);
    }

    public Booking(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:35:5
        super(withDefaults, com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking);
    }

    public com.opensap.mobile.canteen.proxy.Booking copy()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:20:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Booking.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.GlobalDateTime getBookingDate()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:62:5
        return com.sap.cloud.server.odata.GlobalDateTime.castRequired(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.bookingDate));
    }

    public long getBookingID()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:75:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.bookingID));
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenuBooked()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:140:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.menuBooked));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:88:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.menuID));
    }

    public com.opensap.mobile.canteen.proxy.Booking getOld()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:15:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Booking.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:101:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.price));
    }

    public String getStatus()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:114:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.status));
    }

    public String getUser()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:127:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Booking.user));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long bookingID)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("BookingID", com.sap.cloud.server.odata.LongValue.of(bookingID));
    }

    public static com.opensap.mobile.canteen.proxy.BookingList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:30:12
        return com.opensap.mobile.canteen.proxy.BookingList.share(from);
    }

    public void setBookingDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:67:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.bookingDate, value);
    }

    public void setBookingID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:80:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.bookingID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setMenuBooked(final com.opensap.mobile.canteen.proxy.Menu value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:145:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.menuBooked, value);
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:93:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:106:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.price, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setStatus(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:119:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.status, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setUser(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:132:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Booking.user, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
