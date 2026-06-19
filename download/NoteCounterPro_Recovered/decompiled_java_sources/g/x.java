package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static b0.g b(Configuration configuration) {
        return b0.g.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(b0.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f689a.f690a.toLanguageTags()));
    }

    public static void d(Configuration configuration, b0.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f689a.f690a.toLanguageTags()));
    }
}
