package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzhzv<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        s.c.e(sb, "Reading ", name, " from a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static zziee zzaR(zzidc zzidcVar) {
        return new zziee(zzidcVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzice.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzicn)) {
            if (iterable instanceof zzidl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzicn) iterable).zza();
        zzicn zzicnVar = (zzicn) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                int size2 = zzicnVar.size() - size;
                String m5 = u.m(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzicnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(m5);
                    }
                    zzicnVar.remove(size3);
                }
            } else if (obj instanceof zzian) {
                zzicnVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzian.zzs(bArr2, 0, bArr2.length);
                zzicnVar.zzb();
            } else {
                zzicnVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzidn) {
                ((zzidn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            a2.f fVar = (Object) list2.get(i5);
            if (fVar == null) {
                zzc(list, size2);
            }
            list.add(fVar);
        }
    }

    private static void zzc(List<?> list, int i5) {
        int size = list.size() - i5;
        String m5 = u.m(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i5) {
                throw new NullPointerException(m5);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziaq zziaqVar) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        return zzbd(zziaqVar, zzibb.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziaq zziaqVar, zzibb zzibbVar);

    public BuilderType zzaF(zzian zzianVar) {
        try {
            zziaq zzm = zzianVar.zzm();
            zzbe(zzm);
            zzm.zzb(0);
            return this;
        } catch (zzicg e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza("ByteString"), e5);
        }
    }

    public BuilderType zzaG(zzian zzianVar, zzibb zzibbVar) {
        try {
            zziaq zzm = zzianVar.zzm();
            zzbd(zzm, zzibbVar);
            zzm.zzb(0);
            return this;
        } catch (zzicg e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza("ByteString"), e5);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) {
        return zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i5, int i6) {
        try {
            zziaq zzG = zziaq.zzG(bArr, i5, i6, false);
            zzbe(zzG);
            zzG.zzb(0);
            return this;
        } catch (zzicg e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza("byte array"), e5);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzibb zzibbVar) {
        return zzaX(bArr, 0, bArr.length, zzibbVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i5, int i6, zzibb zzibbVar) {
        try {
            zziaq zzG = zziaq.zzG(bArr, i5, i6, false);
            zzbd(zzG, zzibbVar);
            zzG.zzb(0);
            return this;
        } catch (zzicg e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException(zza("byte array"), e5);
        }
    }

    public BuilderType zzaL(InputStream inputStream) {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzbe(zzF);
        zzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzibb zzibbVar) {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzbd(zzF, zzibbVar);
        zzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzibb zzibbVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new zzhzu(inputStream, zziaq.zzM(read, inputStream)), zzibbVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        return zzaN(inputStream, zzibb.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzidc zzidcVar) {
        if (zzbw().getClass().isInstance(zzidcVar)) {
            return (BuilderType) zzaQ((zzhzw) zzidcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzidb zzaV(InputStream inputStream, zzibb zzibbVar) {
        zzaM(inputStream, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaW(InputStream inputStream) {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbb(zzian zzianVar, zzibb zzibbVar) {
        zzaG(zzianVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbc(zzian zzianVar) {
        zzaF(zzianVar);
        return this;
    }
}
