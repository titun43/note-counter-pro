package com.capacitorjs.plugins.filesystem;

import android.os.Handler;
import com.capacitorjs.plugins.filesystem.LegacyFilesystemImplementation;
import com.getcapacitor.Bridge;
import com.getcapacitor.PluginCall;
import com.getcapacitor.plugin.util.HttpRequestHandler;
import t3.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f4.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LegacyFilesystemImplementation f841g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PluginCall f842i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bridge f843j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HttpRequestHandler.ProgressEmitter f844k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Handler f845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LegacyFilesystemImplementation.FilesystemDownloadCallback f846m;

    public /* synthetic */ a(LegacyFilesystemImplementation legacyFilesystemImplementation, String str, PluginCall pluginCall, Bridge bridge, HttpRequestHandler.ProgressEmitter progressEmitter, Handler handler, LegacyFilesystemImplementation.FilesystemDownloadCallback filesystemDownloadCallback) {
        this.f841g = legacyFilesystemImplementation;
        this.h = str;
        this.f842i = pluginCall;
        this.f843j = bridge;
        this.f844k = progressEmitter;
        this.f845l = handler;
        this.f846m = filesystemDownloadCallback;
    }

    @Override // f4.a
    public final Object invoke() {
        h downloadFile$lambda$0;
        downloadFile$lambda$0 = LegacyFilesystemImplementation.downloadFile$lambda$0(this.f841g, this.h, this.f842i, this.f843j, this.f844k, this.f845l, this.f846m);
        return downloadFile$lambda$0;
    }
}
