getServerConfig();

function getServerConfig() {
    layui.use(['layer', 'form'], function () {
        var form = layui.form;
        var layer = layui.layer;
        fetch(`/pal/getServerConfig`).then(res => {
            return res.json();
        }).then(data => {
            const json = JSON.parse(data);
            if (json.code === '0') {
                form.val('server-config-form', JSON.parse(json.result));
                layer.msg('已获取当前服务器配置信息');
            } else {
                layer.msg('失败!' + json.result, {icon: 0}, function () {
                    console.log(json.stackTrace);
                });
            }
        }).catch(error => {
            console.log('error:', error);
            layer.msg('失败:' + error);
        });
    });
}
function getDefaultServerConfig() {
    layui.use(['layer', 'form'], function () {
        var form = layui.form;
        var layer = layui.layer;
        fetch(`/pal/getDefaultServerConfig`).then(res => {
            return res.json();
        }).then(data => {
            const json = JSON.parse(data);
            if (json.code === '0') {
                form.val('server-config-form', JSON.parse(json.result));
                layer.msg('已获服务器默认配置信息');
            } else {
                layer.msg('失败!' + json.result, {icon: 0}, function () {
                    console.log(json.stackTrace);
                });
            }
        }).catch(error => {
            console.log('error:', error);
            layer.msg('失败:' + error);
        });
    });
}

layui.use(['layer', 'form'], function () {
    var form = layui.form;
    form.on('submit(modify-setting)', function (data) {
        // 将复选框的值从字符串"on"转换为布尔类型true和false
        Object.keys(data.field).forEach(key => {
            if (typeof data.field[key] === 'string' && data.field[key].toLowerCase() === 'true') {
                data.field[key] = true;
            }
        });

        fetch('/pal/modifyServerConfig', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data.field)
        }).then(res => {
            return res.json();
        }).then(response => {
            const json = JSON.parse(response);
            if (json.code === '0') {
                layer.msg('成功');
            } else {
                layer.msg('失败!' + json.result, {icon: 0}, function () {
                    console.log(json.stackTrace);
                });
            }
        }).catch(error => {
            console.log("失败 ===> ", error);
            layer.msg('失败:' + error);
        });
        return false;
    });
});