.class public final Lcom/google/android/gms/internal/ads/zzemu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzekm;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdmq;

.field private final zzc:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdmq;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemu;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzemu;->zzb:Lcom/google/android/gms/internal/ads/zzdmq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzemu;->zzc:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private static final zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzekj;)V
    .locals 9

    .line 1
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzekj;->zzb:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfki;

    .line 5
    .line 6
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 9
    .line 10
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzv:Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzm(Lcom/google/android/gms/internal/ads/zzfiw;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzemu;->zza:Landroid/content/Context;

    .line 23
    .line 24
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzekj;->zzc:Lcom/google/android/gms/internal/ads/zzdcp;

    .line 25
    .line 26
    move-object v6, p2

    .line 27
    check-cast v6, Lcom/google/android/gms/internal/ads/zzbtz;

    .line 28
    .line 29
    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzj:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 30
    .line 31
    iget-object v8, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 34
    .line 35
    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzfki;->zzo(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbtz;Lcom/google/android/gms/internal/ads/zzbkh;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzekj;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzekj;->zzb:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfki;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfki;->zzD()Lcom/google/android/gms/internal/ads/zzbue;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfki;->zzE()Lcom/google/android/gms/internal/ads/zzbuf;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfki;->zzu()Lcom/google/android/gms/internal/ads/zzbui;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x6

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzemu;->zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzdoh;->zzaf(Lcom/google/android/gms/internal/ads/zzbui;)Lcom/google/android/gms/internal/ads/zzdoh;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzemu;->zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzai(Lcom/google/android/gms/internal/ads/zzbue;)Lcom/google/android/gms/internal/ads/zzdoh;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const/4 v6, 0x2

    .line 48
    invoke-static {p1, v6}, Lcom/google/android/gms/internal/ads/zzemu;->zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzah(Lcom/google/android/gms/internal/ads/zzbue;)Lcom/google/android/gms/internal/ads/zzdoh;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzemu;->zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzaj(Lcom/google/android/gms/internal/ads/zzbuf;)Lcom/google/android/gms/internal/ads/zzdoh;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzemu;->zzc(Lcom/google/android/gms/internal/ads/zzfjc;I)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_5

    .line 79
    .line 80
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzag(Lcom/google/android/gms/internal/ads/zzbuf;)Lcom/google/android/gms/internal/ads/zzdoh;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_0
    if-eqz v5, :cond_4

    .line 85
    .line 86
    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 87
    .line 88
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 89
    .line 90
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdoh;->zzx()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzemu;->zzb:Lcom/google/android/gms/internal/ads/zzdmq;

    .line 107
    .line 108
    iget-object v6, p3, Lcom/google/android/gms/internal/ads/zzekj;->zza:Ljava/lang/String;

    .line 109
    .line 110
    new-instance v7, Lcom/google/android/gms/internal/ads/zzcwv;

    .line 111
    .line 112
    invoke-direct {v7, p1, p2, v6}, Lcom/google/android/gms/internal/ads/zzcwv;-><init>(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdos;

    .line 116
    .line 117
    invoke-direct {p1, v5}, Lcom/google/android/gms/internal/ads/zzdos;-><init>(Lcom/google/android/gms/internal/ads/zzdoh;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdql;

    .line 121
    .line 122
    invoke-direct {p2, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzdql;-><init>(Lcom/google/android/gms/internal/ads/zzbuf;Lcom/google/android/gms/internal/ads/zzbue;Lcom/google/android/gms/internal/ads/zzbui;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v7, p1, p2}, Lcom/google/android/gms/internal/ads/zzdmq;->zze(Lcom/google/android/gms/internal/ads/zzcwv;Lcom/google/android/gms/internal/ads/zzdos;Lcom/google/android/gms/internal/ads/zzdql;)Lcom/google/android/gms/internal/ads/zzdoj;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzekj;->zzc:Lcom/google/android/gms/internal/ads/zzdcp;

    .line 130
    .line 131
    check-cast p2, Lcom/google/android/gms/internal/ads/zzelv;

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcwg;->zzf()Lcom/google/android/gms/internal/ads/zzepk;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzelv;->zzc(Lcom/google/android/gms/internal/ads/zzbtz;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcwg;->zza()Lcom/google/android/gms/internal/ads/zzdce;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    new-instance p3, Lcom/google/android/gms/internal/ads/zzcrl;

    .line 145
    .line 146
    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/ads/zzcrl;-><init>(Lcom/google/android/gms/internal/ads/zzfki;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzemu;->zzc:Ljava/util/concurrent/Executor;

    .line 150
    .line 151
    invoke-virtual {p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzdhd;->zzq(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdok;->zzh()Lcom/google/android/gms/internal/ads/zzdoc;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 160
    .line 161
    const-string p2, "No corresponding native ad listener"

    .line 162
    .line 163
    invoke-direct {p1, v4, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 168
    .line 169
    const-string p2, "No native ad mappers"

    .line 170
    .line 171
    invoke-direct {p1, v4, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1
.end method
