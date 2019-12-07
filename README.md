### Reproduction:

two modules,
- :okta requires "@okta/okta-signin-widget",
- :react requires "react",
- :okta depends on :react

open `public/index.html` and view console.

(run `yarn && yarn shadow-cljs release app` to recompile)

### Error:

```
Uncaught TypeError: $jscomp.initSymbol is not a function
    at okta.js:613
    at okta.js:583
    at Object.<anonymous> (okta.js:583)
    at k (okta.js:232)
    at okta.js:1037
    at Object.<anonymous> (okta.js:1037)
    at Object.<anonymous> (okta.js:1079)
    at k (okta.js:232)
    at Object.<anonymous> (okta.js:242)
    at b (okta.js:233)
(anonymous) @ okta.js:613
(anonymous) @ okta.js:583
(anonymous) @ okta.js:583
k @ okta.js:232
(anonymous) @ okta.js:1037
(anonymous) @ okta.js:1037
(anonymous) @ okta.js:1079
k @ okta.js:232
(anonymous) @ okta.js:242
b @ okta.js:233
(anonymous) @ okta.js:349
b @ okta.js:233
(anonymous) @ okta.js:276
b @ okta.js:233
(anonymous) @ okta.js:346
b @ okta.js:233
(anonymous) @ okta.js:346
b @ okta.js:233
(anonymous) @ okta.js:233
(anonymous) @ okta.js:233
k @ okta.js:232
(anonymous) @ okta.js:797
k @ okta.js:232
(anonymous) @ okta.js:1022
(anonymous) @ okta.js:1023
k @ okta.js:232
(anonymous) @ okta.js:1020
k @ okta.js:232
(anonymous) @ okta.js:232
(anonymous) @ okta.js:232
(anonymous) @ okta.js:231
shadow$provide.<computed> @ okta.js:231
$APP.$shadow$js$jsRequire$$ @ react.js:2010
(anonymous) @ okta.js:1594
(anonymous) @ okta.js:1596
Show 5 more frames
```

