package y0;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3752a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3753b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3754c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3757f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f3758g;
    public byte[] h;

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.f3752a = executor;
        this.f3753b = dVar;
        this.f3756e = str;
        this.f3755d = file;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31) {
            switch (i5) {
                case 24:
                case 25:
                    bArr = e.h;
                    break;
                case 26:
                    bArr = e.f3773g;
                    break;
                case 27:
                    bArr = e.f3772f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f3771e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f3770d;
        }
        this.f3754c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3753b.e();
            return null;
        }
    }

    public final void b(int i5, Serializable serializable) {
        this.f3752a.execute(new q(this, i5, 2, serializable));
    }
}
