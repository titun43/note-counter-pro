.class public final Lcom/google/android/gms/ads/internal/client/zzfy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-char v3, v2

    .line 17
    const/16 v4, 0xf

    .line 18
    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1, v2}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p1, v2}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p1, v0}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lcom/google/android/gms/ads/internal/client/zzfx;

    .line 34
    .line 35
    invoke-direct {p1, v1}, Lcom/google/android/gms/ads/internal/client/zzfx;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/ads/internal/client/zzfx;

    .line 2
    .line 3
    return-object p1
.end method
