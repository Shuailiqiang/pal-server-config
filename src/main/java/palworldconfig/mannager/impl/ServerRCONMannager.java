package palworldconfig.mannager.impl;

import net.kronos.rkon.core.Rcon;
import net.kronos.rkon.core.ex.AuthenticationException;
import org.springframework.stereotype.Component;
import palworldconfig.mannager.IServerRCONMannager;

import java.io.IOException;
@Component
public class ServerRCONMannager implements IServerRCONMannager {
	@Override
	public String RCONToPalServer(String ip, int port, String password, String cmd) throws AuthenticationException, IOException {


		// Connects to 127.0.0.1 on port 27015
		Rcon rcon = new Rcon(ip, port, password.getBytes());

		// Example: On a minecraft server this will list the connected players
		String result = rcon.command(cmd);

		// Display the result in the console
		System.err.println("rcon result ===> " + result);

		return result;
	}

}
