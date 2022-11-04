package class15B.dispatch;

import java.util.HashMap;

import class15B.controller.MainController;
//import class15B.controller.member.JoinProc;
import class15B.controller.member.Login;

public class ReqDispatch {
	HashMap<String, MainController> map;
	public void init() {
		map = new HashMap<String, MainController>();
		map.put("/login", new Login());
		//map.put("/joinProc", new JoinProc());
		
		//map.get("/login").exec(req, resp);
		//map.get("joinProc").exec(req, resp);
	}

}
