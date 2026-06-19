package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f634b = n.g("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final g f635c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f636a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f635c = gVar;
    }

    public g(g gVar) {
        this.f636a = new HashMap(gVar.f636a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e4;
        String str = f634b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                } catch (IOException e5) {
                    e4 = e5;
                    Log.e(str, "Error in Data#fromByteArray: ", e4);
                } catch (ClassNotFoundException e6) {
                    e4 = e6;
                    Log.e(str, "Error in Data#fromByteArray: ", e4);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#fromByteArray: ", e7);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e8) {
                    Log.e(str, "Error in Data#fromByteArray: ", e8);
                    throw th;
                }
            }
        } catch (IOException e9) {
            e = e9;
            Throwable th3 = e;
            objectInputStream = null;
            e4 = th3;
            Log.e(str, "Error in Data#fromByteArray: ", e4);
        } catch (ClassNotFoundException e10) {
            e = e10;
            Throwable th32 = e;
            objectInputStream = null;
            e4 = th32;
            Log.e(str, "Error in Data#fromByteArray: ", e4);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        try {
            objectInputStream.close();
        } catch (IOException e11) {
            Log.e(str, "Error in Data#fromByteArray: ", e11);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e12) {
            Log.e(str, "Error in Data#fromByteArray: ", e12);
        }
        return new g(hashMap);
    }

    public static byte[] c(g gVar) {
        ObjectOutputStream objectOutputStream;
        String str = f634b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            objectOutputStream.writeInt(gVar.f636a.size());
            for (Map.Entry entry : gVar.f636a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e5) {
                Log.e(str, "Error in Data#toByteArray: ", e5);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(str, "Error in Data#toByteArray: ", e6);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e7) {
            e = e7;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(str, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#toByteArray: ", e10);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f636a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                HashMap hashMap = ((g) obj).f636a;
                HashMap hashMap2 = this.f636a;
                Set<String> keySet = hashMap2.keySet();
                if (keySet.equals(hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f636a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f636a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public g(HashMap hashMap) {
        this.f636a = new HashMap(hashMap);
    }
}
