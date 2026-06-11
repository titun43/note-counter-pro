.class public final Lcom/google/android/gms/internal/ads/zzfie;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzesf;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcma;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfhv;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfgj;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfjd;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfor;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfjj;

.field private zzi:Lj3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcma;Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzfhv;Lcom/google/android/gms/internal/ads/zzfjj;Lcom/google/android/gms/internal/ads/zzfjd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzb:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfie;->zze:Lcom/google/android/gms/internal/ads/zzfgj;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzd:Lcom/google/android/gms/internal/ads/zzfhv;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzh:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzf:Lcom/google/android/gms/internal/ads/zzfjd;

    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcma;->zzx()Lcom/google/android/gms/internal/ads/zzfor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzg:Lcom/google/android/gms/internal/ads/zzfor;

    .line 23
    .line 24
    return-void
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzfgh;)Lcom/google/android/gms/internal/ads/zzdud;
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfid;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcma;->zzp()Lcom/google/android/gms/internal/ads/zzdud;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdan;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzdan;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfie;->zza:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzdan;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfid;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzdan;->zzb(Lcom/google/android/gms/internal/ads/zzfjk;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzf:Lcom/google/android/gms/internal/ads/zzfjd;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzdan;->zzf(Lcom/google/android/gms/internal/ads/zzfjd;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdan;->zze()Lcom/google/android/gms/internal/ads/zzdao;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdud;->zzd(Lcom/google/android/gms/internal/ads/zzdao;)Lcom/google/android/gms/internal/ads/zzdud;

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdhe;

    .line 37
    .line 38
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzdhe;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhe;->zzn()Lcom/google/android/gms/internal/ads/zzdhf;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdud;->zze(Lcom/google/android/gms/internal/ads/zzdhf;)Lcom/google/android/gms/internal/ads/zzdud;

    .line 46
    .line 47
    .line 48
    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzesd;Lcom/google/android/gms/internal/ads/zzese;)Z
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcan;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzcan;-><init>(Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p3, Lcom/google/android/gms/internal/ads/zzfhx;

    .line 7
    .line 8
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/zzcan;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 14
    .line 15
    const-string p1, "Ad unit ID should not be null for rewarded video ad."

    .line 16
    .line 17
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzb:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    new-instance p3, Lcom/google/android/gms/internal/ads/zzfic;

    .line 23
    .line 24
    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/zzfic;-><init>(Lcom/google/android/gms/internal/ads/zzfie;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return p2

    .line 31
    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzi:Lj3/a;

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    invoke-interface {p3}, Ljava/util/concurrent/Future;->isDone()Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    if-nez p3, :cond_1

    .line 40
    .line 41
    return p2

    .line 42
    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zzcZ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 43
    .line 44
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zzc()V

    .line 61
    .line 62
    .line 63
    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const/4 p3, 0x5

    .line 76
    const/4 v1, 0x0

    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfie;->zze:Lcom/google/android/gms/internal/ads/zzfgj;

    .line 80
    .line 81
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzfgj;->zzd()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzfgj;->zzd()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Lcom/google/android/gms/internal/ads/zzdue;

    .line 92
    .line 93
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzdam;->zzd()Lcom/google/android/gms/internal/ads/zzfoo;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfoo;->zzi(I)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzcan;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 101
    .line 102
    iget-object v3, v2, Lcom/google/android/gms/ads/internal/client/zzm;->zzp:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzfoo;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 105
    .line 106
    .line 107
    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzm;->zzm:Landroid/os/Bundle;

    .line 108
    .line 109
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzfoo;->zzd(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 110
    .line 111
    .line 112
    move-object v6, p2

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move-object v6, v1

    .line 115
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfie;->zza:Landroid/content/Context;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzcan;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 118
    .line 119
    iget-boolean v2, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzf:Z

    .line 120
    .line 121
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/ads/zzfkh;->zzb(Landroid/content/Context;Z)V

    .line 122
    .line 123
    .line 124
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzkq:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 125
    .line 126
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    const/4 v9, 0x1

    .line 141
    if-eqz v3, :cond_4

    .line 142
    .line 143
    if-eqz v2, :cond_4

    .line 144
    .line 145
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcma;->zzw()Lcom/google/android/gms/internal/ads/zzebf;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzebf;->zzc(Z)V

    .line 152
    .line 153
    .line 154
    :cond_4
    new-instance v2, Landroid/util/Pair;

    .line 155
    .line 156
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zza:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 157
    .line 158
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iget-wide v4, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzz:J

    .line 163
    .line 164
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance v3, Landroid/util/Pair;

    .line 172
    .line 173
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzb:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 174
    .line 175
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Lx2/c;

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v7

    .line 192
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    filled-new-array {v2, v3}, [Landroid/util/Pair;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdxj;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzh:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 208
    .line 209
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzfjj;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 210
    .line 211
    .line 212
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzr;->zzc()Lcom/google/android/gms/ads/internal/client/zzr;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzfjj;->zzc(Lcom/google/android/gms/ads/internal/client/zzr;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzfjj;->zza(Lcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzfjj;->zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfjj;->zzA()Lcom/google/android/gms/internal/ads/zzfjk;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfon;->zzg(Lcom/google/android/gms/internal/ads/zzfjk;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    invoke-static {p2, v2, p3, v0}, Lcom/google/android/gms/internal/ads/zzfoe;->zzo(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    new-instance v8, Lcom/google/android/gms/internal/ads/zzfid;

    .line 238
    .line 239
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/ads/zzfid;-><init>([B)V

    .line 240
    .line 241
    .line 242
    iput-object p1, v8, Lcom/google/android/gms/internal/ads/zzfid;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 243
    .line 244
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zze:Lcom/google/android/gms/internal/ads/zzfgj;

    .line 245
    .line 246
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfgk;

    .line 247
    .line 248
    invoke-direct {p2, v8, v1}, Lcom/google/android/gms/internal/ads/zzfgk;-><init>(Lcom/google/android/gms/internal/ads/zzfgh;Lcom/google/android/gms/internal/ads/zzbzu;)V

    .line 249
    .line 250
    .line 251
    new-instance p3, Lcom/google/android/gms/internal/ads/zzfib;

    .line 252
    .line 253
    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/zzfib;-><init>(Lcom/google/android/gms/internal/ads/zzfie;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzfgj;->zzc(Lcom/google/android/gms/internal/ads/zzfgk;Lcom/google/android/gms/internal/ads/zzfgi;Ljava/lang/Object;)Lj3/a;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzi:Lj3/a;

    .line 261
    .line 262
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfia;

    .line 263
    .line 264
    move-object v4, p0

    .line 265
    move-object v5, p4

    .line 266
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzfia;-><init>(Lcom/google/android/gms/internal/ads/zzfie;Lcom/google/android/gms/internal/ads/zzese;Lcom/google/android/gms/internal/ads/zzfoo;Lcom/google/android/gms/internal/ads/zzfoe;Lcom/google/android/gms/internal/ads/zzfid;)V

    .line 267
    .line 268
    .line 269
    iget-object p2, v4, Lcom/google/android/gms/internal/ads/zzfie;->zzb:Ljava/util/concurrent/Executor;

    .line 270
    .line 271
    invoke-static {p1, v3, p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 272
    .line 273
    .line 274
    return v9
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final synthetic zzc()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzd:Lcom/google/android/gms/internal/ads/zzfhv;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfkm;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfhv;->zzdI(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzfgh;)Lcom/google/android/gms/internal/ads/zzdud;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfie;->zzk(Lcom/google/android/gms/internal/ads/zzfgh;)Lcom/google/android/gms/internal/ads/zzdud;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zzfgh;)Lcom/google/android/gms/internal/ads/zzdud;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfie;->zzk(Lcom/google/android/gms/internal/ads/zzfgh;)Lcom/google/android/gms/internal/ads/zzdud;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzf()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzb:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzfhv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzd:Lcom/google/android/gms/internal/ads/zzfhv;

    return-object v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/ads/zzfgj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zze:Lcom/google/android/gms/internal/ads/zzfgj;

    return-object v0
.end method

.method public final synthetic zzi()Lcom/google/android/gms/internal/ads/zzfor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzg:Lcom/google/android/gms/internal/ads/zzfor;

    return-object v0
.end method

.method public final zzj(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfie;->zzh:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfjj;->zzj()Lcom/google/android/gms/internal/ads/zzfix;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfix;->zza(I)Lcom/google/android/gms/internal/ads/zzfix;

    .line 8
    .line 9
    .line 10
    return-void
.end method
