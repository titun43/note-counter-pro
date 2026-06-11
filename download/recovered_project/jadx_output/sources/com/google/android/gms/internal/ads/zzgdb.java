package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class zzgdb extends zzgct {
    private final ExecutorService zzb;
    private final zzgda zzc;
    private final Function zzd;

    public zzgdb(File file, ExecutorService executorService, zzgda zzgdaVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgdaVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final j3.a zzb() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgcy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgdb.this.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final j3.a zzc(final Object obj) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgcx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgdb.this.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object apply;
        Object zzb;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        zzb = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    apply = this.zzc.zzc();
                    return apply;
                }
            } catch (zzgcw e4) {
                apply = this.zzd.apply(e4);
                return apply;
            } catch (IOException e5) {
                apply = this.zzd.apply(new zzgcw(e5));
                return apply;
            }
        }
        return zzb;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgxm.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                file2.delete();
                throw e4;
            }
        }
        return null;
    }
}
