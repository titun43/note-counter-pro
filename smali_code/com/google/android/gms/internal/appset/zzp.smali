.class public final Lcom/google/android/gms/internal/appset/zzp;
.super Lcom/google/android/gms/common/api/m;
.source "SourceFile"

# interfaces
.implements Lq2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/m;",
        "Lq2/a;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/common/api/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/h;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/i;"
        }
    .end annotation
.end field


# instance fields
.field private final zzd:Landroid/content/Context;

.field private final zze:Lt2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/appset/zzp;->zza:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/appset/zzn;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/appset/zzn;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/appset/zzp;->zzb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "AppSet.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/appset/zzp;->zzc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt2/f;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/appset/zzp;->zzc:Lcom/google/android/gms/common/api/i;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/common/api/e;->a:Lcom/google/android/gms/common/api/d;

    .line 4
    .line 5
    sget-object v2, Lcom/google/android/gms/common/api/l;->c:Lcom/google/android/gms/common/api/l;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/common/api/m;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/l;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/appset/zzp;->zzd:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/android/gms/internal/appset/zzp;->zze:Lt2/f;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getAppSetIdInfo()Lh3/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh3/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/appset/zzp;->zze:Lt2/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/appset/zzp;->zzd:Landroid/content/Context;

    .line 4
    .line 5
    const v2, 0xcaf1200

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lt2/f;->c(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/google/android/gms/common/api/internal/t;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput v1, v0, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 24
    .line 25
    sget-object v2, Lq2/e;->a:Lt2/d;

    .line 26
    .line 27
    filled-new-array {v2}, [Lt2/d;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, v0, Lcom/google/android/gms/common/api/internal/t;->c:[Lt2/d;

    .line 32
    .line 33
    new-instance v2, Lcom/google/android/gms/internal/appset/zzm;

    .line 34
    .line 35
    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/appset/zzm;-><init>(Lcom/google/android/gms/internal/appset/zzp;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, Lcom/google/android/gms/common/api/internal/t;->a:Lcom/google/android/gms/common/api/internal/q;

    .line 39
    .line 40
    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 41
    .line 42
    const/16 v1, 0x6bd1

    .line 43
    .line 44
    iput v1, v0, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 45
    .line 46
    new-instance v1, Lcom/google/android/gms/common/api/internal/k0;

    .line 47
    .line 48
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/t;->c:[Lt2/d;

    .line 49
    .line 50
    iget-boolean v3, v0, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 51
    .line 52
    iget v4, v0, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 53
    .line 54
    invoke-direct {v1, v0, v2, v3, v4}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/t;[Lt2/d;ZI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/api/m;->doRead(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/j;

    .line 63
    .line 64
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 65
    .line 66
    const/16 v2, 0x11

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v1, v2, v3, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lh3/n;

    .line 76
    .line 77
    invoke-direct {v1}, Lh3/n;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-object v1
.end method
