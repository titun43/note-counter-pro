.class public final Lcom/google/android/gms/internal/ads/zzcei;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzgzy;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzgzy;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzgzy;

.field public static final zzd:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzgzz;

.field public static final zzf:Lcom/google/android/gms/internal/ads/zzgzy;

.field public static final zzg:Lcom/google/android/gms/internal/ads/zzgzy;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmK:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "Default"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmL:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 32
    .line 33
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzmM:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 44
    .line 45
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 56
    .line 57
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 86
    .line 87
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 88
    .line 89
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v11, Lcom/google/android/gms/internal/ads/zzcef;

    .line 93
    .line 94
    invoke-direct {v11, v2}, Lcom/google/android/gms/internal/ads/zzcef;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-wide/16 v7, 0xa

    .line 98
    .line 99
    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zze(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 121
    .line 122
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 123
    .line 124
    new-instance v11, Ljava/util/concurrent/SynchronousQueue;

    .line 125
    .line 126
    invoke-direct {v11}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v12, Lcom/google/android/gms/internal/ads/zzcef;

    .line 130
    .line 131
    invoke-direct {v12, v2}, Lcom/google/android/gms/internal/ads/zzcef;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 v6, 0x2

    .line 135
    const v7, 0x7fffffff

    .line 136
    .line 137
    .line 138
    const-wide/16 v8, 0xa

    .line 139
    .line 140
    invoke-direct/range {v5 .. v12}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 141
    .line 142
    .line 143
    move-object v4, v5

    .line 144
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzceh;

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-direct {v0, v4, v1}, Lcom/google/android/gms/internal/ads/zzceh;-><init>(Ljava/util/concurrent/Executor;[B)V

    .line 148
    .line 149
    .line 150
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 151
    .line 152
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 153
    .line 154
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 155
    .line 156
    new-instance v11, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 157
    .line 158
    invoke-direct {v11}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 159
    .line 160
    .line 161
    new-instance v12, Lcom/google/android/gms/internal/ads/zzcef;

    .line 162
    .line 163
    const-string v0, "Loader"

    .line 164
    .line 165
    invoke-direct {v12, v0}, Lcom/google/android/gms/internal/ads/zzcef;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/4 v6, 0x5

    .line 169
    const/4 v7, 0x5

    .line 170
    const-wide/16 v8, 0xa

    .line 171
    .line 172
    invoke-direct/range {v5 .. v12}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 173
    .line 174
    .line 175
    const/4 v0, 0x1

    .line 176
    invoke-virtual {v5, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 177
    .line 178
    .line 179
    new-instance v2, Lcom/google/android/gms/internal/ads/zzceh;

    .line 180
    .line 181
    invoke-direct {v2, v5, v1}, Lcom/google/android/gms/internal/ads/zzceh;-><init>(Ljava/util/concurrent/Executor;[B)V

    .line 182
    .line 183
    .line 184
    sput-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzb:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 185
    .line 186
    new-instance v6, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 187
    .line 188
    new-instance v12, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 189
    .line 190
    invoke-direct {v12}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 191
    .line 192
    .line 193
    new-instance v13, Lcom/google/android/gms/internal/ads/zzcef;

    .line 194
    .line 195
    const-string v2, "Activeview"

    .line 196
    .line 197
    invoke-direct {v13, v2}, Lcom/google/android/gms/internal/ads/zzcef;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    const/4 v8, 0x1

    .line 202
    move-object v11, v10

    .line 203
    const-wide/16 v9, 0xa

    .line 204
    .line 205
    invoke-direct/range {v6 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Lcom/google/android/gms/internal/ads/zzceh;

    .line 212
    .line 213
    invoke-direct {v0, v6, v1}, Lcom/google/android/gms/internal/ads/zzceh;-><init>(Ljava/util/concurrent/Executor;[B)V

    .line 214
    .line 215
    .line 216
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zzc:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 217
    .line 218
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcee;

    .line 219
    .line 220
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcef;

    .line 221
    .line 222
    const-string v3, "Schedule"

    .line 223
    .line 224
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzcef;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const/4 v3, 0x3

    .line 228
    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzcee;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 229
    .line 230
    .line 231
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 232
    .line 233
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhaf;->zzc(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/zzgzz;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zze:Lcom/google/android/gms/internal/ads/zzgzz;

    .line 238
    .line 239
    new-instance v0, Lcom/google/android/gms/internal/ads/zzceg;

    .line 240
    .line 241
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzceg;-><init>()V

    .line 242
    .line 243
    .line 244
    new-instance v2, Lcom/google/android/gms/internal/ads/zzceh;

    .line 245
    .line 246
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzceh;-><init>(Ljava/util/concurrent/Executor;[B)V

    .line 247
    .line 248
    .line 249
    sput-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzf:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 250
    .line 251
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    new-instance v2, Lcom/google/android/gms/internal/ads/zzceh;

    .line 256
    .line 257
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzceh;-><init>(Ljava/util/concurrent/Executor;[B)V

    .line 258
    .line 259
    .line 260
    sput-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 261
    .line 262
    return-void
.end method
