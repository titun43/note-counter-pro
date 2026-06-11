.class public final Lcom/google/android/gms/internal/ads/zzbgj$zzz;
.super Lcom/google/android/gms/internal/ads/zzibr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbgj$zzaa;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzibr<",
        "Lcom/google/android/gms/internal/ads/zzbgj$zzz;",
        "Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbgj$zzaa;"
    }
.end annotation


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field public static final zzc:I = 0x3

.field public static final zzd:I = 0x4

.field private static final zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

.field private static volatile zzk:Lcom/google/android/gms/internal/ads/zzidk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzidk<",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

.field private zzg:Lcom/google/android/gms/internal/ads/zzicd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzicd<",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzan;",
            ">;"
        }
    .end annotation
.end field

.field private zzh:I

.field private zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbu(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibr;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbM()Lcom/google/android/gms/internal/ads/zzicd;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 9
    .line 10
    return-void
.end method

.method public static zzA()Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    return-object v0
.end method

.method public static zzB()Lcom/google/android/gms/internal/ads/zzidk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/zzidk<",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzz;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbd()Lcom/google/android/gms/internal/ads/zzidk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic zzQ()Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    return-object v0
.end method

.method private zzR(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 11
    .line 12
    return-void
.end method

.method private zzS(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzv;->zzz()Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzv;->zzy(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)Lcom/google/android/gms/internal/ads/zzbgj$zzv$zza;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbo(Lcom/google/android/gms/internal/ads/zzibr;)Lcom/google/android/gms/internal/ads/zzibl;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbl()Lcom/google/android/gms/internal/ads/zzibr;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 26
    .line 27
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 28
    .line 29
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 34
    .line 35
    return-void
.end method

.method private zzT()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    return-void
.end method

.method private zzU()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzicd;->zza()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbN(Lcom/google/android/gms/internal/ads/zzicd;)Lcom/google/android/gms/internal/ads/zzicd;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private zzV(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzU()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private zzW(Lcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzU()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private zzX(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzU()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private zzY(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzan;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzU()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzhzw;->zzaW(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private zzZ()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbM()Lcom/google/android/gms/internal/ads/zzicd;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 6
    .line 7
    return-void
.end method

.method private zzaa(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzU()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private zzab(Lcom/google/android/gms/internal/ads/zzbgj$zzq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzq;->zza()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzh:I

    .line 6
    .line 7
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 12
    .line 13
    return-void
.end method

.method private zzac()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzh:I

    return-void
.end method

.method private zzad(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 11
    .line 12
    return-void
.end method

.method private zzae(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzap;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzap;->zzr(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)Lcom/google/android/gms/internal/ads/zzbgj$zzap$zza;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbo(Lcom/google/android/gms/internal/ads/zzibr;)Lcom/google/android/gms/internal/ads/zzibl;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbl()Lcom/google/android/gms/internal/ads/zzibr;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 26
    .line 27
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 28
    .line 29
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x4

    .line 32
    .line 33
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    .line 34
    .line 35
    return-void
.end method

.method private zzaf()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    return-void
.end method

.method public static zze(Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbR(Lcom/google/android/gms/internal/ads/zzibr;Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzj(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbQ(Lcom/google/android/gms/internal/ads/zzibr;Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzk(Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbS(Lcom/google/android/gms/internal/ads/zzibr;Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzl(Lcom/google/android/gms/internal/ads/zzian;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbT(Lcom/google/android/gms/internal/ads/zzibr;Lcom/google/android/gms/internal/ads/zzian;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzm([B)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbU(Lcom/google/android/gms/internal/ads/zzibr;[B)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzn([BLcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbV(Lcom/google/android/gms/internal/ads/zzibr;[BLcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzo(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbW(Lcom/google/android/gms/internal/ads/zzibr;Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzp(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbX(Lcom/google/android/gms/internal/ads/zzibr;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzq(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzca(Lcom/google/android/gms/internal/ads/zzibr;Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzr(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzcb(Lcom/google/android/gms/internal/ads/zzibr;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzu(Lcom/google/android/gms/internal/ads/zziaq;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbY(Lcom/google/android/gms/internal/ads/zzibr;Lcom/google/android/gms/internal/ads/zziaq;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzv(Lcom/google/android/gms/internal/ads/zziaq;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzbgj$zzz;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbZ(Lcom/google/android/gms/internal/ads/zzibr;Lcom/google/android/gms/internal/ads/zziaq;Lcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zzy()Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbn()Lcom/google/android/gms/internal/ads/zzibl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;

    .line 8
    .line 9
    return-object v0
.end method

.method public static zzz(Lcom/google/android/gms/internal/ads/zzbgj$zzz;)Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbo(Lcom/google/android/gms/internal/ads/zzibr;)Lcom/google/android/gms/internal/ads/zzibl;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final synthetic zzC(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzR(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V

    return-void
.end method

.method public final synthetic zzD(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzS(Lcom/google/android/gms/internal/ads/zzbgj$zzv;)V

    return-void
.end method

.method public final synthetic zzE()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzT()V

    return-void
.end method

.method public final synthetic zzF(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzV(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V

    return-void
.end method

.method public final synthetic zzG(Lcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzW(Lcom/google/android/gms/internal/ads/zzbgj$zzan;)V

    return-void
.end method

.method public final synthetic zzH(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzX(ILcom/google/android/gms/internal/ads/zzbgj$zzan;)V

    return-void
.end method

.method public final synthetic zzI(Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzY(Ljava/lang/Iterable;)V

    return-void
.end method

.method public final synthetic zzJ()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzZ()V

    return-void
.end method

.method public final synthetic zzK(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzaa(I)V

    return-void
.end method

.method public final synthetic zzL(Lcom/google/android/gms/internal/ads/zzbgj$zzq;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzab(Lcom/google/android/gms/internal/ads/zzbgj$zzq;)V

    return-void
.end method

.method public final synthetic zzM()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzac()V

    return-void
.end method

.method public final synthetic zzN(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzad(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V

    return-void
.end method

.method public final synthetic zzO(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzae(Lcom/google/android/gms/internal/ads/zzbgj$zzap;)V

    return-void
.end method

.method public final synthetic zzP()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzaf()V

    return-void
.end method

.method public zza()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzb()Lcom/google/android/gms/internal/ads/zzbgj$zzv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzf:Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzv;->zzz()Lcom/google/android/gms/internal/ads/zzbgj$zzv;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public zzc()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzao;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    return-object v0
.end method

.method public zzd(I)Lcom/google/android/gms/internal/ads/zzbgj$zzao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbgj$zzao;

    .line 8
    .line 9
    return-object p1
.end method

.method public final zzdc(Lcom/google/android/gms/internal/ads/zzibq;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    if-eq p1, p2, :cond_6

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    if-eq p1, p2, :cond_5

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    const/4 p3, 0x0

    .line 15
    if-eq p1, p2, :cond_4

    .line 16
    .line 17
    const/4 p2, 0x5

    .line 18
    if-eq p1, p2, :cond_3

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzk:Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-class p2, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 28
    .line 29
    monitor-enter p2

    .line 30
    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzk:Lcom/google/android/gms/internal/ads/zzidk;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibm;

    .line 35
    .line 36
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 37
    .line 38
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 39
    .line 40
    .line 41
    sput-object p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzk:Lcom/google/android/gms/internal/ads/zzidk;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    monitor-exit p2

    .line 48
    return-object p1

    .line 49
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p1

    .line 51
    :cond_1
    return-object p1

    .line 52
    :cond_2
    throw p3

    .line 53
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;

    .line 57
    .line 58
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbgj$zzz$zza;-><init>([B)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 63
    .line 64
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzz;-><init>()V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_6
    const-string v0, "zze"

    .line 69
    .line 70
    const-string v1, "zzf"

    .line 71
    .line 72
    const-string v2, "zzg"

    .line 73
    .line 74
    const-class v3, Lcom/google/android/gms/internal/ads/zzbgj$zzan;

    .line 75
    .line 76
    const-string v4, "zzh"

    .line 77
    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzq;->zze()Lcom/google/android/gms/internal/ads/zzibx;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const-string v6, "zzi"

    .line 83
    .line 84
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzj:Lcom/google/android/gms/internal/ads/zzbgj$zzz;

    .line 89
    .line 90
    const-string p3, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u180c\u0001\u0004\u1009\u0002"

    .line 91
    .line 92
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbv(Lcom/google/android/gms/internal/ads/zzidc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_7
    const/4 p1, 0x1

    .line 98
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
.end method

.method public zzg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzbgj$zzan;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    return-object v0
.end method

.method public zzh()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public zzi(I)Lcom/google/android/gms/internal/ads/zzbgj$zzan;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzg:Lcom/google/android/gms/internal/ads/zzicd;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbgj$zzan;

    .line 8
    .line 9
    return-object p1
.end method

.method public zzs()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzt()Lcom/google/android/gms/internal/ads/zzbgj$zzq;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzh:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzq;->zzc(I)Lcom/google/android/gms/internal/ads/zzbgj$zzq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzq;->zza:Lcom/google/android/gms/internal/ads/zzbgj$zzq;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public zzw()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzx()Lcom/google/android/gms/internal/ads/zzbgj$zzap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgj$zzz;->zzi:Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzap;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method
