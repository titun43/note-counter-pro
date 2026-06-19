package org.apache.cordova;

import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AllowListPlugin f2896i;

    public c(AllowListPlugin allowListPlugin) {
        this.f2896i = allowListPlugin;
        new HashMap(20);
    }

    @Override // org.apache.cordova.g
    public final void a(XmlPullParser xmlPullParser) {
    }

    @Override // org.apache.cordova.g
    public final void b(XmlPullParser xmlPullParser) {
        String attributeValue;
        String name = xmlPullParser.getName();
        boolean equals = name.equals("content");
        AllowListPlugin allowListPlugin = this.f2896i;
        if (equals) {
            allowListPlugin.f2856c.a(xmlPullParser.getAttributeValue(null, "src"));
            return;
        }
        if (name.equals("allow-navigation")) {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "href");
            if (!"*".equals(attributeValue2)) {
                allowListPlugin.f2856c.a(attributeValue2);
                return;
            }
            allowListPlugin.f2856c.a("http://*/*");
            allowListPlugin.f2856c.a("https://*/*");
            allowListPlugin.f2856c.a("data:*");
            return;
        }
        if (name.equals("allow-intent")) {
            allowListPlugin.f2857d.a(xmlPullParser.getAttributeValue(null, "href"));
            return;
        }
        if (!name.equals("access") || (attributeValue = xmlPullParser.getAttributeValue(null, "origin")) == null) {
            return;
        }
        if ("*".equals(attributeValue)) {
            allowListPlugin.f2858e.a("http://*/*");
            allowListPlugin.f2858e.a("https://*/*");
            return;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "subdomains");
        b bVar = allowListPlugin.f2858e;
        if (attributeValue3 != null) {
            attributeValue3.compareToIgnoreCase("true");
        }
        bVar.a(attributeValue);
    }
}
