.class public final synthetic Ly1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ly1/w;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ly1/w;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/s;->a:Ly1/w;

    .line 5
    .line 6
    iput p2, p0, Ly1/s;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/zzr;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/s;->a:Ly1/w;

    .line 2
    .line 3
    iget v1, p0, Ly1/s;->b:I

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v0, Ly1/w;->B:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Ly1/w;->B:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 10
    .line 11
    iget-object v3, v0, Ly1/w;->z:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const-string v1, "QUERY_SKU_DETAILS_ASYNC"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :pswitch_0
    const-string v1, "QUERY_PRODUCT_DETAILS_ASYNC"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    const-string v1, "START_CONNECTION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    const-string v1, "IS_FEATURE_SUPPORTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_3
    const-string v1, "CONSUME_ASYNC"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_4
    const-string v1, "ACKNOWLEDGE_PURCHASE"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_5
    const-string v1, "LAUNCH_BILLING_FLOW"

    .line 41
    .line 42
    :goto_0
    new-instance v4, Ly1/u;

    .line 43
    .line 44
    invoke-direct {v4, p1}, Ly1/u;-><init>(Lcom/google/android/gms/internal/play_billing/zzr;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v3, v1, v4}, Lcom/google/android/gms/internal/play_billing/zzav;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzax;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    const/4 v1, 0x0

    .line 52
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :goto_1
    const/16 v2, 0x1c

    .line 54
    .line 55
    sget-object v3, Ly1/b0;->q:Ly1/e;

    .line 56
    .line 57
    const/16 v4, 0x6b

    .line 58
    .line 59
    invoke-virtual {v0, v4, v2, v3}, Ly1/w;->A(IILy1/e;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "BillingClientTesting"

    .line 63
    .line 64
    const-string v2, "An error occurred while retrieving billing override."

    .line 65
    .line 66
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzr;->zzb(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :goto_2
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
