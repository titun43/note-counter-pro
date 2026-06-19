.class public abstract Landroidx/work/impl/WorkDatabase;
.super Lz0/i;
.source "SourceFile"


# static fields
.field public static final j:J

.field public static final synthetic k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Landroidx/work/impl/WorkDatabase;->j:J

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz0/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract i()Landroidx/emoji2/text/p;
.end method

.method public abstract j()Landroidx/emoji2/text/p;
.end method

.method public abstract k()Landroidx/emoji2/text/t;
.end method

.method public abstract l()Landroidx/emoji2/text/p;
.end method

.method public abstract m()Lr1/h;
.end method

.method public abstract n()Ll2/j;
.end method

.method public abstract o()Landroidx/emoji2/text/p;
.end method
