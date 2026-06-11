package t1;

import android.os.Build;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import z0.l;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(z0.i iVar, int i5) {
        super(iVar);
        this.f3329d = i5;
    }

    @Override // z0.l
    public final String b() {
        switch (this.f3329d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(e1.f fVar, Object obj) {
        int i5;
        int i6;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        Iterator it;
        switch (this.f3329d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f3327a;
                if (str == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str);
                }
                String str2 = aVar.f3328b;
                if (str2 == null) {
                    fVar.e(2);
                    return;
                } else {
                    fVar.f(2, str2);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str3 = cVar.f3330a;
                if (str3 == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str3);
                }
                Long l5 = cVar.f3331b;
                if (l5 == null) {
                    fVar.e(2);
                    return;
                } else {
                    fVar.d(2, l5.longValue());
                    return;
                }
            case 2:
                String str4 = ((d) obj).f3332a;
                if (str4 == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str4);
                }
                fVar.d(2, r0.f3333b);
                return;
            case 3:
                f fVar2 = (f) obj;
                fVar2.getClass();
                fVar.e(1);
                String str5 = fVar2.f3335a;
                if (str5 == null) {
                    fVar.e(2);
                    return;
                } else {
                    fVar.f(2, str5);
                    return;
                }
            case 4:
                g gVar = (g) obj;
                String str6 = gVar.f3336a;
                if (str6 == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str6);
                }
                byte[] c5 = androidx.work.g.c(gVar.f3337b);
                if (c5 == null) {
                    fVar.e(2);
                    return;
                } else {
                    fVar.b(2, c5);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f3340a;
                int i7 = 1;
                if (str7 == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str7);
                }
                fVar.d(2, z2.b.A(iVar.f3341b));
                String str8 = iVar.f3342c;
                if (str8 == null) {
                    fVar.e(3);
                } else {
                    fVar.f(3, str8);
                }
                String str9 = iVar.f3343d;
                if (str9 == null) {
                    fVar.e(4);
                } else {
                    fVar.f(4, str9);
                }
                byte[] c6 = androidx.work.g.c(iVar.f3344e);
                if (c6 == null) {
                    fVar.e(5);
                } else {
                    fVar.b(5, c6);
                }
                byte[] c7 = androidx.work.g.c(iVar.f3345f);
                if (c7 == null) {
                    fVar.e(6);
                } else {
                    fVar.b(6, c7);
                }
                fVar.d(7, iVar.f3346g);
                fVar.d(8, iVar.h);
                fVar.d(9, iVar.f3347i);
                fVar.d(10, iVar.f3349k);
                int i8 = iVar.f3350l;
                int c8 = h1.c(i8);
                if (c8 == 0) {
                    i5 = 0;
                } else {
                    if (c8 != 1) {
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(i8 != 1 ? i8 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i5 = 1;
                }
                fVar.d(11, i5);
                fVar.d(12, iVar.f3351m);
                fVar.d(13, iVar.f3352n);
                fVar.d(14, iVar.f3353o);
                fVar.d(15, iVar.f3354p);
                fVar.d(16, iVar.f3355q ? 1L : 0L);
                int i9 = iVar.f3356r;
                int c9 = h1.c(i9);
                if (c9 == 0) {
                    i6 = 0;
                } else {
                    if (c9 != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i9 != 1 ? i9 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i6 = 1;
                }
                fVar.d(17, i6);
                androidx.work.c cVar2 = iVar.f3348j;
                if (cVar2 == null) {
                    fVar.e(18);
                    fVar.e(19);
                    fVar.e(20);
                    fVar.e(21);
                    fVar.e(22);
                    fVar.e(23);
                    fVar.e(24);
                    fVar.e(25);
                    return;
                }
                int i10 = cVar2.f623a;
                int c10 = h1.c(i10);
                if (c10 == 0) {
                    i7 = 0;
                } else if (c10 != 1) {
                    if (c10 == 2) {
                        i7 = 2;
                    } else if (c10 == 3) {
                        i7 = 3;
                    } else if (c10 == 4) {
                        i7 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i10 != 6) {
                            throw new IllegalArgumentException("Could not convert " + u.A(i10) + " to int");
                        }
                        i7 = 5;
                    }
                }
                fVar.d(18, i7);
                fVar.d(19, cVar2.f624b ? 1L : 0L);
                fVar.d(20, cVar2.f625c ? 1L : 0L);
                fVar.d(21, cVar2.f626d ? 1L : 0L);
                fVar.d(22, cVar2.f627e ? 1L : 0L);
                fVar.d(23, cVar2.f628f);
                fVar.d(24, cVar2.f629g);
                androidx.work.e eVar = cVar2.h;
                HashSet hashSet = eVar.f632a;
                HashSet hashSet2 = eVar.f632a;
                byte[] bArr = null;
                r4 = null;
                r4 = null;
                ObjectOutputStream objectOutputStream3 = null;
                if (hashSet.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream = objectOutputStream3;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        }
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    try {
                        objectOutputStream2.writeInt(hashSet2.size());
                        it = hashSet2.iterator();
                    } catch (IOException e6) {
                        e = e6;
                        objectOutputStream3 = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream3 != null) {
                            objectOutputStream3.close();
                            objectOutputStream3 = objectOutputStream3;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                        if (bArr != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th;
                        }
                    }
                    while (true) {
                        boolean hasNext = it.hasNext();
                        if (hasNext != 0) {
                            androidx.work.d dVar = (androidx.work.d) it.next();
                            objectOutputStream2.writeUTF(dVar.f630a.toString());
                            objectOutputStream2.writeBoolean(dVar.f631b);
                        } else {
                            objectOutputStream2.close();
                            objectOutputStream3 = hasNext;
                            byteArrayOutputStream.close();
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                    }
                }
                if (bArr != null) {
                    fVar.e(25);
                    return;
                } else {
                    fVar.b(25, bArr);
                    return;
                }
            default:
                j jVar = (j) obj;
                String str10 = jVar.f3357a;
                if (str10 == null) {
                    fVar.e(1);
                } else {
                    fVar.f(1, str10);
                }
                String str11 = jVar.f3358b;
                if (str11 == null) {
                    fVar.e(2);
                    return;
                } else {
                    fVar.f(2, str11);
                    return;
                }
        }
    }

    public final void e(Object obj) {
        e1.f a5 = a();
        try {
            d(a5, obj);
            a5.f1242j.executeInsert();
        } finally {
            c(a5);
        }
    }
}
