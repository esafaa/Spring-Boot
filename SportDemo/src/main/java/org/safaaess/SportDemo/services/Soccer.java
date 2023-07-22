package org.safaaess.SportDemo.services;

import org.springframework.stereotype.Component;

@Component
public class Soccer implements ISportWin {
    
	@Override
	public boolean getWin() {
		
		return true;
	}
	public String type(){
		return "Soccer";
	}



}
