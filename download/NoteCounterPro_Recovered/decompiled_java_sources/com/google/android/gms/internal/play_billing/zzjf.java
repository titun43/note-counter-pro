package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class zzjf extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzjd zze;
    private Map zzf;

    private zzjf() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i5 = this.zzb;
        int i6 = i5 - 1;
        int i7 = 0;
        if (i6 >= 0) {
            int compareTo = comparable.compareTo(((zzjb) this.zza[i6]).zza());
            if (compareTo > 0) {
                return -(i5 + 1);
            }
            if (compareTo == 0) {
                return i6;
            }
        }
        while (i7 <= i6) {
            int i8 = (i7 + i6) / 2;
            int compareTo2 = comparable.compareTo(((zzjb) this.zza[i8]).zza());
            if (compareTo2 < 0) {
                i6 = i8 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i8;
                }
                i7 = i8 + 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i5) {
        zzo();
        Object value = ((zzjb) this.zza[i5]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i5 + 1, objArr, i5, (this.zzb - i5) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i6 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i6] = new zzjb(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzjd(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjf)) {
            return super.equals(obj);
        }
        zzjf zzjfVar = (zzjf) obj;
        int size = size();
        if (size != zzjfVar.size()) {
            return false;
        }
        int i5 = this.zzb;
        if (i5 != zzjfVar.zzb) {
            return entrySet().equals(zzjfVar.entrySet());
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!zzg(i6).equals(zzjfVar.zzg(i6))) {
                return false;
            }
        }
        if (i5 != size) {
            return this.zzc.equals(zzjfVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((zzjb) this.zza[zzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i5 = this.zzb;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += this.zza[i7].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i6 : i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzjb) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i5 = -(zzl + 1);
        if (i5 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzjb zzjbVar = (zzjb) this.zza[15];
            this.zzb = 15;
            zzn().put(zzjbVar.zza(), zzjbVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i5, objArr, i5 + 1, 15 - i5);
        this.zza[i5] = new zzjb(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i5) {
        if (i5 < this.zzb) {
            return (zzjb) this.zza[i5];
        }
        throw new ArrayIndexOutOfBoundsException(i5);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzjf(zzje zzjeVar) {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }
}
