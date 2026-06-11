.class public final Lcom/google/android/gms/internal/ads/zzfjj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/ads/internal/client/zzm;

.field private zzb:Lcom/google/android/gms/ads/internal/client/zzr;

.field private zzc:Ljava/lang/String;

.field private zzd:Lcom/google/android/gms/ads/internal/client/zzga;

.field private zze:Z

.field private zzf:Ljava/util/ArrayList;

.field private zzg:Ljava/util/ArrayList;

.field private zzh:Lcom/google/android/gms/internal/ads/zzbkh;

.field private zzi:Lcom/google/android/gms/ads/internal/client/zzx;

.field private zzj:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

.field private zzk:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

.field private zzl:Lcom/google/android/gms/ads/internal/client/zzco;

.field private zzm:I

.field private zzn:Lcom/google/android/gms/internal/ads/zzbqs;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzfix;

.field private zzp:Z

.field private zzq:Z

.field private zzr:Lcom/google/android/gms/internal/ads/zzerp;

.field private zzs:Z

.field private zzt:Landroid/os/Bundle;

.field private final zzu:Ljava/util/concurrent/atomic/AtomicLong;

.field private zzv:Z

.field private zzw:Lcom/google/android/gms/ads/internal/client/zzcs;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzm:I

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfix;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfix;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzo:Lcom/google/android/gms/internal/ads/zzfix;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzp:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzq:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzs:Z

    .line 20
    .line 21
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzv:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final zzA()Lcom/google/android/gms/internal/ads/zzfjk;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "ad unit must not be null"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzb:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 9
    .line 10
    const-string v1, "ad size must not be null"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 16
    .line 17
    const-string v1, "ad request must not be null"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfjk;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzfjk;-><init>(Lcom/google/android/gms/internal/ads/zzfjj;[B)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final zzB()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzp:Z

    return v0
.end method

.method public final zzC()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzq:Z

    return v0
.end method

.method public final synthetic zzD()Lcom/google/android/gms/ads/internal/client/zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    return-object v0
.end method

.method public final synthetic zzE()Lcom/google/android/gms/ads/internal/client/zzr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzb:Lcom/google/android/gms/ads/internal/client/zzr;

    return-object v0
.end method

.method public final synthetic zzF()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic zzG()Lcom/google/android/gms/ads/internal/client/zzga;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzd:Lcom/google/android/gms/ads/internal/client/zzga;

    return-object v0
.end method

.method public final synthetic zzH()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zze:Z

    return v0
.end method

.method public final synthetic zzI()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzf:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic zzJ()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzg:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic zzK()Lcom/google/android/gms/internal/ads/zzbkh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    return-object v0
.end method

.method public final synthetic zzL()Lcom/google/android/gms/ads/internal/client/zzx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzi:Lcom/google/android/gms/ads/internal/client/zzx;

    return-object v0
.end method

.method public final synthetic zzM()Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzj:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    return-object v0
.end method

.method public final synthetic zzN()Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzk:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    return-object v0
.end method

.method public final synthetic zzO()Lcom/google/android/gms/ads/internal/client/zzco;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzl:Lcom/google/android/gms/ads/internal/client/zzco;

    return-object v0
.end method

.method public final synthetic zzP()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzm:I

    return v0
.end method

.method public final synthetic zzQ()Lcom/google/android/gms/internal/ads/zzbqs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzn:Lcom/google/android/gms/internal/ads/zzbqs;

    return-object v0
.end method

.method public final synthetic zzR()Lcom/google/android/gms/internal/ads/zzfix;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzo:Lcom/google/android/gms/internal/ads/zzfix;

    return-object v0
.end method

.method public final synthetic zzS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzp:Z

    return v0
.end method

.method public final synthetic zzT()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzq:Z

    return v0
.end method

.method public final synthetic zzU()Lcom/google/android/gms/internal/ads/zzerp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzr:Lcom/google/android/gms/internal/ads/zzerp;

    return-object v0
.end method

.method public final synthetic zzV()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzs:Z

    return v0
.end method

.method public final synthetic zzW()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzt:Landroid/os/Bundle;

    return-object v0
.end method

.method public final synthetic zzX()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method public final synthetic zzY()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzv:Z

    return v0
.end method

.method public final zzZ(Lcom/google/android/gms/ads/internal/client/zzcs;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzw:Lcom/google/android/gms/ads/internal/client/zzcs;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    return-object p0
.end method

.method public final synthetic zzaa()Lcom/google/android/gms/ads/internal/client/zzcs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzw:Lcom/google/android/gms/ads/internal/client/zzcs;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/ads/internal/client/zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/client/zzr;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzb:Lcom/google/android/gms/ads/internal/client/zzr;

    return-object p0
.end method

.method public final zzd(Z)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzp:Z

    return-object p0
.end method

.method public final zze(Z)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzq:Z

    return-object p0
.end method

.method public final zzf()Lcom/google/android/gms/ads/internal/client/zzr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzb:Lcom/google/android/gms/ads/internal/client/zzr;

    return-object v0
.end method

.method public final zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzi(Lcom/google/android/gms/ads/internal/client/zzga;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzd:Lcom/google/android/gms/ads/internal/client/zzga;

    return-object p0
.end method

.method public final zzj()Lcom/google/android/gms/internal/ads/zzfix;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzo:Lcom/google/android/gms/internal/ads/zzfix;

    return-object v0
.end method

.method public final zzk(Z)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zze:Z

    return-object p0
.end method

.method public final zzl(I)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzm:I

    return-object p0
.end method

.method public final zzm(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzf:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final zzn(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzg:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzbkh;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    return-object p0
.end method

.method public final zzp(Lcom/google/android/gms/ads/internal/client/zzx;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzi:Lcom/google/android/gms/ads/internal/client/zzx;

    return-object p0
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzbqs;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzn:Lcom/google/android/gms/internal/ads/zzbqs;

    .line 2
    .line 3
    new-instance p1, Lcom/google/android/gms/ads/internal/client/zzga;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {p1, v0, v1, v0}, Lcom/google/android/gms/ads/internal/client/zzga;-><init>(ZZZ)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzd:Lcom/google/android/gms/ads/internal/client/zzga;

    .line 11
    .line 12
    return-object p0
.end method

.method public final zzr(Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzk:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;->zza()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zze:Z

    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;->zzb()Lcom/google/android/gms/ads/internal/client/zzco;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzl:Lcom/google/android/gms/ads/internal/client/zzco;

    :cond_0
    return-object p0
.end method

.method public final zzs(Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzj:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;->getManualImpressionsEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zze:Z

    :cond_0
    return-object p0
.end method

.method public final zzt(Lcom/google/android/gms/internal/ads/zzerp;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzr:Lcom/google/android/gms/internal/ads/zzerp;

    return-object p0
.end method

.method public final zzu(Z)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzs:Z

    return-object p0
.end method

.method public final zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzt:Landroid/os/Bundle;

    return-object p0
.end method

.method public final zzw()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzx(J)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final zzy(Z)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzv:Z

    return-object p0
.end method

.method public final zzz(Lcom/google/android/gms/internal/ads/zzfjk;)Lcom/google/android/gms/internal/ads/zzfjj;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzo:Lcom/google/android/gms/internal/ads/zzfix;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzp:Lcom/google/android/gms/internal/ads/zzfiy;

    .line 4
    .line 5
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzfiy;->zza:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfix;->zza(I)Lcom/google/android/gms/internal/ads/zzfix;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zza:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzf:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzb:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 17
    .line 18
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzw:Lcom/google/android/gms/ads/internal/client/zzcs;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzw:Lcom/google/android/gms/ads/internal/client/zzcs;

    .line 21
    .line 22
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzc:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zza:Lcom/google/android/gms/ads/internal/client/zzga;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzd:Lcom/google/android/gms/ads/internal/client/zzga;

    .line 29
    .line 30
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzf:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzi:Ljava/util/ArrayList;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzg:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzj:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 41
    .line 42
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzk:Lcom/google/android/gms/ads/internal/client/zzx;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzi:Lcom/google/android/gms/ads/internal/client/zzx;

    .line 45
    .line 46
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzm:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfjj;->zzs(Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzn:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfjj;->zzr(Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 54
    .line 55
    .line 56
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzq:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzp:Z

    .line 59
    .line 60
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzr:Z

    .line 61
    .line 62
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzq:Z

    .line 63
    .line 64
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzc:Lcom/google/android/gms/internal/ads/zzerp;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzr:Lcom/google/android/gms/internal/ads/zzerp;

    .line 67
    .line 68
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzs:Z

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzs:Z

    .line 71
    .line 72
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzt:Landroid/os/Bundle;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzt:Landroid/os/Bundle;

    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 77
    .line 78
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 85
    .line 86
    .line 87
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzv:Z

    .line 88
    .line 89
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfjj;->zzv:Z

    .line 90
    .line 91
    return-object p0
.end method
