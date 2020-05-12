//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy.internal;

public abstract class CanteenServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        //# /usr/sap/ljs/xs-temp/2d058d74-33bc-4841-9375-9e0bf80ede75/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:512:12
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataText.XML, "com.opensap.mobile.canteen");
        metadata.setProxyVersion("20.1.2-a5868d-20200407");
        return metadata;
    }
}
