//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy.internal;

public abstract class Any_as_com_opensap_mobile_canteen_proxy_Booking
{
    public static com.opensap.mobile.canteen.proxy.Booking cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1023:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.opensap.mobile.canteen.proxy.Booking)
        {
            final com.opensap.mobile.canteen.proxy.Booking var_value = ((com.opensap.mobile.canteen.proxy.Booking)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.opensap.mobile.canteen.proxy.Booking");
        }
    }
}
