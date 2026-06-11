.class public final Lcom/google/android/gms/internal/ads/zzfff;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzesf;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcma;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzerp;

.field private final zze:Lcom/google/android/gms/internal/ads/zzert;

.field private final zzf:Landroid/view/ViewGroup;

.field private zzg:Lcom/google/android/gms/internal/ads/zzbhz;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdeg;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfor;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdgl;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfjj;

.field private zzl:Lj3/a;

.field private zzm:Z

.field private zzn:Lcom/google/android/gms/ads/internal/client/zze;

.field private zzo:Lcom/google/android/gms/internal/ads/zzese;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzr;Lcom/google/android/gms/internal/ads/zzcma;Lcom/google/android/gms/internal/ads/zzerp;Lcom/google/android/gms/internal/ads/zzert;Lcom/google/android/gms/internal/ads/zzfjj;Lcom/google/android/gms/internal/ads/zzdgl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfff;->zze:Lcom/google/android/gms/internal/ads/zzert;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzk:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 15
    .line 16
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcma;->zzd()Lcom/google/android/gms/internal/ads/zzdeg;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 21
    .line 22
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcma;->zzx()Lcom/google/android/gms/internal/ads/zzfor;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzi:Lcom/google/android/gms/internal/ads/zzfor;

    .line 27
    .line 28
    new-instance p2, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    .line 34
    .line 35
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 36
    .line 37
    invoke-virtual {p7, p3}, Lcom/google/android/gms/internal/ads/zzfjj;->zzc(Lcom/google/android/gms/ads/internal/client/zzr;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzn:Lcom/google/android/gms/ads/internal/client/zze;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzo:Lcom/google/android/gms/internal/ads/zzese;

    .line 47
    .line 48
    return-void
.end method

.method private final zzt()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzn:Lcom/google/android/gms/ads/internal/client/zze;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzn:Lcom/google/android/gms/ads/internal/client/zze;

    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzjw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    new-instance v2, Lcom/google/android/gms/internal/ads/zzffc;

    .line 31
    .line 32
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzffc;-><init>(Lcom/google/android/gms/internal/ads/zzfff;Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzo:Lcom/google/android/gms/internal/ads/zzese;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzese;->zza()V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzesd;Lcom/google/android/gms/internal/ads/zzese;)Z
    .locals 7

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 5
    .line 6
    const-string p1, "Ad unit ID should not be null for banner ad."

    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance p2, Lcom/google/android/gms/internal/ads/zzffd;

    .line 14
    .line 15
    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzffd;-><init>(Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return p3

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfff;->zzb()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzk:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfjj;->zzB()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcZ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 42
    .line 43
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zzc()V

    .line 60
    .line 61
    .line 62
    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkq:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzm;->zzf:Z

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcma;->zzw()Lcom/google/android/gms/internal/ads/zzebf;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzebf;->zzc(Z)V

    .line 91
    .line 92
    .line 93
    :cond_3
    new-instance v0, Landroid/util/Pair;

    .line 94
    .line 95
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zza:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget-wide v3, p1, Lcom/google/android/gms/ads/internal/client/zzm;->zzz:J

    .line 102
    .line 103
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {v0, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance v2, Landroid/util/Pair;

    .line 111
    .line 112
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzb:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Lx2/c;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    filled-new-array {v0, v2}, [Landroid/util/Pair;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdxj;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzk:Lcom/google/android/gms/internal/ads/zzfjj;

    .line 147
    .line 148
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzfjj;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzfjj;->zza(Lcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzfjj;->zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 155
    .line 156
    .line 157
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zza:Landroid/content/Context;

    .line 158
    .line 159
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfjj;->zzA()Lcom/google/android/gms/internal/ads/zzfjk;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfon;->zzg(Lcom/google/android/gms/internal/ads/zzfjk;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    const/4 v4, 0x3

    .line 168
    invoke-static {p2, v3, v4, p1}, Lcom/google/android/gms/internal/ads/zzfoe;->zzo(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbjk;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 173
    .line 174
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    check-cast v5, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    const/4 v6, 0x0

    .line 185
    if-eqz v5, :cond_5

    .line 186
    .line 187
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfjj;->zzf()Lcom/google/android/gms/ads/internal/client/zzr;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zzk:Z

    .line 192
    .line 193
    if-eqz v2, :cond_5

    .line 194
    .line 195
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 196
    .line 197
    if-eqz p1, :cond_4

    .line 198
    .line 199
    const/4 p2, 0x7

    .line 200
    invoke-static {p2, v6, v6}, Lcom/google/android/gms/internal/ads/zzfkm;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzerp;->zzdI(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 205
    .line 206
    .line 207
    :cond_4
    :goto_0
    return p3

    .line 208
    :cond_5
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbhe;->zzjw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 209
    .line 210
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    check-cast p3, Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 221
    .line 222
    .line 223
    move-result p3

    .line 224
    if-eqz p3, :cond_6

    .line 225
    .line 226
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 227
    .line 228
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcma;->zzi()Lcom/google/android/gms/internal/ads/zzcvb;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdan;

    .line 233
    .line 234
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzdan;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzdan;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzdan;->zzb(Lcom/google/android/gms/internal/ads/zzfjk;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdan;->zze()Lcom/google/android/gms/internal/ads/zzdao;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzl(Lcom/google/android/gms/internal/ads/zzdao;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 248
    .line 249
    .line 250
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdhe;

    .line 251
    .line 252
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdhe;-><init>()V

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 256
    .line 257
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 258
    .line 259
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzm(Lcom/google/android/gms/internal/ads/zzdel;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zze(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzn()Lcom/google/android/gms/internal/ads/zzdhf;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzm(Lcom/google/android/gms/internal/ads/zzdhf;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 270
    .line 271
    .line 272
    new-instance p2, Lcom/google/android/gms/internal/ads/zzepw;

    .line 273
    .line 274
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzg:Lcom/google/android/gms/internal/ads/zzbhz;

    .line 275
    .line 276
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzepw;-><init>(Lcom/google/android/gms/internal/ads/zzbhz;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzk(Lcom/google/android/gms/internal/ads/zzepw;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 280
    .line 281
    .line 282
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdml;

    .line 283
    .line 284
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdor;->zza:Lcom/google/android/gms/internal/ads/zzdor;

    .line 285
    .line 286
    invoke-direct {p2, v0, v6}, Lcom/google/android/gms/internal/ads/zzdml;-><init>(Lcom/google/android/gms/internal/ads/zzdor;Lcom/google/android/gms/ads/internal/client/zzbk;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzd(Lcom/google/android/gms/internal/ads/zzdml;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 290
    .line 291
    .line 292
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 293
    .line 294
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 295
    .line 296
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcvx;

    .line 297
    .line 298
    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/ads/zzcvx;-><init>(Lcom/google/android/gms/internal/ads/zzdeg;Lcom/google/android/gms/internal/ads/zzdgl;)V

    .line 299
    .line 300
    .line 301
    invoke-interface {p3, v2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzg(Lcom/google/android/gms/internal/ads/zzcvx;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 302
    .line 303
    .line 304
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    .line 305
    .line 306
    new-instance v0, Lcom/google/android/gms/internal/ads/zzctu;

    .line 307
    .line 308
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzctu;-><init>(Landroid/view/ViewGroup;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {p3, v0}, Lcom/google/android/gms/internal/ads/zzcvb;->zze(Lcom/google/android/gms/internal/ads/zzctu;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 312
    .line 313
    .line 314
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcvb;->zza()Lcom/google/android/gms/internal/ads/zzcvc;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    goto :goto_1

    .line 319
    :cond_6
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzc:Lcom/google/android/gms/internal/ads/zzcma;

    .line 320
    .line 321
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcma;->zzi()Lcom/google/android/gms/internal/ads/zzcvb;

    .line 322
    .line 323
    .line 324
    move-result-object p3

    .line 325
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdan;

    .line 326
    .line 327
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzdan;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzdan;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzdan;->zzb(Lcom/google/android/gms/internal/ads/zzfjk;)Lcom/google/android/gms/internal/ads/zzdan;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdan;->zze()Lcom/google/android/gms/internal/ads/zzdao;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzl(Lcom/google/android/gms/internal/ads/zzdao;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 341
    .line 342
    .line 343
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdhe;

    .line 344
    .line 345
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdhe;-><init>()V

    .line 346
    .line 347
    .line 348
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 349
    .line 350
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 351
    .line 352
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzm(Lcom/google/android/gms/internal/ads/zzdel;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzf(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 356
    .line 357
    .line 358
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfff;->zze:Lcom/google/android/gms/internal/ads/zzert;

    .line 359
    .line 360
    invoke-virtual {p2, v5, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzf(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzg(Lcom/google/android/gms/internal/ads/zzdjm;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzh(Lcom/google/android/gms/internal/ads/zzdbz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zza(Lcom/google/android/gms/internal/ads/zzdbf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzb(Lcom/google/android/gms/internal/ads/zzdct;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzc(Lcom/google/android/gms/internal/ads/zzdbi;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zze(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzk(Lcom/google/android/gms/internal/ads/zzddw;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdhe;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhe;->zzn()Lcom/google/android/gms/internal/ads/zzdhf;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzm(Lcom/google/android/gms/internal/ads/zzdhf;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 389
    .line 390
    .line 391
    new-instance p2, Lcom/google/android/gms/internal/ads/zzepw;

    .line 392
    .line 393
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzg:Lcom/google/android/gms/internal/ads/zzbhz;

    .line 394
    .line 395
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzepw;-><init>(Lcom/google/android/gms/internal/ads/zzbhz;)V

    .line 396
    .line 397
    .line 398
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzk(Lcom/google/android/gms/internal/ads/zzepw;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 399
    .line 400
    .line 401
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdml;

    .line 402
    .line 403
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdor;->zza:Lcom/google/android/gms/internal/ads/zzdor;

    .line 404
    .line 405
    invoke-direct {p2, v0, v6}, Lcom/google/android/gms/internal/ads/zzdml;-><init>(Lcom/google/android/gms/internal/ads/zzdor;Lcom/google/android/gms/ads/internal/client/zzbk;)V

    .line 406
    .line 407
    .line 408
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzd(Lcom/google/android/gms/internal/ads/zzdml;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 409
    .line 410
    .line 411
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 412
    .line 413
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 414
    .line 415
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcvx;

    .line 416
    .line 417
    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/ads/zzcvx;-><init>(Lcom/google/android/gms/internal/ads/zzdeg;Lcom/google/android/gms/internal/ads/zzdgl;)V

    .line 418
    .line 419
    .line 420
    invoke-interface {p3, v2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzg(Lcom/google/android/gms/internal/ads/zzcvx;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 421
    .line 422
    .line 423
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    .line 424
    .line 425
    new-instance v0, Lcom/google/android/gms/internal/ads/zzctu;

    .line 426
    .line 427
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzctu;-><init>(Landroid/view/ViewGroup;)V

    .line 428
    .line 429
    .line 430
    invoke-interface {p3, v0}, Lcom/google/android/gms/internal/ads/zzcvb;->zze(Lcom/google/android/gms/internal/ads/zzctu;)Lcom/google/android/gms/internal/ads/zzcvb;

    .line 431
    .line 432
    .line 433
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcvb;->zza()Lcom/google/android/gms/internal/ads/zzcvc;

    .line 434
    .line 435
    .line 436
    move-result-object p2

    .line 437
    :goto_1
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbix;->zzc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 438
    .line 439
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p3

    .line 443
    check-cast p3, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result p3

    .line 449
    if-eqz p3, :cond_7

    .line 450
    .line 451
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcvc;->zze()Lcom/google/android/gms/internal/ads/zzfoo;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzfoo;->zzi(I)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 456
    .line 457
    .line 458
    iget-object p3, p1, Lcom/google/android/gms/ads/internal/client/zzm;->zzp:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v6, p3}, Lcom/google/android/gms/internal/ads/zzfoo;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 461
    .line 462
    .line 463
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzm;->zzm:Landroid/os/Bundle;

    .line 464
    .line 465
    invoke-virtual {v6, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzd(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 466
    .line 467
    .line 468
    :cond_7
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzo:Lcom/google/android/gms/internal/ads/zzese;

    .line 469
    .line 470
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcvc;->zzc()Lcom/google/android/gms/internal/ads/zzcxj;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcxj;->zzb()Lj3/a;

    .line 475
    .line 476
    .line 477
    move-result-object p3

    .line 478
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzcxj;->zzc(Lj3/a;)Lj3/a;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 483
    .line 484
    new-instance p3, Lcom/google/android/gms/internal/ads/zzffb;

    .line 485
    .line 486
    invoke-direct {p3, p0, v6, v3, p2}, Lcom/google/android/gms/internal/ads/zzffb;-><init>(Lcom/google/android/gms/internal/ads/zzfff;Lcom/google/android/gms/internal/ads/zzfoo;Lcom/google/android/gms/internal/ads/zzfoe;Lcom/google/android/gms/internal/ads/zzcvc;)V

    .line 487
    .line 488
    .line 489
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 490
    .line 491
    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 492
    .line 493
    .line 494
    return v1
.end method

.method public final zzb()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final zzc()V
    .locals 9

    .line 1
    const-string v0, " already has a parent view. Removing its old parent."

    .line 2
    .line 3
    const-string v1, "Banner view provided from "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_6

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v2, :cond_6

    .line 16
    .line 17
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/android/gms/internal/ads/zzctx;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zza()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zza()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    const-string v6, ""

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcwf;->zzn()Lcom/google/android/gms/internal/ads/zzday;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcwf;->zzn()Lcom/google/android/gms/internal/ads/zzday;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzday;->zze()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :catch_1
    move-exception v0

    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_0
    :goto_0
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    add-int/lit8 v7, v7, 0x4e

    .line 83
    .line 84
    new-instance v8, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 103
    .line 104
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    check-cast v5, Landroid/view/ViewGroup;

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zza()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzjw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 117
    .line 118
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcwf;->zzq()Lcom/google/android/gms/internal/ads/zzdev;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 139
    .line 140
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzdev;->zza(Lcom/google/android/gms/internal/ads/zzerp;)Lcom/google/android/gms/internal/ads/zzdev;

    .line 141
    .line 142
    .line 143
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfff;->zze:Lcom/google/android/gms/internal/ads/zzert;

    .line 144
    .line 145
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzdev;->zzb(Lcom/google/android/gms/internal/ads/zzert;)Lcom/google/android/gms/internal/ads/zzdev;

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zza()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzo:Lcom/google/android/gms/internal/ads/zzese;

    .line 156
    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzese;->zzb(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 179
    .line 180
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 181
    .line 182
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    new-instance v4, Lcom/google/android/gms/internal/ads/zzffe;

    .line 186
    .line 187
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzffe;-><init>(Lcom/google/android/gms/internal/ads/zzerp;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 191
    .line 192
    .line 193
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zzh()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-ltz v0, :cond_5

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 201
    .line 202
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 203
    .line 204
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zzh()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdeg;->zzd(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zzg()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdeg;->zze(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 220
    .line 221
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 222
    .line 223
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctx;->zzg()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdeg;->zzd(I)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :goto_1
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfff;->zzt()V

    .line 232
    .line 233
    .line 234
    const-string v1, "Error occurred while refreshing the ad. Making a new ad request."

    .line 235
    .line 236
    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 240
    .line 241
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdeg;->zzc()V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzl:Lj3/a;

    .line 248
    .line 249
    if-eqz v0, :cond_7

    .line 250
    .line 251
    const-string v0, "Show timer went off but there is an ongoing ad request."

    .line 252
    .line 253
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_7
    const-string v0, "No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad."

    .line 260
    .line 261
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    .line 265
    .line 266
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 267
    .line 268
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdeg;->zzc()V

    .line 269
    .line 270
    .line 271
    :goto_2
    monitor-exit p0

    .line 272
    return-void

    .line 273
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 274
    throw v0
.end method

.method public final zzd()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbhz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzg:Lcom/google/android/gms/internal/ads/zzbhz;

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zze:Lcom/google/android/gms/internal/ads/zzert;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzert;->zza(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzk:Lcom/google/android/gms/internal/ads/zzfjj;

    return-object v0
.end method

.method public final zzh()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzf:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzad(Landroid/view/View;Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzdeb;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzb:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdhd;->zzq(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzj()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgl;->zzc()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdeg;->zzd(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final zzk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgl;->zzd()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdeg;->zze(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

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
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzerp;->zzdI(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzm(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzd:Lcom/google/android/gms/internal/ads/zzerp;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzerp;->zzdI(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzn()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfff;->zzt()V

    return-void
.end method

.method public final synthetic zzo()Lcom/google/android/gms/internal/ads/zzdeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzh:Lcom/google/android/gms/internal/ads/zzdeg;

    return-object v0
.end method

.method public final synthetic zzp()Lcom/google/android/gms/internal/ads/zzfor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzi:Lcom/google/android/gms/internal/ads/zzfor;

    return-object v0
.end method

.method public final synthetic zzq()Lcom/google/android/gms/internal/ads/zzdgl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzj:Lcom/google/android/gms/internal/ads/zzdgl;

    return-object v0
.end method

.method public final synthetic zzr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzm:Z

    return v0
.end method

.method public final synthetic zzs(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfff;->zzn:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method
