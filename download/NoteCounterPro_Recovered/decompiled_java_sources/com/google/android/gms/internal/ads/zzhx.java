package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhx extends zzgt {
    private final Context zza;
    private zzhf zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhx(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i5) {
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append("rawresource:///");
        sb.append(i5);
        return Uri.parse(sb.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzhf zzhfVar) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzhfVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                throw new zzhw(u.l(new StringBuilder(String.valueOf(size).length() + 61), "rawresource:// URI must have exactly one path element, found ", size));
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                String scheme = normalizeScheme.getScheme();
                throw new zzhw(h1.b(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new zzhw("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(h1.b(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzhw("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzhw("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e5) {
            throw new zzhw(null, e5, 2005);
        }
    }

    private static int zzl(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhw("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j2 = this.zze;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i6 = (int) Math.min(j2, i6);
            } catch (IOException e4) {
                throw new zzhw(null, e4, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzfj.zza;
        int read = inputStream.read(bArr, i5, i6);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j5 = this.zze;
        if (j5 != -1) {
            this.zze = j5 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        long j2;
        this.zzb = zzhfVar;
        zzf(zzhfVar);
        AssetFileDescriptor zzk = zzk(this.zza, zzhfVar);
        this.zzc = zzk;
        long length = zzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhfVar.zze > length) {
                    throw new zzhw(null, null, 2008);
                }
            } catch (zzhw e4) {
                throw e4;
            } catch (IOException e5) {
                throw new zzhw(null, e5, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j5 = zzhfVar.zze;
        long skip = fileInputStream.skip(startOffset + j5) - startOffset;
        if (skip != j5) {
            throw new zzhw(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j2 = -1;
            } else {
                j2 = channel.size() - channel.position();
                this.zze = j2;
                if (j2 < 0) {
                    throw new zzhw(null, null, 2008);
                }
            }
        } else {
            j2 = length - skip;
            this.zze = j2;
            if (j2 < 0) {
                throw new zzhc(2008);
            }
        }
        long j6 = zzhfVar.zzf;
        if (j6 != -1) {
            this.zze = j2 == -1 ? j6 : Math.min(j2, j6);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j6 != -1 ? j6 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        zzhf zzhfVar = this.zzb;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e4) {
                        throw new zzhw(null, e4, 2000);
                    }
                } catch (IOException e5) {
                    throw new zzhw(null, e5, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new zzhw(null, e6, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th2;
        }
    }
}
