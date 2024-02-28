package palworldconfig.mannager;

import net.kronos.rkon.core.ex.AuthenticationException;

import java.io.IOException;

public interface IServerRCONMannager {
	public String RCONToPalServer(String ip, int port, String password, String cmd) throws Exception;
}
