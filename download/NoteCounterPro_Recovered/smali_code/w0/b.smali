.class public final Lw0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/a;->z()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "context.getSystemService\u2026:class.java\n            )"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/a;->e(Ljava/lang/Object;)Landroid/adservices/measurement/MeasurementManager;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lw0/b;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public a(Lw0/a;Lw3/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/a;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lo4/f;

    .line 2
    .line 3
    invoke-static {p2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/ads/a;->q()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public b(Lw3/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lo4/f;

    .line 2
    .line 3
    invoke-static {p1}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lw0/b;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v2, Ll/a;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Ll/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lb0/c;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lb0/c;-><init>(Lo4/f;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/ads/a;->t(Landroid/adservices/measurement/MeasurementManager;Ll/a;Landroid/os/OutcomeReceiver;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lo4/f;->q()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 34
    .line 35
    return-object p1
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;Lw3/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lo4/f;

    .line 2
    .line 3
    invoke-static {p3}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p3}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Lw0/b;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v1, Ll/a;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ll/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lb0/c;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lb0/c;-><init>(Lo4/f;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p3, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/a;->r(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/InputEvent;Ll/a;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lo4/f;->q()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 35
    .line 36
    if-ne p1, p2, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 40
    .line 41
    return-object p1
.end method

.method public d(Landroid/net/Uri;Lw3/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lo4/f;

    .line 2
    .line 3
    invoke-static {p2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lw0/b;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v1, Ll/a;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ll/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lb0/c;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lb0/c;-><init>(Lo4/f;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p2, p1, v1, v2}, Lcom/google/android/gms/internal/ads/a;->s(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Ll/a;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lo4/f;->q()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 35
    .line 36
    if-ne p1, p2, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 40
    .line 41
    return-object p1
.end method

.method public e(Lw0/c;Lw3/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/c;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lo4/f;

    .line 2
    .line 3
    invoke-static {p2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/ads/a;->A()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public f(Lw0/d;Lw3/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw0/d;",
            "Lw3/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lo4/f;

    .line 2
    .line 3
    invoke-static {p2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lo4/f;->r()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/ads/a;->C()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method
