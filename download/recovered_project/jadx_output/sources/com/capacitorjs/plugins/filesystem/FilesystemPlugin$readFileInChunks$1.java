package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import com.google.android.gms.ads.RequestConfiguration;
import f4.p;
import f4.q;
import g4.i;
import o3.k;
import o4.t;
import o4.w;
import r3.f0;
import r3.z;
import t3.h;
import u1.f;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1", f = "FilesystemPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$readFileInChunks$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ ReadFileInChunksOptions $input;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    @e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$1", f = "FilesystemPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends g implements p {
        final /* synthetic */ PluginCall $call;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PluginCall pluginCall, c cVar) {
            super(2, cVar);
            this.$call = pluginCall;
        }

        @Override // y3.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // y3.a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            x3.a aVar = x3.a.f3712g;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            PluginResultExtensionsKt.sendSuccess(this.$call, FilesystemMethodResultsKt.createReadResultObject(str), true);
            return h.f3400a;
        }

        @Override // f4.p
        public final Object invoke(String str, c cVar) {
            return ((AnonymousClass1) create(str, cVar)).invokeSuspend(h.f3400a);
        }
    }

    @e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$2", f = "FilesystemPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends g implements q {
        final /* synthetic */ PluginCall $call;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PluginCall pluginCall, c cVar) {
            super(3, cVar);
            this.$call = pluginCall;
        }

        @Override // y3.a
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            x3.a aVar = x3.a.f3712g;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            if (th == null) {
                PluginResultExtensionsKt.sendSuccess$default(this.$call, FilesystemMethodResultsKt.createReadResultObject(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), false, 2, null);
            }
            return h.f3400a;
        }

        @Override // f4.q
        public final Object invoke(r4.c cVar, Throwable th, c cVar2) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$call, cVar2);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(h.f3400a);
        }
    }

    @e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$3", f = "FilesystemPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.capacitorjs.plugins.filesystem.FilesystemPlugin$readFileInChunks$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends g implements q {
        final /* synthetic */ PluginCall $call;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PluginCall pluginCall, c cVar) {
            super(3, cVar);
            this.$call = pluginCall;
        }

        @Override // y3.a
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            x3.a aVar = x3.a.f3712g;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            PluginCall pluginCall = this.$call;
            String methodName = pluginCall.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall, FilesystemErrorsKt.toFilesystemError(th, methodName));
            return h.f3400a;
        }

        @Override // f4.q
        public final Object invoke(r4.c cVar, Throwable th, c cVar2) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$call, cVar2);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(h.f3400a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$readFileInChunks$1(FilesystemPlugin filesystemPlugin, ReadFileInChunksOptions readFileInChunksOptions, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$input = readFileInChunksOptions;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$readFileInChunks$1 filesystemPlugin$readFileInChunks$1 = new FilesystemPlugin$readFileInChunks$1(this.this$0, this.$input, this.$call, cVar);
        filesystemPlugin$readFileInChunks$1.L$0 = obj;
        return filesystemPlugin$readFileInChunks$1;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        t coroutineScope;
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b3.g.x(obj);
        controller = this.this$0.getController();
        z options = this.$input.getOptions();
        controller.getClass();
        i.e(f0Var, "uri");
        i.e(options, "options");
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(new r4.h(new androidx.emoji2.text.p(18, new f(new o3.i(options, controller, f0Var, (c) null)), new AnonymousClass1(this.$call, null)), new AnonymousClass2(this.$call, null)), new AnonymousClass3(this.$call, null));
        coroutineScope = this.this$0.getCoroutineScope();
        w.i(coroutineScope, new r4.e(pVar, null, 0));
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$readFileInChunks$1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
