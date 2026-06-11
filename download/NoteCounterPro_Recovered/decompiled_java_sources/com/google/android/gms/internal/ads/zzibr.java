package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzibr<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzibr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            s.c.e(sb, "Generated message class \"", name, "\" missing method \"", str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e4);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static zzibz zzbC() {
        return zzibs.zzd();
    }

    public static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zzh(size + size);
    }

    public static zzicc zzbE() {
        return zzicq.zzg();
    }

    public static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzh(size + size);
    }

    public static zziby zzbG() {
        return zzibi.zzd();
    }

    public static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zzh(size + size);
    }

    public static zzibu zzbI() {
        return zziay.zzd();
    }

    public static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zzh(size + size);
    }

    public static zzibt zzbK() {
        return zziad.zzd();
    }

    public static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zzh(size + size);
    }

    public static <E> zzicd<E> zzbM() {
        return zzidn.zzd();
    }

    public static <E> zzicd<E> zzbN(zzicd<E> zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    public static <T extends zzibr<T, ?>> T zzbO(T t5, zziaq zziaqVar, zzibb zzibbVar) {
        T t6 = (T) t5.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(t6.getClass());
            zzb2.zzg(t6, zziar.zza(zziaqVar), zzibbVar);
            zzb2.zzk(t6);
            return t6;
        } catch (zzicg e4) {
            if (e4.zzb()) {
                throw new zzicg(e4);
            }
            throw e4;
        } catch (zziee e5) {
            throw e5.zza();
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzicg) {
                throw ((zzicg) e6.getCause());
            }
            throw new zzicg(e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof zzicg) {
                throw ((zzicg) e7.getCause());
            }
            throw e7;
        }
    }

    public static <T extends zzibr<T, ?>> T zzbP(T t5, zziaq zziaqVar) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        return (T) zzbO(t5, zziaqVar, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbQ(T t5, ByteBuffer byteBuffer, zzibb zzibbVar) {
        zziaq zzG;
        if (byteBuffer.hasArray()) {
            zzG = zziaq.zzG(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzG = zziaq.zzG(bArr, 0, remaining, true);
        }
        T t6 = (T) zzbZ(t5, zzG, zzibbVar);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbR(T t5, ByteBuffer byteBuffer) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        return (T) zzbQ(t5, byteBuffer, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbS(T t5, zzian zzianVar) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        T t6 = (T) zzbT(t5, zzianVar, zzibb.zza);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbT(T t5, zzian zzianVar, zzibb zzibbVar) {
        T t6 = (T) zzj(t5, zzianVar, zzibbVar);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbU(T t5, byte[] bArr) {
        int length = bArr.length;
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        T t6 = (T) zzh(t5, bArr, 0, length, zzibb.zza);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbV(T t5, byte[] bArr, zzibb zzibbVar) {
        T t6 = (T) zzh(t5, bArr, 0, bArr.length, zzibbVar);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbW(T t5, InputStream inputStream) {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        T t6 = (T) zzbO(t5, zzF, zzibb.zza);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbX(T t5, InputStream inputStream, zzibb zzibbVar) {
        T t6 = (T) zzbO(t5, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzbY(T t5, zziaq zziaqVar) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        return (T) zzbZ(t5, zziaqVar, zzibb.zza);
    }

    public static <T extends zzibr<T, ?>> T zzbZ(T t5, zziaq zziaqVar, zzibb zzibbVar) {
        T t6 = (T) zzbO(t5, zziaqVar, zzibbVar);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr> T zzbt(Class<T> cls) {
        zzibr<?, ?> zzibrVar = zzd.get(cls);
        if (zzibrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVar = zzd.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzibrVar != null) {
            return zzibrVar;
        }
        zzibr<?, ?> zzbw = ((zzibr) zziem.zzc(cls)).zzbw();
        if (zzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzbw);
        return zzbw;
    }

    public static <T extends zzibr> void zzbu(Class<T> cls, T t5) {
        t5.zzaY();
        zzd.put(cls, t5);
    }

    public static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzidc zzidcVar, zzibw zzibwVar, int i5, zzies zziesVar, Class cls) {
        return new zzibp<>(containingtype, type, zzidcVar, new zzibo(zzibwVar, i5, zziesVar, false, false), cls);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzbz(ContainingType containingtype, zzidc zzidcVar, zzibw zzibwVar, int i5, zzies zziesVar, boolean z4, Class cls) {
        return new zzibp<>(containingtype, zzidn.zzd(), zzidcVar, new zzibo(zzibwVar, i5, zziesVar, true, z4), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    public static <T extends zzibr<T, ?>> T zzca(T t5, InputStream inputStream) {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
        T t6 = (T) zzk(t5, inputStream, zzibb.zza);
        zzi(t6);
        return t6;
    }

    public static <T extends zzibr<T, ?>> T zzcb(T t5, InputStream inputStream, zzibb zzibbVar) {
        T t6 = (T) zzk(t5, inputStream, zzibbVar);
        zzi(t6);
        return t6;
    }

    private int zzd(zzidu<?> zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzibn<MessageType, BuilderType>, BuilderType, T> zzibp<MessageType, T> zze(zziaz<MessageType, T> zziazVar) {
        return (zzibp) zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzibr<T, ?>> boolean zzg(T t5, boolean z4) {
        byte byteValue = ((Byte) t5.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzidm.zza().zzb(t5.getClass()).zzl(t5);
        if (z4) {
            t5.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t5, null);
        }
        return zzl;
    }

    private static <T extends zzibr<T, ?>> T zzh(T t5, byte[] bArr, int i5, int i6, zzibb zzibbVar) {
        if (i6 == 0) {
            return t5;
        }
        T t6 = (T) t5.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(t6.getClass());
            zzb2.zzj(t6, bArr, i5, i5 + i6, new zziab(zzibbVar));
            zzb2.zzk(t6);
            return t6;
        } catch (zzicg e4) {
            if (e4.zzb()) {
                throw new zzicg(e4);
            }
            throw e4;
        } catch (zziee e5) {
            throw e5.zza();
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzicg) {
                throw ((zzicg) e6.getCause());
            }
            throw new zzicg(e6);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzibr<T, ?>> T zzi(T t5) {
        if (t5 == null || t5.zzbi()) {
            return t5;
        }
        throw t5.zzaU().zza();
    }

    private static <T extends zzibr<T, ?>> T zzj(T t5, zzian zzianVar, zzibb zzibbVar) {
        zziaq zzm = zzianVar.zzm();
        T t6 = (T) zzbO(t5, zzm, zzibbVar);
        zzm.zzb(0);
        return t6;
    }

    private static <T extends zzibr<T, ?>> T zzk(T t5, InputStream inputStream, zzibb zzibbVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zziaq zzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(read, inputStream)), 4096);
            T t6 = (T) zzbO(t5, zzF, zzibbVar);
            zzF.zzb(0);
            return t6;
        } catch (zzicg e4) {
            if (e4.zzb()) {
                throw new zzicg(e4);
            }
            throw e4;
        } catch (IOException e5) {
            throw new zzicg(e5);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzide.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public int zzaQ() {
        return this.zzc & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public void zzaR(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(i5).length() + 42), "serialized size must be non-negative, was ", i5));
        }
        this.zzc = i5 | (this.zzc & zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public int zzaT(zzidu zziduVar) {
        if (zzaX()) {
            int zzd2 = zzd(zziduVar);
            if (zzd2 >= 0) {
                return zzd2;
            }
            throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(zzd2).length() + 42), "serialized size must be non-negative, was ", zzd2));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int zzd3 = zzd(zziduVar);
        zzaR(zzd3);
        return zzd3;
    }

    public boolean zzaX() {
        return (this.zzc & zza) != 0;
    }

    public void zzaY() {
        this.zzc &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i5) {
        this.zzq = i5;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final zzidk<MessageType> zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public MessageType zzbg() {
        return (MessageType) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i5, zziaq zziaqVar) {
        if ((i5 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i5, zziaqVar);
    }

    public void zzbk(int i5, int i6) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk(i5 << 3, Long.valueOf(i6));
    }

    public void zzbl(int i5, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk((i5 << 3) | 2, zzianVar);
    }

    public void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public void zzbq() {
        zzaR(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzcX(zziaw zziawVar) {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }

    public abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);
}
