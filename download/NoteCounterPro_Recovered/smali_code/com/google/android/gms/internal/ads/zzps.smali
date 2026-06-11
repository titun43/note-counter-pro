.class public final Lcom/google/android/gms/internal/ads/zzps;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzps;

.field static final zzb:Lcom/google/android/gms/internal/ads/zzgui;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzguf;


# instance fields
.field private final zzd:Landroid/util/SparseArray;

.field private final zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzps;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpr;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzps;-><init>(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/android/gms/internal/ads/zzps;->zza:Lcom/google/android/gms/internal/ads/zzps;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzguf;->zzl(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/google/android/gms/internal/ads/zzps;->zzc:Lcom/google/android/gms/internal/ads/zzguf;

    .line 34
    .line 35
    new-instance v0, Lcom/google/android/gms/internal/ads/zzguh;

    .line 36
    .line 37
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzguh;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x11

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 58
    .line 59
    .line 60
    const/16 v1, 0x1e

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/16 v3, 0xa

    .line 67
    .line 68
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x12

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x8

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 94
    .line 95
    .line 96
    const/16 v2, 0xe

    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzguh;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguh;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzguh;->zzc()Lcom/google/android/gms/internal/ads/zzgui;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sput-object v0, Lcom/google/android/gms/internal/ads/zzps;->zzb:Lcom/google/android/gms/internal/ads/zzgui;

    .line 110
    .line 111
    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/android/gms/internal/ads/zzpr;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 26
    .line 27
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzpr;->zzb:I

    .line 28
    .line 29
    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p1, v0

    .line 36
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ge v0, v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/google/android/gms/internal/ads/zzpr;

    .line 51
    .line 52
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzpr;->zzc:I

    .line 53
    .line 54
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzps;->zze:I

    .line 62
    .line 63
    return-void
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzps;->zzb(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static zzb(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/16 v3, 0x21

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    if-lt p3, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {v2, p3}, Landroidx/activity/t;->t(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_2

    .line 34
    .line 35
    :cond_1
    move-object p3, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    check-cast p3, Landroid/media/AudioDeviceInfo;

    .line 42
    .line 43
    :goto_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v6, 0xc

    .line 46
    .line 47
    const/4 v7, 0x1

    .line 48
    if-lt v5, v3, :cond_a

    .line 49
    .line 50
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfj;->zzM(Landroid/content/Context;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfj;->zzN(Landroid/content/Context;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_a

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {v2, p0}, Landroidx/activity/t;->n(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, Lcom/google/android/gms/internal/ads/zzps;

    .line 71
    .line 72
    new-instance p2, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance p3, Ljava/util/HashSet;

    .line 78
    .line 79
    filled-new-array {v6}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgxz;->zzg([I)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-ge v4, p3, :cond_8

    .line 98
    .line 99
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/g;->h(Ljava/lang/Object;)Landroid/media/AudioProfile;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/g;->c(Landroid/media/AudioProfile;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-ne v0, v7, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/g;->B(Landroid/media/AudioProfile;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzA(I)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_5

    .line 123
    .line 124
    sget-object v1, Lcom/google/android/gms/internal/ads/zzps;->zzb:Lcom/google/android/gms/internal/ads/zzgui;

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzgui;->containsKey(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/util/Set;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/g;->A(Landroid/media/AudioProfile;)[I

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzgxz;->zzg([I)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-interface {v0, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_6
    new-instance v1, Ljava/util/HashSet;

    .line 168
    .line 169
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/g;->A(Landroid/media/AudioProfile;)[I

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzgxz;->zzg([I)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    invoke-direct {v1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    sget p0, Lcom/google/android/gms/internal/ads/zzguf;->zzd:I

    .line 187
    .line 188
    new-instance p0, Lcom/google/android/gms/internal/ads/zzguc;

    .line 189
    .line 190
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzguc;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result p3

    .line 205
    if-eqz p3, :cond_9

    .line 206
    .line 207
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p3

    .line 211
    check-cast p3, Ljava/util/Map$Entry;

    .line 212
    .line 213
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpr;

    .line 214
    .line 215
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    check-cast p3, Ljava/util/Set;

    .line 230
    .line 231
    invoke-direct {v0, v1, p3}, Lcom/google/android/gms/internal/ads/zzpr;-><init>(ILjava/util/Set;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzguc;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzguc;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzps;-><init>(Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    return-object p1

    .line 246
    :cond_a
    if-nez p3, :cond_b

    .line 247
    .line 248
    invoke-virtual {v2, v0}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 249
    .line 250
    .line 251
    move-result-object p3

    .line 252
    goto :goto_4

    .line 253
    :cond_b
    new-array v0, v7, [Landroid/media/AudioDeviceInfo;

    .line 254
    .line 255
    aput-object p3, v0, v4

    .line 256
    .line 257
    move-object p3, v0

    .line 258
    :goto_4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzguo;

    .line 259
    .line 260
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzguo;-><init>()V

    .line 261
    .line 262
    .line 263
    const/16 v2, 0x8

    .line 264
    .line 265
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const/4 v8, 0x7

    .line 270
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    filled-new-array {v2, v8}, [Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzguo;->zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 279
    .line 280
    .line 281
    const/16 v2, 0x1f

    .line 282
    .line 283
    if-lt v5, v2, :cond_c

    .line 284
    .line 285
    const/16 v2, 0x1a

    .line 286
    .line 287
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    const/16 v8, 0x1b

    .line 292
    .line 293
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    filled-new-array {v2, v8}, [Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzguo;->zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 302
    .line 303
    .line 304
    :cond_c
    if-lt v5, v3, :cond_d

    .line 305
    .line 306
    const/16 v2, 0x1e

    .line 307
    .line 308
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzguo;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 313
    .line 314
    .line 315
    :cond_d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzguo;->zzi()Lcom/google/android/gms/internal/ads/zzgup;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    array-length v2, p3

    .line 320
    move v3, v4

    .line 321
    :goto_5
    if-ge v3, v2, :cond_f

    .line 322
    .line 323
    aget-object v5, p3, v3

    .line 324
    .line 325
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzgub;->contains(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-eqz v5, :cond_e

    .line 338
    .line 339
    sget-object p0, Lcom/google/android/gms/internal/ads/zzps;->zza:Lcom/google/android/gms/internal/ads/zzps;

    .line 340
    .line 341
    return-object p0

    .line 342
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_f
    new-instance p3, Lcom/google/android/gms/internal/ads/zzguo;

    .line 346
    .line 347
    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzguo;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/ads/zzguo;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 351
    .line 352
    .line 353
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 354
    .line 355
    const/16 v2, 0x1d

    .line 356
    .line 357
    const/16 v3, 0xa

    .line 358
    .line 359
    if-lt v0, v2, :cond_13

    .line 360
    .line 361
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfj;->zzM(Landroid/content/Context;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-nez v0, :cond_10

    .line 366
    .line 367
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfj;->zzN(Landroid/content/Context;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_13

    .line 372
    .line 373
    :cond_10
    sget p0, Lcom/google/android/gms/internal/ads/zzguf;->zzd:I

    .line 374
    .line 375
    new-instance p0, Lcom/google/android/gms/internal/ads/zzguc;

    .line 376
    .line 377
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzguc;-><init>()V

    .line 378
    .line 379
    .line 380
    sget-object p1, Lcom/google/android/gms/internal/ads/zzps;->zzb:Lcom/google/android/gms/internal/ads/zzgui;

    .line 381
    .line 382
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgui;->zzf()Lcom/google/android/gms/internal/ads/zzgup;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgup;->zza()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    :cond_11
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_12

    .line 395
    .line 396
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Ljava/lang/Integer;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzC(I)I

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 411
    .line 412
    if-lt v5, v4, :cond_11

    .line 413
    .line 414
    new-instance v4, Landroid/media/AudioFormat$Builder;

    .line 415
    .line 416
    invoke-direct {v4}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v6}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-virtual {v4, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const v4, 0xbb80

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-virtual {v2}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-static {v2, v4}, Landroidx/lifecycle/g0;->r(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-eqz v2, :cond_11

    .line 447
    .line 448
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzguc;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 449
    .line 450
    .line 451
    goto :goto_6

    .line 452
    :cond_12
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzguc;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 453
    .line 454
    .line 455
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzguc;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzguo;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 460
    .line 461
    .line 462
    new-instance p0, Lcom/google/android/gms/internal/ads/zzps;

    .line 463
    .line 464
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzguo;->zzi()Lcom/google/android/gms/internal/ads/zzgup;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgxz;->zzf(Ljava/util/Collection;)[I

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-static {p1, v3}, Lcom/google/android/gms/internal/ads/zzps;->zzf([II)Lcom/google/android/gms/internal/ads/zzguf;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzps;-><init>(Ljava/util/List;)V

    .line 477
    .line 478
    .line 479
    return-object p0

    .line 480
    :cond_13
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    const-string p2, "use_external_surround_sound_flag"

    .line 485
    .line 486
    invoke-static {p0, p2, v4}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 487
    .line 488
    .line 489
    move-result p2

    .line 490
    if-ne p2, v7, :cond_14

    .line 491
    .line 492
    move p2, v7

    .line 493
    goto :goto_7

    .line 494
    :cond_14
    move p2, v4

    .line 495
    :goto_7
    if-nez p2, :cond_15

    .line 496
    .line 497
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzps;->zze()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_16

    .line 502
    .line 503
    :cond_15
    const-string v0, "external_surround_sound_enabled"

    .line 504
    .line 505
    invoke-static {p0, v0, v4}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    if-ne p0, v7, :cond_16

    .line 510
    .line 511
    sget-object p0, Lcom/google/android/gms/internal/ads/zzps;->zzc:Lcom/google/android/gms/internal/ads/zzguf;

    .line 512
    .line 513
    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzguo;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 514
    .line 515
    .line 516
    :cond_16
    if-eqz p1, :cond_18

    .line 517
    .line 518
    if-nez p2, :cond_18

    .line 519
    .line 520
    const-string p0, "android.media.extra.AUDIO_PLUG_STATE"

    .line 521
    .line 522
    invoke-virtual {p1, p0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 523
    .line 524
    .line 525
    move-result p0

    .line 526
    if-ne p0, v7, :cond_18

    .line 527
    .line 528
    const-string p0, "android.media.extra.ENCODINGS"

    .line 529
    .line 530
    invoke-virtual {p1, p0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    if-eqz p0, :cond_17

    .line 535
    .line 536
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgxz;->zzg([I)Ljava/util/List;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzguo;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzguo;

    .line 541
    .line 542
    .line 543
    :cond_17
    new-instance p0, Lcom/google/android/gms/internal/ads/zzps;

    .line 544
    .line 545
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzguo;->zzi()Lcom/google/android/gms/internal/ads/zzgup;

    .line 546
    .line 547
    .line 548
    move-result-object p2

    .line 549
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgxz;->zzf(Ljava/util/Collection;)[I

    .line 550
    .line 551
    .line 552
    move-result-object p2

    .line 553
    const-string p3, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 554
    .line 555
    invoke-virtual {p1, p3, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 556
    .line 557
    .line 558
    move-result p1

    .line 559
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzps;->zzf([II)Lcom/google/android/gms/internal/ads/zzguf;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzps;-><init>(Ljava/util/List;)V

    .line 564
    .line 565
    .line 566
    return-object p0

    .line 567
    :cond_18
    new-instance p0, Lcom/google/android/gms/internal/ads/zzps;

    .line 568
    .line 569
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzguo;->zzi()Lcom/google/android/gms/internal/ads/zzgup;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgxz;->zzf(Ljava/util/Collection;)[I

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-static {p1, v3}, Lcom/google/android/gms/internal/ads/zzps;->zzf([II)Lcom/google/android/gms/internal/ads/zzguf;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzps;-><init>(Ljava/util/List;)V

    .line 582
    .line 583
    .line 584
    return-object p0
.end method

.method public static zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzps;->zze()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "external_surround_sound_enabled"

    .line 8
    .line 9
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private static zze()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "Amazon"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "Xiaomi"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method

.method private static zzf([II)Lcom/google/android/gms/internal/ads/zzguf;
    .locals 4

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzguf;->zzd:I

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzguc;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzguc;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-array p0, v1, [I

    .line 12
    .line 13
    :cond_0
    :goto_0
    array-length v2, p0

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    aget v2, p0, v1

    .line 17
    .line 18
    new-instance v3, Lcom/google/android/gms/internal/ads/zzpr;

    .line 19
    .line 20
    invoke-direct {v3, v2, p1}, Lcom/google/android/gms/internal/ads/zzpr;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzguc;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzguc;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzps;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzps;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 13
    .line 14
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 15
    .line 16
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 17
    .line 18
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v4, 0x1f

    .line 21
    .line 22
    if-lt v3, v4, :cond_2

    .line 23
    .line 24
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/g;->z(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-ne v3, v4, :cond_4

    .line 40
    .line 41
    move v4, v1

    .line 42
    :goto_0
    if-ge v4, v3, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzps;->zze:I

    .line 66
    .line 67
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzps;->zze:I

    .line 68
    .line 69
    if-ne v0, p1, :cond_4

    .line 70
    .line 71
    :goto_2
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_4
    :goto_3
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/g;->d(Landroid/util/SparseArray;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    const/16 v3, 0x11

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v0, v4, :cond_1

    .line 24
    .line 25
    mul-int/lit8 v3, v3, 0x1f

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/2addr v4, v3

    .line 32
    mul-int/2addr v4, v2

    .line 33
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/2addr v3, v4

    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v0, v3

    .line 46
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zze:I

    .line 47
    .line 48
    mul-int/2addr v0, v2

    .line 49
    add-int/2addr v0, v1

    .line 50
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zze:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/lit8 v2, v2, 0x32

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const-string v2, "AudioCapabilities[maxChannelCount="

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", audioProfiles="

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "]"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzas;->zzg(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sget-object v2, Lcom/google/android/gms/internal/ads/zzps;->zzb:Lcom/google/android/gms/internal/ads/zzgui;

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgui;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    const/4 v2, 0x7

    .line 27
    const/16 v3, 0x8

    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    const/16 v5, 0x12

    .line 31
    .line 32
    if-ne v1, v5, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zza(Landroid/util/SparseArray;I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    move v1, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move v1, v5

    .line 45
    :cond_2
    if-ne v1, v3, :cond_4

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 48
    .line 49
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zza(Landroid/util/SparseArray;I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    move v1, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    move v1, v2

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_1
    const/16 v6, 0x1e

    .line 60
    .line 61
    if-ne v1, v6, :cond_5

    .line 62
    .line 63
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 64
    .line 65
    invoke-static {v7, v6}, Lcom/google/android/gms/internal/ads/zzfj;->zza(Landroid/util/SparseArray;I)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzps;->zzd:Landroid/util/SparseArray;

    .line 73
    .line 74
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/ads/zzfj;->zza(Landroid/util/SparseArray;I)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_f

    .line 79
    .line 80
    invoke-virtual {v6, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Lcom/google/android/gms/internal/ads/zzpr;

    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget v7, p1, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 90
    .line 91
    const/4 v8, -0x1

    .line 92
    if-eq v7, v8, :cond_8

    .line 93
    .line 94
    if-ne v1, v5, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    const-string p1, "audio/vnd.dts.uhd;profile=p2"

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    const/16 p2, 0x21

    .line 108
    .line 109
    if-ge p1, p2, :cond_7

    .line 110
    .line 111
    const/16 p1, 0xa

    .line 112
    .line 113
    if-le v7, p1, :cond_a

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_7
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzpr;->zza(I)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_a

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    :goto_3
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 124
    .line 125
    if-ne p1, v8, :cond_9

    .line 126
    .line 127
    const p1, 0xbb80

    .line 128
    .line 129
    .line 130
    :cond_9
    invoke-virtual {v6, p1, p2}, Lcom/google/android/gms/internal/ads/zzpr;->zzb(ILcom/google/android/gms/internal/ads/zzd;)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    :cond_a
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    const/16 p2, 0x1c

    .line 137
    .line 138
    if-gt p1, p2, :cond_d

    .line 139
    .line 140
    if-ne v7, v2, :cond_b

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    const/4 p2, 0x3

    .line 144
    if-eq v7, p2, :cond_c

    .line 145
    .line 146
    const/4 p2, 0x4

    .line 147
    if-eq v7, p2, :cond_c

    .line 148
    .line 149
    const/4 p2, 0x5

    .line 150
    if-ne v7, p2, :cond_d

    .line 151
    .line 152
    :cond_c
    move v3, v4

    .line 153
    goto :goto_4

    .line 154
    :cond_d
    move v3, v7

    .line 155
    :goto_4
    const/16 p2, 0x1a

    .line 156
    .line 157
    if-gt p1, p2, :cond_e

    .line 158
    .line 159
    const-string p1, "fugu"

    .line 160
    .line 161
    sget-object p2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_e

    .line 168
    .line 169
    const/4 p1, 0x1

    .line 170
    if-ne v3, p1, :cond_e

    .line 171
    .line 172
    const/4 v3, 0x2

    .line 173
    :cond_e
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzB(I)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_f

    .line 178
    .line 179
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    return-object p1

    .line 192
    :cond_f
    :goto_5
    const/4 p1, 0x0

    .line 193
    return-object p1
.end method
