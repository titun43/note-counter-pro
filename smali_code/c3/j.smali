.class public final Lc3/j;
.super Lu2/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/t;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc3/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final g:Lcom/google/android/gms/common/api/Status;

.field public final h:Lc3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/b;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc3/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lc3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc3/j;->g:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p2, p0, Lc3/j;->h:Lc3/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/j;->g:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    return-object v0
.end method

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
    iget-object v2, p0, Lc3/j;->g:Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    invoke-static {p1, v1, v2, p2}, Lz2/b;->H(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lc3/j;->h:Lc3/k;

    .line 15
    .line 16
    invoke-static {p1, v1, v2, p2}, Lz2/b;->H(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
