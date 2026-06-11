.class public abstract Lc3/o;
.super Lcom/google/android/gms/internal/location/zzb;
.source "SourceFile"

# interfaces
.implements Lc3/p;


# direct methods
.method public static zzb(Landroid/os/IBinder;)Lc3/p;
    .locals 3

    .line 1
    const-string v0, "com.google.android.gms.location.IDeviceOrientationListener"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Lc3/p;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Lc3/p;

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance v1, Lc3/n;

    .line 15
    .line 16
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/location/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method


# virtual methods
.method public final zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method
