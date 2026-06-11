.class public final Lcom/google/android/gms/internal/ads/zzgrr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgrq;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgrq;)V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzgqp;->zzb:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgrr;->zza:Lcom/google/android/gms/internal/ads/zzgrq;

    .line 7
    .line 8
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzgqq;)Lcom/google/android/gms/internal/ads/zzgrr;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrr;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgro;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzgro;-><init>(Lcom/google/android/gms/internal/ads/zzgqq;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgrr;-><init>(Lcom/google/android/gms/internal/ads/zzgrq;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static zzb(Ljava/util/regex/Pattern;)Lcom/google/android/gms/internal/ads/zzgrr;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgqv;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgqv;-><init>(Ljava/util/regex/Pattern;)V

    .line 4
    .line 5
    .line 6
    const-string p0, ""

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzgqv;->zza(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/zzgqr;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/google/android/gms/internal/ads/zzgqu;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzgqu;->zza:Ljava/util/regex/Matcher;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    xor-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    const-string v1, "The pattern may not match the empty string: %s"

    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzgrc;->zzf(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lcom/google/android/gms/internal/ads/zzgrr;

    .line 28
    .line 29
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgrm;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzgrm;-><init>(Lcom/google/android/gms/internal/ads/zzgqs;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzgrr;-><init>(Lcom/google/android/gms/internal/ads/zzgrq;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static zzc(I)Lcom/google/android/gms/internal/ads/zzgrr;
    .locals 2

    .line 1
    new-instance p0, Lcom/google/android/gms/internal/ads/zzgrr;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrn;

    .line 4
    .line 5
    const/16 v1, 0xfa0

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgrn;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzgrr;-><init>(Lcom/google/android/gms/internal/ads/zzgrq;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method private final zzg(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgrr;->zza:Lcom/google/android/gms/internal/ads/zzgrq;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgrq;->zza(Lcom/google/android/gms/internal/ads/zzgrr;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method


# virtual methods
.method public final zzd(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrl;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgrl;-><init>(Lcom/google/android/gms/internal/ads/zzgrr;Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final zze(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgrr;->zzg(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final synthetic zzf(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgrr;->zzg(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
