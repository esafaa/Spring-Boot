package org.safaaess.SportDemo.services;
/*Create a class that implements ISportInterface and uses field-based annotation with the qualifier annotation to say which of the SportWin classes is being implemented.*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sport implements ISportInterface {
	@Autowired
	@Qualifier("soccer")
	private ISportWin isportWin;

	
	
	public Sport() {

	}
	
	public Sport(ISportWin isportWin) {
		this.isportWin= isportWin;
	}

	@Override
	public String getSportName() {
		return  "your are playing "+ isportWin.type();
	}

	@Override
	public String getSportType() {
		return "outdoor "+  isportWin.getWin();
	}

}
