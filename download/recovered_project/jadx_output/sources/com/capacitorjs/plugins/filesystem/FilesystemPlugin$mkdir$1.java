package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.p;
import g4.i;
import o3.k;
import r3.f0;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$mkdir$1", f = "FilesystemPlugin.kt", l = {161}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$mkdir$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ SingleUriWithRecursiveOptions $input;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$mkdir$1(FilesystemPlugin filesystemPlugin, SingleUriWithRecursiveOptions singleUriWithRecursiveOptions, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$input = singleUriWithRecursiveOptions;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$mkdir$1 filesystemPlugin$mkdir$1 = new FilesystemPlugin$mkdir$1(this.this$0, this.$input, this.$call, cVar);
        filesystemPlugin$mkdir$1.L$0 = obj;
        return filesystemPlugin$mkdir$1;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object b2;
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            r3.a aVar2 = new r3.a(this.$input.getRecursive());
            this.L$0 = null;
            this.label = 1;
            b2 = controller.b(f0Var, aVar2, this);
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            b2 = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        if (!(b2 instanceof d)) {
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, null, false, 3, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(b2);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$mkdir$1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
