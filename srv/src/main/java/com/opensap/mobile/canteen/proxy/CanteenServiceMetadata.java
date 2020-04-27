//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy;

public abstract class CanteenServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:551:12
        com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.registerAll();
        com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType booking = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Booking");

        public static final com.sap.cloud.server.odata.EntityType canteen = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Canteen");

        public static final com.sap.cloud.server.odata.EntityType menu = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Menu");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet bookingSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("BookingSet");

        public static final com.sap.cloud.server.odata.EntitySet canteenSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("CanteenSet");

        public static final com.sap.cloud.server.odata.EntitySet menuSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("MenuSet");
    }

    public abstract static class FunctionImports
    {
        public static final com.sap.cloud.server.odata.DataMethod bookLunch = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getDataMethod("BookLunch");
    }
}
