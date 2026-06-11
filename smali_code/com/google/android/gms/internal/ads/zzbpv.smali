.class public final Lcom/google/android/gms/internal/ads/zzbpv;
.super Lu2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbpv;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Z

.field public final zzb:Ljava/lang/String;

.field public final zzc:I

.field public final zzd:[B

.field public final zze:[Ljava/lang/String;

.field public final zzf:[Ljava/lang/String;

.field public final zzg:Z

.field public final zzh:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbpw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbpw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbpv;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;I[B[Ljava/lang/String;[Ljava/lang/String;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zza:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzc:I

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzd:[B

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zze:[Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzf:[Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzg:Z

    .line 17
    .line 18
    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzh:J

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zza:Z

    .line 2
    .line 3
    const/16 v0, 0x4f45

    .line 4
    .line 5
    invoke-static {p1, v0}, Lz2/b;->O(Landroid/os/Parcel;I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-static {p1, v1, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x2

    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzb:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, p2, v1}, Lz2/b;->I(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzc:I

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-static {p1, v1, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzd:[B

    .line 33
    .line 34
    invoke-static {p1, v2, p2}, Lz2/b;->F(Landroid/os/Parcel;I[B)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x5

    .line 38
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zze:[Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1, p2, v1}, Lz2/b;->J(Landroid/os/Parcel;I[Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x6

    .line 44
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzf:[Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1, p2, v1}, Lz2/b;->J(Landroid/os/Parcel;I[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzg:Z

    .line 50
    .line 51
    const/4 v1, 0x7

    .line 52
    invoke-static {p1, v1, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    .line 57
    .line 58
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzbpv;->zzh:J

    .line 59
    .line 60
    const/16 p2, 0x8

    .line 61
    .line 62
    invoke-static {p1, p2, p2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
