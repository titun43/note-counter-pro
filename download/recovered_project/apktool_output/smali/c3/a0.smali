.class public final Lc3/a0;
.super Lu2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc3/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final g:Lcom/google/android/gms/internal/location/zzbs;

.field public final h:Landroid/app/PendingIntent;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/b;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc3/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroid/app/PendingIntent;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/location/zzbs;->zzi()Lcom/google/android/gms/internal/location/zzbs;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/location/zzbs;->zzj(Ljava/util/Collection;)Lcom/google/android/gms/internal/location/zzbs;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, Lc3/a0;->g:Lcom/google/android/gms/internal/location/zzbs;

    .line 16
    .line 17
    iput-object p2, p0, Lc3/a0;->h:Landroid/app/PendingIntent;

    .line 18
    .line 19
    iput-object p3, p0, Lc3/a0;->i:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

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
    iget-object v2, p0, Lc3/a0;->g:Lcom/google/android/gms/internal/location/zzbs;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lz2/b;->K(Landroid/os/Parcel;ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lc3/a0;->h:Landroid/app/PendingIntent;

    .line 15
    .line 16
    invoke-static {p1, v1, v2, p2}, Lz2/b;->H(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    iget-object v1, p0, Lc3/a0;->i:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, p2, v1}, Lz2/b;->I(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
