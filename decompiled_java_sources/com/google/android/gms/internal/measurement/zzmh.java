package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class zzmh extends AbstractMap {
    private final int zza;
    private List zzb = Collections.EMPTY_LIST;
    private Map zzc;
    private boolean zzd;
    private volatile zzmf zze;
    private Map zzf;

    public /* synthetic */ zzmh(int i5, zzmg zzmgVar) {
        this.zza = i5;
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size();
        int i5 = size - 1;
        int i6 = 0;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((zzmb) this.zzb.get(i5)).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((zzmb) this.zzb.get(i7)).zza());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        return -(i6 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i5) {
        zzn();
        Object value = ((zzmb) this.zzb.remove(i5)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzmb(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzmf(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmh)) {
            return super.equals(obj);
        }
        zzmh zzmhVar = (zzmh) obj;
        int size = size();
        if (size != zzmhVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb != zzmhVar.zzb()) {
            return entrySet().equals(zzmhVar.entrySet());
        }
        for (int i5 = 0; i5 < zzb; i5++) {
            if (!zzg(i5).equals(zzmhVar.zzg(i5))) {
                return false;
            }
        }
        if (zzb != size) {
            return this.zzc.equals(zzmhVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? ((zzmb) this.zzb.get(zzk)).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i5 = 0;
        for (int i6 = 0; i6 < zzb; i6++) {
            i5 += ((zzmb) this.zzb.get(i6)).hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i5 : i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        return this.zzc.isEmpty() ? zzma.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzmb) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i5 = -(zzk + 1);
        if (i5 >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i6 = this.zza;
        if (size == i6) {
            zzmb zzmbVar = (zzmb) this.zzb.remove(i6 - 1);
            zzm().put(zzmbVar.zza(), zzmbVar.getValue());
        }
        this.zzb.add(i5, new zzmb(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i5) {
        return (Map.Entry) this.zzb.get(i5);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
