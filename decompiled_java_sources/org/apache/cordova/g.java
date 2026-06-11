package org.apache.cordova;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public String f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2916b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2917c = new ArrayList(20);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2918d = false;

    /* renamed from: e, reason: collision with root package name */
    public String f2919e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: f, reason: collision with root package name */
    public String f2920f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: g, reason: collision with root package name */
    public String f2921g = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean h = false;

    public void a(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getName().equals("feature")) {
            this.f2917c.add(new i0(this.f2919e, this.f2920f, this.h));
            this.f2919e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            this.f2920f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            this.f2918d = false;
            this.h = false;
        }
    }

    public void b(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (name.equals("feature")) {
            this.f2918d = true;
            this.f2919e = xmlPullParser.getAttributeValue(null, "name");
            return;
        }
        if (this.f2918d && name.equals("param")) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "name");
            this.f2921g = attributeValue;
            if (attributeValue.equals("service")) {
                this.f2919e = xmlPullParser.getAttributeValue(null, "value");
                return;
            }
            if (this.f2921g.equals("package") || this.f2921g.equals("android-package")) {
                this.f2920f = xmlPullParser.getAttributeValue(null, "value");
                return;
            } else {
                if (this.f2921g.equals("onload")) {
                    this.h = "true".equals(xmlPullParser.getAttributeValue(null, "value"));
                    return;
                }
                return;
            }
        }
        if (name.equals("preference")) {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "name");
            Locale locale = Locale.ENGLISH;
            String lowerCase = attributeValue2.toLowerCase(locale);
            this.f2916b.f2955a.put(lowerCase.toLowerCase(locale), xmlPullParser.getAttributeValue(null, "value"));
            return;
        }
        if (name.equals("content")) {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "src");
            if (attributeValue3 != null) {
                this.f2915a = attributeValue3;
            } else {
                this.f2915a = "index.html";
            }
        }
    }

    public final void c(Context context) {
        int identifier = context.getResources().getIdentifier("config", "xml", context.getClass().getPackage().getName());
        if (identifier == 0 && (identifier = context.getResources().getIdentifier("config", "xml", context.getPackageName())) == 0) {
            Log.e("ConfigXmlParser", "res/xml/config.xml is missing!");
            return;
        }
        i0 i0Var = new i0(AllowListPlugin.PLUGIN_NAME, "org.apache.cordova.AllowListPlugin", true);
        ArrayList arrayList = this.f2917c;
        arrayList.add(i0Var);
        arrayList.add(new i0("CordovaSplashScreenPlugin", "org.apache.cordova.SplashScreenPlugin", true));
        d(context.getResources().getXml(identifier));
    }

    public final void d(XmlPullParser xmlPullParser) {
        int i5 = -1;
        while (i5 != 1) {
            if (i5 == 2) {
                b(xmlPullParser);
            } else if (i5 == 3) {
                a(xmlPullParser);
            }
            try {
                i5 = xmlPullParser.next();
            } catch (IOException e4) {
                e4.printStackTrace();
            } catch (XmlPullParserException e5) {
                e5.printStackTrace();
            }
        }
        if (this.f2915a == null) {
            this.f2915a = "index.html";
        }
    }
}
