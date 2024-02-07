function msg(json) {
    layui.use(['layer'], function () {
        var layer = layui.layer;
        if (json.code === '0'){
            layer.msg('成功');
        } else {
            layer.msg('失败!' + json.result, {icon: 0}, function(){
                console.log(json.stackTrace);
            });
        }
    });
}

