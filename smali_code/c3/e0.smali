.class public abstract Lc3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt2/d;

.field public static final b:[Lt2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lt2/d;

    .line 2
    .line 3
    const-string v1, "name_ulr_private"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lt2/d;

    .line 11
    .line 12
    const-string v4, "name_sleep_segment_request"

    .line 13
    .line 14
    invoke-direct {v1, v4, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 15
    .line 16
    .line 17
    new-instance v4, Lt2/d;

    .line 18
    .line 19
    const-string v5, "support_context_feature_id"

    .line 20
    .line 21
    invoke-direct {v4, v5, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 22
    .line 23
    .line 24
    sput-object v4, Lc3/e0;->a:Lt2/d;

    .line 25
    .line 26
    new-instance v5, Lt2/d;

    .line 27
    .line 28
    const-string v6, "get_current_location"

    .line 29
    .line 30
    invoke-direct {v5, v6, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lt2/d;

    .line 34
    .line 35
    const-string v7, "get_last_activity_feature_id"

    .line 36
    .line 37
    invoke-direct {v6, v7, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 38
    .line 39
    .line 40
    filled-new-array {v0, v1, v4, v5, v6}, [Lt2/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lc3/e0;->b:[Lt2/d;

    .line 45
    .line 46
    return-void
.end method
