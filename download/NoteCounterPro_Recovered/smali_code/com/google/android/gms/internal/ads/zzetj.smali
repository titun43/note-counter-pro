.class public final Lcom/google/android/gms/internal/ads/zzetj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfav;


# instance fields
.field public final zza:Lcom/google/android/gms/ads/internal/client/zzr;

.field public final zzb:Ljava/lang/String;

.field public final zzc:Z

.field public final zzd:Ljava/lang/String;

.field public final zze:F

.field public final zzf:I

.field public final zzg:I

.field public final zzh:Ljava/lang/String;

.field public final zzi:I

.field public final zzj:Z

.field public final zzk:Ly/c;

.field public final zzl:Lcom/google/android/gms/internal/ads/zzetg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzr;Ljava/lang/String;ZLjava/lang/String;FIILjava/lang/String;IZLy/c;Lcom/google/android/gms/internal/ads/zzetg;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "the adSize must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzetj;->zza:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzb:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzc:Z

    .line 14
    .line 15
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzd:Ljava/lang/String;

    .line 16
    .line 17
    iput p5, p0, Lcom/google/android/gms/internal/ads/zzetj;->zze:F

    .line 18
    .line 19
    iput p6, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzf:I

    .line 20
    .line 21
    iput p7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzg:I

    .line 22
    .line 23
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzh:Ljava/lang/String;

    .line 24
    .line 25
    iput p9, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzi:I

    .line 26
    .line 27
    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzj:Z

    .line 28
    .line 29
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzk:Ly/c;

    .line 30
    .line 31
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzl:Lcom/google/android/gms/internal/ads/zzetg;

    .line 32
    .line 33
    return-void
.end method

