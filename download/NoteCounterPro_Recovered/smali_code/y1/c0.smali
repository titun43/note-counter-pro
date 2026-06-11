.class public final Ly1/c0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Z

.field public final synthetic c:Lcom/google/android/gms/common/api/internal/c0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/c0;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/c0;->c:Lcom/google/android/gms/common/api/internal/c0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Ly1/c0;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ly1/c0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-lt v0, v1, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Ly1/c0;->b:Z

    .line 16
    .line 17
    if-eq v2, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x2

    .line 22
    :goto_0
    invoke-static {p1, p0, p2, v0}, Lg0/b;->q(Landroid/content/Context;Ly1/c0;Landroid/content/IntentFilter;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    :goto_1
    iput-boolean v2, p0, Ly1/c0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw p1
.end method

.method public final b(Landroid/os/Bundle;Ly1/e;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/c0;->c:Lcom/google/android/gms/common/api/internal/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ly1/a0;

    .line 6
    .line 7
    const-string v1, "FAILURE_LOGGING_PAYLOAD"

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzgw;->zza()Lcom/google/android/gms/internal/play_billing/zzgw;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzC([BLcom/google/android/gms/internal/play_billing/zzgw;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast v0, Landroidx/emoji2/text/p;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/16 p1, 0x17

    .line 34
    .line 35
    invoke-static {p1, p3, p2}, Ly1/z;->b(IILy1/e;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast v0, Landroidx/emoji2/text/p;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    const-string p1, "BillingBroadcastManager"

    .line 46
    .line 47
    const-string p2, "Failed parsing Api failure."

    .line 48
    .line 49
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1
    iget-object p1, p0, Ly1/c0;->c:Lcom/google/android/gms/common/api/internal/c0;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ly1/a0;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ly1/i;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "BillingBroadcastManager"

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string p2, "Bundle is null."

    .line 21
    .line 22
    invoke-static {v3, p2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object p2, Ly1/b0;->g:Ly1/e;

    .line 26
    .line 27
    const/16 v1, 0xb

    .line 28
    .line 29
    invoke-static {v1, v2, p2}, Ly1/z;->b(IILy1/e;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v0, Landroidx/emoji2/text/p;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-interface {p1, p2, v0}, Ly1/i;->onPurchasesUpdated(Ly1/e;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzf(Landroid/content/Intent;Ljava/lang/String;)Ly1/e;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const-string v5, "INTENT_SOURCE"

    .line 54
    .line 55
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v6, "LAUNCH_BILLING_FLOW"

    .line 60
    .line 61
    invoke-static {v5, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eq v2, v5, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 v2, 0x2

    .line 69
    :goto_0
    const-string v5, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 70
    .line 71
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_5

    .line 76
    .line 77
    const-string v5, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const-string v5, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 87
    .line 88
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    iget p2, v4, Ly1/e;->a:I

    .line 95
    .line 96
    if-eqz p2, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0, v1, v4, v2}, Ly1/c0;->b(Landroid/os/Bundle;Ly1/e;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-interface {p1, v4, p2}, Ly1/i;->onPurchasesUpdated(Ly1/e;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    const-string p2, "AlternativeBillingListener and UserChoiceBillingListener is null."

    .line 110
    .line 111
    invoke-static {v3, p2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object p2, Ly1/b0;->g:Ly1/e;

    .line 115
    .line 116
    const/16 v1, 0x4d

    .line 117
    .line 118
    invoke-static {v1, v2, p2}, Ly1/z;->b(IILy1/e;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v0, Landroidx/emoji2/text/p;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {p1, p2, v0}, Ly1/i;->onPurchasesUpdated(Ly1/e;Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void

    .line 135
    :cond_5
    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzj(Landroid/os/Bundle;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iget v3, v4, Ly1/e;->a:I

    .line 140
    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    invoke-static {v2}, Ly1/z;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v0, Landroidx/emoji2/text/p;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/p;->I(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    invoke-virtual {p0, v1, v4, v2}, Ly1/c0;->b(Landroid/os/Bundle;Ly1/e;I)V

    .line 154
    .line 155
    .line 156
    :goto_2
    invoke-interface {p1, v4, p2}, Ly1/i;->onPurchasesUpdated(Ly1/e;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method
