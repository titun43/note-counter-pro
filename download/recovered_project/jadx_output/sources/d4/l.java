package d4;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends b3.g {
    public static boolean B(File file, File file2) {
        boolean exists = file.exists();
        n nVar = n.f1224g;
        if (!exists) {
            nVar.invoke(file, new a(file, null, "The source file doesn't exist."));
            throw null;
        }
        try {
            h hVar = new h(new j(file, k.f1221g, new m(nVar, 0)));
            while (hVar.hasNext()) {
                File file3 = (File) hVar.next();
                if (!file3.exists()) {
                    nVar.invoke(file3, new a(file3, null, "The source file doesn't exist."));
                    throw null;
                }
                File file4 = new File(file2, F(file3, file));
                if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                    nVar.invoke(file4, new a(file3, file4, "The destination file already exists."));
                    throw null;
                }
                if (file3.isDirectory()) {
                    file4.mkdirs();
                } else {
                    C(file3, file4, false);
                    if (file4.length() != file3.length()) {
                        nVar.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
            return true;
        } catch (p unused) {
            return false;
        }
    }

    public static void C(File file, File file2, boolean z4) {
        if (!file.exists()) {
            throw new a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            if (!z4) {
                throw new a(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new a(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new c(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                z2.b.e(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String D(File file) {
        g4.i.e(file, "<this>");
        String name = file.getName();
        g4.i.d(name, "getName(...)");
        int Y = n4.i.Y(name);
        if (Y == -1) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String substring = name.substring(Y + 1, name.length());
        g4.i.d(substring, "substring(...)");
        return substring;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final b E(b bVar) {
        File file = bVar.f1202a;
        ?? r6 = bVar.f1203b;
        ArrayList arrayList = new ArrayList(r6.size());
        for (File file2 : r6) {
            String name = file2.getName();
            if (!g4.i.a(name, ".")) {
                if (!g4.i.a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || g4.i.a(((File) u3.g.Y(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new b(file, arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static final String F(File file, File file2) {
        List list;
        b E = E(b3.g.y(file));
        ?? r12 = E.f1203b;
        b E2 = E(b3.g.y(file2));
        ?? r32 = E2.f1203b;
        boolean equals = E.f1202a.equals(E2.f1202a);
        String str = null;
        if (equals) {
            int size = r32.size();
            int size2 = r12.size();
            int min = Math.min(size2, size);
            int i5 = 0;
            while (i5 < min && g4.i.a(r12.get(i5), r32.get(i5))) {
                i5++;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = size - 1;
            if (i5 <= i6) {
                while (!g4.i.a(((File) r32.get(i6)).getName(), "..")) {
                    sb.append("..");
                    if (i6 != i5) {
                        sb.append(File.separatorChar);
                    }
                    if (i6 != i5) {
                        i6--;
                    }
                }
            }
            if (i5 < size2) {
                if (i5 < size) {
                    sb.append(File.separatorChar);
                }
                if (i5 < 0) {
                    throw new IllegalArgumentException(u.i(i5, "Requested element count ", " is less than zero.").toString());
                }
                if (i5 == 0) {
                    list = u3.g.a0(r12);
                } else {
                    int size3 = r12.size() - i5;
                    if (size3 <= 0) {
                        list = u3.o.f3547g;
                    } else if (size3 == 1) {
                        list = y4.b.y(u3.g.Y(r12));
                    } else {
                        ArrayList arrayList = new ArrayList(size3);
                        int size4 = r12.size();
                        while (i5 < size4) {
                            arrayList.add(r12.get(i5));
                            i5++;
                        }
                        list = arrayList;
                    }
                }
                String str2 = File.separator;
                g4.i.d(str2, "separator");
                u3.g.V(list, sb, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "...", null);
            }
            str = sb.toString();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }
}
