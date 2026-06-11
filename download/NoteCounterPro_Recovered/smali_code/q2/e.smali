.class public abstract Lq2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt2/d;

.field public static final b:[Lt2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt2/d;

    .line 2
    .line 3
    const-string v1, "app_set_id"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Lt2/d;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lq2/e;->a:Lt2/d;

    .line 11
    .line 12
    filled-new-array {v0}, [Lt2/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lq2/e;->b:[Lt2/d;

    .line 17
    .line 18
    return-void
.end method
