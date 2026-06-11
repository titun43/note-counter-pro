.class public final Lcom/google/android/gms/common/internal/y;
.super Lu2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final g:I

.field public final h:Landroid/os/IBinder;

.field public final i:Lt2/b;

.field public final j:Z

.field public final k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/b;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/common/internal/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lt2/b;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/common/internal/y;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/internal/y;->h:Landroid/os/IBinder;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/internal/y;->i:Lt2/b;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/google/android/gms/common/internal/y;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/google/android/gms/common/internal/y;->k:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    if-ne p0, p1, :cond_1

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/common/internal/y;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_2
    check-cast p1, Lcom/google/android/gms/common/internal/y;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/common/internal/y;->i:Lt2/b;

    .line 15
    .line 16
    iget-object v1, p1, Lcom/google/android/gms/common/internal/y;->i:Lt2/b;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lt2/b;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    const-string v0, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iget-object v2, p0, Lcom/google/android/gms/common/internal/y;->h:Landroid/os/IBinder;

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    move-object v3, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_3
    sget v3, Lcom/google/android/gms/common/internal/a;->g:I

    .line 34
    .line 35
    invoke-interface {v2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v4, v3, Lcom/google/android/gms/common/internal/n;

    .line 40
    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    check-cast v3, Lcom/google/android/gms/common/internal/n;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    new-instance v3, Lcom/google/android/gms/common/internal/q0;

    .line 47
    .line 48
    invoke-direct {v3, v2, v0}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/common/internal/y;->h:Landroid/os/IBinder;

    .line 52
    .line 53
    if-nez p1, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    sget v1, Lcom/google/android/gms/common/internal/a;->g:I

    .line 57
    .line 58
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    instance-of v2, v1, Lcom/google/android/gms/common/internal/n;

    .line 63
    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    check-cast v1, Lcom/google/android/gms/common/internal/n;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_6
    new-instance v1, Lcom/google/android/gms/common/internal/q0;

    .line 70
    .line 71
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-static {v3, v1}, Lcom/google/android/gms/common/internal/b0;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    :goto_2
    const/4 p1, 0x1

    .line 81
    return p1

    .line 82
    :cond_7
    :goto_3
    const/4 p1, 0x0

    .line 83
    return p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lz2/b;->O(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {p1, v1, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/google/android/gms/common/internal/y;->g:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    iget-object v3, p0, Lcom/google/android/gms/common/internal/y;->h:Landroid/os/IBinder;

    .line 19
    .line 20
    invoke-static {p1, v1, v3}, Lz2/b;->G(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    iget-object v3, p0, Lcom/google/android/gms/common/internal/y;->i:Lt2/b;

    .line 25
    .line 26
    invoke-static {p1, v1, v3, p2}, Lz2/b;->H(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v2, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/y;->j:Z

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x5

    .line 38
    invoke-static {p1, p2, v2}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 39
    .line 40
    .line 41
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/y;->k:Z

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
