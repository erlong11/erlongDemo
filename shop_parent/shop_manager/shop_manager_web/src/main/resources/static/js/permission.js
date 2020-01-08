axios.interceptors.request.use(function (config) {
    if(sessionStorage.getItem("userInfo")==null){
        window.parent.location.href = "/admin/login.html";
    }
    return config;
},function (error) {
    
})
axios.interceptors.response.use(function (val) {
    return val;
},function (error) {

})
//自定义命令
Vue.directive("has",{
    inserted: function (el, binder, vnode) {
        // 传递当前按钮资源的url--不一定是url，只要能保证每条权限的唯一性的都可以
        var permission = binder.value[0];
        //获取登录完成后前端session中的用户信息
        var userInfo = sessionStorage.getItem("userInfo");
        // 管理员判断--必须转成json格式才能进行-userInfo.userType操作
        userInfo = JSON.parse(userInfo);
        if(userInfo.userType != 1) { // 只有普通用户才做验证
           //获取用户拥有的按钮（不包括菜单）权限--（btns是一个resources集合，不单单是一个属性（url按钮）字符窜）
            var btns = JSON.stringify(userInfo.btns);
            console.log("btn=",btns)
            // 根据url地址, 查看按钮权限中是否存在; 若不存在删除此元素
            if (btns.indexOf(permission) == -1) {
                el.parentNode.removeChild(el);
            }
        }
    }
})
