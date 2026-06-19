.class public final Landroidx/activity/ComponentActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic g:Landroidx/activity/s;


# direct methods
.method public constructor <init>(Landroidx/activity/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/ComponentActivity$4;->g:Landroidx/activity/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/activity/ComponentActivity$4;->g:Landroidx/activity/s;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/activity/s;->access$ensureViewModelStore(Landroidx/activity/s;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/activity/s;->getLifecycle()Landroidx/lifecycle/o;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->b(Landroidx/lifecycle/s;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
