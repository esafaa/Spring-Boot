package org.safaaess.SportDemo.services;

import org.springframework.stereotype.Component;

@Component
public class Baseball  implements ISportWin {

	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return false;
	}
	public String type(){
		return "Baseball";
	}

}
