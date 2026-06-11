package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.p;
import g4.i;
import o3.k;
import r3.f0;
import r3.y;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$stat$1", f = "FilesystemPlugin.kt", l = {213}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$stat$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$stat$1(FilesystemPlugin filesystemPlugin, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$stat$1 filesystemPlugin$stat$1 = new FilesystemPlugin$stat$1(this.this$0, this.$call, cVar);
        filesystemPlugin$stat$1.L$0 = obj;
        return filesystemPlugin$stat$1;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object e4;
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            this.L$0 = null;
            this.label = 1;
            e4 = controller.e(f0Var, this);
            if (e4 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            e4 = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        if (!(e4 instanceof d)) {
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, FilesystemMethodResultsKt.toResultObject((y) e4), false, 2, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(e4);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$stat$1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
