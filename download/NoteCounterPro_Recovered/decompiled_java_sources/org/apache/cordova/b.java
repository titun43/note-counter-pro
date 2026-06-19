package org.apache.cordova;

import android.net.Uri;
import com.getcapacitor.Bridge;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2895a = new ArrayList();

    public final void a(String str) {
        String str2 = "*";
        if (this.f2895a != null) {
            try {
                if (str.compareTo("*") == 0) {
                    this.f2895a = null;
                    return;
                }
                Matcher matcher = Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(4);
                    if ((!"file".equals(group) && !"content".equals(group)) || group2 != null) {
                        str2 = group2;
                    }
                    String group3 = matcher.group(8);
                    String group4 = matcher.group(9);
                    if (group != null) {
                        this.f2895a.add(new a(group, str2, group3, group4));
                    } else {
                        this.f2895a.add(new a(Bridge.CAPACITOR_HTTP_SCHEME, str2, group3, group4));
                        this.f2895a.add(new a(Bridge.CAPACITOR_HTTPS_SCHEME, str2, group3, group4));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean b(String str) {
        Pattern pattern;
        if (this.f2895a == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        ArrayList arrayList = this.f2895a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            a aVar = (a) obj;
            aVar.getClass();
            try {
                pattern = aVar.f2890a;
            } catch (Exception e4) {
                e4.toString();
            }
            if (pattern != null && !pattern.matcher(parse.getScheme()).matches()) {
            }
            Pattern pattern2 = aVar.f2891b;
            if (pattern2 == null || pattern2.matcher(parse.getHost()).matches()) {
                Integer num = aVar.f2892c;
                if (num == null || num.equals(Integer.valueOf(parse.getPort()))) {
                    Pattern pattern3 = aVar.f2893d;
                    if (pattern3 == null || pattern3.matcher(parse.getPath()).matches()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
