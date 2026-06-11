package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.p;
import g4.i;
import o3.k;
import r3.a0;
import r3.f0;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFile$1", f = "FilesystemPlugin.kt", l = {77}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$readFile$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ ReadFileOptions $input;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$readFile$1(FilesystemPlugin filesystemPlugin, ReadFileOptions readFileOptions, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$input = readFileOptions;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$readFile$1 filesystemPlugin$readFile$1 = new FilesystemPlugin$readFile$1(this.this$0, this.$input, this.$call, cVar);
        filesystemPlugin$readFile$1.L$0 = obj;
        return filesystemPlugin$readFile$1;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object h;
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            a0 options = this.$input.getOptions();
            this.L$0 = null;
            this.label = 1;
            h = controller.h(f0Var, options, this);
            if (h == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            h = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        if (!(h instanceof d)) {
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, FilesystemMethodResultsKt.createReadResultObject((String) h), false, 2, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(h);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$readFile$1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
