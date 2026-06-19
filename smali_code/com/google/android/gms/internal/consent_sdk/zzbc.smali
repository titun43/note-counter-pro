.class final Lcom/google/android/gms/internal/consent_sdk/zzbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/l;
.implements Li3/k;


# instance fields
.field private final zza:Li3/l;

.field private final zzb:Li3/k;


# direct methods
.method public synthetic constructor <init>(Li3/l;Li3/k;Lcom/google/android/gms/internal/consent_sdk/zzbd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbc;->zza:Li3/l;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzbc;->zzb:Li3/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onConsentFormLoadFailure(Li3/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzbc;->zzb:Li3/k;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li3/k;->onConsentFormLoadFailure(Li3/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onConsentFormLoadSuccess(Li3/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzbc;->zza:Li3/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li3/l;->onConsentFormLoadSuccess(Li3/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
