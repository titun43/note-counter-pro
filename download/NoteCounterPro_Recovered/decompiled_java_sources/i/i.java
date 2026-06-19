package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j.q;
import java.io.IOException;
import k.n1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f1775e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1776f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1778b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1779c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1780d;

    static {
        Class[] clsArr = {Context.class};
        f1775e = clsArr;
        f1776f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f1779c = context;
        Object[] objArr = {context};
        this.f1777a = objArr;
        this.f1778b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i5;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i5 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i5) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z5 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z5 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i5 = 2;
                        z4 = z4;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        hVar.f1752b = 0;
                        hVar.f1753c = 0;
                        hVar.f1754d = 0;
                        hVar.f1755e = 0;
                        hVar.f1756f = true;
                        hVar.f1757g = true;
                    } else if (name2.equals("item")) {
                        if (!hVar.h) {
                            q qVar = hVar.f1774z;
                            if (qVar == null || !qVar.f1992b.hasSubMenu()) {
                                hVar.h = true;
                                hVar.b(hVar.f1751a.add(hVar.f1752b, hVar.f1758i, hVar.f1759j, hVar.f1760k));
                            } else {
                                hVar.h = true;
                                hVar.b(hVar.f1751a.addSubMenu(hVar.f1752b, hVar.f1758i, hVar.f1759j, hVar.f1760k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z4 = z4;
            } else {
                if (!z5) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f1779c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1324p);
                        hVar.f1752b = obtainStyledAttributes.getResourceId(1, 0);
                        hVar.f1753c = obtainStyledAttributes.getInt(3, 0);
                        hVar.f1754d = obtainStyledAttributes.getInt(4, 0);
                        hVar.f1755e = obtainStyledAttributes.getInt(5, 0);
                        hVar.f1756f = obtainStyledAttributes.getBoolean(2, true);
                        hVar.f1757g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1325q);
                            hVar.f1758i = obtainStyledAttributes2.getResourceId(2, 0);
                            hVar.f1759j = (obtainStyledAttributes2.getInt(5, hVar.f1753c) & (-65536)) | (obtainStyledAttributes2.getInt(6, hVar.f1754d) & 65535);
                            hVar.f1760k = obtainStyledAttributes2.getText(7);
                            hVar.f1761l = obtainStyledAttributes2.getText(8);
                            hVar.f1762m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            hVar.f1763n = string == null ? (char) 0 : string.charAt(0);
                            hVar.f1764o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            hVar.f1765p = string2 == null ? (char) 0 : string2.charAt(0);
                            hVar.f1766q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                hVar.f1767r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                hVar.f1767r = hVar.f1755e;
                            }
                            hVar.f1768s = obtainStyledAttributes2.getBoolean(3, false);
                            hVar.f1769t = obtainStyledAttributes2.getBoolean(4, hVar.f1756f);
                            hVar.f1770u = obtainStyledAttributes2.getBoolean(1, hVar.f1757g);
                            hVar.f1771v = obtainStyledAttributes2.getInt(21, -1);
                            hVar.f1773y = obtainStyledAttributes2.getString(12);
                            hVar.w = obtainStyledAttributes2.getResourceId(13, 0);
                            hVar.f1772x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && hVar.w == 0 && hVar.f1772x == null) {
                                hVar.f1774z = (q) hVar.a(string3, f1776f, this.f1778b);
                            } else {
                                if (z6) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                hVar.f1774z = null;
                            }
                            hVar.A = obtainStyledAttributes2.getText(17);
                            hVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                hVar.D = n1.b(obtainStyledAttributes2.getInt(19, -1), hVar.D);
                            } else {
                                hVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = v.a.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                hVar.C = colorStateList;
                            } else {
                                hVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            hVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            hVar.h = true;
                            SubMenu addSubMenu = hVar.f1751a.addSubMenu(hVar.f1752b, hVar.f1758i, hVar.f1759j, hVar.f1760k);
                            hVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i5 = 2;
                        z4 = z4;
                        z5 = z5;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z4 = z4;
            }
            eventType = xmlPullParser2.next();
            i5 = 2;
            z4 = z4;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i5, Menu menu) {
        if (!(menu instanceof j.n)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z4 = false;
        try {
            try {
                xmlResourceParser = this.f1779c.getResources().getLayout(i5);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof j.n) {
                    j.n nVar = (j.n) menu;
                    if (!nVar.f1957p) {
                        nVar.w();
                        z4 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z4) {
                    ((j.n) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (z4) {
                ((j.n) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
