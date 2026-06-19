package k1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.play_billing.zze;
import f0.b0;
import f0.q1;
import f0.r0;
import f0.t;
import g.m0;
import j.f0;
import j.y;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.a1;
import o4.e0;
import o4.w;
import org.apache.cordova.c0;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.g0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import r3.a0;
import r3.s;

/* loaded from: classes.dex */
public class j implements WebMessageListenerBoundaryInterface, androidx.emoji2.text.k, com.google.android.gms.common.internal.e, f0.e, y, a1, j.l, h2.b, t, c0, g0, y0.d, d.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2413g;
    public Object h;

    public /* synthetic */ j(int i5) {
        this.f2413g = i5;
    }

    public static m0 A(e1.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new b1.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap.put("prerequisite_id", new b1.a(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new b1.d(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
        hashSet2.add(new b1.d(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
        b1.e eVar = new b1.e("Dependency", hashMap, hashSet, hashSet2);
        b1.e a5 = b1.e.a(bVar, "Dependency");
        if (!eVar.equals(a5)) {
            return new m0("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a5, false);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new b1.a(1, "id", "TEXT", null, true, 1));
        hashMap2.put("state", new b1.a(0, "state", "INTEGER", null, true, 1));
        hashMap2.put("worker_class_name", new b1.a(0, "worker_class_name", "TEXT", null, true, 1));
        hashMap2.put("input_merger_class_name", new b1.a(0, "input_merger_class_name", "TEXT", null, false, 1));
        hashMap2.put("input", new b1.a(0, "input", "BLOB", null, true, 1));
        hashMap2.put("output", new b1.a(0, "output", "BLOB", null, true, 1));
        hashMap2.put("initial_delay", new b1.a(0, "initial_delay", "INTEGER", null, true, 1));
        hashMap2.put("interval_duration", new b1.a(0, "interval_duration", "INTEGER", null, true, 1));
        hashMap2.put("flex_duration", new b1.a(0, "flex_duration", "INTEGER", null, true, 1));
        hashMap2.put("run_attempt_count", new b1.a(0, "run_attempt_count", "INTEGER", null, true, 1));
        hashMap2.put("backoff_policy", new b1.a(0, "backoff_policy", "INTEGER", null, true, 1));
        hashMap2.put("backoff_delay_duration", new b1.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        hashMap2.put("period_start_time", new b1.a(0, "period_start_time", "INTEGER", null, true, 1));
        hashMap2.put("minimum_retention_duration", new b1.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        hashMap2.put("schedule_requested_at", new b1.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
        hashMap2.put("run_in_foreground", new b1.a(0, "run_in_foreground", "INTEGER", null, true, 1));
        hashMap2.put("out_of_quota_policy", new b1.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        hashMap2.put("required_network_type", new b1.a(0, "required_network_type", "INTEGER", null, false, 1));
        hashMap2.put("requires_charging", new b1.a(0, "requires_charging", "INTEGER", null, true, 1));
        hashMap2.put("requires_device_idle", new b1.a(0, "requires_device_idle", "INTEGER", null, true, 1));
        hashMap2.put("requires_battery_not_low", new b1.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        hashMap2.put("requires_storage_not_low", new b1.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        hashMap2.put("trigger_content_update_delay", new b1.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        hashMap2.put("trigger_max_content_delay", new b1.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        hashMap2.put("content_uri_triggers", new b1.a(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new b1.d(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
        hashSet4.add(new b1.d(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
        b1.e eVar2 = new b1.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        b1.e a6 = b1.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(a6)) {
            return new m0("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a6, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new b1.a(1, "tag", "TEXT", null, true, 1));
        hashMap3.put("work_spec_id", new b1.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new b1.d(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
        b1.e eVar3 = new b1.e("WorkTag", hashMap3, hashSet5, hashSet6);
        b1.e a7 = b1.e.a(bVar, "WorkTag");
        if (!eVar3.equals(a7)) {
            return new m0("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a7, false);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new b1.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap4.put("system_id", new b1.a(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        b1.e eVar4 = new b1.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        b1.e a8 = b1.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(a8)) {
            return new m0("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a8, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new b1.a(1, "name", "TEXT", null, true, 1));
        hashMap5.put("work_spec_id", new b1.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new b1.d(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
        b1.e eVar5 = new b1.e("WorkName", hashMap5, hashSet8, hashSet9);
        b1.e a9 = b1.e.a(bVar, "WorkName");
        if (!eVar5.equals(a9)) {
            return new m0("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a9, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new b1.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap6.put("progress", new b1.a(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new b1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        b1.e eVar6 = new b1.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        b1.e a10 = b1.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(a10)) {
            return new m0("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a10, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new b1.a(1, "key", "TEXT", null, true, 1));
        hashMap7.put("long_value", new b1.a(0, "long_value", "INTEGER", null, false, 1));
        b1.e eVar7 = new b1.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        b1.e a11 = b1.e.a(bVar, "Preference");
        if (eVar7.equals(a11)) {
            return new m0(null, true);
        }
        return new m0("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a11, false);
    }

    public static final long q(j jVar, Cursor cursor, Uri uri) {
        Long l5;
        int columnIndex = cursor.getColumnIndex("_size");
        Long l6 = null;
        if (columnIndex >= 0) {
            String string = cursor.getString(columnIndex);
            g4.i.d(string, "getString(...)");
            l5 = n4.i.a0(string);
        } else {
            l5 = null;
        }
        if (l5 != null) {
            return l5.longValue();
        }
        AssetFileDescriptor openAssetFileDescriptor = ((ContentResolver) jVar.h).openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            try {
                l6 = Long.valueOf(openAssetFileDescriptor.getLength());
                openAssetFileDescriptor.close();
            } finally {
            }
        }
        if (l6 != null) {
            return l6.longValue();
        }
        return 0L;
    }

    public static final Object r(j jVar, Object obj, Uri uri) {
        Throwable a5 = t3.e.a(obj);
        return a5 != null ? b3.g.g(z(a5, uri)) : obj;
    }

    public static void t(e1.b bVar) {
        bVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static Integer v(Cursor cursor, List list) {
        Integer num;
        Iterator it = list.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            int columnIndex = cursor.getColumnIndex((String) it.next());
            Integer valueOf = Integer.valueOf(columnIndex);
            if (columnIndex >= 0) {
                num = valueOf;
            }
        } while (num == null);
        return num;
    }

    public static long w(Cursor cursor) {
        Integer v5 = v(cursor, u3.h.S("datetaken", "date_added"));
        if (v5 == null) {
            return 0L;
        }
        String string = cursor.getString(v5.intValue());
        g4.i.d(string, "getString(...)");
        Long a02 = n4.i.a0(string);
        if (a02 != null) {
            return a02.longValue();
        }
        return 0L;
    }

    public static Throwable z(Throwable th, Uri uri) {
        if (!(th instanceof FileNotFoundException)) {
            return th instanceof UnsupportedOperationException ? new s(th) : th;
        }
        String uri2 = uri.toString();
        g4.i.d(uri2, "toString(...)");
        return new r3.o(uri2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(Uri uri, a0 a0Var, y3.c cVar) {
        p3.f fVar;
        int i5;
        if (cVar instanceof p3.f) {
            fVar = (p3.f) cVar;
            int i6 = fVar.f2999i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f2999i = i6 - Integer.MIN_VALUE;
                Object obj = fVar.f2998g;
                x3.a aVar = x3.a.f3712g;
                i5 = fVar.f2999i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.b bVar = new p3.b(this, uri, a0Var, (w3.c) null, 1);
                    fVar.f2999i = 1;
                    obj = w.p(bVar, dVar, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        fVar = new p3.f(this, cVar);
        Object obj2 = fVar.f2998g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = fVar.f2999i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    @Override // f0.e
    public ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.h).getClip();
        return clip;
    }

    @Override // j.y
    public void b(j.n nVar, boolean z4) {
        if (nVar instanceof f0) {
            ((f0) nVar).f1908z.k().c(false);
        }
        y yVar = ((k.l) this.h).f2141k;
        if (yVar != null) {
            yVar.b(nVar, z4);
        }
    }

    @Override // d.b
    public void c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.h;
        d.a aVar = (d.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.h;
        int i5 = zze.zzf(intent, "ProxyBillingActivityV2").f3832a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f835i;
        if (resultReceiver != null) {
            resultReceiver.send(i5, intent == null ? null : intent.getExtras());
        }
        int i6 = aVar.f1157g;
        if (i6 != -1 || i5 != 0) {
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // f0.t
    public q1 d(View view, q1 q1Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h;
        if (!Objects.equals(coordinatorLayout.f198r, q1Var)) {
            coordinatorLayout.f198r = q1Var;
            boolean z4 = q1Var.d() > 0;
            coordinatorLayout.f199s = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!q1Var.f1406a.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = coordinatorLayout.getChildAt(i5);
                    WeakHashMap weakHashMap = r0.f1407a;
                    if (childAt.getFitsSystemWindows()) {
                        ((s.d) childAt.getLayoutParams()).getClass();
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return q1Var;
    }

    @Override // y0.d
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // j.l
    public void f(j.n nVar) {
        Toolbar toolbar = (Toolbar) this.h;
        k.l lVar = toolbar.f163g.f146z;
        if (lVar == null || !lVar.j()) {
            Iterator it = toolbar.M.f1392b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.m0) ((f0.o) it.next())).f404a.t();
            }
        }
        u1.f fVar = toolbar.U;
        if (fVar != null) {
            fVar.f(nVar);
        }
    }

    @Override // j.l
    public boolean g(j.n nVar, MenuItem menuItem) {
        return false;
    }

    @Override // s3.a
    public Object get() {
        return new m2.j((Context) ((s3.a) this.h).get(), "com.google.android.datatransport.events", Integer.valueOf(m2.j.f2583j).intValue());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // y0.d
    public void h(int i5, Object obj) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.h).setResultCode(i5);
    }

    @Override // androidx.emoji2.text.k
    public void i(z2.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new a2.f(this, bVar, threadPoolExecutor, 1));
    }

    @Override // j.y
    public boolean k(j.n nVar) {
        k.l lVar = (k.l) this.h;
        if (nVar == lVar.f2139i) {
            return false;
        }
        ((f0) nVar).A.getClass();
        lVar.getClass();
        y yVar = lVar.f2141k;
        if (yVar != null) {
            return yVar.k(nVar);
        }
        return false;
    }

    @Override // f0.e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.h).getFlags();
        return flags;
    }

    @Override // f0.e
    public ContentInfo m() {
        return (ContentInfo) this.h;
    }

    @Override // f0.e
    public int o() {
        int source;
        source = ((ContentInfo) this.h).getSource();
        return source;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z4, InvocationHandler invocationHandler2) {
        j1.c cVar;
        j1.c cVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) y4.b.f(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        j[] jVarArr = new j[ports.length];
        for (int i5 = 0; i5 < ports.length; i5++) {
            InvocationHandler invocationHandler3 = ports[i5];
            j jVar = new j(14);
            jVar.h = (WebMessagePortBoundaryInterface) y4.b.f(WebMessagePortBoundaryInterface.class, invocationHandler3);
            jVarArr[i5] = jVar;
        }
        if (m.f2416a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) y4.b.f(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                cVar = new j1.c(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    cVar2 = null;
                    if (cVar2 == null) {
                        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) y4.b.f(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((j1.e) this.h).onPostMessage(webView, cVar2, uri, z4, (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: k1.f
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return new g(JsReplyProxyBoundaryInterface.this);
                            }
                        }));
                        return;
                    }
                    return;
                }
                cVar = new j1.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            cVar = new j1.c(webMessageBoundaryInterface.getData());
        }
        cVar2 = cVar;
        if (cVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Uri uri, String str, y3.c cVar) {
        p3.a aVar;
        int i5;
        if (cVar instanceof p3.a) {
            aVar = (p3.a) cVar;
            int i6 = aVar.f2984i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f2984i = i6 - Integer.MIN_VALUE;
                Object obj = aVar.f2983g;
                x3.a aVar2 = x3.a.f3712g;
                i5 = aVar.f2984i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.b bVar = new p3.b(this, uri, str, (w3.c) null, 0);
                    aVar.f2984i = 1;
                    obj = w.p(bVar, dVar, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        aVar = new p3.a(this, cVar);
        Object obj2 = aVar.f2983g;
        x3.a aVar22 = x3.a.f3712g;
        i5 = aVar.f2984i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    public String toString() {
        switch (this.f2413g) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.h) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(Uri uri, y3.c cVar) {
        p3.c cVar2;
        int i5;
        if (cVar instanceof p3.c) {
            cVar2 = (p3.c) cVar;
            int i6 = cVar2.f2992i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar2.f2992i = i6 - Integer.MIN_VALUE;
                Object obj = cVar2.f2991g;
                x3.a aVar = x3.a.f3712g;
                i5 = cVar2.f2992i;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.d dVar2 = new p3.d(this, uri, null, 0);
                    cVar2.f2992i = 1;
                    obj = w.p(dVar2, dVar, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        cVar2 = new p3.c(this, cVar);
        Object obj2 = cVar2.f2991g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = cVar2.f2992i;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(Uri uri, y3.c cVar) {
        p3.e eVar;
        int i5;
        if (cVar instanceof p3.e) {
            eVar = (p3.e) cVar;
            int i6 = eVar.f2997i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.f2997i = i6 - Integer.MIN_VALUE;
                Object obj = eVar.f2996g;
                x3.a aVar = x3.a.f3712g;
                i5 = eVar.f2997i;
                int i7 = 1;
                if (i5 != 0) {
                    b3.g.x(obj);
                    v4.e eVar2 = e0.f2793a;
                    v4.d dVar = v4.d.f3605i;
                    p3.d dVar2 = new p3.d(this, uri, null, i7);
                    eVar.f2997i = 1;
                    obj = w.p(dVar2, dVar, eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b3.g.x(obj);
                }
                return ((t3.e) obj).f3396g;
            }
        }
        eVar = new p3.e(this, cVar);
        Object obj2 = eVar.f2996g;
        x3.a aVar2 = x3.a.f3712g;
        i5 = eVar.f2997i;
        int i72 = 1;
        if (i5 != 0) {
        }
        return ((t3.e) obj2).f3396g;
    }

    public void y(String str, boolean z4) {
        JsResult jsResult = (JsResult) this.h;
        if (z4) {
            jsResult.confirm();
        } else {
            jsResult.cancel();
        }
    }

    public /* synthetic */ j(Object obj, int i5) {
        this.f2413g = i5;
        this.h = obj;
    }

    public j(SystemWebView systemWebView) {
        this.f2413g = 22;
        this.h = systemWebView;
        CookieManager.getInstance().setAcceptThirdPartyCookies(systemWebView, true);
    }

    public j() {
        Handler handler;
        Handler handler2;
        this.f2413g = 15;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = b0.e.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e4) {
                e = e4;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.h = handler2;
            } catch (InstantiationException e5) {
                e = e5;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.h = handler2;
            } catch (NoSuchMethodException e6) {
                e = e6;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.h = handler2;
            } catch (InvocationTargetException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handler2 = handler;
        }
        this.h = handler2;
    }

    public j(View view) {
        this.f2413g = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            b0 b0Var = new b0(view, 5);
            b0Var.f1339i = view;
            this.h = b0Var;
            return;
        }
        this.h = new u1.f(view, 5);
    }

    public j(EditText editText) {
        this.f2413g = 18;
        this.h = new androidx.emoji2.text.p(editText);
    }

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2413g = 8;
        if (Build.VERSION.SDK_INT >= 25) {
            this.h = new h0.f(uri, clipDescription, uri2);
        } else {
            this.h = new androidx.emoji2.text.t(uri, clipDescription, uri2, 12);
        }
    }

    public void j(int i5) {
    }

    public void n(int i5) {
    }

    public j(Context context) {
        this.f2413g = 1;
        this.h = context.getApplicationContext();
    }

    public j(ContentInfo contentInfo) {
        this.f2413g = 5;
        contentInfo.getClass();
        this.h = com.google.android.gms.internal.ads.g.n(contentInfo);
    }

    public void p(int i5, float f5) {
    }
}
