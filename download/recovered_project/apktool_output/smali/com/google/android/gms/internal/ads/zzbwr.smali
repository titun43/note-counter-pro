.class public final Lcom/google/android/gms/internal/ads/zzbwr;
.super Lcom/google/android/gms/internal/ads/zzbwx;
.source "SourceFile"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Z

.field private zzc:I

.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private final zzi:Ljava/lang/Object;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzcjl;

.field private final zzk:Landroid/app/Activity;

.field private zzl:Lcom/google/android/gms/internal/ads/zzclv;

.field private zzm:Landroid/widget/ImageView;

.field private zzn:Landroid/widget/LinearLayout;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzbwy;

.field private zzp:Landroid/widget/PopupWindow;

.field private zzq:Landroid/widget/RelativeLayout;

.field private zzr:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "bottom-right"

    .line 2
    .line 3
    const-string v6, "bottom-center"

    .line 4
    .line 5
    const-string v0, "top-left"

    .line 6
    .line 7
    const-string v1, "top-right"

    .line 8
    .line 9
    const-string v2, "top-center"

    .line 10
    .line 11
    const-string v3, "center"

    .line 12
    .line 13
    const-string v4, "bottom-left"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lo/g;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v1, v2}, Lo/g;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzbwy;)V
    .locals 2

    .line 1
    const-string v0, "resize"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;-><init>(Lcom/google/android/gms/internal/ads/zzcjl;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "top-right"

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zza:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzb:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 20
    .line 21
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 22
    .line 23
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I

    .line 24
    .line 25
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 26
    .line 27
    new-instance v0, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzi:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 35
    .line 36
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcjl;->zzj()Landroid/app/Activity;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzk:Landroid/app/Activity;

    .line 41
    .line 42
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzo:Lcom/google/android/gms/internal/ads/zzbwy;

    .line 43
    .line 44
    return-void
.end method

.method private final zzm(Z)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmn:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 22
    .line 23
    check-cast v1, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 42
    .line 43
    check-cast v1, Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmo:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 49
    .line 50
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 67
    .line 68
    check-cast v0, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    check-cast v1, Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzm:Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmp:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 93
    .line 94
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 113
    .line 114
    move-object v2, v1

    .line 115
    check-cast v2, Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzl:Lcom/google/android/gms/internal/ads/zzclv;

    .line 121
    .line 122
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaf(Lcom/google/android/gms/internal/ads/zzclv;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catch_0
    move-exception v0

    .line 127
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 128
    .line 129
    const-string v1, "Unable to add webview back to view hierarchy."

    .line 130
    .line 131
    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    const-string v1, "MraidCallResizeHandler.collapseInternal"

    .line 135
    .line 136
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 145
    .line 146
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 147
    .line 148
    move-object v2, v1

    .line 149
    check-cast v2, Landroid/view/View;

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzl:Lcom/google/android/gms/internal/ads/zzclv;

    .line 155
    .line 156
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaf(Lcom/google/android/gms/internal/ads/zzclv;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 160
    .line 161
    const-string p1, "default"

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbwx;->zzk(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzo:Lcom/google/android/gms/internal/ads/zzbwy;

    .line 167
    .line 168
    if-eqz p1, :cond_4

    .line 169
    .line 170
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbwy;->zzb()V

    .line 171
    .line 172
    .line 173
    :cond_4
    const/4 p1, 0x0

    .line 174
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 175
    .line 176
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 177
    .line 178
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 179
    .line 180
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzn:Landroid/widget/LinearLayout;

    .line 181
    .line 182
    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/Map;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzi:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "Cannot show popup window: "

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzk:Landroid/app/Activity;

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    const-string v0, "Not an activity context. Cannot resize."

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v2

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_d

    .line 23
    .line 24
    :cond_0
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 25
    .line 26
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzcjl;->zzN()Lcom/google/android/gms/internal/ads/zzclv;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    const-string v0, "Webview is not yet available, size is not set."

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    monitor-exit v2

    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzcjl;->zzN()Lcom/google/android/gms/internal/ads/zzclv;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzclv;->zzg()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    const-string v0, "Is interstitial. Cannot resize an interstitial."

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    monitor-exit v2

    .line 55
    return-void

    .line 56
    :cond_2
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzcjl;->zzW()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    const-string v0, "Cannot resize an expanded banner."

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v2

    .line 68
    return-void

    .line 69
    :cond_3
    const-string v6, "width"

    .line 70
    .line 71
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ljava/lang/CharSequence;

    .line 76
    .line 77
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_4

    .line 82
    .line 83
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 84
    .line 85
    .line 86
    const-string v6, "width"

    .line 87
    .line 88
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/zzs;->zzU(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 99
    .line 100
    :cond_4
    const-string v6, "height"

    .line 101
    .line 102
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Ljava/lang/CharSequence;

    .line 107
    .line 108
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_5

    .line 113
    .line 114
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 115
    .line 116
    .line 117
    const-string v6, "height"

    .line 118
    .line 119
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/zzs;->zzU(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 130
    .line 131
    :cond_5
    const-string v6, "offsetX"

    .line 132
    .line 133
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    check-cast v6, Ljava/lang/CharSequence;

    .line 138
    .line 139
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_6

    .line 144
    .line 145
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 146
    .line 147
    .line 148
    const-string v6, "offsetX"

    .line 149
    .line 150
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    check-cast v6, Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/zzs;->zzU(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 161
    .line 162
    :cond_6
    const-string v6, "offsetY"

    .line 163
    .line 164
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    check-cast v6, Ljava/lang/CharSequence;

    .line 169
    .line 170
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_7

    .line 175
    .line 176
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 177
    .line 178
    .line 179
    const-string v6, "offsetY"

    .line 180
    .line 181
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/zzs;->zzU(Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I

    .line 192
    .line 193
    :cond_7
    const-string v6, "allowOffscreen"

    .line 194
    .line 195
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    check-cast v6, Ljava/lang/CharSequence;

    .line 200
    .line 201
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-nez v6, :cond_8

    .line 206
    .line 207
    const-string v6, "allowOffscreen"

    .line 208
    .line 209
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    check-cast v6, Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzb:Z

    .line 220
    .line 221
    :cond_8
    const-string v6, "customClosePosition"

    .line 222
    .line 223
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-nez v6, :cond_9

    .line 234
    .line 235
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zza:Ljava/lang/String;

    .line 236
    .line 237
    :cond_9
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 238
    .line 239
    if-ltz v0, :cond_1f

    .line 240
    .line 241
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 242
    .line 243
    if-ltz v0, :cond_1f

    .line 244
    .line 245
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-eqz v0, :cond_1e

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    if-nez v6, :cond_a

    .line 256
    .line 257
    goto/16 :goto_c

    .line 258
    .line 259
    :cond_a
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 260
    .line 261
    .line 262
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzac(Landroid/app/Activity;)[I

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 267
    .line 268
    .line 269
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzY(Landroid/app/Activity;)[I

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    const/4 v8, 0x0

    .line 274
    aget v9, v6, v8

    .line 275
    .line 276
    const/4 v10, 0x1

    .line 277
    aget v6, v6, v10

    .line 278
    .line 279
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 280
    .line 281
    const/16 v12, 0x32

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    if-lt v11, v12, :cond_16

    .line 285
    .line 286
    if-le v11, v9, :cond_b

    .line 287
    .line 288
    goto/16 :goto_7

    .line 289
    .line 290
    :cond_b
    iget v14, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 291
    .line 292
    if-lt v14, v12, :cond_15

    .line 293
    .line 294
    if-le v14, v6, :cond_c

    .line 295
    .line 296
    goto/16 :goto_6

    .line 297
    .line 298
    :cond_c
    if-ne v14, v6, :cond_d

    .line 299
    .line 300
    if-ne v11, v9, :cond_d

    .line 301
    .line 302
    const-string v6, "Cannot resize to a full-screen ad."

    .line 303
    .line 304
    sget v7, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 305
    .line 306
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_8

    .line 310
    .line 311
    :cond_d
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzb:Z

    .line 312
    .line 313
    if-eqz v6, :cond_10

    .line 314
    .line 315
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zza:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 318
    .line 319
    .line 320
    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    sparse-switch v15, :sswitch_data_0

    .line 322
    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :sswitch_0
    const-string v14, "top-center"

    .line 327
    .line 328
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-eqz v6, :cond_e

    .line 333
    .line 334
    :try_start_1
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 335
    .line 336
    iget v14, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 337
    .line 338
    shr-int/2addr v11, v10

    .line 339
    add-int/2addr v6, v14

    .line 340
    add-int/2addr v6, v11

    .line 341
    add-int/lit8 v6, v6, -0x19

    .line 342
    .line 343
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 344
    .line 345
    :goto_0
    iget v14, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    .line 347
    add-int/2addr v11, v14

    .line 348
    goto/16 :goto_3

    .line 349
    .line 350
    :sswitch_1
    const-string v15, "bottom-center"

    .line 351
    .line 352
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-eqz v6, :cond_e

    .line 357
    .line 358
    :try_start_2
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 359
    .line 360
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 361
    .line 362
    shr-int/2addr v11, v10

    .line 363
    add-int/2addr v6, v15

    .line 364
    add-int/2addr v6, v11

    .line 365
    add-int/lit8 v6, v6, -0x19

    .line 366
    .line 367
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 368
    .line 369
    :goto_1
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 370
    .line 371
    add-int/2addr v11, v15

    .line 372
    add-int/2addr v11, v14

    .line 373
    add-int/lit8 v11, v11, -0x32

    .line 374
    .line 375
    goto :goto_3

    .line 376
    :sswitch_2
    const-string v15, "bottom-right"

    .line 377
    .line 378
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-eqz v6, :cond_e

    .line 383
    .line 384
    :try_start_3
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 385
    .line 386
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 387
    .line 388
    add-int/2addr v6, v15

    .line 389
    add-int/2addr v6, v11

    .line 390
    add-int/lit8 v6, v6, -0x32

    .line 391
    .line 392
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 393
    .line 394
    goto :goto_1

    .line 395
    :sswitch_3
    const-string v15, "bottom-left"

    .line 396
    .line 397
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    if-eqz v6, :cond_e

    .line 402
    .line 403
    :try_start_4
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 404
    .line 405
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 406
    .line 407
    add-int/2addr v6, v11

    .line 408
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 409
    .line 410
    goto :goto_1

    .line 411
    :sswitch_4
    const-string v14, "top-left"

    .line 412
    .line 413
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    if-eqz v6, :cond_e

    .line 418
    .line 419
    :try_start_5
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 420
    .line 421
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 422
    .line 423
    add-int/2addr v6, v11

    .line 424
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :sswitch_5
    const-string v15, "center"

    .line 428
    .line 429
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_e

    .line 434
    .line 435
    :try_start_6
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 436
    .line 437
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 438
    .line 439
    shr-int/2addr v11, v10

    .line 440
    add-int/2addr v6, v15

    .line 441
    add-int/2addr v6, v11

    .line 442
    add-int/lit8 v6, v6, -0x19

    .line 443
    .line 444
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 445
    .line 446
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I

    .line 447
    .line 448
    add-int/2addr v11, v15

    .line 449
    shr-int/2addr v14, v10

    .line 450
    add-int/2addr v11, v14

    .line 451
    add-int/lit8 v11, v11, -0x19

    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_e
    :goto_2
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 455
    .line 456
    iget v14, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 457
    .line 458
    add-int/2addr v6, v14

    .line 459
    add-int/2addr v6, v11

    .line 460
    add-int/lit8 v6, v6, -0x32

    .line 461
    .line 462
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 463
    .line 464
    goto :goto_0

    .line 465
    :goto_3
    if-ltz v6, :cond_17

    .line 466
    .line 467
    add-int/2addr v6, v12

    .line 468
    if-gt v6, v9, :cond_17

    .line 469
    .line 470
    aget v6, v7, v8

    .line 471
    .line 472
    if-lt v11, v6, :cond_17

    .line 473
    .line 474
    add-int/2addr v11, v12

    .line 475
    aget v6, v7, v10

    .line 476
    .line 477
    if-le v11, v6, :cond_f

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :cond_f
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 481
    .line 482
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 483
    .line 484
    add-int/2addr v6, v7

    .line 485
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 486
    .line 487
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I

    .line 488
    .line 489
    add-int/2addr v7, v9

    .line 490
    filled-new-array {v6, v7}, [I

    .line 491
    .line 492
    .line 493
    move-result-object v13

    .line 494
    goto :goto_8

    .line 495
    :cond_10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 496
    .line 497
    .line 498
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzac(Landroid/app/Activity;)[I

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 503
    .line 504
    .line 505
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzY(Landroid/app/Activity;)[I

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    aget v6, v6, v8

    .line 510
    .line 511
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 512
    .line 513
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzf:I

    .line 514
    .line 515
    add-int/2addr v9, v11

    .line 516
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 517
    .line 518
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzg:I

    .line 519
    .line 520
    add-int/2addr v11, v13

    .line 521
    if-gez v9, :cond_11

    .line 522
    .line 523
    move v9, v8

    .line 524
    goto :goto_4

    .line 525
    :cond_11
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 526
    .line 527
    add-int v14, v9, v13

    .line 528
    .line 529
    if-le v14, v6, :cond_12

    .line 530
    .line 531
    sub-int v9, v6, v13

    .line 532
    .line 533
    :cond_12
    :goto_4
    aget v6, v7, v8

    .line 534
    .line 535
    if-ge v11, v6, :cond_13

    .line 536
    .line 537
    move v11, v6

    .line 538
    goto :goto_5

    .line 539
    :cond_13
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 540
    .line 541
    add-int v13, v11, v6

    .line 542
    .line 543
    aget v7, v7, v10

    .line 544
    .line 545
    if-le v13, v7, :cond_14

    .line 546
    .line 547
    sub-int v11, v7, v6

    .line 548
    .line 549
    :cond_14
    :goto_5
    filled-new-array {v9, v11}, [I

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    goto :goto_8

    .line 554
    :cond_15
    :goto_6
    const-string v6, "Height is too small or too large."

    .line 555
    .line 556
    sget v7, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 557
    .line 558
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_16
    :goto_7
    const-string v6, "Width is too small or too large."

    .line 563
    .line 564
    sget v7, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 565
    .line 566
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    :cond_17
    :goto_8
    if-nez v13, :cond_18

    .line 570
    .line 571
    const-string v0, "Resize location out of screen or close button is not visible."

    .line 572
    .line 573
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    monitor-exit v2

    .line 577
    return-void

    .line 578
    :cond_18
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 579
    .line 580
    .line 581
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 582
    .line 583
    invoke-static {v4, v6}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 588
    .line 589
    .line 590
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 591
    .line 592
    invoke-static {v4, v7}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    move-object v9, v5

    .line 597
    check-cast v9, Landroid/view/View;

    .line 598
    .line 599
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    instance-of v11, v9, Landroid/view/ViewGroup;

    .line 604
    .line 605
    if-eqz v11, :cond_1d

    .line 606
    .line 607
    check-cast v9, Landroid/view/ViewGroup;

    .line 608
    .line 609
    move-object v11, v5

    .line 610
    check-cast v11, Landroid/view/View;

    .line 611
    .line 612
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 613
    .line 614
    .line 615
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 616
    .line 617
    if-nez v11, :cond_19

    .line 618
    .line 619
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 620
    .line 621
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 622
    .line 623
    .line 624
    move-object v9, v5

    .line 625
    check-cast v9, Landroid/view/View;

    .line 626
    .line 627
    invoke-virtual {v9, v10}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 628
    .line 629
    .line 630
    move-object v9, v5

    .line 631
    check-cast v9, Landroid/view/View;

    .line 632
    .line 633
    invoke-virtual {v9}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 634
    .line 635
    .line 636
    move-result-object v9

    .line 637
    invoke-static {v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 638
    .line 639
    .line 640
    move-result-object v9

    .line 641
    move-object v11, v5

    .line 642
    check-cast v11, Landroid/view/View;

    .line 643
    .line 644
    invoke-virtual {v11, v8}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 645
    .line 646
    .line 647
    new-instance v11, Landroid/widget/ImageView;

    .line 648
    .line 649
    invoke-direct {v11, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 650
    .line 651
    .line 652
    iput-object v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzm:Landroid/widget/ImageView;

    .line 653
    .line 654
    invoke-virtual {v11, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 655
    .line 656
    .line 657
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzcjl;->zzN()Lcom/google/android/gms/internal/ads/zzclv;

    .line 658
    .line 659
    .line 660
    move-result-object v9

    .line 661
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzl:Lcom/google/android/gms/internal/ads/zzclv;

    .line 662
    .line 663
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 664
    .line 665
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzm:Landroid/widget/ImageView;

    .line 666
    .line 667
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 668
    .line 669
    .line 670
    goto :goto_9

    .line 671
    :cond_19
    invoke-virtual {v11}, Landroid/widget/PopupWindow;->dismiss()V

    .line 672
    .line 673
    .line 674
    :goto_9
    new-instance v9, Landroid/widget/RelativeLayout;

    .line 675
    .line 676
    invoke-direct {v9, v4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 677
    .line 678
    .line 679
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 680
    .line 681
    invoke-virtual {v9, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 682
    .line 683
    .line 684
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 685
    .line 686
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    .line 687
    .line 688
    invoke-direct {v11, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v9, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 692
    .line 693
    .line 694
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 695
    .line 696
    .line 697
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 698
    .line 699
    new-instance v11, Landroid/widget/PopupWindow;

    .line 700
    .line 701
    invoke-direct {v11, v9, v6, v7, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 702
    .line 703
    .line 704
    iput-object v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 705
    .line 706
    invoke-virtual {v11, v8}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 707
    .line 708
    .line 709
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 710
    .line 711
    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 712
    .line 713
    .line 714
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 715
    .line 716
    iget-boolean v11, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzb:Z

    .line 717
    .line 718
    xor-int/2addr v11, v10

    .line 719
    invoke-virtual {v9, v11}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 720
    .line 721
    .line 722
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 723
    .line 724
    check-cast v5, Landroid/view/View;

    .line 725
    .line 726
    const/4 v11, -0x1

    .line 727
    invoke-virtual {v9, v5, v11, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 728
    .line 729
    .line 730
    new-instance v5, Landroid/widget/LinearLayout;

    .line 731
    .line 732
    invoke-direct {v5, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 733
    .line 734
    .line 735
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzn:Landroid/widget/LinearLayout;

    .line 736
    .line 737
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 738
    .line 739
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 740
    .line 741
    .line 742
    invoke-static {v4, v12}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 743
    .line 744
    .line 745
    move-result v9

    .line 746
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 747
    .line 748
    .line 749
    invoke-static {v4, v12}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 750
    .line 751
    .line 752
    move-result v11

    .line 753
    invoke-direct {v5, v9, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 754
    .line 755
    .line 756
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zza:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 759
    .line 760
    .line 761
    move-result v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 762
    const/16 v12, 0x9

    .line 763
    .line 764
    const/16 v14, 0xe

    .line 765
    .line 766
    const/16 v15, 0xb

    .line 767
    .line 768
    move/from16 p1, v10

    .line 769
    .line 770
    const/16 v10, 0xc

    .line 771
    .line 772
    move/from16 v16, v8

    .line 773
    .line 774
    const/16 v8, 0xa

    .line 775
    .line 776
    sparse-switch v11, :sswitch_data_1

    .line 777
    .line 778
    .line 779
    goto :goto_a

    .line 780
    :sswitch_6
    const-string v10, "top-center"

    .line 781
    .line 782
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v9

    .line 786
    if-eqz v9, :cond_1a

    .line 787
    .line 788
    :try_start_7
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v5, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 792
    .line 793
    .line 794
    goto :goto_b

    .line 795
    :sswitch_7
    const-string v11, "bottom-center"

    .line 796
    .line 797
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v9

    .line 801
    if-eqz v9, :cond_1a

    .line 802
    .line 803
    :try_start_8
    invoke-virtual {v5, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v5, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 807
    .line 808
    .line 809
    goto :goto_b

    .line 810
    :sswitch_8
    const-string v11, "bottom-right"

    .line 811
    .line 812
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    if-eqz v9, :cond_1a

    .line 817
    .line 818
    :try_start_9
    invoke-virtual {v5, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v5, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 822
    .line 823
    .line 824
    goto :goto_b

    .line 825
    :sswitch_9
    const-string v11, "bottom-left"

    .line 826
    .line 827
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v9

    .line 831
    if-eqz v9, :cond_1a

    .line 832
    .line 833
    :try_start_a
    invoke-virtual {v5, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v5, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 837
    .line 838
    .line 839
    goto :goto_b

    .line 840
    :sswitch_a
    const-string v10, "top-left"

    .line 841
    .line 842
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v9

    .line 846
    if-eqz v9, :cond_1a

    .line 847
    .line 848
    :try_start_b
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v5, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 852
    .line 853
    .line 854
    goto :goto_b

    .line 855
    :sswitch_b
    const-string v10, "center"

    .line 856
    .line 857
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v9

    .line 861
    if-eqz v9, :cond_1a

    .line 862
    .line 863
    const/16 v8, 0xd

    .line 864
    .line 865
    :try_start_c
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 866
    .line 867
    .line 868
    goto :goto_b

    .line 869
    :cond_1a
    :goto_a
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v5, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 873
    .line 874
    .line 875
    :goto_b
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzn:Landroid/widget/LinearLayout;

    .line 876
    .line 877
    new-instance v9, Lcom/google/android/gms/internal/ads/zzbwp;

    .line 878
    .line 879
    invoke-direct {v9, v1}, Lcom/google/android/gms/internal/ads/zzbwp;-><init>(Lcom/google/android/gms/internal/ads/zzbwr;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 883
    .line 884
    .line 885
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzn:Landroid/widget/LinearLayout;

    .line 886
    .line 887
    const-string v9, "Close button"

    .line 888
    .line 889
    invoke-virtual {v8, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 890
    .line 891
    .line 892
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 893
    .line 894
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzn:Landroid/widget/LinearLayout;

    .line 895
    .line 896
    invoke-virtual {v8, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 897
    .line 898
    .line 899
    :try_start_d
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 900
    .line 901
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 906
    .line 907
    .line 908
    aget v8, v13, v16

    .line 909
    .line 910
    invoke-static {v4, v8}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 911
    .line 912
    .line 913
    move-result v8

    .line 914
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 915
    .line 916
    .line 917
    aget v9, v13, p1

    .line 918
    .line 919
    invoke-static {v4, v9}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 920
    .line 921
    .line 922
    move-result v4

    .line 923
    move/from16 v9, v16

    .line 924
    .line 925
    invoke-virtual {v5, v0, v9, v8, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 926
    .line 927
    .line 928
    :try_start_e
    aget v0, v13, v9

    .line 929
    .line 930
    aget v3, v13, p1

    .line 931
    .line 932
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzo:Lcom/google/android/gms/internal/ads/zzbwy;

    .line 933
    .line 934
    if-eqz v4, :cond_1b

    .line 935
    .line 936
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 937
    .line 938
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 939
    .line 940
    invoke-interface {v4, v0, v3, v5, v8}, Lcom/google/android/gms/internal/ads/zzbwy;->zza(IIII)V

    .line 941
    .line 942
    .line 943
    :cond_1b
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 944
    .line 945
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/zzclv;->zzc(II)Lcom/google/android/gms/internal/ads/zzclv;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaf(Lcom/google/android/gms/internal/ads/zzclv;)V

    .line 950
    .line 951
    .line 952
    const/16 v16, 0x0

    .line 953
    .line 954
    aget v0, v13, v16

    .line 955
    .line 956
    aget v3, v13, p1

    .line 957
    .line 958
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 959
    .line 960
    .line 961
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzk:Landroid/app/Activity;

    .line 962
    .line 963
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzY(Landroid/app/Activity;)[I

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    aget v4, v4, v16

    .line 968
    .line 969
    sub-int/2addr v3, v4

    .line 970
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzh:I

    .line 971
    .line 972
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zze:I

    .line 973
    .line 974
    invoke-virtual {v1, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzbwx;->zzi(IIII)V

    .line 975
    .line 976
    .line 977
    const-string v0, "resized"

    .line 978
    .line 979
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzk(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    monitor-exit v2

    .line 983
    return-void

    .line 984
    :catch_0
    move-exception v0

    .line 985
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    add-int/lit8 v4, v4, 0x1a

    .line 998
    .line 999
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzq:Landroid/widget/RelativeLayout;

    .line 1018
    .line 1019
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzj:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 1020
    .line 1021
    move-object v4, v3

    .line 1022
    check-cast v4, Landroid/view/View;

    .line 1023
    .line 1024
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1025
    .line 1026
    .line 1027
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 1028
    .line 1029
    if-eqz v0, :cond_1c

    .line 1030
    .line 1031
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzm:Landroid/widget/ImageView;

    .line 1032
    .line 1033
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzr:Landroid/view/ViewGroup;

    .line 1037
    .line 1038
    move-object v4, v3

    .line 1039
    check-cast v4, Landroid/view/View;

    .line 1040
    .line 1041
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1042
    .line 1043
    .line 1044
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbwr;->zzl:Lcom/google/android/gms/internal/ads/zzclv;

    .line 1045
    .line 1046
    invoke-interface {v3, v0}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaf(Lcom/google/android/gms/internal/ads/zzclv;)V

    .line 1047
    .line 1048
    .line 1049
    :cond_1c
    monitor-exit v2

    .line 1050
    return-void

    .line 1051
    :cond_1d
    const-string v0, "Webview is detached, probably in the middle of a resize or expand."

    .line 1052
    .line 1053
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    monitor-exit v2

    .line 1057
    return-void

    .line 1058
    :cond_1e
    :goto_c
    const-string v0, "Activity context is not ready, cannot get window or decor view."

    .line 1059
    .line 1060
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    monitor-exit v2

    .line 1064
    return-void

    .line 1065
    :cond_1f
    const-string v0, "Invalid width and height options. Cannot resize."

    .line 1066
    .line 1067
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbwx;->zzg(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    monitor-exit v2

    .line 1071
    return-void

    .line 1072
    :goto_d
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 1073
    throw v0

    .line 1074
    nop

    .line 1075
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x3c587281 -> :sswitch_4
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_2
        0x4ccee637 -> :sswitch_1
        0x68a23bcd -> :sswitch_0
    .end sparse-switch

    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_b
        -0x3c587281 -> :sswitch_a
        -0x27103597 -> :sswitch_9
        0x455fe3fa -> :sswitch_8
        0x4ccee637 -> :sswitch_7
        0x68a23bcd -> :sswitch_6
    .end sparse-switch
.end method

.method public final zzb(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzmm:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zzf:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 41
    .line 42
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbwq;

    .line 43
    .line 44
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/ads/zzbwq;-><init>(Lcom/google/android/gms/internal/ads/zzbwr;Z)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzgzy;->zza(Ljava/lang/Runnable;)Lj3/a;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbwr;->zzm(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public final zzc(IIZ)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p3

    .line 4
    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    .line 7
    .line 8
    monitor-exit p3

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
.end method

.method public final zzd()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzp:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public final zze(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzc:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbwr;->zzd:I

    return-void
.end method

.method public final synthetic zzf(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbwr;->zzm(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
