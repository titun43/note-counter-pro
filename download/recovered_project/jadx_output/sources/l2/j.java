package l2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import androidx.emoji2.text.t;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.RequestConfiguration;
import e2.k;
import e2.l;
import e2.u;
import e2.w;
import f2.n;
import f2.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2533a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2534b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2535c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2536d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2537e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2538f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2539g;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2540i;

    public j(WorkDatabase_Impl workDatabase_Impl) {
        this.f2533a = workDatabase_Impl;
        this.f2534b = new t1.b(workDatabase_Impl, 5);
        this.f2535c = new t1.e(workDatabase_Impl, 3);
        this.f2536d = new t1.e(workDatabase_Impl, 4);
        this.f2537e = new t1.e(workDatabase_Impl, 5);
        this.f2538f = new t1.e(workDatabase_Impl, 6);
        this.f2539g = new t1.e(workDatabase_Impl, 7);
        this.h = new t1.e(workDatabase_Impl, 8);
        this.f2540i = new t1.e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public ArrayList a() {
        z0.j jVar;
        z0.j d5 = z0.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        d5.e(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            int i5 = z2.b.i(g5, "required_network_type");
            int i6 = z2.b.i(g5, "requires_charging");
            int i7 = z2.b.i(g5, "requires_device_idle");
            int i8 = z2.b.i(g5, "requires_battery_not_low");
            int i9 = z2.b.i(g5, "requires_storage_not_low");
            int i10 = z2.b.i(g5, "trigger_content_update_delay");
            int i11 = z2.b.i(g5, "trigger_max_content_delay");
            int i12 = z2.b.i(g5, "content_uri_triggers");
            int i13 = z2.b.i(g5, "id");
            int i14 = z2.b.i(g5, "state");
            int i15 = z2.b.i(g5, "worker_class_name");
            int i16 = z2.b.i(g5, "input_merger_class_name");
            int i17 = z2.b.i(g5, "input");
            jVar = d5;
            try {
                int i18 = z2.b.i(g5, "output");
                int i19 = z2.b.i(g5, "initial_delay");
                int i20 = z2.b.i(g5, "interval_duration");
                int i21 = z2.b.i(g5, "flex_duration");
                int i22 = z2.b.i(g5, "run_attempt_count");
                int i23 = z2.b.i(g5, "backoff_policy");
                int i24 = z2.b.i(g5, "backoff_delay_duration");
                int i25 = z2.b.i(g5, "period_start_time");
                int i26 = z2.b.i(g5, "minimum_retention_duration");
                int i27 = z2.b.i(g5, "schedule_requested_at");
                int i28 = z2.b.i(g5, "run_in_foreground");
                int i29 = z2.b.i(g5, "out_of_quota_policy");
                int i30 = i18;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    String string = g5.getString(i13);
                    int i31 = i13;
                    String string2 = g5.getString(i15);
                    int i32 = i15;
                    androidx.work.c cVar = new androidx.work.c();
                    int i33 = i5;
                    cVar.f623a = z2.b.n(g5.getInt(i5));
                    cVar.f624b = g5.getInt(i6) != 0;
                    cVar.f625c = g5.getInt(i7) != 0;
                    cVar.f626d = g5.getInt(i8) != 0;
                    cVar.f627e = g5.getInt(i9) != 0;
                    int i34 = i6;
                    cVar.f628f = g5.getLong(i10);
                    cVar.f629g = g5.getLong(i11);
                    cVar.h = z2.b.a(g5.getBlob(i12));
                    t1.i iVar = new t1.i(string, string2);
                    iVar.f3341b = z2.b.p(g5.getInt(i14));
                    iVar.f3343d = g5.getString(i16);
                    iVar.f3344e = androidx.work.g.a(g5.getBlob(i17));
                    int i35 = i30;
                    iVar.f3345f = androidx.work.g.a(g5.getBlob(i35));
                    int i36 = i17;
                    i30 = i35;
                    int i37 = i19;
                    iVar.f3346g = g5.getLong(i37);
                    i19 = i37;
                    int i38 = i7;
                    int i39 = i20;
                    iVar.h = g5.getLong(i39);
                    i20 = i39;
                    int i40 = i21;
                    iVar.f3347i = g5.getLong(i40);
                    int i41 = i22;
                    iVar.f3349k = g5.getInt(i41);
                    int i42 = i23;
                    i22 = i41;
                    iVar.f3350l = z2.b.m(g5.getInt(i42));
                    i21 = i40;
                    int i43 = i24;
                    iVar.f3351m = g5.getLong(i43);
                    i24 = i43;
                    int i44 = i25;
                    iVar.f3352n = g5.getLong(i44);
                    i25 = i44;
                    int i45 = i26;
                    iVar.f3353o = g5.getLong(i45);
                    i26 = i45;
                    int i46 = i27;
                    iVar.f3354p = g5.getLong(i46);
                    int i47 = i28;
                    iVar.f3355q = g5.getInt(i47) != 0;
                    int i48 = i29;
                    i28 = i47;
                    iVar.f3356r = z2.b.o(g5.getInt(i48));
                    iVar.f3348j = cVar;
                    arrayList.add(iVar);
                    i23 = i42;
                    i7 = i38;
                    i29 = i48;
                    i27 = i46;
                    i17 = i36;
                    i13 = i31;
                    i15 = i32;
                    i5 = i33;
                    i6 = i34;
                }
                g5.close();
                jVar.h();
                return arrayList;
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

    public ArrayList b(int i5) {
        z0.j jVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        z0.j d5 = z0.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        d5.e(1, i5);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            i6 = z2.b.i(g5, "required_network_type");
            i7 = z2.b.i(g5, "requires_charging");
            i8 = z2.b.i(g5, "requires_device_idle");
            i9 = z2.b.i(g5, "requires_battery_not_low");
            i10 = z2.b.i(g5, "requires_storage_not_low");
            i11 = z2.b.i(g5, "trigger_content_update_delay");
            i12 = z2.b.i(g5, "trigger_max_content_delay");
            i13 = z2.b.i(g5, "content_uri_triggers");
            i14 = z2.b.i(g5, "id");
            i15 = z2.b.i(g5, "state");
            i16 = z2.b.i(g5, "worker_class_name");
            i17 = z2.b.i(g5, "input_merger_class_name");
            i18 = z2.b.i(g5, "input");
            jVar = d5;
        } catch (Throwable th) {
            th = th;
            jVar = d5;
        }
        try {
            int i19 = z2.b.i(g5, "output");
            int i20 = z2.b.i(g5, "initial_delay");
            int i21 = z2.b.i(g5, "interval_duration");
            int i22 = z2.b.i(g5, "flex_duration");
            int i23 = z2.b.i(g5, "run_attempt_count");
            int i24 = z2.b.i(g5, "backoff_policy");
            int i25 = z2.b.i(g5, "backoff_delay_duration");
            int i26 = z2.b.i(g5, "period_start_time");
            int i27 = z2.b.i(g5, "minimum_retention_duration");
            int i28 = z2.b.i(g5, "schedule_requested_at");
            int i29 = z2.b.i(g5, "run_in_foreground");
            int i30 = z2.b.i(g5, "out_of_quota_policy");
            int i31 = i19;
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                String string = g5.getString(i14);
                int i32 = i14;
                String string2 = g5.getString(i16);
                int i33 = i16;
                androidx.work.c cVar = new androidx.work.c();
                int i34 = i6;
                cVar.f623a = z2.b.n(g5.getInt(i6));
                cVar.f624b = g5.getInt(i7) != 0;
                cVar.f625c = g5.getInt(i8) != 0;
                cVar.f626d = g5.getInt(i9) != 0;
                cVar.f627e = g5.getInt(i10) != 0;
                int i35 = i7;
                cVar.f628f = g5.getLong(i11);
                cVar.f629g = g5.getLong(i12);
                cVar.h = z2.b.a(g5.getBlob(i13));
                t1.i iVar = new t1.i(string, string2);
                iVar.f3341b = z2.b.p(g5.getInt(i15));
                iVar.f3343d = g5.getString(i17);
                iVar.f3344e = androidx.work.g.a(g5.getBlob(i18));
                int i36 = i31;
                iVar.f3345f = androidx.work.g.a(g5.getBlob(i36));
                int i37 = i20;
                int i38 = i18;
                i31 = i36;
                iVar.f3346g = g5.getLong(i37);
                int i39 = i8;
                int i40 = i21;
                iVar.h = g5.getLong(i40);
                i21 = i40;
                int i41 = i22;
                iVar.f3347i = g5.getLong(i41);
                int i42 = i23;
                iVar.f3349k = g5.getInt(i42);
                int i43 = i24;
                i23 = i42;
                iVar.f3350l = z2.b.m(g5.getInt(i43));
                i22 = i41;
                int i44 = i25;
                iVar.f3351m = g5.getLong(i44);
                i25 = i44;
                int i45 = i26;
                iVar.f3352n = g5.getLong(i45);
                i26 = i45;
                int i46 = i27;
                iVar.f3353o = g5.getLong(i46);
                i27 = i46;
                int i47 = i28;
                iVar.f3354p = g5.getLong(i47);
                int i48 = i29;
                iVar.f3355q = g5.getInt(i48) != 0;
                int i49 = i30;
                i29 = i48;
                iVar.f3356r = z2.b.o(g5.getInt(i49));
                iVar.f3348j = cVar;
                arrayList.add(iVar);
                i24 = i43;
                i8 = i39;
                i18 = i38;
                i30 = i49;
                i28 = i47;
                i20 = i37;
                i14 = i32;
                i16 = i33;
                i6 = i34;
                i7 = i35;
            }
            g5.close();
            jVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.h();
            throw th;
        }
    }

    public ArrayList c() {
        z0.j jVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        z0.j d5 = z0.j.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            i5 = z2.b.i(g5, "required_network_type");
            i6 = z2.b.i(g5, "requires_charging");
            i7 = z2.b.i(g5, "requires_device_idle");
            i8 = z2.b.i(g5, "requires_battery_not_low");
            i9 = z2.b.i(g5, "requires_storage_not_low");
            i10 = z2.b.i(g5, "trigger_content_update_delay");
            i11 = z2.b.i(g5, "trigger_max_content_delay");
            i12 = z2.b.i(g5, "content_uri_triggers");
            i13 = z2.b.i(g5, "id");
            i14 = z2.b.i(g5, "state");
            i15 = z2.b.i(g5, "worker_class_name");
            i16 = z2.b.i(g5, "input_merger_class_name");
            i17 = z2.b.i(g5, "input");
            jVar = d5;
        } catch (Throwable th) {
            th = th;
            jVar = d5;
        }
        try {
            int i18 = z2.b.i(g5, "output");
            int i19 = z2.b.i(g5, "initial_delay");
            int i20 = z2.b.i(g5, "interval_duration");
            int i21 = z2.b.i(g5, "flex_duration");
            int i22 = z2.b.i(g5, "run_attempt_count");
            int i23 = z2.b.i(g5, "backoff_policy");
            int i24 = z2.b.i(g5, "backoff_delay_duration");
            int i25 = z2.b.i(g5, "period_start_time");
            int i26 = z2.b.i(g5, "minimum_retention_duration");
            int i27 = z2.b.i(g5, "schedule_requested_at");
            int i28 = z2.b.i(g5, "run_in_foreground");
            int i29 = z2.b.i(g5, "out_of_quota_policy");
            int i30 = i18;
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                String string = g5.getString(i13);
                int i31 = i13;
                String string2 = g5.getString(i15);
                int i32 = i15;
                androidx.work.c cVar = new androidx.work.c();
                int i33 = i5;
                cVar.f623a = z2.b.n(g5.getInt(i5));
                cVar.f624b = g5.getInt(i6) != 0;
                cVar.f625c = g5.getInt(i7) != 0;
                cVar.f626d = g5.getInt(i8) != 0;
                cVar.f627e = g5.getInt(i9) != 0;
                int i34 = i6;
                cVar.f628f = g5.getLong(i10);
                cVar.f629g = g5.getLong(i11);
                cVar.h = z2.b.a(g5.getBlob(i12));
                t1.i iVar = new t1.i(string, string2);
                iVar.f3341b = z2.b.p(g5.getInt(i14));
                iVar.f3343d = g5.getString(i16);
                iVar.f3344e = androidx.work.g.a(g5.getBlob(i17));
                int i35 = i30;
                iVar.f3345f = androidx.work.g.a(g5.getBlob(i35));
                int i36 = i17;
                i30 = i35;
                int i37 = i19;
                iVar.f3346g = g5.getLong(i37);
                i19 = i37;
                int i38 = i7;
                int i39 = i20;
                iVar.h = g5.getLong(i39);
                i20 = i39;
                int i40 = i21;
                iVar.f3347i = g5.getLong(i40);
                int i41 = i22;
                iVar.f3349k = g5.getInt(i41);
                int i42 = i23;
                i22 = i41;
                iVar.f3350l = z2.b.m(g5.getInt(i42));
                i21 = i40;
                int i43 = i24;
                iVar.f3351m = g5.getLong(i43);
                i24 = i43;
                int i44 = i25;
                iVar.f3352n = g5.getLong(i44);
                i25 = i44;
                int i45 = i26;
                iVar.f3353o = g5.getLong(i45);
                i26 = i45;
                int i46 = i27;
                iVar.f3354p = g5.getLong(i46);
                int i47 = i28;
                iVar.f3355q = g5.getInt(i47) != 0;
                int i48 = i29;
                i28 = i47;
                iVar.f3356r = z2.b.o(g5.getInt(i48));
                iVar.f3348j = cVar;
                arrayList.add(iVar);
                i23 = i42;
                i7 = i38;
                i29 = i48;
                i27 = i46;
                i17 = i36;
                i13 = i31;
                i15 = i32;
                i5 = i33;
                i6 = i34;
            }
            g5.close();
            jVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.h();
            throw th;
        }
    }

    public ArrayList d() {
        z0.j jVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        z0.j d5 = z0.j.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            i5 = z2.b.i(g5, "required_network_type");
            i6 = z2.b.i(g5, "requires_charging");
            i7 = z2.b.i(g5, "requires_device_idle");
            i8 = z2.b.i(g5, "requires_battery_not_low");
            i9 = z2.b.i(g5, "requires_storage_not_low");
            i10 = z2.b.i(g5, "trigger_content_update_delay");
            i11 = z2.b.i(g5, "trigger_max_content_delay");
            i12 = z2.b.i(g5, "content_uri_triggers");
            i13 = z2.b.i(g5, "id");
            i14 = z2.b.i(g5, "state");
            i15 = z2.b.i(g5, "worker_class_name");
            i16 = z2.b.i(g5, "input_merger_class_name");
            i17 = z2.b.i(g5, "input");
            jVar = d5;
        } catch (Throwable th) {
            th = th;
            jVar = d5;
        }
        try {
            int i18 = z2.b.i(g5, "output");
            int i19 = z2.b.i(g5, "initial_delay");
            int i20 = z2.b.i(g5, "interval_duration");
            int i21 = z2.b.i(g5, "flex_duration");
            int i22 = z2.b.i(g5, "run_attempt_count");
            int i23 = z2.b.i(g5, "backoff_policy");
            int i24 = z2.b.i(g5, "backoff_delay_duration");
            int i25 = z2.b.i(g5, "period_start_time");
            int i26 = z2.b.i(g5, "minimum_retention_duration");
            int i27 = z2.b.i(g5, "schedule_requested_at");
            int i28 = z2.b.i(g5, "run_in_foreground");
            int i29 = z2.b.i(g5, "out_of_quota_policy");
            int i30 = i18;
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                String string = g5.getString(i13);
                int i31 = i13;
                String string2 = g5.getString(i15);
                int i32 = i15;
                androidx.work.c cVar = new androidx.work.c();
                int i33 = i5;
                cVar.f623a = z2.b.n(g5.getInt(i5));
                cVar.f624b = g5.getInt(i6) != 0;
                cVar.f625c = g5.getInt(i7) != 0;
                cVar.f626d = g5.getInt(i8) != 0;
                cVar.f627e = g5.getInt(i9) != 0;
                int i34 = i6;
                cVar.f628f = g5.getLong(i10);
                cVar.f629g = g5.getLong(i11);
                cVar.h = z2.b.a(g5.getBlob(i12));
                t1.i iVar = new t1.i(string, string2);
                iVar.f3341b = z2.b.p(g5.getInt(i14));
                iVar.f3343d = g5.getString(i16);
                iVar.f3344e = androidx.work.g.a(g5.getBlob(i17));
                int i35 = i30;
                iVar.f3345f = androidx.work.g.a(g5.getBlob(i35));
                int i36 = i17;
                i30 = i35;
                int i37 = i19;
                iVar.f3346g = g5.getLong(i37);
                i19 = i37;
                int i38 = i7;
                int i39 = i20;
                iVar.h = g5.getLong(i39);
                i20 = i39;
                int i40 = i21;
                iVar.f3347i = g5.getLong(i40);
                int i41 = i22;
                iVar.f3349k = g5.getInt(i41);
                int i42 = i23;
                i22 = i41;
                iVar.f3350l = z2.b.m(g5.getInt(i42));
                i21 = i40;
                int i43 = i24;
                iVar.f3351m = g5.getLong(i43);
                i24 = i43;
                int i44 = i25;
                iVar.f3352n = g5.getLong(i44);
                i25 = i44;
                int i45 = i26;
                iVar.f3353o = g5.getLong(i45);
                i26 = i45;
                int i46 = i27;
                iVar.f3354p = g5.getLong(i46);
                int i47 = i28;
                iVar.f3355q = g5.getInt(i47) != 0;
                int i48 = i29;
                i28 = i47;
                iVar.f3356r = z2.b.o(g5.getInt(i48));
                iVar.f3348j = cVar;
                arrayList.add(iVar);
                i23 = i42;
                i7 = i38;
                i29 = i48;
                i27 = i46;
                i17 = i36;
                i13 = i31;
                i15 = i32;
                i5 = i33;
                i6 = i34;
            }
            g5.close();
            jVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.h();
            throw th;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        z0.j d5 = z0.j.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            d5.f(1);
        } else {
            d5.g(1, str);
        }
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            return g5.moveToFirst() ? z2.b.p(g5.getInt(0)) : 0;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        z0.j d5 = z0.j.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        d5.f(1);
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        z0.j d5 = z0.j.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        d5.g(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            d5.h();
        }
    }

    public t1.i h(String str) {
        z0.j jVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        t1.i iVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        z0.j d5 = z0.j.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            d5.f(1);
        } else {
            d5.g(1, str);
        }
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(d5);
        try {
            i5 = z2.b.i(g5, "required_network_type");
            i6 = z2.b.i(g5, "requires_charging");
            i7 = z2.b.i(g5, "requires_device_idle");
            i8 = z2.b.i(g5, "requires_battery_not_low");
            i9 = z2.b.i(g5, "requires_storage_not_low");
            i10 = z2.b.i(g5, "trigger_content_update_delay");
            i11 = z2.b.i(g5, "trigger_max_content_delay");
            i12 = z2.b.i(g5, "content_uri_triggers");
            i13 = z2.b.i(g5, "id");
            i14 = z2.b.i(g5, "state");
            i15 = z2.b.i(g5, "worker_class_name");
            i16 = z2.b.i(g5, "input_merger_class_name");
            i17 = z2.b.i(g5, "input");
            i18 = z2.b.i(g5, "output");
            jVar = d5;
        } catch (Throwable th) {
            th = th;
            jVar = d5;
        }
        try {
            int i19 = z2.b.i(g5, "initial_delay");
            int i20 = z2.b.i(g5, "interval_duration");
            int i21 = z2.b.i(g5, "flex_duration");
            int i22 = z2.b.i(g5, "run_attempt_count");
            int i23 = z2.b.i(g5, "backoff_policy");
            int i24 = z2.b.i(g5, "backoff_delay_duration");
            int i25 = z2.b.i(g5, "period_start_time");
            int i26 = z2.b.i(g5, "minimum_retention_duration");
            int i27 = z2.b.i(g5, "schedule_requested_at");
            int i28 = z2.b.i(g5, "run_in_foreground");
            int i29 = z2.b.i(g5, "out_of_quota_policy");
            if (g5.moveToFirst()) {
                String string = g5.getString(i13);
                String string2 = g5.getString(i15);
                androidx.work.c cVar = new androidx.work.c();
                cVar.f623a = z2.b.n(g5.getInt(i5));
                cVar.f624b = g5.getInt(i6) != 0;
                cVar.f625c = g5.getInt(i7) != 0;
                cVar.f626d = g5.getInt(i8) != 0;
                cVar.f627e = g5.getInt(i9) != 0;
                cVar.f628f = g5.getLong(i10);
                cVar.f629g = g5.getLong(i11);
                cVar.h = z2.b.a(g5.getBlob(i12));
                iVar = new t1.i(string, string2);
                iVar.f3341b = z2.b.p(g5.getInt(i14));
                iVar.f3343d = g5.getString(i16);
                iVar.f3344e = androidx.work.g.a(g5.getBlob(i17));
                iVar.f3345f = androidx.work.g.a(g5.getBlob(i18));
                iVar.f3346g = g5.getLong(i19);
                iVar.h = g5.getLong(i20);
                iVar.f3347i = g5.getLong(i21);
                iVar.f3349k = g5.getInt(i22);
                iVar.f3350l = z2.b.m(g5.getInt(i23));
                iVar.f3351m = g5.getLong(i24);
                iVar.f3352n = g5.getLong(i25);
                iVar.f3353o = g5.getLong(i26);
                iVar.f3354p = g5.getLong(i27);
                iVar.f3355q = g5.getInt(i28) != 0;
                iVar.f3356r = z2.b.o(g5.getInt(i29));
                iVar.f3348j = cVar;
            } else {
                iVar = null;
            }
            g5.close();
            jVar.h();
            return iVar;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.h();
            throw th;
        }
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.f2538f;
        e1.f a5 = eVar.a();
        if (str == null) {
            a5.e(1);
        } else {
            a5.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            a5.f1242j.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(final f2.j jVar, int i5) {
        byte[] bArr;
        long j2;
        g2.a aVar;
        String str;
        int i6;
        d2.b b2;
        String str2;
        Integer num;
        Iterator it;
        h3 h3Var;
        ArrayList arrayList;
        int i7;
        final j jVar2 = this;
        final f2.j jVar3 = jVar;
        byte[] bArr2 = jVar3.f1472b;
        n2.c cVar = (n2.c) jVar2.f2538f;
        g2.e a5 = ((g2.d) jVar2.f2534b).a(jVar3.f1471a);
        long j5 = 0;
        while (true) {
            final int i8 = 0;
            m2.h hVar = (m2.h) cVar;
            if (!((Boolean) hVar.g(new n2.b(jVar2) { // from class: l2.g
                public final /* synthetic */ j h;

                {
                    this.h = jVar2;
                }

                @Override // n2.b
                public final Object a() {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            f2.j jVar4 = jVar3;
                            m2.h hVar2 = (m2.h) ((m2.d) this.h.f2535c);
                            SQLiteDatabase a6 = hVar2.a();
                            a6.beginTransaction();
                            try {
                                Long b5 = m2.h.b(a6, jVar4);
                                if (b5 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b5.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a6.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a6.endTransaction();
                            }
                        default:
                            m2.h hVar3 = (m2.h) ((m2.d) this.h.f2535c);
                            hVar3.getClass();
                            return (Iterable) hVar3.d(new a2.c(5, hVar3, jVar3));
                    }
                }
            })).booleanValue()) {
                hVar.g(new i(jVar2, jVar3, j5));
                return;
            }
            final int i9 = 1;
            final Iterable iterable = (Iterable) hVar.g(new n2.b(jVar2) { // from class: l2.g
                public final /* synthetic */ j h;

                {
                    this.h = jVar2;
                }

                @Override // n2.b
                public final Object a() {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            f2.j jVar4 = jVar3;
                            m2.h hVar2 = (m2.h) ((m2.d) this.h.f2535c);
                            SQLiteDatabase a6 = hVar2.a();
                            a6.beginTransaction();
                            try {
                                Long b5 = m2.h.b(a6, jVar4);
                                if (b5 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b5.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a6.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a6.endTransaction();
                            }
                        default:
                            m2.h hVar3 = (m2.h) ((m2.d) this.h.f2535c);
                            hVar3.getClass();
                            return (Iterable) hVar3.d(new a2.c(5, hVar3, jVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a5 == null) {
                b3.g.n("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar3);
                aVar = new g2.a(3, -1L);
                bArr = bArr2;
                j2 = j5;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((m2.b) it2.next()).f2572c);
                }
                int i10 = 5;
                if (bArr2 != null) {
                    m2.c cVar2 = (m2.c) jVar2.f2540i;
                    Objects.requireNonNull(cVar2);
                    i2.a aVar2 = (i2.a) hVar.g(new com.getcapacitor.plugin.c(cVar2, i10));
                    f2.h hVar2 = new f2.h();
                    hVar2.f1464f = new HashMap();
                    hVar2.f1462d = Long.valueOf(((t2.i) jVar2.f2539g).s());
                    hVar2.f1463e = Long.valueOf(((t2.i) jVar2.h).s());
                    hVar2.f1459a = "GDT_CLIENT_METRICS";
                    c2.b bVar = new c2.b("proto");
                    aVar2.getClass();
                    t tVar = p.f1483a;
                    tVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        tVar.h(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.f1461c = new n(bVar, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((d2.c) a5).a(hVar2.c()));
                }
                d2.c cVar3 = (d2.c) a5;
                HashMap hashMap = new HashMap();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    f2.i iVar = (f2.i) obj;
                    String str3 = iVar.f1465a;
                    if (hashMap.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) hashMap.get(str3)).add(iVar);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(iVar);
                        hashMap.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    f2.i iVar2 = (f2.i) ((List) entry.getValue()).get(0);
                    w wVar = w.f1309g;
                    long s5 = cVar3.f1200f.s();
                    long s6 = cVar3.f1199e.s();
                    e2.j jVar4 = new e2.j(new e2.h(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (f2.i iVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        n nVar = iVar3.f1467c;
                        long j6 = j5;
                        c2.b bVar2 = nVar.f1480a;
                        byte[] bArr4 = nVar.f1481b;
                        if (bVar2.equals(new c2.b("proto"))) {
                            h3Var = new h3();
                            h3Var.f2105j = bArr4;
                            it = it3;
                        } else {
                            it = it3;
                            if (bVar2.equals(new c2.b("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                h3 h3Var2 = new h3();
                                h3Var2.f2106k = str4;
                                h3Var = h3Var2;
                            } else {
                                String v5 = b3.g.v("CctTransportBackend");
                                if (Log.isLoggable(v5, 5)) {
                                    Log.w(v5, "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                                }
                                bArr2 = bArr3;
                                j5 = j6;
                                it3 = it;
                            }
                        }
                        h3Var.f2103g = Long.valueOf(iVar3.f1468d);
                        h3Var.f2104i = Long.valueOf(iVar3.f1469e);
                        String str5 = (String) iVar3.f1470f.get("tz-offset");
                        h3Var.f2107l = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        h3Var.f2108m = new e2.n((u) u.f1308g.get(iVar3.b("net-type")), (e2.t) e2.t.f1307g.get(iVar3.b("mobile-subtype")));
                        Integer num2 = iVar3.f1466b;
                        if (num2 != null) {
                            h3Var.h = num2;
                        }
                        String str6 = ((Long) h3Var.f2103g) == null ? " eventTimeMs" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (((Long) h3Var.f2104i) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) h3Var.f2107l) == null) {
                            str6 = androidx.emoji2.text.u.j(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList5.add(new k(((Long) h3Var.f2103g).longValue(), (Integer) h3Var.h, ((Long) h3Var.f2104i).longValue(), (byte[]) h3Var.f2105j, (String) h3Var.f2106k, ((Long) h3Var.f2107l).longValue(), (e2.n) h3Var.f2108m));
                        bArr2 = bArr3;
                        j5 = j6;
                        it3 = it;
                    }
                    arrayList4.add(new l(s5, s6, jVar4, num, str2, arrayList5));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j2 = j5;
                e2.i iVar4 = new e2.i(arrayList4);
                URL url = cVar3.f1198d;
                if (bArr != null) {
                    try {
                        d2.a a6 = d2.a.a(bArr);
                        str = a6.f1191b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a6.f1190a;
                        if (str7 != null) {
                            url = d2.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new g2.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                int i12 = 3;
                try {
                    t tVar2 = new t(url, iVar4, str, 5);
                    com.getcapacitor.plugin.c cVar4 = new com.getcapacitor.plugin.c(cVar3, i12);
                    int i13 = 5;
                    do {
                        b2 = cVar4.b(tVar2);
                        URL url2 = b2.f1193b;
                        if (url2 != null) {
                            b3.g.n("CctTransportBackend", "Following redirect to: %s", url2);
                            tVar2 = new t(url2, (e2.i) tVar2.f284i, (String) tVar2.f285j, 5);
                        } else {
                            tVar2 = null;
                        }
                        if (tVar2 == null) {
                            break;
                        } else {
                            i13--;
                        }
                    } while (i13 >= 1);
                    int i14 = b2.f1192a;
                    if (i14 == 200) {
                        aVar = new g2.a(1, b2.f1194c);
                    } else if (i14 >= 500 || i14 == 404) {
                        aVar = new g2.a(2, -1L);
                    } else if (i14 == 400) {
                        try {
                            aVar = new g2.a(4, -1L);
                        } catch (IOException e4) {
                            e = e4;
                            b3.g.p("CctTransportBackend", "Could not make request to the backend", e);
                            i6 = 2;
                            aVar = new g2.a(2, -1L);
                            i7 = aVar.f1669a;
                            if (i7 != i6) {
                            }
                        }
                    } else {
                        aVar = new g2.a(3, -1L);
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            }
            i6 = 2;
            i7 = aVar.f1669a;
            if (i7 != i6) {
                final long j7 = j2;
                hVar.g(new n2.b() { // from class: l2.h
                    @Override // n2.b
                    public final Object a() {
                        j jVar5 = j.this;
                        m2.h hVar3 = (m2.h) ((m2.d) jVar5.f2535c);
                        hVar3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m2.h.h(iterable2);
                            SQLiteDatabase a7 = hVar3.a();
                            a7.beginTransaction();
                            try {
                                a7.compileStatement(str8).execute();
                                Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (rawQuery.moveToNext()) {
                                    try {
                                        hVar3.f(rawQuery.getInt(0), i2.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                rawQuery.close();
                                a7.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                a7.setTransactionSuccessful();
                            } finally {
                                a7.endTransaction();
                            }
                        }
                        hVar3.d(new m2.e(((t2.i) jVar5.f2539g).s() + j7, jVar));
                        return null;
                    }
                });
                ((t) this.f2536d).w(jVar, i5 + 1, true);
                return;
            }
            jVar3 = jVar;
            long j8 = j2;
            hVar.g(new a2.c(3, this, iterable));
            if (i7 == 1) {
                j5 = Math.max(j8, aVar.f1670b);
                if (bArr != null) {
                    hVar.g(new com.getcapacitor.plugin.c(this, 7));
                }
            } else {
                if (i7 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        String str8 = ((m2.b) it4.next()).f2572c.f1465a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    hVar.g(new a2.c(4, this, hashMap2));
                }
                j5 = j8;
            }
            jVar2 = this;
            bArr2 = bArr;
        }
    }

    public void k(String str, long j2) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.h;
        e1.f a5 = eVar.a();
        a5.d(1, j2);
        if (str == null) {
            a5.e(2);
        } else {
            a5.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.f1242j.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.f2539g;
        e1.f a5 = eVar.a();
        if (str == null) {
            a5.e(1);
        } else {
            a5.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            a5.f1242j.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void m(String str, androidx.work.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.f2536d;
        e1.f a5 = eVar.a();
        byte[] c5 = androidx.work.g.c(gVar);
        if (c5 == null) {
            a5.e(1);
        } else {
            a5.b(1, c5);
        }
        if (str == null) {
            a5.e(2);
        } else {
            a5.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void n(String str, long j2) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        t1.e eVar = (t1.e) this.f2537e;
        e1.f a5 = eVar.a();
        a5.d(1, j2);
        if (str == null) {
            a5.e(2);
        } else {
            a5.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void o(int i5, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2533a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            sb.append("?");
            if (i6 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement compileStatement = ((SQLiteDatabase) workDatabase_Impl.f3924c.c().h).compileStatement(sb2);
        compileStatement.bindLong(1, z2.b.A(i5));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i7);
            } else {
                compileStatement.bindString(i7, str);
            }
            i7++;
        }
        workDatabase_Impl.c();
        try {
            compileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public j(Context context, g2.d dVar, m2.d dVar2, t tVar, Executor executor, n2.c cVar, t2.i iVar, t2.i iVar2, m2.c cVar2) {
        this.f2533a = context;
        this.f2534b = dVar;
        this.f2535c = dVar2;
        this.f2536d = tVar;
        this.f2537e = executor;
        this.f2538f = cVar;
        this.f2539g = iVar;
        this.h = iVar2;
        this.f2540i = cVar2;
    }
}
