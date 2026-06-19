.class public Lcom/google/android/gms/internal/ads/zzfvh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I = 0x0

.field private static volatile zzf:I = 0x1


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/util/concurrent/Executor;

.field private final zzd:Lh3/g;

.field private final zze:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lh3/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzb:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzc:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzd:Lh3/g;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zze:Z

    .line 11
    .line 12
    return-void
.end method

.method public static zza(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lcom/google/android/gms/internal/ads/zzfvh;
    .locals 2

    .line 1
    new-instance v0, Lh3/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lh3/h;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfvd;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzfvd;-><init>(Landroid/content/Context;Lh3/h;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfvf;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzfvf;-><init>(Lh3/h;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfvh;

    .line 26
    .line 27
    iget-object v0, v0, Lh3/h;->a:Lh3/n;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzfvh;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lh3/g;Z)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public static zzg(I)V
    .locals 0

    sput p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzf:I

    return-void
.end method

.method private final zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;
    .locals 2

    .line 1
    iget-boolean p6, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zze:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p6, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzd:Lh3/g;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzc:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    sget-object p3, Lcom/google/android/gms/internal/ads/zzfvg;->zza:Lcom/google/android/gms/internal/ads/zzfvg;

    .line 11
    .line 12
    check-cast p1, Lh3/n;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p4, Lh3/n;

    .line 18
    .line 19
    invoke-direct {p4}, Lh3/n;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p5, Lh3/j;

    .line 23
    .line 24
    invoke-direct {p5, p2, p3, p4, v0}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/b;Lh3/n;I)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p1, Lh3/n;->b:Lh3/m;

    .line 28
    .line 29
    invoke-virtual {p2, p5}, Lh3/m;->a(Lh3/l;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lh3/n;->h()V

    .line 33
    .line 34
    .line 35
    return-object p4

    .line 36
    :cond_0
    iget-object p6, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzb:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavq;->zza()Lcom/google/android/gms/internal/ads/zzavm;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p6

    .line 46
    invoke-virtual {v1, p6}, Lcom/google/android/gms/internal/ads/zzavm;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavm;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzavm;->zzb(J)Lcom/google/android/gms/internal/ads/zzavm;

    .line 50
    .line 51
    .line 52
    sget p2, Lcom/google/android/gms/internal/ads/zzfvh;->zzf:I

    .line 53
    .line 54
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzavm;->zzg(I)Lcom/google/android/gms/internal/ads/zzavm;

    .line 55
    .line 56
    .line 57
    if-eqz p4, :cond_1

    .line 58
    .line 59
    sget p2, Lcom/google/android/gms/internal/ads/zzgrz;->zza:I

    .line 60
    .line 61
    new-instance p2, Ljava/io/StringWriter;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/io/StringWriter;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p3, Ljava/io/PrintWriter;

    .line 67
    .line 68
    invoke-direct {p3, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzavm;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavm;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzavm;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavm;

    .line 90
    .line 91
    .line 92
    :cond_1
    if-eqz p7, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, p7}, Lcom/google/android/gms/internal/ads/zzavm;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavm;

    .line 95
    .line 96
    .line 97
    :cond_2
    if-eqz p5, :cond_3

    .line 98
    .line 99
    invoke-virtual {v1, p5}, Lcom/google/android/gms/internal/ads/zzavm;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavm;

    .line 100
    .line 101
    .line 102
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzd:Lh3/g;

    .line 103
    .line 104
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfvh;->zzc:Ljava/util/concurrent/Executor;

    .line 105
    .line 106
    new-instance p4, Lcom/google/android/gms/internal/ads/zzfve;

    .line 107
    .line 108
    invoke-direct {p4, v1, p1}, Lcom/google/android/gms/internal/ads/zzfve;-><init>(Lcom/google/android/gms/internal/ads/zzavm;I)V

    .line 109
    .line 110
    .line 111
    check-cast p2, Lh3/n;

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance p1, Lh3/n;

    .line 117
    .line 118
    invoke-direct {p1}, Lh3/n;-><init>()V

    .line 119
    .line 120
    .line 121
    new-instance p5, Lh3/j;

    .line 122
    .line 123
    invoke-direct {p5, p3, p4, p1, v0}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/b;Lh3/n;I)V

    .line 124
    .line 125
    .line 126
    iget-object p3, p2, Lh3/n;->b:Lh3/m;

    .line 127
    .line 128
    invoke-virtual {p3, p5}, Lh3/m;->a(Lh3/l;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Lh3/n;->h()V

    .line 132
    .line 133
    .line 134
    return-object p1
.end method


# virtual methods
.method public zzb(IJ)Lh3/g;
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v7, 0x0

    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move v1, p1

    .line 7
    move-wide v2, p2

    .line 8
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzfvh;->zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public zzc(IJLjava/lang/Exception;)Lh3/g;
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v7, 0x0

    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzfvh;->zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final zzd(IJLjava/lang/String;Ljava/util/Map;)Lh3/g;
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v7, 0x0

    .line 3
    const/4 v4, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzfvh;->zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public zze(ILjava/lang/String;)Lh3/g;
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move v1, p1

    .line 8
    move-object v7, p2

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzfvh;->zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final zzf(IJLjava/lang/String;)Lh3/g;
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v4, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move-object v7, p4

    .line 8
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzfvh;->zzh(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lh3/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
