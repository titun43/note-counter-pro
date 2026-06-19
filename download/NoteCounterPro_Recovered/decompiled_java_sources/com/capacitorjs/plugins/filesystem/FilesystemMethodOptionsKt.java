package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import com.google.android.gms.common.api.f;
import g4.i;
import r3.a0;
import r3.b0;
import r3.c0;
import r3.d;
import r3.e;
import r3.g0;
import r3.x;
import r3.z;
import t3.c;
import z2.b;

/* loaded from: classes.dex */
public final class FilesystemMethodOptionsKt {
    public static final String INPUT_APPEND = "append";
    private static final String INPUT_CHUNK_SIZE = "chunkSize";
    private static final String INPUT_DATA = "data";
    private static final String INPUT_DIRECTORY = "directory";
    private static final String INPUT_ENCODING = "encoding";
    private static final String INPUT_FROM = "from";
    private static final String INPUT_FROM_DIRECTORY = "directory";
    private static final String INPUT_LENGTH = "length";
    private static final String INPUT_OFFSET = "offset";
    private static final String INPUT_PATH = "path";
    private static final String INPUT_RECURSIVE = "recursive";
    private static final String INPUT_TO = "to";
    private static final String INPUT_TO_DIRECTORY = "toDirectory";

    public static final DoubleUri getDoubleIONFILEUri(PluginCall pluginCall) {
        x xVar;
        i.e(pluginCall, "<this>");
        String string = pluginCall.getString(INPUT_FROM);
        if (string == null) {
            return null;
        }
        t2.i iVar = x.f3196i;
        String string2 = pluginCall.getString("directory");
        iVar.getClass();
        x p5 = t2.i.p(string2);
        String string3 = pluginCall.getString(INPUT_TO);
        if (string3 == null) {
            return null;
        }
        String string4 = pluginCall.getString(INPUT_TO_DIRECTORY);
        if (string4 == null || (xVar = t2.i.p(string4)) == null) {
            xVar = p5;
        }
        return new DoubleUri(new g0(p5, string), new g0(xVar, string3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final c getOffsetAndLength(PluginCall pluginCall) {
        int i5;
        Integer num;
        int i6;
        Integer num2 = pluginCall.getInt(INPUT_OFFSET);
        if (num2 != null) {
            if (num2.intValue() < 0) {
                num2 = null;
            }
            if (num2 != null) {
                i5 = num2.intValue();
                Integer valueOf = Integer.valueOf(i5);
                num = pluginCall.getInt(INPUT_LENGTH);
                if (num != null) {
                    Integer num3 = num.intValue() > 0 ? num : null;
                    if (num3 != null) {
                        i6 = num3.intValue();
                        return new c(valueOf, Integer.valueOf(i6));
                    }
                }
                i6 = f.API_PRIORITY_OTHER;
                return new c(valueOf, Integer.valueOf(i6));
            }
        }
        i5 = 0;
        Integer valueOf2 = Integer.valueOf(i5);
        num = pluginCall.getInt(INPUT_LENGTH);
        if (num != null) {
        }
        i6 = f.API_PRIORITY_OTHER;
        return new c(valueOf2, Integer.valueOf(i6));
    }

    public static final ReadFileInChunksOptions getReadFileInChunksOptions(PluginCall pluginCall) {
        i.e(pluginCall, "<this>");
        g0 singleIONFILEUri = getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri != null) {
            d dVar = e.f3178a;
            e h = b.h(pluginCall.getString(INPUT_ENCODING));
            Integer num = pluginCall.getInt(INPUT_CHUNK_SIZE);
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    c offsetAndLength = getOffsetAndLength(pluginCall);
                    return new ReadFileInChunksOptions(singleIONFILEUri, new z(h, intValue, ((Number) offsetAndLength.f3394g).intValue(), ((Number) offsetAndLength.h).intValue()));
                }
            }
        }
        return null;
    }

    public static final ReadFileOptions getReadFileOptions(PluginCall pluginCall) {
        i.e(pluginCall, "<this>");
        g0 singleIONFILEUri = getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri == null) {
            return null;
        }
        d dVar = e.f3178a;
        e h = b.h(pluginCall.getString(INPUT_ENCODING));
        c offsetAndLength = getOffsetAndLength(pluginCall);
        return new ReadFileOptions(singleIONFILEUri, new a0(h, ((Number) offsetAndLength.f3394g).intValue(), ((Number) offsetAndLength.h).intValue()));
    }

    public static final g0 getSingleIONFILEUri(PluginCall pluginCall) {
        i.e(pluginCall, "<this>");
        String string = pluginCall.getString(INPUT_PATH);
        if (string == null) {
            return null;
        }
        return unresolvedUri(string, pluginCall.getString("directory"));
    }

    public static final SingleUriWithRecursiveOptions getSingleUriWithRecursiveOptions(PluginCall pluginCall) {
        i.e(pluginCall, "<this>");
        g0 singleIONFILEUri = getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri == null) {
            return null;
        }
        Boolean bool = pluginCall.getBoolean(INPUT_RECURSIVE);
        return new SingleUriWithRecursiveOptions(singleIONFILEUri, bool != null ? bool.booleanValue() : false);
    }

    public static final WriteFileOptions getWriteFileOptions(PluginCall pluginCall) {
        String string;
        i.e(pluginCall, "<this>");
        g0 singleIONFILEUri = getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri == null || (string = pluginCall.getString(INPUT_DATA)) == null) {
            return null;
        }
        Boolean bool = pluginCall.getBoolean(INPUT_RECURSIVE);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = pluginCall.getBoolean(INPUT_APPEND);
        b0 b0Var = bool2 != null ? bool2.booleanValue() : false ? b0.h : b0.f3169g;
        d dVar = e.f3178a;
        return new WriteFileOptions(singleIONFILEUri, new c0(string, b.h(pluginCall.getString(INPUT_ENCODING)), b0Var, booleanValue));
    }

    private static final g0 unresolvedUri(String str, String str2) {
        x.f3196i.getClass();
        return new g0(t2.i.p(str2), str);
    }
}
