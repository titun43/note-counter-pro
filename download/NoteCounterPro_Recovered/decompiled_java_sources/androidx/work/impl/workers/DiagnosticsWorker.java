package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.l;
import androidx.work.m;
import androidx.work.n;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l1.k;
import t1.d;
import t1.i;
import z0.j;
import z2.b;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public static final String f668g = n.g("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(p pVar, p pVar2, t tVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            i iVar = (i) obj;
            d o2 = tVar.o(iVar.f3340a);
            Integer valueOf = o2 != null ? Integer.valueOf(o2.f3333b) : null;
            String str2 = iVar.f3340a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar.h;
            j d5 = j.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                d5.f(1);
            } else {
                d5.g(1, str2);
            }
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(d5);
            try {
                ArrayList arrayList2 = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    arrayList2.add(g5.getString(0));
                }
                g5.close();
                d5.h();
                ArrayList A = pVar2.A(iVar.f3340a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", A);
                String str3 = iVar.f3340a;
                String str4 = iVar.f3342c;
                switch (iVar.f3341b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sb2 = new StringBuilder("\n");
                sb2.append(str3);
                sb2.append("\t ");
                sb2.append(str4);
                sb2.append("\t ");
                sb2.append(valueOf);
                sb2.append("\t ");
                sb2.append(str);
                sb2.append("\t ");
                sb.append(u.n(sb2, join, "\t ", join2, "\t"));
            } catch (Throwable th) {
                g5.close();
                d5.h();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        j jVar;
        t tVar;
        p pVar;
        p pVar2;
        int i5;
        WorkDatabase workDatabase = k.Q(getApplicationContext()).f2489e;
        l2.j n5 = workDatabase.n();
        p l5 = workDatabase.l();
        p o2 = workDatabase.o();
        t k5 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n5.getClass();
        j d5 = j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        d5.e(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f2533a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            int i6 = b.i(g5, "required_network_type");
            int i7 = b.i(g5, "requires_charging");
            int i8 = b.i(g5, "requires_device_idle");
            int i9 = b.i(g5, "requires_battery_not_low");
            int i10 = b.i(g5, "requires_storage_not_low");
            int i11 = b.i(g5, "trigger_content_update_delay");
            int i12 = b.i(g5, "trigger_max_content_delay");
            int i13 = b.i(g5, "content_uri_triggers");
            int i14 = b.i(g5, "id");
            int i15 = b.i(g5, "state");
            int i16 = b.i(g5, "worker_class_name");
            jVar = d5;
            try {
                int i17 = b.i(g5, "input_merger_class_name");
                int i18 = b.i(g5, "input");
                int i19 = b.i(g5, "output");
                int i20 = b.i(g5, "initial_delay");
                int i21 = b.i(g5, "interval_duration");
                int i22 = b.i(g5, "flex_duration");
                int i23 = b.i(g5, "run_attempt_count");
                int i24 = b.i(g5, "backoff_policy");
                int i25 = b.i(g5, "backoff_delay_duration");
                int i26 = b.i(g5, "period_start_time");
                int i27 = b.i(g5, "minimum_retention_duration");
                int i28 = b.i(g5, "schedule_requested_at");
                int i29 = b.i(g5, "run_in_foreground");
                int i30 = b.i(g5, "out_of_quota_policy");
                int i31 = i19;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    String string = g5.getString(i14);
                    int i32 = i14;
                    String string2 = g5.getString(i16);
                    int i33 = i16;
                    c cVar = new c();
                    int i34 = i6;
                    cVar.f623a = b.n(g5.getInt(i6));
                    cVar.f624b = g5.getInt(i7) != 0;
                    cVar.f625c = g5.getInt(i8) != 0;
                    cVar.f626d = g5.getInt(i9) != 0;
                    cVar.f627e = g5.getInt(i10) != 0;
                    int i35 = i7;
                    int i36 = i8;
                    cVar.f628f = g5.getLong(i11);
                    cVar.f629g = g5.getLong(i12);
                    cVar.h = b.a(g5.getBlob(i13));
                    i iVar = new i(string, string2);
                    iVar.f3341b = b.p(g5.getInt(i15));
                    iVar.f3343d = g5.getString(i17);
                    iVar.f3344e = g.a(g5.getBlob(i18));
                    int i37 = i31;
                    iVar.f3345f = g.a(g5.getBlob(i37));
                    int i38 = i15;
                    int i39 = i20;
                    iVar.f3346g = g5.getLong(i39);
                    int i40 = i21;
                    int i41 = i17;
                    iVar.h = g5.getLong(i40);
                    int i42 = i9;
                    int i43 = i22;
                    iVar.f3347i = g5.getLong(i43);
                    int i44 = i23;
                    iVar.f3349k = g5.getInt(i44);
                    int i45 = i24;
                    int i46 = i18;
                    iVar.f3350l = b.m(g5.getInt(i45));
                    int i47 = i25;
                    iVar.f3351m = g5.getLong(i47);
                    int i48 = i26;
                    iVar.f3352n = g5.getLong(i48);
                    int i49 = i27;
                    iVar.f3353o = g5.getLong(i49);
                    int i50 = i28;
                    iVar.f3354p = g5.getLong(i50);
                    int i51 = i29;
                    iVar.f3355q = g5.getInt(i51) != 0;
                    int i52 = i30;
                    iVar.f3356r = b.o(g5.getInt(i52));
                    iVar.f3348j = cVar;
                    arrayList.add(iVar);
                    i23 = i44;
                    i17 = i41;
                    i21 = i40;
                    i26 = i48;
                    i9 = i42;
                    i31 = i37;
                    i29 = i51;
                    i7 = i35;
                    i20 = i39;
                    i18 = i46;
                    i22 = i43;
                    i24 = i45;
                    i27 = i49;
                    i25 = i47;
                    i16 = i33;
                    i6 = i34;
                    i30 = i52;
                    i28 = i50;
                    i15 = i38;
                    i14 = i32;
                    i8 = i36;
                }
                g5.close();
                jVar.h();
                ArrayList c5 = n5.c();
                ArrayList a5 = n5.a();
                boolean isEmpty = arrayList.isEmpty();
                String str = f668g;
                if (isEmpty) {
                    tVar = k5;
                    pVar = l5;
                    pVar2 = o2;
                    i5 = 0;
                } else {
                    i5 = 0;
                    n.e().f(str, "Recently completed work:\n\n", new Throwable[0]);
                    tVar = k5;
                    pVar = l5;
                    pVar2 = o2;
                    n.e().f(str, a(pVar, pVar2, tVar, arrayList), new Throwable[0]);
                }
                if (!c5.isEmpty()) {
                    n.e().f(str, "Running work:\n\n", new Throwable[i5]);
                    n.e().f(str, a(pVar, pVar2, tVar, c5), new Throwable[i5]);
                }
                if (!a5.isEmpty()) {
                    n.e().f(str, "Enqueued work:\n\n", new Throwable[i5]);
                    n.e().f(str, a(pVar, pVar2, tVar, a5), new Throwable[i5]);
                }
                return new l(g.f635c);
            } catch (Throwable th) {
                th = th;
                g5.close();
                jVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = d5;
        }
    }
}
