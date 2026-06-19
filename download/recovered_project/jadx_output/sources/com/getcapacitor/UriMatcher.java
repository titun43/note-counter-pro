package com.getcapacitor;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class UriMatcher {
    private static final int EXACT = 0;
    private static final int MASK = 3;
    static final Pattern PATH_SPLIT_PATTERN = Pattern.compile("/");
    private static final int REST = 2;
    private static final int TEXT = 1;
    private ArrayList<UriMatcher> mChildren;
    private Object mCode;
    private String mText;
    private int mWhich;

    public UriMatcher(Object obj) {
        this.mCode = obj;
        this.mWhich = -1;
        this.mChildren = new ArrayList<>();
        this.mText = null;
    }

    public void addURI(String str, String str2, String str3, Object obj) {
        String[] strArr;
        String str4 = str3;
        if (obj == null) {
            throw new IllegalArgumentException("Code can't be null");
        }
        if (str4 != null) {
            if (!str4.isEmpty() && str4.charAt(0) == '/') {
                str4 = str4.substring(1);
            }
            strArr = PATH_SPLIT_PATTERN.split(str4);
        } else {
            strArr = null;
        }
        int length = strArr != null ? strArr.length : 0;
        UriMatcher uriMatcher = this;
        int i5 = -2;
        while (i5 < length) {
            String str5 = i5 == -2 ? str : i5 == -1 ? str2 : strArr[i5];
            ArrayList<UriMatcher> arrayList = uriMatcher.mChildren;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                UriMatcher uriMatcher2 = arrayList.get(i6);
                if (str5.equals(uriMatcher2.mText)) {
                    uriMatcher = uriMatcher2;
                    break;
                }
                i6++;
            }
            if (i6 == size) {
                UriMatcher uriMatcher3 = new UriMatcher();
                if (i5 == -1 && str5.contains("*")) {
                    uriMatcher3.mWhich = 3;
                } else if (str5.equals("**")) {
                    uriMatcher3.mWhich = 2;
                } else if (str5.equals("*")) {
                    uriMatcher3.mWhich = 1;
                } else {
                    uriMatcher3.mWhich = 0;
                }
                uriMatcher3.mText = str5;
                uriMatcher.mChildren.add(uriMatcher3);
                uriMatcher = uriMatcher3;
            }
            i5++;
        }
        uriMatcher.mCode = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (com.getcapacitor.util.HostMask.Parser.parse(r10.mText).matches(r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r10.mText.equals(r5) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[LOOP:1: B:15:0x0039->B:27:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[EDGE_INSN: B:28:0x006a->B:29:0x006a BREAK  A[LOOP:1: B:15:0x0039->B:27:0x006c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object match(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        if (size == 0 && uri.getAuthority() == null) {
            return this.mCode;
        }
        UriMatcher uriMatcher = this;
        int i5 = -2;
        while (i5 < size) {
            String scheme = i5 == -2 ? uri.getScheme() : i5 == -1 ? uri.getAuthority() : pathSegments.get(i5);
            ArrayList<UriMatcher> arrayList = uriMatcher.mChildren;
            if (arrayList == null) {
                break;
            }
            int size2 = arrayList.size();
            UriMatcher uriMatcher2 = null;
            for (int i6 = 0; i6 < size2; i6++) {
                UriMatcher uriMatcher3 = arrayList.get(i6);
                int i7 = uriMatcher3.mWhich;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            return uriMatcher3.mCode;
                        }
                        if (i7 == 3) {
                        }
                        if (uriMatcher2 == null) {
                            break;
                        }
                    }
                    uriMatcher2 = uriMatcher3;
                    if (uriMatcher2 == null) {
                    }
                }
            }
            uriMatcher = uriMatcher2;
            if (uriMatcher == null) {
                return null;
            }
            i5++;
        }
        return uriMatcher.mCode;
    }

    private UriMatcher() {
        this.mCode = null;
        this.mWhich = -1;
        this.mChildren = new ArrayList<>();
        this.mText = null;
    }
}
