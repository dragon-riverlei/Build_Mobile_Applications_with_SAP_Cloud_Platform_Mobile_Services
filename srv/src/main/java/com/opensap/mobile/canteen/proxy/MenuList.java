//# xsc 20.1.2-a5868d-20200407

package com.opensap.mobile.canteen.proxy;

public class MenuList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.opensap.mobile.canteen.proxy.Menu>
{
    public static final com.opensap.mobile.canteen.proxy.MenuList empty = new com.opensap.mobile.canteen.proxy.MenuList(java.lang.Integer.MIN_VALUE);

    public MenuList()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public MenuList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.opensap.mobile.canteen.proxy.MenuList list)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.opensap.mobile.canteen.proxy.MenuList addThis(final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.opensap.mobile.canteen.proxy.MenuList copy()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.opensap.mobile.canteen.proxy.Menu first()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getUntypedList().first());
    }

    public static com.opensap.mobile.canteen.proxy.MenuList from(final java.util.List<com.opensap.mobile.canteen.proxy.Menu> list)
    {
        return MenuList.share(new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.canteen.proxy.Menu>(list).toAnyList());
    }

    public com.opensap.mobile.canteen.proxy.Menu get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.opensap.mobile.canteen.proxy.Menu item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.opensap.mobile.canteen.proxy.MenuList list)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.opensap.mobile.canteen.proxy.Menu> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.opensap.mobile.canteen.proxy.Menu last()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.opensap.mobile.canteen.proxy.Menu item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.opensap.mobile.canteen.proxy.Menu item)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.opensap.mobile.canteen.proxy.MenuList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.opensap.mobile.canteen.proxy.MenuList result = new com.opensap.mobile.canteen.proxy.MenuList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.opensap.mobile.canteen.proxy.Menu)
                {
                    final com.opensap.mobile.canteen.proxy.Menu var_item = ((com.opensap.mobile.canteen.proxy.Menu)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.opensap.mobile.canteen.proxy.Menu single()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getUntypedList().single());
    }

    public com.opensap.mobile.canteen.proxy.MenuList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.opensap.mobile.canteen.proxy.MenuList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1051:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.opensap.mobile.canteen.proxy.MenuList result = new com.opensap.mobile.canteen.proxy.MenuList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1053:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/2851a564-817f-44c4-8f13-9827e56293a4/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1058:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu);
    }

    public java.util.List<com.opensap.mobile.canteen.proxy.Menu> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.canteen.proxy.Menu>(this);
    }
}