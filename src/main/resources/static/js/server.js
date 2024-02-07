layui.use(['layer', 'form'], function () {

    var layer = layui.layer;
    var form = layui.form;
    var serverRunStatus = document.getElementById("toggle");
    var serverStatus = document.getElementById("serverAnimation");

    serverStatus.style.height = serverStatus.style.width;
    window.onresize = function () {
        serverStatus.style.height = serverStatus.style.width;
    }

    fetch(`/pal/getServerStatus`).then(response => {
        return response.json();
    }).then(response => {
        if (response.code === '0') {
            form.val('server-status-form', {
                "serverRunStatus": ('Y' === response.result)
            });
        } else {
            layer.msg('获取当前服务器状态失败!' + response.result, {icon: 0}, function () {
                console.log(response.stackTrace);
            });
        }

        if (serverRunStatus.checked) {
            // 开启动画
            serverStatus.style.animationPlayState = "running";
            serverStatus.style.backgroundColor = "#4CAF50";
        } else {
            // 停止动画
            serverStatus.style.animationPlayState = "paused";
            serverStatus.style.backgroundColor = "#AAAAAA";
        }
    });

    form.on('switch(changeServerFrom)', function (data) {
        if (data.elem.checked) {
            fetch(`/pal/startServer`).then(res => {
                return res.json();
            }).then(response => {
                const json = JSON.parse(response);
                if (json.code === '0') {
                    // 开启动画
                    serverStatus.style.animationPlayState = "running";
                    serverStatus.style.backgroundColor = "#4CAF50";
                    serverStatus.style.transform = "scale(1)";
                    layer.tips('服务器启动成功', data.othis);
                } else {
                    layer.msg('服务器启动失败!' + json.result, {icon: 0}, function () {
                        console.log(json.stackTrace);
                        location.reload();
                    });
                }
            });
        } else {
            fetch(`/pal/stopServer`).then(res => {
                return res.json();
            }).then(response => {
                const json = JSON.parse(response);
                if (json.code === '0') {
                    // 停止动画
                    serverStatus.style.animationPlayState = "paused";
                    serverStatus.style.backgroundColor = "#AAAAAA";
                    serverStatus.style.transform = "scale(1)";
                    layer.tips('服务器关闭成功', data.othis);
                } else {
                    layer.msg('服务器关闭失败!' + json.result, {icon: 0}, function () {
                        console.log(json.stackTrace);
                        location.reload();
                    });
                }
            });
        }
    });
});