package com.getcapacitor.plugin;

import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.lokhnathtechnical.notecounterpro.plugins.ContactPickerPlugin;
import com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin;
import e2.m;
import f0.g;
import f0.q1;
import f0.r0;
import f0.t;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k.x;
import m2.h;
import o4.z;
import q.i;
import q.j;
import u1.f;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements t, d.b, n2.b, j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f891g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(Object obj, int i5) {
        this.f891g = i5;
        this.h = obj;
    }

    @Override // n2.b
    public Object a() {
        SQLiteDatabase a5;
        int i5 = this.f891g;
        Object obj = this.h;
        switch (i5) {
            case 5:
                h hVar = (h) ((m2.c) obj);
                hVar.getClass();
                int i6 = i2.a.f1832e;
                r1.h hVar2 = new r1.h();
                hVar2.f3161g = null;
                hVar2.h = new ArrayList();
                hVar2.f3162i = null;
                hVar2.f3163j = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                HashMap hashMap = new HashMap();
                a5 = hVar.a();
                a5.beginTransaction();
                try {
                    i2.a aVar = (i2.a) h.i(a5.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k2.a(hVar, hashMap, hVar2, 3));
                    a5.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 6:
                h hVar3 = (h) ((m2.d) obj);
                long s5 = hVar3.h.s() - hVar3.f2579j.f2568d;
                a5 = hVar3.a();
                a5.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(s5)};
                    Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar3.f(rawQuery.getInt(0), i2.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a5.delete("events", "timestamp_ms < ?", strArr);
                    a5.setTransactionSuccessful();
                    a5.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 7:
                h hVar4 = (h) ((m2.c) ((l2.j) obj).f2540i);
                a5 = hVar4.a();
                a5.beginTransaction();
                try {
                    a5.compileStatement("DELETE FROM log_event_dropped").execute();
                    a5.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar4.h.s()).execute();
                    a5.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                r1.h hVar5 = (r1.h) obj;
                Iterator it = ((Iterable) ((h) ((m2.d) hVar5.h)).d(new g())).iterator();
                while (it.hasNext()) {
                    ((androidx.emoji2.text.t) hVar5.f3162i).w((f2.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // q.j
    public Object attachCompleter(i iVar) {
        z zVar = (z) this.h;
        zVar.h(new k0.j(1, iVar, zVar));
        return "Deferred.asListenableFuture";
    }

    public d2.b b(androidx.emoji2.text.t tVar) {
        d2.c cVar = (d2.c) this.h;
        URL url = (URL) tVar.h;
        String v5 = b3.g.v("CctTransportBackend");
        if (Log.isLoggable(v5, 4)) {
            Log.i(v5, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f1201g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) tVar.f285j;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    f fVar = cVar.f1195a;
                    e2.i iVar = (e2.i) tVar.f284i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    m3.d dVar = (m3.d) fVar.h;
                    m3.e eVar = new m3.e(bufferedWriter, dVar.f2592a, dVar.f2593b, dVar.f2594c, dVar.f2595d);
                    eVar.e(iVar);
                    eVar.g();
                    eVar.f2597b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String v6 = b3.g.v("CctTransportBackend");
                    if (Log.isLoggable(v6, 4)) {
                        Log.i(v6, String.format("Status Code: %d", valueOf));
                    }
                    b3.g.n("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    b3.g.n("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new d2.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new d2.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            d2.b bVar = new d2.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1303a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e4) {
            e = e4;
            b3.g.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d2.b(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            b3.g.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d2.b(500, null, 0L);
        } catch (IOException e6) {
            e = e6;
            b3.g.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d2.b(400, null, 0L);
        } catch (k3.b e7) {
            e = e7;
            b3.g.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d2.b(400, null, 0L);
        }
    }

    @Override // d.b
    public void c(Object obj) {
        ((ContactPickerPlugin) this.h).lambda$load$0((d.a) obj);
    }

    @Override // f0.t
    public q1 d(View view, q1 q1Var) {
        q1 lambda$initWindowInsetsListener$6;
        lambda$initWindowInsetsListener$6 = ((SystemBars) this.h).lambda$initWindowInsetsListener$6(view, q1Var);
        return lambda$initWindowInsetsListener$6;
    }

    public boolean e(k1.j jVar, int i5, Bundle bundle) {
        f0.c cVar;
        x xVar = (x) this.h;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 25 && (i5 & 1) != 0) {
            try {
                ((h0.g) jVar.h).b();
                Parcelable parcelable = (Parcelable) ((h0.g) jVar.h).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        h0.g gVar = (h0.g) jVar.h;
        ClipData clipData = new ClipData(gVar.getDescription(), new ClipData.Item(gVar.a()));
        if (i6 >= 31) {
            cVar = new f(clipData, 2);
        } else {
            f0.d dVar = new f0.d();
            dVar.h = clipData;
            dVar.f1342i = 2;
            cVar = dVar;
        }
        cVar.b(gVar.c());
        cVar.setExtras(bundle);
        return r0.g(xVar, cVar.build()) == null;
    }

    public void f(y1.e eVar, ArrayList arrayList) {
        ((PremiumPlugin) this.h).lambda$queryProductDetails$0(eVar, arrayList);
    }
}
