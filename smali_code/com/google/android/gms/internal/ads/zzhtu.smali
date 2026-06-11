.class public final Lcom/google/android/gms/internal/ads/zzhtu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhla;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzhtu;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhku;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhtu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhtu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhtu;->zza:Lcom/google/android/gms/internal/ads/zzhtu;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhtr;->zza:Lcom/google/android/gms/internal/ads/zzhtr;

    const-class v1, Lcom/google/android/gms/internal/ads/zzhjo;

    const-class v2, Lcom/google/android/gms/internal/ads/zzhbs;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhku;->zzd(Lcom/google/android/gms/internal/ads/zzhkt;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhku;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhtu;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzc()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkd;->zza()Lcom/google/android/gms/internal/ads/zzhkd;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhtu;->zza:Lcom/google/android/gms/internal/ads/zzhtu;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkd;->zzc(Lcom/google/android/gms/internal/ads/zzhla;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkd;->zza()Lcom/google/android/gms/internal/ads/zzhkd;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhtu;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkd;->zzb(Lcom/google/android/gms/internal/ads/zzhku;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/zzhbs;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/zzhbs;

    return-object v0
.end method

.method public final bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzhjj;Lcom/google/android/gms/internal/ads/zzhjr;Lcom/google/android/gms/internal/ads/zzhkz;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhkp;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhkp;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzhjj;->zzd()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    check-cast v2, Lcom/google/android/gms/internal/ads/zzhbk;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzhbk;->zze(I)Lcom/google/android/gms/internal/ads/zzhbi;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhbi;->zzb()Lcom/google/android/gms/internal/ads/zzhbb;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v4, Lcom/google/android/gms/internal/ads/zzhbb;->zza:Lcom/google/android/gms/internal/ads/zzhbb;

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {p3, v2}, Lcom/google/android/gms/internal/ads/zzhkz;->zza(Lcom/google/android/gms/internal/ads/zzhbi;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhbi;->zza()Lcom/google/android/gms/internal/ads/zzhaz;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    instance-of v5, v4, Lcom/google/android/gms/internal/ads/zzhuw;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    check-cast v4, Lcom/google/android/gms/internal/ads/zzhuw;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhuw;->zze()Lcom/google/android/gms/internal/ads/zzhye;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    instance-of v5, v4, Lcom/google/android/gms/internal/ads/zzhjo;

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    check-cast v4, Lcom/google/android/gms/internal/ads/zzhjo;

    .line 58
    .line 59
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhjo;->zzd()Lcom/google/android/gms/internal/ads/zzhye;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :goto_1
    new-instance v5, Lcom/google/android/gms/internal/ads/zzhts;

    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhbi;->zzc()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-direct {v5, v3, v2}, Lcom/google/android/gms/internal/ads/zzhts;-><init>(Lcom/google/android/gms/internal/ads/zzhbs;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzhkp;->zza(Lcom/google/android/gms/internal/ads/zzhye;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhaz;->zza()Lcom/google/android/gms/internal/ads/zzhbp;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/lit8 v0, v0, 0x3b

    .line 99
    .line 100
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    add-int/2addr v0, v1

    .line 107
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const-string v0, "Cannot get output prefix for key of class "

    .line 111
    .line 112
    const-string v1, " with parameters "

    .line 113
    .line 114
    invoke-static {v2, v0, p1, v1, p3}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2

    .line 122
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzhjr;->zza()Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    if-nez p3, :cond_4

    .line 130
    .line 131
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkb;->zza()Lcom/google/android/gms/internal/ads/zzhkb;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzhkb;->zzb()Lcom/google/android/gms/internal/ads/zzhjt;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    const-string v1, "public_key_verify"

    .line 140
    .line 141
    const-string v2, "verify"

    .line 142
    .line 143
    invoke-interface {p3, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzhjt;->zza(Lcom/google/android/gms/internal/ads/zzhjj;Lcom/google/android/gms/internal/ads/zzhjr;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhjs;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_3

    .line 148
    :cond_4
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhjv;->zza:Lcom/google/android/gms/internal/ads/zzhjs;

    .line 149
    .line 150
    :goto_3
    new-instance p2, Lcom/google/android/gms/internal/ads/zzhtt;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhkp;->zzb()Lcom/google/android/gms/internal/ads/zzhkr;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    invoke-direct {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzhtt;-><init>(Lcom/google/android/gms/internal/ads/zzhkr;Lcom/google/android/gms/internal/ads/zzhjs;)V

    .line 157
    .line 158
    .line 159
    return-object p2
.end method
