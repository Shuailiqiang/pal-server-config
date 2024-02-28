package palworldconfig.service;

import net.kronos.rkon.core.ex.AuthenticationException;

import java.io.IOException;

public interface IServerRCONService {
	public String RCONToPalServer(String cmd) throws Exception;
}
