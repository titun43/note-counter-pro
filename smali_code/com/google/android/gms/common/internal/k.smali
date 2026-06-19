.class public final Lcom/google/android/gms/common/internal/k;
.super Lu2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:[Lcom/google/android/gms/common/api/Scope;

.field public static final v:[Lt2/d;


# instance fields
.field public final g:I

.field public final h:I

.field public final i:I

.field public j:Ljava/lang/String;

.field public k:Landroid/os/IBinder;

.field public l:[Lcom/google/android/gms/common/api/Scope;

.field public m:Landroid/os/Bundle;

.field public n:Landroid/accounts/Account;

.field public o:[Lt2/d;

.field public p:[Lt2/d;

.field public final q:Z

.field public final r:I

.field public s:Z

.field public final t:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/common/internal/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/k0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/common/internal/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    .line 11
    .line 12
    sput-object v1, Lcom/google/android/gms/common/internal/k;->u:[Lcom/google/android/gms/common/api/Scope;

    .line 13
    .line 14
    new-array v0, v0, [Lt2/d;

    .line 15
    .line 16
    sput-object v0, Lcom/google/android/gms/common/internal/k;->v:[Lt2/d;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lt2/d;[Lt2/d;ZIZLjava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p6, :cond_0

    .line 2
    sget-object v1, Lcom/google/android/gms/common/internal/k;->u:[Lcom/google/android/gms/common/api/Scope;

    goto :goto_0

    :cond_0
    move-object v1, p6

    :goto_0
    if-nez p7, :cond_1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    goto :goto_1

    :cond_1
    move-object v2, p7

    :goto_1
    sget-object v3, Lcom/google/android/gms/common/internal/k;->v:[Lt2/d;

    if-nez p9, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    move-object/from16 v4, p9

    :goto_2
    if-nez p10, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v3, p10

    :goto_3
    iput p1, p0, Lcom/google/android/gms/common/internal/k;->g:I

    iput p2, p0, Lcom/google/android/gms/common/internal/k;->h:I

    iput p3, p0, Lcom/google/android/gms/common/internal/k;->i:I

    .line 3
    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lcom/google/android/gms/common/internal/k;->j:Ljava/lang/String;

    goto :goto_4

    .line 4
    :cond_4
    iput-object p4, p0, Lcom/google/android/gms/common/internal/k;->j:Ljava/lang/String;

    :goto_4
    const/4 p2, 0x2

    if-ge p1, p2, :cond_7

    const/4 p1, 0x0

    if-eqz p5, :cond_6

    .line 5
    sget p3, Lcom/google/android/gms/common/internal/a;->g:I

    .line 6
    const-string p3, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {p5, p3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v5, p4, Lcom/google/android/gms/common/internal/n;

    if-eqz v5, :cond_5

    .line 7
    check-cast p4, Lcom/google/android/gms/common/internal/n;

    goto :goto_5

    :cond_5
    new-instance p4, Lcom/google/android/gms/common/internal/q0;

    .line 8
    invoke-direct {p4, p5, p3}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 9
    :goto_5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v5

    .line 10
    :try_start_0
    check-cast p4, Lcom/google/android/gms/common/internal/q0;

    .line 11
    invoke-virtual {p4}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    move-result-object p3

    .line 12
    invoke-virtual {p4, p2, p3}, Lcom/google/android/gms/internal/common/zza;->zzB(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p2

    sget-object p3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 13
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/common/zzc;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Landroid/accounts/Account;

    .line 14
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-static {v5, v6}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    move-object p1, p3

    goto :goto_6

    :catch_0
    :try_start_1
    const-string p2, "AccountAccessor"

    const-string p3, "Remote account accessor probably died"

    .line 16
    invoke-static {p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    invoke-static {v5, v6}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v5, v6}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 18
    throw p1

    .line 19
    :cond_6
    :goto_6
    iput-object p1, p0, Lcom/google/android/gms/common/internal/k;->n:Landroid/accounts/Account;

    goto :goto_7

    :cond_7
    iput-object p5, p0, Lcom/google/android/gms/common/internal/k;->k:Landroid/os/IBinder;

    iput-object p8, p0, Lcom/google/android/gms/common/internal/k;->n:Landroid/accounts/Account;

    :goto_7
    iput-object v1, p0, Lcom/google/android/gms/common/internal/k;->l:[Lcom/google/android/gms/common/api/Scope;

    iput-object v2, p0, Lcom/google/android/gms/common/internal/k;->m:Landroid/os/Bundle;

    iput-object v4, p0, Lcom/google/android/gms/common/internal/k;->o:[Lt2/d;

    iput-object v3, p0, Lcom/google/android/gms/common/internal/k;->p:[Lt2/d;

    move/from16 p1, p11

    iput-boolean p1, p0, Lcom/google/android/gms/common/internal/k;->q:Z

    move/from16 p1, p12

    iput p1, p0, Lcom/google/android/gms/common/internal/k;->r:I

    move/from16 p1, p13

    iput-boolean p1, p0, Lcom/google/android/gms/common/internal/k;->s:Z

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/google/android/gms/common/internal/k;->t:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/internal/k0;->a(Lcom/google/android/gms/common/internal/k;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
