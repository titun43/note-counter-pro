package com.getcapacitor.community.admob.banner;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.helpers.AdViewIdHelper;
import com.getcapacitor.community.admob.helpers.RequestHelper;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.AdOptions;
import com.getcapacitor.community.admob.models.Executor;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import e0.d;

/* loaded from: classes.dex */
public class BannerExecutor extends Executor {
    private final JSObject emptyObject;
    private AdView mAdView;
    private RelativeLayout mAdViewLayout;
    private ViewGroup mViewGroup;

    public BannerExecutor(d dVar, d dVar2, x2.a aVar, String str) {
        super(dVar, dVar2, aVar, str, "BannerExecutor");
        this.emptyObject = new JSObject();
    }

    private void createNewAdView(AdOptions adOptions) {
        ((Activity) this.activitySupplier.get()).runOnUiThread(new c(this, adOptions, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createNewAdView$5(AdOptions adOptions) {
        AdRequest createRequest = RequestHelper.createRequest(adOptions);
        AdViewIdHelper.assignIdToAdView(this.mAdView, adOptions, createRequest, this.logTag, (Context) this.contextSupplier.get());
        this.mAdViewLayout.addView(this.mAdView);
        this.mAdView.loadAd(createRequest);
        this.mAdView.setAdListener(new AdListener() { // from class: com.getcapacitor.community.admob.banner.BannerExecutor.1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.Closed.getWebEventName(), BannerExecutor.this.emptyObject);
                super.onAdClosed();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                if (BannerExecutor.this.mAdView != null) {
                    BannerExecutor.this.mViewGroup.removeView(BannerExecutor.this.mAdViewLayout);
                    BannerExecutor.this.mAdViewLayout.removeView(BannerExecutor.this.mAdView);
                    BannerExecutor.this.mAdView.destroy();
                    BannerExecutor.this.mAdView = null;
                }
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.SizeChanged.getWebEventName(), new BannerAdSizeInfo(0, 0));
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.FailedToLoad.getWebEventName(), new AdMobPluginError(loadAdError));
                super.onAdFailedToLoad(loadAdError);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.AdImpression.getWebEventName(), BannerExecutor.this.emptyObject);
                super.onAdImpression();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.SizeChanged.getWebEventName(), new BannerAdSizeInfo(BannerExecutor.this.mAdView));
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.Loaded.getWebEventName(), BannerExecutor.this.emptyObject);
                super.onAdLoaded();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                BannerExecutor.this.notifyListeners(BannerAdPluginEvents.Opened.getWebEventName(), BannerExecutor.this.emptyObject);
                super.onAdOpened();
            }
        });
        this.mViewGroup.addView(this.mAdViewLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideBanner$1(PluginCall pluginCall) {
        RelativeLayout relativeLayout = this.mAdViewLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            this.mAdView.pause();
            notifyListeners(BannerAdPluginEvents.SizeChanged.getWebEventName(), new BannerAdSizeInfo(0, 0));
            pluginCall.resolve();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeBanner$3() {
        if (this.mAdView != null) {
            this.mViewGroup.removeView(this.mAdViewLayout);
            this.mAdViewLayout.removeView(this.mAdView);
            this.mAdView.destroy();
            this.mAdView = null;
            Log.d(this.logTag, "Banner AD Removed");
            notifyListeners(BannerAdPluginEvents.SizeChanged.getWebEventName(), new BannerAdSizeInfo(0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeBanner$2() {
        RelativeLayout relativeLayout = this.mAdViewLayout;
        if (relativeLayout == null || this.mAdView == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        this.mAdView.resume();
        notifyListeners(BannerAdPluginEvents.SizeChanged.getWebEventName(), new BannerAdSizeInfo(this.mAdView));
        Log.d(this.logTag, "Banner AD Resumed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets lambda$showBanner$0(AdOptions adOptions, s.d dVar, View view, WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ("TOP_CENTER".equals(adOptions.position)) {
            dVar.setMargins(0, systemWindowInsetTop, 0, 0);
        } else {
            dVar.setMargins(0, 0, 0, systemWindowInsetBottom);
        }
        this.mAdViewLayout.setLayoutParams(dVar);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateExistingAdView$4(AdOptions adOptions) {
        this.mAdView.loadAd(RequestHelper.createRequest(adOptions));
    }

    private void updateExistingAdView(AdOptions adOptions) {
        ((Activity) this.activitySupplier.get()).runOnUiThread(new c(this, adOptions, 0));
    }

    public void hideBanner(PluginCall pluginCall) {
        if (this.mAdView == null) {
            pluginCall.reject("You tried to hide a banner that was never shown");
            return;
        }
        try {
            ((Activity) this.activitySupplier.get()).runOnUiThread(new a2.b(5, this, pluginCall));
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    public void initialize() {
        this.mViewGroup = (ViewGroup) ((ViewGroup) ((Activity) this.activitySupplier.get()).findViewById(R.id.content)).getChildAt(0);
    }

    public void removeBanner(PluginCall pluginCall) {
        try {
            if (this.mAdView != null) {
                ((Activity) this.activitySupplier.get()).runOnUiThread(new b(this, 1));
            }
            pluginCall.resolve();
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    public void resumeBanner(PluginCall pluginCall) {
        try {
            ((Activity) this.activitySupplier.get()).runOnUiThread(new b(this, 0));
            pluginCall.resolve();
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0146, code lost:
    
        r7 = (r4 - r3) / 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:10:0x006b, B:12:0x0086, B:13:0x00a9, B:18:0x00f2, B:19:0x00f4, B:21:0x00fa, B:22:0x0112, B:24:0x012b, B:27:0x0138, B:29:0x013d, B:30:0x0140, B:31:0x014c, B:35:0x0146, B:36:0x0149, B:37:0x00d8, B:39:0x00e0, B:40:0x00e5, B:42:0x00ed, B:43:0x0095), top: B:9:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:10:0x006b, B:12:0x0086, B:13:0x00a9, B:18:0x00f2, B:19:0x00f4, B:21:0x00fa, B:22:0x0112, B:24:0x012b, B:27:0x0138, B:29:0x013d, B:30:0x0140, B:31:0x014c, B:35:0x0146, B:36:0x0149, B:37:0x00d8, B:39:0x00e0, B:40:0x00e5, B:42:0x00ed, B:43:0x0095), top: B:9:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:10:0x006b, B:12:0x0086, B:13:0x00a9, B:18:0x00f2, B:19:0x00f4, B:21:0x00fa, B:22:0x0112, B:24:0x012b, B:27:0x0138, B:29:0x013d, B:30:0x0140, B:31:0x014c, B:35:0x0146, B:36:0x0149, B:37:0x00d8, B:39:0x00e0, B:40:0x00e5, B:42:0x00ed, B:43:0x0095), top: B:9:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showBanner(PluginCall pluginCall) {
        int i5;
        int width;
        final AdOptions createBannerOptions = AdOptions.getFactory().createBannerOptions(pluginCall);
        float f5 = ((Context) this.contextSupplier.get()).getResources().getDisplayMetrics().density;
        int i6 = ((Context) this.contextSupplier.get()).getResources().getDisplayMetrics().widthPixels;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.activitySupplier.get()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i7 = displayMetrics.widthPixels;
        int i8 = 0;
        boolean z4 = (((Activity) this.activitySupplier.get()).getWindow().getAttributes().flags & 1024) != 0;
        if (this.mAdView != null) {
            updateExistingAdView(createBannerOptions);
            return;
        }
        try {
            this.mAdView = new AdView((Context) this.contextSupplier.get());
            if (createBannerOptions.adSize.toString().equals("ADAPTIVE_BANNER")) {
                this.mAdView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize((Context) this.contextSupplier.get(), (int) (i6 / f5)));
            } else {
                this.mAdView.setAdSize(createBannerOptions.adSize.getSize());
            }
            RelativeLayout relativeLayout = new RelativeLayout((Context) this.contextSupplier.get());
            this.mAdViewLayout = relativeLayout;
            relativeLayout.setHorizontalGravity(1);
            this.mAdViewLayout.setVerticalGravity(80);
            final s.d dVar = new s.d();
            String str = createBannerOptions.position;
            int hashCode = str.hashCode();
            if (hashCode == 1984282709) {
                if (str.equals("CENTER")) {
                    dVar.f3274b = 17;
                    if (Build.VERSION.SDK_INT >= 35) {
                    }
                    this.mAdViewLayout.setLayoutParams(dVar);
                    i5 = (int) (createBannerOptions.margin * f5);
                    width = (int) (createBannerOptions.adSize.getSize().getWidth() * f5);
                    if (width > 0) {
                    }
                    dVar.setMargins(i8, i5, i8, i5);
                    createNewAdView(createBannerOptions);
                    pluginCall.resolve();
                    return;
                }
                dVar.f3274b = 80;
                if (Build.VERSION.SDK_INT >= 35) {
                }
                this.mAdViewLayout.setLayoutParams(dVar);
                i5 = (int) (createBannerOptions.margin * f5);
                width = (int) (createBannerOptions.adSize.getSize().getWidth() * f5);
                if (width > 0) {
                }
                dVar.setMargins(i8, i5, i8, i5);
                createNewAdView(createBannerOptions);
                pluginCall.resolve();
                return;
            }
            if (hashCode == 2001412767 && str.equals("TOP_CENTER")) {
                dVar.f3274b = 48;
                if (Build.VERSION.SDK_INT >= 35) {
                    ((Activity) this.activitySupplier.get()).getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.getcapacitor.community.admob.banner.a
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            WindowInsets lambda$showBanner$0;
                            lambda$showBanner$0 = BannerExecutor.this.lambda$showBanner$0(createBannerOptions, dVar, view, windowInsets);
                            return lambda$showBanner$0;
                        }
                    });
                }
                this.mAdViewLayout.setLayoutParams(dVar);
                i5 = (int) (createBannerOptions.margin * f5);
                width = (int) (createBannerOptions.adSize.getSize().getWidth() * f5);
                if (width > 0 && !createBannerOptions.adSize.toString().equals("ADAPTIVE_BANNER")) {
                    int i9 = (i6 - width) / 2;
                    if (z4) {
                        i9 = (i7 - width) / 2;
                    }
                    dVar.setMargins(i9, i5, i9, i5);
                    createNewAdView(createBannerOptions);
                    pluginCall.resolve();
                    return;
                }
                dVar.setMargins(i8, i5, i8, i5);
                createNewAdView(createBannerOptions);
                pluginCall.resolve();
                return;
            }
            dVar.f3274b = 80;
            if (Build.VERSION.SDK_INT >= 35) {
            }
            this.mAdViewLayout.setLayoutParams(dVar);
            i5 = (int) (createBannerOptions.margin * f5);
            width = (int) (createBannerOptions.adSize.getSize().getWidth() * f5);
            if (width > 0) {
                int i92 = (i6 - width) / 2;
                if (z4) {
                }
                dVar.setMargins(i92, i5, i92, i5);
                createNewAdView(createBannerOptions);
                pluginCall.resolve();
                return;
            }
            dVar.setMargins(i8, i5, i8, i5);
            createNewAdView(createBannerOptions);
            pluginCall.resolve();
            return;
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
        pluginCall.reject(e4.getLocalizedMessage(), e4);
    }
}
