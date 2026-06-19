package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzide {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzidc zzidcVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzidcVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i5, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i5, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i6 = 1; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzied.zza(zzian.zzv((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzian) {
            sb.append(": \"");
            sb.append(zzied.zza((zzian) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzibr) {
            sb.append(" {");
            zzc((zzibr) obj, sb, i5 + 2);
            sb.append("\n");
            zzd(i5, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i7 = i5 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i7, "key", entry.getKey());
        zzb(sb, i7, "value", entry.getValue());
        sb.append("\n");
        zzd(i5, sb);
        sb.append("}");
    }

    private static void zzc(zzidc zzidcVar, StringBuilder sb, int i5) {
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzidcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i6 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i6);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i5, substring.substring(0, substring.length() - 4), zzibr.zzbB(method2, zzidcVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i5, substring.substring(0, substring.length() - 3), zzibr.zzbB(method, zzidcVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbB = zzibr.zzbB(method4, zzidcVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzibr.zzbB(method5, zzidcVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    } else if (zzbB instanceof Boolean) {
                        if (!((Boolean) zzbB).booleanValue()) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    } else if (zzbB instanceof Integer) {
                        if (((Integer) zzbB).intValue() == 0) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    } else if (zzbB instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzbB).floatValue()) == 0) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    } else if (zzbB instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzbB).doubleValue()) == 0) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    } else {
                        if (zzbB instanceof String) {
                            equals = zzbB.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        } else if (zzbB instanceof zzian) {
                            equals = zzbB.equals(zzian.zza);
                        } else if (zzbB instanceof zzidc) {
                            if (zzbB == ((zzidc) zzbB).zzbw()) {
                            }
                            zzb(sb, i5, substring, zzbB);
                        } else {
                            if ((zzbB instanceof Enum) && ((Enum) zzbB).ordinal() == 0) {
                            }
                            zzb(sb, i5, substring, zzbB);
                        }
                        if (equals) {
                        }
                        zzb(sb, i5, substring, zzbB);
                    }
                }
            }
            i6 = 3;
        }
        if (zzidcVar instanceof zzibn) {
            Iterator zzc = ((zzibn) zzidcVar).zza.zzc();
            while (zzc.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzc.next();
                int i8 = ((zzibo) entry2.getKey()).zza;
                zzb(sb, i5, u.m(new StringBuilder(String.valueOf(i8).length() + 2), "[", i8, "]"), entry2.getValue());
            }
        }
        zzieg zziegVar = ((zzibr) zzidcVar).zzt;
        if (zziegVar != null) {
            zziegVar.zzj(sb, i5);
        }
    }

    private static void zzd(int i5, StringBuilder sb) {
        while (i5 > 0) {
            int i6 = 80;
            if (i5 <= 80) {
                i6 = i5;
            }
            sb.append(zza, 0, i6);
            i5 -= i6;
        }
    }
}
