package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeiu extends zzfxo {
    private final Context zza;
    private final zzgzy zzb;

    public zzeiu(Context context, zzgzy zzgzyVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjH)).intValue(), zzfxq.zza);
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    public static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    public static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i5 = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j2 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            Uri parse = Uri.parse(string);
                            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j2;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(currentTimeMillis));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append("&");
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i5] = sb;
                    }
                    i5++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i6 = 0; i6 < count; i6++) {
                    zzuVar.zzc(strArr2[i6], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zza(zzfmu zzfmuVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeit
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeiu.this.getWritableDatabase();
            }
        };
        zzgzy zzgzyVar = this.zzb;
        zzgzo.zzr(zzgzyVar.submit(callable), new zzein(this, zzfmuVar), zzgzyVar);
    }

    public final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeiu.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                zzeiu.this.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfmu(this) { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                zzeiu.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzeiw zzeiwVar) {
        zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                zzeiu.this.zzh(zzeiwVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final Void zzh(zzeiw zzeiwVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeiwVar.zza));
        contentValues.put("gws_query_id", zzeiwVar.zzb);
        contentValues.put("url", zzeiwVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeiwVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
        if (zzE != null) {
            try {
                zzE.zzf(new a3.b(context));
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e4);
            }
        }
        return null;
    }
}
