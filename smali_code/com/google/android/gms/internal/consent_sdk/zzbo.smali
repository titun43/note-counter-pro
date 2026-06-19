.class public final synthetic Lcom/google/android/gms/internal/consent_sdk/zzbo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/l;


# instance fields
.field public final synthetic zza:Landroid/app/Activity;

.field public final synthetic zzb:Li3/c;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Li3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbo;->zza:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzbo;->zzb:Li3/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onConsentFormLoadSuccess(Li3/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzbo;->zza:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbo;->zzb:Li3/c;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Li3/d;->show(Landroid/app/Activity;Li3/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
