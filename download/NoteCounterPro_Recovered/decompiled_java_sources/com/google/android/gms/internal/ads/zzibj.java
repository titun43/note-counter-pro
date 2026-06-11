package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzibj {
    public static zzibb zzb(Class cls) {
        ClassLoader classLoader = zzibj.class.getClassLoader();
        if (cls.equals(zzibb.class)) {
            try {
                try {
                    return (zzibb) cls.cast(((zzibj) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (ReflectiveOperationException e4) {
                    throw new IllegalStateException(e4);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzibj.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzibb) cls.cast(((zzibj) it.next()).zza()));
            } catch (ServiceConfigurationError e5) {
                Logger.getLogger(zziaw.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
            }
        }
        if (arrayList.size() == 1) {
            return (zzibb) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzibb) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public abstract zzibb zza();
}
