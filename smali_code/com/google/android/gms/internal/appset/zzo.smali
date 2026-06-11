.class final Lcom/google/android/gms/internal/appset/zzo;
.super Lcom/google/android/gms/internal/appset/zze;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lh3/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/appset/zzp;Lh3/h;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/appset/zzo;->zza:Lh3/h;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/appset/zze;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/common/api/Status;Lq2/d;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lq2/b;

    .line 4
    .line 5
    iget-object v1, p2, Lq2/d;->g:Ljava/lang/String;

    .line 6
    .line 7
    iget p2, p2, Lq2/d;->h:I

    .line 8
    .line 9
    invoke-direct {v0, v1, p2}, Lq2/b;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/appset/zzo;->zza:Lh3/h;

    .line 15
    .line 16
    iget v1, p1, Lcom/google/android/gms/common/api/Status;->g:I

    .line 17
    .line 18
    if-gtz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lh3/h;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->i:Landroid/app/PendingIntent;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    new-instance v0, Lcom/google/android/gms/common/api/s;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    new-instance v0, Lcom/google/android/gms/common/api/j;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    iget-object p1, p2, Lh3/h;->a:Lh3/n;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
