(globalThis.TURBOPACK || (globalThis.TURBOPACK = [])).push(["object" == typeof document ? document.currentScript : void 0, 82568, e => {
    "use strict";
    var t, n, r, s, i, a, o, l;
    let c, d, u, m, h, p;
    (s = t || (t = {})).Unimplemented = "UNIMPLEMENTED", s.Unavailable = "UNAVAILABLE";
    class w extends Error {
        constructor(e, t, n) {
            super(e), this.message = e, this.code = t, this.data = n
        }
    }
    let g = (c = (a = i = "u" > typeof globalThis ? globalThis : "u" > typeof self ? self : "u" > typeof window ? window : e.g).CapacitorCustomPlatform || null, u = (d = a.Capacitor || {}).Plugins = d.Plugins || {}, m = () => {
            var e, t;
            return null !== c ? c.name : (null == a ? void 0 : a.androidBridge) ? "android" : (null == (t = null == (e = null == a ? void 0 : a.webkit) ? void 0 : e.messageHandlers) ? void 0 : t.bridge) ? "ios" : "web"
        }, h = e => {
            var t;
            return null == (t = d.PluginHeaders) ? void 0 : t.find(t => t.name === e)
        }, p = new Map, d.convertFileSrc || (d.convertFileSrc = e => e), d.getPlatform = m, d.handleError = e => a.console.error(e), d.isNativePlatform = () => "web" !== m(), d.isPluginAvailable = e => {
            let t = p.get(e);
            return !!((null == t ? void 0 : t.platforms.has(m())) || h(e))
        }, d.registerPlugin = (e, n = {}) => {
            let r, s = p.get(e);
            if (s) return console.warn(`Capacitor plugin "${e}" already registered. Cannot register plugins twice.`), s.proxy;
            let i = m(),
                a = h(e),
                o = async () => (!r && i in n ? r = r = "function" == typeof n[i] ? await n[i]() : n[i] : null !== c && !r && "web" in n && (r = r = "function" == typeof n.web ? await n.web() : n.web), r), l = n => {
                    let r, s = (...s) => {
                        let l = o().then(o => {
                            let l = ((n, r) => {
                                var s, o;
                                if (a) {
                                    let t = null == a ? void 0 : a.methods.find(e => r === e.name);
                                    if (t)
                                        if ("promise" === t.rtype) return t => d.nativePromise(e, r.toString(), t);
                                        else return (t, n) => d.nativeCallback(e, r.toString(), t, n);
                                    if (n) return null == (s = n[r]) ? void 0 : s.bind(n)
                                } else if (n) return null == (o = n[r]) ? void 0 : o.bind(n);
                                else throw new w(`"${e}" plugin is not implemented on ${i}`, t.Unimplemented)
                            })(o, n);
                            if (l) {
                                let e = l(...s);
                                return r = null == e ? void 0 : e.remove, e
                            }
                            throw new w(`"${e}.${n}()" is not implemented on ${i}`, t.Unimplemented)
                        });
                        return "addListener" === n && (l.remove = async () => r()), l
                    };
                    return s.toString = () => `${n.toString()}() { [capacitor code] }`, Object.defineProperty(s, "name", {
                        value: n,
                        writable: !1,
                        configurable: !1
                    }), s
                }, g = l("addListener"), b = l("removeListener"), f = (e, t) => {
                    let n = g({
                            eventName: e
                        }, t),
                        r = async () => {
                            b({
                                eventName: e,
                                callbackId: await n
                            }, t)
                        }, s = new Promise(e => n.then(() => e({
                            remove: r
                        })));
                    return s.remove = async () => {
                        console.warn("Using addListener() without 'await' is deprecated."), await r()
                    }, s
                }, y = new Proxy({}, {
                    get(e, t) {
                        switch (t) {
                            case "$$typeof":
                                return;
                            case "toJSON":
                                return () => ({});
                            case "addListener":
                                return a ? f : g;
                            case "removeListener":
                                return b;
                            default:
                                return l(t)
                        }
                    }
                });
            return u[e] = y, p.set(e, {
                name: e,
                proxy: y,
                platforms: new Set([...Object.keys(n), ...a ? [i] : []])
            }), y
        }, d.Exception = w, d.DEBUG = !!d.DEBUG, d.isLoggingEnabled = !!d.isLoggingEnabled, i.Capacitor = d),
        b = g.registerPlugin;
    class f {
        constructor() {
            this.listeners = {}, this.retainedEventArguments = {}, this.windowListeners = {}
        }
        addListener(e, t) {
            let n = !1;
            this.listeners[e] || (this.listeners[e] = [], n = !0), this.listeners[e].push(t);
            let r = this.windowListeners[e];
            return r && !r.registered && this.addWindowListener(r), n && this.sendRetainedArgumentsForEvent(e), Promise.resolve({
                remove: async () => this.removeListener(e, t)
            })
        }
        async removeAllListeners() {
            for (let e in this.listeners = {}, this.windowListeners) this.removeWindowListener(this.windowListeners[e]);
            this.windowListeners = {}
        }
        notifyListeners(e, t, n) {
            let r = this.listeners[e];
            if (!r) {
                if (n) {
                    let n = this.retainedEventArguments[e];
                    n || (n = []), n.push(t), this.retainedEventArguments[e] = n
                }
                return
            }
            r.forEach(e => e(t))
        }
        hasListeners(e) {
            var t;
            return !!(null == (t = this.listeners[e]) ? void 0 : t.length)
        }
        registerWindowListener(e, t) {
            this.windowListeners[t] = {
                registered: !1,
                windowEventName: e,
                pluginEventName: t,
                handler: e => {
                    this.notifyListeners(t, e)
                }
            }
        }
        unimplemented(e = "not implemented") {
            return new g.Exception(e, t.Unimplemented)
        }
        unavailable(e = "not available") {
            return new g.Exception(e, t.Unavailable)
        }
        async removeListener(e, t) {
            let n = this.listeners[e];
            if (!n) return;
            let r = n.indexOf(t);
            this.listeners[e].splice(r, 1), this.listeners[e].length || this.removeWindowListener(this.windowListeners[e])
        }
        addWindowListener(e) {
            window.addEventListener(e.windowEventName, e.handler), e.registered = !0
        }
        removeWindowListener(e) {
            e && (window.removeEventListener(e.windowEventName, e.handler), e.registered = !1)
        }
        sendRetainedArgumentsForEvent(e) {
            let t = this.retainedEventArguments[e];
            t && (delete this.retainedEventArguments[e], t.forEach(t => {
                this.notifyListeners(e, t)
            }))
        }
    }
    let y = e => encodeURIComponent(e).replace(/%(2[346B]|5E|60|7C)/g, decodeURIComponent).replace(/[()]/g, escape);
    class v extends f {
        async getCookies() {
            let e = document.cookie,
                t = {};
            return e.split(";").forEach(e => {
                if (e.length <= 0) return;
                let [n, r] = e.replace(/=/, "CAP_COOKIE").split("CAP_COOKIE");
                n = n.replace(/(%[\dA-F]{2})+/gi, decodeURIComponent).trim(), r = r.replace(/(%[\dA-F]{2})+/gi, decodeURIComponent).trim(), t[n] = r
            }), t
        }
        async setCookie(e) {
            try {
                let t = y(e.key),
                    n = y(e.value),
                    r = e.expires ? `; expires=${e.expires.replace("expires=","")}` : "",
                    s = (e.path || "/").replace("path=", ""),
                    i = null != e.url && e.url.length > 0 ? `domain=${e.url}` : "";
                document.cookie = `${t}=${n||""}${r}; path=${s}; ${i};`
            } catch (e) {
                return Promise.reject(e)
            }
        }
        async deleteCookie(e) {
            try {
                document.cookie = `${e.key}=; Max-Age=0`
            } catch (e) {
                return Promise.reject(e)
            }
        }
        async clearCookies() {
            try {
                for (let e of document.cookie.split(";") || []) document.cookie = e.replace(/^ +/, "").replace(/=.*/, `=;expires=${new Date().toUTCString()};path=/`)
            } catch (e) {
                return Promise.reject(e)
            }
        }
        async clearAllCookies() {
            try {
                await this.clearCookies()
            } catch (e) {
                return Promise.reject(e)
            }
        }
    }
    b("CapacitorCookies", {
        web: () => new v
    });
    let E = async e => new Promise((t, n) => {
        let r = new FileReader;
        r.onload = () => {
            let e = r.result;
            t(e.indexOf(",") >= 0 ? e.split(",")[1] : e)
        }, r.onerror = e => n(e), r.readAsDataURL(e)
    }), L = (e, t = {}) => {
        let n = Object.assign({
                method: e.method || "GET",
                headers: e.headers
            }, t),
            r = ((e = {}) => {
                let t = Object.keys(e);
                return Object.keys(e).map(e => e.toLocaleLowerCase()).reduce((n, r, s) => (n[r] = e[t[s]], n), {})
            })(e.headers)["content-type"] || "";
        if ("string" == typeof e.data) n.body = e.data;
        else if (r.includes("application/x-www-form-urlencoded")) {
            let t = new URLSearchParams;
            for (let [n, r] of Object.entries(e.data || {})) t.set(n, r);
            n.body = t.toString()
        } else if (r.includes("multipart/form-data") || e.data instanceof FormData) {
            let t = new FormData;
            if (e.data instanceof FormData) e.data.forEach((e, n) => {
                t.append(n, e)
            });
            else
                for (let n of Object.keys(e.data)) t.append(n, e.data[n]);
            n.body = t;
            let r = new Headers(n.headers);
            r.delete("content-type"), n.headers = r
        } else(r.includes("application/json") || "object" == typeof e.data) && (n.body = JSON.stringify(e.data));
        return n
    };
    class C extends f {
        async request(e) {
            let t, n, r = L(e, e.webFetchExtra),
                s = ((e, t = !0) => e ? Object.entries(e).reduce((e, n) => {
                    let r, s, [i, a] = n;
                    return Array.isArray(a) ? (s = "", a.forEach(e => {
                        r = t ? encodeURIComponent(e) : e, s += `${i}=${r}&`
                    }), s.slice(0, -1)) : (r = t ? encodeURIComponent(a) : a, s = `${i}=${r}`), `${e}&${s}`
                }, "").substr(1) : null)(e.params, e.shouldEncodeUrlParams),
                i = s ? `${e.url}?${s}` : e.url,
                a = await fetch(i, r),
                o = a.headers.get("content-type") || "",
                {
                    responseType: l = "text"
                } = a.ok ? e : {};
            switch (o.includes("application/json") && (l = "json"), l) {
                case "arraybuffer":
                case "blob":
                    n = await a.blob(), t = await E(n);
                    break;
                case "json":
                    t = await a.json();
                    break;
                default:
                    t = await a.text()
            }
            let c = {};
            return a.headers.forEach((e, t) => {
                c[t] = e
            }), {
                data: t,
                headers: c,
                status: a.status,
                url: a.url
            }
        }
        async get(e) {
            return this.request(Object.assign(Object.assign({}, e), {
                method: "GET"
            }))
        }
        async post(e) {
            return this.request(Object.assign(Object.assign({}, e), {
                method: "POST"
            }))
        }
        async put(e) {
            return this.request(Object.assign(Object.assign({}, e), {
                method: "PUT"
            }))
        }
        async patch(e) {
            return this.request(Object.assign(Object.assign({}, e), {
                method: "PATCH"
            }))
        }
        async delete(e) {
            return this.request(Object.assign(Object.assign({}, e), {
                method: "DELETE"
            }))
        }
    }
    b("CapacitorHttp", {
        web: () => new C
    }), (o = n || (n = {})).Dark = "DARK", o.Light = "LIGHT", o.Default = "DEFAULT", (l = r || (r = {})).StatusBar = "StatusBar", l.NavigationBar = "NavigationBar";
    class A extends f {
        async setStyle() {
            this.unavailable("not available for web")
        }
        async setAnimation() {
            this.unavailable("not available for web")
        }
        async show() {
            this.unavailable("not available for web")
        }
        async hide() {
            this.unavailable("not available for web")
        }
    }
    b("SystemBars", {
        web: () => new A
    }), e.s(["Capacitor", 0, g, "WebPlugin", 0, f, "buildRequestInit", 0, L, "registerPlugin", 0, b])
}, 10160, e => {
    "use strict";

    function t(e) {
        return (t = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) {
            return typeof e
        } : function(e) {
            return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e
        })(e)
    }
    e.s(["default", () => t])
}, 62824, e => {
    "use strict";
    var t, n;
    (n = t || (t = {})).NOT_REQUIRED = "NOT_REQUIRED", n.OBTAINED = "OBTAINED", n.REQUIRED = "REQUIRED", n.UNKNOWN = "UNKNOWN", e.s(["AdmobConsentStatus", 0, t])
}, 23274, e => {
    "use strict";
    var t, n, r, s;
    (r = t || (t = {})).Documents = "DOCUMENTS", r.Data = "DATA", r.Library = "LIBRARY", r.Cache = "CACHE", r.External = "EXTERNAL", r.ExternalStorage = "EXTERNAL_STORAGE", r.ExternalCache = "EXTERNAL_CACHE", r.LibraryNoCloud = "LIBRARY_NO_CLOUD", r.Temporary = "TEMPORARY", (s = n || (n = {})).UTF8 = "utf8", s.ASCII = "ascii", s.UTF16 = "utf16", e.s(["Directory", 0, t, "Encoding", 0, n])
}, 75268, e => {
    e.v(t => Promise.all(["static/chunks/255rstp064qux.js"].map(t => e.l(t))).then(() => t(12252)))
}, 48503, e => {
    e.v(t => Promise.all(["static/chunks/3gti1qdk5epqn.js"].map(t => e.l(t))).then(() => t(15833)))
}, 70653, e => {
    e.v(t => Promise.all(["static/chunks/03_zh5mnd_14f.js"].map(t => e.l(t))).then(() => t(24154)))
}, 95111, e => {
    e.v(t => Promise.all(["static/chunks/08e53wauszp13.js"].map(t => e.l(t))).then(() => t(38201)))
}, 15999, e => {
    e.v(t => Promise.all(["static/chunks/3n424-3g8yz2w.js"].map(t => e.l(t))).then(() => t(75398)))
}, 8465, e => {
    e.v(t => Promise.all(["static/chunks/2bx47ka04vg7h.js"].map(t => e.l(t))).then(() => t(23181)))
}, 24225, e => {
    e.v(t => Promise.all(["static/chunks/0g35b9kxcixg-.js"].map(t => e.l(t))).then(() => t(39198)))
}, 6787, e => {
    e.v(t => Promise.all(["static/chunks/2967wwm48502f.js"].map(t => e.l(t))).then(() => t(64939)))
}]);