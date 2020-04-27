//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy;

public class CanteenService
    extends com.sap.cloud.server.odata.DataService
{
    public CanteenService()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:631:5
        this(null);
    }

    public CanteenService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:631:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "CanteenService"));
        this.getProvider().setMetadata(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.document);
    }

    public boolean bookLunch(final long menuID, final String userID)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:984:5
        return this.bookLunch(menuID, userID, null, null, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:984:5
        return this.bookLunch(menuID, userID, query, null, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:984:5
        return this.bookLunch(menuID, userID, query, headers, null);
    }

    public boolean bookLunch(final long menuID, final String userID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:984:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.cloud.server.odata.BooleanValue.unwrap(this.executeQuery(var_query.invoke(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.FunctionImports.bookLunch, new com.sap.cloud.server.odata.ParameterList(2).with("MenuID", com.sap.cloud.server.odata.LongValue.of(menuID)).with("UserID", com.sap.cloud.server.odata.StringValue.of(userID))), var_headers, var_options).getResult());
    }

    public com.opensap.mobile.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:643:5
        return this.getBooking(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:643:5
        return this.getBooking(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Booking getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:643:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Booking.cast(this.executeQuery(query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getRequiredEntity());
    }

    public com.opensap.mobile.canteen.proxy.BookingList getBookingSet()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:658:5
        return this.getBookingSet(null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:658:5
        return this.getBookingSet(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:658:5
        return this.getBookingSet(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.BookingList getBookingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:658:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.Booking.list(this.executeQuery(var_query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.bookingSet), var_headers, var_options).getEntityList());
    }

    public com.opensap.mobile.canteen.proxy.Booking getBookingWithKey(final long bookingID)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:651:5
        return this.getBookingWithKey(bookingID, null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:651:5
        return this.getBookingWithKey(bookingID, query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:651:5
        return this.getBookingWithKey(bookingID, query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Booking getBookingWithKey(final long bookingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:651:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBooking(var_query.withKey(com.opensap.mobile.canteen.proxy.Booking.key(bookingID)), headers, options);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:757:5
        return this.getCanteen(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:757:5
        return this.getCanteen(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:757:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.executeQuery(query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getRequiredEntity());
    }

    public com.opensap.mobile.canteen.proxy.CanteenList getCanteenSet()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:772:5
        return this.getCanteenSet(null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:772:5
        return this.getCanteenSet(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:772:5
        return this.getCanteenSet(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:772:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.Canteen.list(this.executeQuery(var_query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getEntityList());
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteenWithKey(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:765:5
        return this.getCanteenWithKey(canteenID, null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:765:5
        return this.getCanteenWithKey(canteenID, query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:765:5
        return this.getCanteenWithKey(canteenID, query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:765:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCanteen(var_query.withKey(com.opensap.mobile.canteen.proxy.Canteen.key(canteenID)), headers, options);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:871:5
        return this.getMenu(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:871:5
        return this.getMenu(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:871:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.executeQuery(query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.menuSet), var_headers, var_options).getRequiredEntity());
    }

    public com.opensap.mobile.canteen.proxy.MenuList getMenuSet()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:886:5
        return this.getMenuSet(null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:886:5
        return this.getMenuSet(query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:886:5
        return this.getMenuSet(query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:886:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.opensap.mobile.canteen.proxy.Menu.list(this.executeQuery(var_query.fromDefault(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntitySets.menuSet), var_headers, var_options).getEntityList());
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenuWithKey(final long menuID)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:879:5
        return this.getMenuWithKey(menuID, null, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:879:5
        return this.getMenuWithKey(menuID, query, null, null);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:879:5
        return this.getMenuWithKey(menuID, query, headers, null);
    }

    public com.opensap.mobile.canteen.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:879:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getMenu(var_query.withKey(com.opensap.mobile.canteen.proxy.Menu.key(menuID)), headers, options);
    }

    @java.lang.Override public com.sap.cloud.server.odata.MetadataLock getMetadataLock()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:618:5
        return com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.lock;
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:637:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
