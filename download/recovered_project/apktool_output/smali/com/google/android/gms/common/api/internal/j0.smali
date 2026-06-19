.class public final Lcom/google/android/gms/common/api/internal/j0;
.super Lg3/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/n;
.implements Lcom/google/android/gms/common/api/o;


# static fields
.field public static final n:Lc3/m;


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Landroid/os/Handler;

.field public final i:Lc3/m;

.field public final j:Ljava/util/Set;

.field public final k:Lcom/google/android/gms/common/internal/i;

.field public l:Lg3/a;

.field public m:Lcom/google/android/gms/common/api/internal/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lf3/b;->a:Lc3/m;

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/gms/common/api/internal/j0;->n:Lc3/m;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/i;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/base/zab;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/j0;->g:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/j0;->h:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/j0;->k:Lcom/google/android/gms/common/internal/i;

    .line 11
    .line 12
    iget-object p1, p3, Lcom/google/android/gms/common/internal/i;->a:Ljava/util/Set;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/j0;->j:Ljava/util/Set;

    .line 15
    .line 16
    sget-object p1, Lcom/google/android/gms/common/api/internal/j0;->n:Lc3/m;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/j0;->i:Lc3/m;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "<<default account>>"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    :try_start_0
    iget-object v4, v0, Lg3/a;->b:Lcom/google/android/gms/common/internal/i;

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v4, Landroid/accounts/Account;

    .line 16
    .line 17
    const-string v5, "com.google"

    .line 18
    .line 19
    invoke-direct {v4, v1, v5}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v5, Ls2/a;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v5, Ls2/a;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    :try_start_1
    sget-object v6, Ls2/a;->d:Ls2/a;

    .line 45
    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    new-instance v6, Ls2/a;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v6, v1}, Ls2/a;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    sput-object v6, Ls2/a;->d:Ls2/a;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    sget-object v1, Ls2/a;->d:Ls2/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    :try_start_2
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 65
    .line 66
    .line 67
    const-string v5, "defaultGoogleSignInAccount"

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Ls2/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v7, "googleSignInAccount:"

    .line 83
    .line 84
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v1, v5}, Ls2/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    :try_start_3
    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->a(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 101
    .line 102
    .line 103
    move-result-object v1
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 104
    goto :goto_3

    .line 105
    :goto_1
    :try_start_4
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    goto :goto_4

    .line 111
    :catch_1
    :cond_2
    :goto_2
    move-object v1, v3

    .line 112
    :goto_3
    new-instance v5, Lcom/google/android/gms/common/internal/x;

    .line 113
    .line 114
    iget-object v6, v0, Lg3/a;->d:Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-static {v6}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    const/4 v7, 0x2

    .line 124
    invoke-direct {v5, v7, v4, v6, v1}, Lcom/google/android/gms/common/internal/x;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lg3/d;

    .line 132
    .line 133
    new-instance v1, Lg3/f;

    .line 134
    .line 135
    invoke-direct {v1, v2, v5}, Lg3/f;-><init>(ILcom/google/android/gms/common/internal/x;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v4, p0}, Lcom/google/android/gms/internal/base/zac;->zad(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 146
    .line 147
    .line 148
    const/16 v1, 0xc

    .line 149
    .line 150
    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/internal/base/zaa;->zac(ILandroid/os/Parcel;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :goto_4
    const-string v1, "Remote service probably died when signIn is called"

    .line 155
    .line 156
    const-string v4, "SignInClientImpl"

    .line 157
    .line 158
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    :try_start_5
    new-instance v1, Lg3/g;

    .line 162
    .line 163
    new-instance v5, Lt2/b;

    .line 164
    .line 165
    const/16 v6, 0x8

    .line 166
    .line 167
    invoke-direct {v5, v6, v3, v3}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v1, v2, v5, v3}, Lg3/g;-><init>(ILt2/b;Lcom/google/android/gms/common/internal/y;)V

    .line 171
    .line 172
    .line 173
    new-instance v2, Lc0/a;

    .line 174
    .line 175
    const/4 v3, 0x4

    .line 176
    const/4 v5, 0x0

    .line 177
    invoke-direct {v2, p0, v1, v3, v5}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/j0;->h:Landroid/os/Handler;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catch_2
    const-string v1, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    .line 187
    .line 188
    invoke-static {v4, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    .line 190
    .line 191
    :goto_5
    return-void
.end method

.method public final onConnectionFailed(Lt2/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/c0;->b(Lt2/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/google/android/gms/common/api/internal/g;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/gms/common/api/internal/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-boolean v1, v0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    new-instance p1, Lt2/b;

    .line 26
    .line 27
    const/16 v1, 0x11

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {p1, v1, v2, v2}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/a0;->o(Lt2/b;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/a0;->onConnectionSuspended(I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
