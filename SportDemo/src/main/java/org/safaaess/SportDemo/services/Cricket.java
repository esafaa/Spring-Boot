package org.safaaess.SportDemo.services;

import org.springframework.stereotype.Component;

@Component
public class Cricket  implements ISportWin{
	@Override
	public boolean getWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String type() {
		
		return "Cricket";
	}
	
	

}
