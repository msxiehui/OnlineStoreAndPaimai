(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-set-set"],{"1b78":function(t,a,e){a=t.exports=e("2350")(!1),a.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-4a48cc0c]{background:#f8f8f8}.list-cell[data-v-4a48cc0c]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:baseline;-webkit-align-items:baseline;align-items:baseline;padding:%?20?% %?30?%;line-height:%?60?%;position:relative;background:#fff;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center}.list-cell.log-out-btn[data-v-4a48cc0c]{margin-top:%?40?%}.list-cell.log-out-btn .cell-tit[data-v-4a48cc0c]{color:red;text-align:center;margin-right:0}.list-cell.cell-hover[data-v-4a48cc0c]{background:#fafafa}.list-cell.b-b[data-v-4a48cc0c]:after{left:%?30?%}.list-cell.m-t[data-v-4a48cc0c]{margin-top:%?16?%}.list-cell .cell-more[data-v-4a48cc0c]{-webkit-align-self:baseline;align-self:baseline;font-size:%?32?%;color:#909399;margin-left:%?10?%}.list-cell .cell-tit[data-v-4a48cc0c]{-webkit-box-flex:1;-webkit-flex:1;flex:1;font-size:%?30?%;color:#303133;margin-right:%?10?%}.list-cell .cell-tip[data-v-4a48cc0c]{font-size:%?28?%;color:#909399}.list-cell uni-switch[data-v-4a48cc0c]{-webkit-transform:translateX(%?16?%) scale(.84);transform:translateX(%?16?%) scale(.84)}body.?%PAGE?%[data-v-4a48cc0c]{background:#f8f8f8}',""])},"5c23":function(t,a,e){"use strict";var c=e("c64b"),n=e.n(c);n.a},"5f61":function(t,a,e){"use strict";e.r(a);var c=e("7a1a"),n=e.n(c);for(var i in c)"default"!==i&&function(t){e.d(a,t,function(){return c[t]})}(i);a["default"]=n.a},"7a1a":function(t,a,e){"use strict";var c=e("288e");Object.defineProperty(a,"__esModule",{value:!0}),a.default=void 0;var n=c(e("cebc")),i=e("2f62"),l={data:function(){return{}},methods:(0,n.default)({},(0,i.mapMutations)(["logout"]),{navTo:function(t){uni.navigateTo({url:t})},toLogout:function(){var t=this;uni.showModal({content:"确定要退出登录么",success:function(a){a.confirm&&(t.logout(),setTimeout(function(){uni.navigateBack()},200))}})},switchChange:function(t){var a=t.detail.value?"打开":"关闭";this.$api.msg("".concat(a,"消息推送"))}})};a.default=l},"81e3":function(t,a,e){"use strict";e.r(a);var c=e("a8cc"),n=e("5f61");for(var i in n)"default"!==i&&function(t){e.d(a,t,function(){return n[t]})}(i);e("5c23");var l,o=e("f0c5"),s=Object(o["a"])(n["default"],c["b"],c["c"],!1,null,"4a48cc0c",null,!1,c["a"],l);a["default"]=s.exports},a8cc:function(t,a,e){"use strict";var c,n=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("v-uni-view",{staticClass:"container"},[e("v-uni-view",{staticClass:"list-cell b-b",attrs:{"hover-class":"cell-hover","hover-stay-time":50},on:{click:function(a){arguments[0]=a=t.$handleEvent(a),t.navTo("/pages/address/address")}}},[e("v-uni-text",{staticClass:"cell-tit"},[t._v("收货地址")]),e("v-uni-text",{staticClass:"cell-more yticon icon-you"})],1),e("v-uni-view",{staticClass:"list-cell log-out-btn",on:{click:function(a){arguments[0]=a=t.$handleEvent(a),t.toLogout.apply(void 0,arguments)}}},[e("v-uni-text",{staticClass:"cell-tit"},[t._v("退出登录")])],1)],1)},i=[];e.d(a,"b",function(){return n}),e.d(a,"c",function(){return i}),e.d(a,"a",function(){return c})},c64b:function(t,a,e){var c=e("1b78");"string"===typeof c&&(c=[[t.i,c,""]]),c.locals&&(t.exports=c.locals);var n=e("4f06").default;n("5719cb4a",c,!0,{sourceMap:!1,shadowMode:!1})}}]);