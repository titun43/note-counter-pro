.class public final Lcom/google/android/gms/internal/ads/zzeot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzekg;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzduv;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdue;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zze:Ljava/util/concurrent/Executor;

.field private final zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbok;

.field private final zzh:Z

.field private final zzi:Lcom/google/android/gms/internal/ads/zzejf;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdxt;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzdxz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzfjk;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzdue;Lcom/google/android/gms/internal/ads/zzduv;Lcom/google/android/gms/internal/ads/zzbok;Lcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzdxt;Lcom/google/android/gms/internal/ads/zzdxz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeot;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzd:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 7
    .line 8
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzc:Lcom/google/android/gms/internal/ads/zzdue;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeot;->zze:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzb:Lcom/google/android/gms/internal/ads/zzduv;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzg:Lcom/google/android/gms/internal/ads/zzbok;

    .line 17
    .line 18
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkp:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzh:Z

    .line 35
    .line 36
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzi:Lcom/google/android/gms/internal/ads/zzejf;

    .line 37
    .line 38
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 39
    .line 40
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzeot;->zzk:Lcom/google/android/gms/internal/ads/zzdxz;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;)Z
    .locals 0

    .line 1
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfiw;->zza:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;)Lj3/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzduz;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzduz;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeos;

    .line 12
    .line 13
    invoke-direct {v2, p0, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzeos;-><init>(Lcom/google/android/gms/internal/ads/zzeot;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzduz;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeot;->zze:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v1, Lcom/google/android/gms/internal/ads/zzeom;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzeom;-><init>(Lcom/google/android/gms/internal/ads/zzduz;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, v1, p1}, Lj3/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzduz;Ljava/lang/Object;)Lj3/a;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    sget-object v14, Lcom/google/android/gms/internal/ads/zzbhe;->zzcN:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzB:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lx2/c;

    .line 42
    .line 43
    invoke-static {v4, v2, v3}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzb:Lcom/google/android/gms/internal/ads/zzduv;

    .line 47
    .line 48
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzd:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 49
    .line 50
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfjc;->zzb:Lcom/google/android/gms/internal/ads/zzfjb;

    .line 51
    .line 52
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfjb;->zzb:Lcom/google/android/gms/internal/ads/zzfiu;

    .line 53
    .line 54
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzfjk;->zzf:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 55
    .line 56
    invoke-virtual {v3, v5, v6, v2}, Lcom/google/android/gms/internal/ads/zzduv;->zza(Lcom/google/android/gms/ads/internal/client/zzr;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;)Lcom/google/android/gms/internal/ads/zzcjl;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget-boolean v2, v6, Lcom/google/android/gms/internal/ads/zzfir;->zzW:Z

    .line 61
    .line 62
    invoke-interface {v8, v2}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaw(Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v5, Lcom/google/android/gms/internal/ads/zzdxh;->zzC:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 88
    .line 89
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lx2/c;

    .line 98
    .line 99
    invoke-static {v7, v2, v5}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    new-instance v7, Lcom/google/android/gms/internal/ads/zzcen;

    .line 103
    .line 104
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzcen;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzc:Lcom/google/android/gms/internal/ads/zzdue;

    .line 108
    .line 109
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcwv;

    .line 110
    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-direct {v2, v1, v6, v5}, Lcom/google/android/gms/internal/ads/zzcwv;-><init>(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v2

    .line 116
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeot;->zza:Landroid/content/Context;

    .line 117
    .line 118
    move-object v9, v5

    .line 119
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 120
    .line 121
    move-object v10, v9

    .line 122
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzg:Lcom/google/android/gms/internal/ads/zzbok;

    .line 123
    .line 124
    move-object v11, v10

    .line 125
    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzh:Z

    .line 126
    .line 127
    move-object v12, v11

    .line 128
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzi:Lcom/google/android/gms/internal/ads/zzejf;

    .line 129
    .line 130
    move-object v13, v12

    .line 131
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 132
    .line 133
    move-object/from16 v16, v13

    .line 134
    .line 135
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzeot;->zzk:Lcom/google/android/gms/internal/ads/zzdxz;

    .line 136
    .line 137
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdub;

    .line 138
    .line 139
    move-object/from16 v17, v1

    .line 140
    .line 141
    new-instance v1, Lcom/google/android/gms/internal/ads/zzeop;

    .line 142
    .line 143
    move-object/from16 p3, v14

    .line 144
    .line 145
    move-object/from16 v14, v17

    .line 146
    .line 147
    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/zzeop;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzduv;Lcom/google/android/gms/internal/ads/zzfjk;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzfir;Lj3/a;Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzbok;ZLcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzdxt;Lcom/google/android/gms/internal/ads/zzdxz;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v1, v8}, Lcom/google/android/gms/internal/ads/zzdub;-><init>(Lcom/google/android/gms/internal/ads/zzdmc;Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15, v14, v0}, Lcom/google/android/gms/internal/ads/zzdue;->zzf(Lcom/google/android/gms/internal/ads/zzcwv;Lcom/google/android/gms/internal/ads/zzdub;)Lcom/google/android/gms/internal/ads/zzdua;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzcen;->zzc(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    move-object/from16 v2, p3

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_2

    .line 177
    .line 178
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzD:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 183
    .line 184
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Lx2/c;

    .line 193
    .line 194
    invoke-static {v3, v1, v2}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzk()Lcom/google/android/gms/internal/ads/zzdjv;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/ads/zzbpa;->zzb(Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzboz;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcwg;->zzd()Lcom/google/android/gms/internal/ads/zzdbx;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeoq;

    .line 209
    .line 210
    invoke-direct {v2, v8}, Lcom/google/android/gms/internal/ads/zzeoq;-><init>(Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 211
    .line 212
    .line 213
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 214
    .line 215
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzdhd;->zzq(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzl()Lcom/google/android/gms/internal/ads/zzduu;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const/4 v2, 0x1

    .line 223
    if-eq v2, v10, :cond_3

    .line 224
    .line 225
    move-object/from16 v5, v16

    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_3
    move-object v5, v9

    .line 229
    :goto_0
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v1, v8, v2, v5, v3}, Lcom/google/android/gms/internal/ads/zzduu;->zzi(Lcom/google/android/gms/internal/ads/zzcjl;ZLcom/google/android/gms/internal/ads/zzbok;Landroid/os/Bundle;)V

    .line 234
    .line 235
    .line 236
    iget-object v1, v6, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    .line 237
    .line 238
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzfiw;->zza:Ljava/lang/String;

    .line 239
    .line 240
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzgm:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 241
    .line 242
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    check-cast v4, Ljava/lang/Boolean;

    .line 251
    .line 252
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_4

    .line 257
    .line 258
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzo()Lcom/google/android/gms/internal/ads/zzejz;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzejz;->zza(Z)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_4

    .line 267
    .line 268
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzclc;->zzb(Lcom/google/android/gms/internal/ads/zzfir;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    filled-new-array {v2}, [Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzclc;->zza(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzl()Lcom/google/android/gms/internal/ads/zzduu;

    .line 281
    .line 282
    .line 283
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzfiw;->zzb:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-interface {v15}, Lcom/google/android/gms/internal/ads/zzdam;->zzd()Lcom/google/android/gms/internal/ads/zzfoo;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-static {v8, v1, v3, v2, v4}, Lcom/google/android/gms/internal/ads/zzduu;->zzj(Lcom/google/android/gms/internal/ads/zzcjl;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzfoo;)Lj3/a;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeor;

    .line 298
    .line 299
    move-object/from16 v3, p0

    .line 300
    .line 301
    invoke-direct {v2, v3, v8, v6, v0}, Lcom/google/android/gms/internal/ads/zzeor;-><init>(Lcom/google/android/gms/internal/ads/zzeot;Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzdua;)V

    .line 302
    .line 303
    .line 304
    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzeot;->zze:Ljava/util/concurrent/Executor;

    .line 305
    .line 306
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0
.end method
