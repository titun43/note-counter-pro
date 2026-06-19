package com.capacitorjs.plugins.filesystem;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.getcapacitor.PluginCall;
import f4.p;
import g4.i;
import o3.k;
import r3.c0;
import r3.f0;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$writeFile$1", f = "FilesystemPlugin.kt", l = {113}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$writeFile$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ WriteFileOptions $input;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$writeFile$1(FilesystemPlugin filesystemPlugin, WriteFileOptions writeFileOptions, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$input = writeFileOptions;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$writeFile$1 filesystemPlugin$writeFile$1 = new FilesystemPlugin$writeFile$1(this.this$0, this.$input, this.$call, cVar);
        filesystemPlugin$writeFile$1.L$0 = obj;
        return filesystemPlugin$writeFile$1;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object i5;
        String path;
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        int i6 = this.label;
        if (i6 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            c0 options = this.$input.getOptions();
            this.L$0 = f0Var;
            this.label = 1;
            i5 = controller.i(f0Var, options, this);
            if (i5 == aVar) {
                return aVar;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            i5 = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        WriteFileOptions writeFileOptions = this.$input;
        FilesystemPlugin filesystemPlugin = this.this$0;
        if (!(i5 instanceof d)) {
            Uri uri = (Uri) i5;
            if (f0Var.B() && (path = uri.getPath()) != null) {
                MediaScannerConnection.scanFile(filesystemPlugin.getContext(), new String[]{path}, null, null);
            }
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, FilesystemMethodResultsKt.createWriteResultObject(uri, writeFileOptions.getOptions().f3174c), false, 2, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(i5);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$writeFile$1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
