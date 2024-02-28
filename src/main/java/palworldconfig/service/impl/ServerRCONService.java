package palworldconfig.service.impl;

import net.kronos.rkon.core.Rcon;
import net.kronos.rkon.core.ex.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import palworldconfig.mannager.IServerRCONMannager;
import palworldconfig.model.PalWorldSettings;
import palworldconfig.model.exp.BizException;
import palworldconfig.parameter.EExceptionEnum;
import palworldconfig.service.IServerHandlerService;
import palworldconfig.service.IServerRCONService;
import palworldconfig.util.StringUtil;

import java.io.IOException;

@Service
public class ServerRCONService implements IServerRCONService {

	@Autowired
	private IServerRCONMannager serverRCONMannager;

	@Autowired
	private IServerHandlerService serverHandlerService;

	@Override
	public String RCONToPalServer(String cmd) throws Exception {
		PalWorldSettings serverConfig = serverHandlerService.getServerConfig();
		if (!serverConfig.getRCONEnabled()) {
			EExceptionEnum.SYS_SETTING_ERROR.error("未启用RCON");
		}
		Integer rconPort = serverConfig.getRCONPort();
		if (rconPort == null || rconPort < 1 || rconPort > 65536) {
			EExceptionEnum.SYS_SETTING_ERROR.error("RCON端口异常");
		}
		String adminPassword = serverConfig.getAdminPassword();
		if (StringUtil.isEmpty(adminPassword)) {
			EExceptionEnum.SYS_SETTING_ERROR.error("未配置服务器密码");
		}
		String publicIP = serverConfig.getPublicIP();
		if (StringUtil.isEmpty(publicIP)) {
			publicIP = "127.0.0.1";
		}

		String result = serverRCONMannager.RCONToPalServer(publicIP, rconPort, adminPassword, cmd);
		return result;
	}
}
