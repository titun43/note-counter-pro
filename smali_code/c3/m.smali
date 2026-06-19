.class public final Lc3/m;
.super Lcom/google/android/gms/common/api/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc3/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/common/api/g;
    .locals 7

    iget v0, p0, Lc3/m;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/common/api/g;

    move-result-object p1

    return-object p1

    .line 1
    :pswitch_0
    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/common/internal/u;

    .line 2
    new-instance v0, Lv2/c;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lv2/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Lcom/google/android/gms/common/internal/u;Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/internal/n;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/g;
    .locals 10

    iget v0, p0, Lc3/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/g;

    move-result-object p1

    return-object p1

    .line 3
    :pswitch_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    .line 5
    :pswitch_1
    check-cast p4, Lf3/a;

    .line 6
    new-instance v2, Lg3/a;

    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iget-object p4, p3, Lcom/google/android/gms/common/internal/i;->f:Ljava/lang/Integer;

    .line 9
    new-instance v6, Landroid/os/Bundle;

    .line 10
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.google.android.gms.signin.internal.clientRequestedAccount"

    const/4 v3, 0x0

    .line 11
    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz p4, :cond_0

    const-string v0, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    .line 12
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-virtual {v6, v0, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    const-string p4, "com.google.android.gms.signin.internal.offlineAccessRequested"

    .line 13
    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.idTokenRequested"

    .line 14
    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.serverClientId"

    .line 15
    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    const/4 v0, 0x1

    .line 16
    invoke-virtual {v6, p4, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    .line 17
    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.hostedDomain"

    .line 18
    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.logSessionId"

    .line 19
    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    .line 20
    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p5

    move-object/from16 v8, p6

    .line 21
    invoke-direct/range {v2 .. v8}, Lg3/a;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Landroid/os/Bundle;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;)V

    return-object v2

    .line 22
    :pswitch_2
    check-cast p4, Lcom/google/android/gms/common/api/d;

    .line 23
    new-instance v3, Lcom/google/android/gms/internal/location/zzaz;

    const-string v8, "locationServices"

    move-object v4, p1

    move-object v5, p2

    move-object v9, p3

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/location/zzaz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;Ljava/lang/String;Lcom/google/android/gms/common/internal/i;)V

    return-object v3

    .line 24
    :pswitch_3
    check-cast p4, Lcom/google/android/gms/common/api/d;

    .line 25
    new-instance v3, Lcom/google/android/gms/internal/location/zzaz;

    .line 26
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    new-instance p3, Ljava/util/HashSet;

    .line 27
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 28
    new-instance v6, Lo/f;

    .line 29
    invoke-direct {v6, v1}, Lo/l;-><init>(I)V

    .line 30
    new-instance p3, Lo/f;

    .line 31
    invoke-direct {p3, v1}, Lo/l;-><init>(I)V

    .line 32
    sget-object p4, Lt2/e;->c:Ljava/lang/Object;

    .line 33
    sget-object p4, Lf3/b;->a:Lc3/m;

    new-instance p4, Ljava/util/ArrayList;

    .line 34
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    new-instance p4, Ljava/util/ArrayList;

    .line 35
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    .line 39
    sget-object p4, Lf3/b;->b:Lcom/google/android/gms/common/api/i;

    invoke-virtual {p3, p4}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    invoke-virtual {p3, p4}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lf3/a;

    :goto_0
    move-object v9, p3

    goto :goto_1

    .line 41
    :cond_1
    sget-object p3, Lf3/a;->b:Lf3/a;

    goto :goto_0

    .line 42
    :goto_1
    new-instance v4, Lcom/google/android/gms/common/internal/i;

    .line 43
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/internal/i;-><init>(Ljava/util/Set;Lo/f;Ljava/lang/String;Ljava/lang/String;Lf3/a;)V

    move-object v9, v4

    .line 44
    const-string v8, "activity_recognition"

    move-object v4, p1

    move-object v5, p2

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/location/zzaz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;Ljava/lang/String;Lcom/google/android/gms/common/internal/i;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
