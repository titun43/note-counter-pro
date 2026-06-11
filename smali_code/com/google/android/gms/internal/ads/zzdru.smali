.class public final Lcom/google/android/gms/internal/ads/zzdru;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/concurrent/Executor;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdrp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdxt;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzdrp;Lcom/google/android/gms/internal/ads/zzdxt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdru;->zza:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdru;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdru;->zzc:Lcom/google/android/gms/internal/ads/zzdxt;

    return-void
.end method


# virtual methods
.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;)Lj3/a;
    .locals 7

    .line 1
    const-string p2, "custom_assets"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zzcR:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 17
    .line 18
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdru;->zzc:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdxh;->zzaj:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lx2/c;

    .line 51
    .line 52
    invoke-static {v1, p2, v0}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_0
    if-ge v1, v0, :cond_6

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v3, 0x0

    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const-string v4, "name"

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const-string v5, "type"

    .line 93
    .line 94
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-string v6, "string"

    .line 99
    .line 100
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    new-instance v3, Lcom/google/android/gms/internal/ads/zzdrr;

    .line 107
    .line 108
    const-string v5, "string_value"

    .line 109
    .line 110
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-direct {v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzdrr;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const-string v6, "image"

    .line 123
    .line 124
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdru;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    .line 131
    .line 132
    const-string v6, "image_value"

    .line 133
    .line 134
    invoke-virtual {v5, v2, v6, v3}, Lcom/google/android/gms/internal/ads/zzdrp;->zza(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    new-instance v3, Lcom/google/android/gms/internal/ads/zzdrs;

    .line 139
    .line 140
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzdrs;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdru;->zza:Ljava/util/concurrent/Executor;

    .line 144
    .line 145
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    goto :goto_1

    .line 150
    :cond_5
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    :goto_1
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_6
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzm(Ljava/lang/Iterable;)Lj3/a;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdru;->zza:Ljava/util/concurrent/Executor;

    .line 165
    .line 166
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdrt;->zza:Lcom/google/android/gms/internal/ads/zzdrt;

    .line 167
    .line 168
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1
.end method