.method private final zzc(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzetj;->zza:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zze:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, -0x1

    .line 8
    if-ne v1, v4, :cond_0

    .line 9
    .line 10
    move v5, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v5, v2

    .line 13
    :goto_0
    const-string v6, "smart_w"

    .line 14
    .line 15
    const-string v7, "full"

    .line 16
    .line 17
    invoke-static {p1, v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget v5, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzb:I

    .line 21
    .line 22
    const/4 v6, -0x2

    .line 23
    if-ne v5, v6, :cond_1

    .line 24
    .line 25
    move v6, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v6, v2

    .line 28
    :goto_1
    const-string v7, "smart_h"

    .line 29
    .line 30
    const-string v8, "auto"

    .line 31
    .line 32
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    iget-boolean v6, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzj:Z

    .line 36
    .line 37
    const-string v7, "ene"

    .line 38
    .line 39
    invoke-static {p1, v7, v3, v6}, Lcom/google/android/gms/internal/ads/zzfjz;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 40
    .line 41
    .line 42
    const-string v6, "102"

    .line 43
    .line 44
    iget-boolean v7, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzm:Z

    .line 45
    .line 46
    const-string v8, "rafmt"

    .line 47
    .line 48
    invoke-static {p1, v8, v6, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    const-string v6, "103"

    .line 52
    .line 53
    iget-boolean v7, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzn:Z

    .line 54
    .line 55
    invoke-static {p1, v8, v6, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v6, "105"

    .line 59
    .line 60
    iget-boolean v7, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzo:Z

    .line 61
    .line 62
    invoke-static {p1, v8, v6, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    iget-boolean v6, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzj:Z

    .line 66
    .line 67
    const-string v7, "inline_adaptive_slot"

    .line 68
    .line 69
    invoke-static {p1, v7, v3, v6}, Lcom/google/android/gms/internal/ads/zzfjz;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 70
    .line 71
    .line 72
    iget-boolean v6, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzo:Z

    .line 73
    .line 74
    const-string v7, "interscroller_slot"

    .line 75
    .line 76
    invoke-static {p1, v7, v3, v6}, Lcom/google/android/gms/internal/ads/zzfjz;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 77
    .line 78
    .line 79
    const-string v6, "format"

    .line 80
    .line 81
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzb:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v6, "fluid"

    .line 87
    .line 88
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzc:Z

    .line 89
    .line 90
    const-string v8, "height"

    .line 91
    .line 92
    invoke-static {p1, v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzd:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    xor-int/2addr v7, v3

    .line 102
    const-string v9, "sz"

    .line 103
    .line 104
    invoke-static {p1, v9, v6, v7}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    const-string v6, "u_sd"

    .line 108
    .line 109
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zze:F

    .line 110
    .line 111
    invoke-virtual {p1, v6, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 112
    .line 113
    .line 114
    const-string v6, "sw"

    .line 115
    .line 116
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzf:I

    .line 117
    .line 118
    invoke-virtual {p1, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    const-string v6, "sh"

    .line 122
    .line 123
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzg:I

    .line 124
    .line 125
    invoke-virtual {p1, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzh:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    xor-int/2addr v3, v7

    .line 135
    const-string v7, "sc"

    .line 136
    .line 137
    invoke-static {p1, v7, v6, v3}, Lcom/google/android/gms/internal/ads/zzfjz;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzi:I

    .line 141
    .line 142
    if-eq v3, v4, :cond_2

    .line 143
    .line 144
    const-string v4, "u_mso"

    .line 145
    .line 146
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzk:Ly/c;

    .line 150
    .line 151
    if-eqz v3, :cond_3

    .line 152
    .line 153
    const-string v4, "sam_t"

    .line 154
    .line 155
    iget v6, v3, Ly/c;->b:I

    .line 156
    .line 157
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    const-string v4, "sam_b"

    .line 161
    .line 162
    iget v6, v3, Ly/c;->d:I

    .line 163
    .line 164
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    const-string v4, "sam_l"

    .line 168
    .line 169
    iget v6, v3, Ly/c;->a:I

    .line 170
    .line 171
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    const-string v4, "sam_r"

    .line 175
    .line 176
    iget v3, v3, Ly/c;->c:I

    .line 177
    .line 178
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzetj;->zzl:Lcom/google/android/gms/internal/ads/zzetg;

    .line 182
    .line 183
    if-eqz v3, :cond_4

    .line 184
    .line 185
    const-string v4, "rc_tl"

    .line 186
    .line 187
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzetg;->zza:I

    .line 188
    .line 189
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    const-string v4, "rc_tr"

    .line 193
    .line 194
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzetg;->zzb:I

    .line 195
    .line 196
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    const-string v4, "rc_bl"

    .line 200
    .line 201
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzetg;->zzc:I

    .line 202
    .line 203
    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 204
    .line 205
    .line 206
    const-string v4, "rc_br"

    .line 207
    .line 208
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzetg;->zzd:I

    .line 209
    .line 210
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    iget-object v4, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzg:[Lcom/google/android/gms/ads/internal/client/zzr;

    .line 219
    .line 220
    const-string v6, "is_fluid_height"

    .line 221
    .line 222
    const-string v7, "width"

    .line 223
    .line 224
    if-nez v4, :cond_5

    .line 225
    .line 226
    new-instance v2, Landroid/os/Bundle;

    .line 227
    .line 228
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v8, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v7, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzi:Z

    .line 238
    .line 239
    invoke-virtual {v2, v6, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_5
    :goto_2
    array-length v0, v4

    .line 247
    if-ge v2, v0, :cond_6

    .line 248
    .line 249
    aget-object v0, v4, v2

    .line 250
    .line 251
    new-instance v1, Landroid/os/Bundle;

    .line 252
    .line 253
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 254
    .line 255
    .line 256
    iget-boolean v5, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzi:Z

    .line 257
    .line 258
    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 259
    .line 260
    .line 261
    iget v5, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zzb:I

    .line 262
    .line 263
    invoke-virtual {v1, v8, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 264
    .line 265
    .line 266
    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzr;->zze:I

    .line 267
    .line 268
    invoke-virtual {v1, v7, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    add-int/lit8 v2, v2, 0x1

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_6
    :goto_3
    const-string v0, "valid_ad_sizes"

    .line 278
    .line 279
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zza:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzetj;->zzc(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic zzb(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zzb:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzetj;->zzc(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
