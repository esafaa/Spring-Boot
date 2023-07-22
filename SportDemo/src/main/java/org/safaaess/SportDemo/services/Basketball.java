package org.safaaess.SportDemo.services;

import org.springframework.stereotype.Component;

@Component
public class Basketball  implements ISportWin{

	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String type() {
		return "Baseball";
	}

}
