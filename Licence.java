package ressources;

import java.util.ArrayList;

public class Licence {
	int numeroLicence;
	Logiciel log;
	public Licence(int numeroLicence,Logiciel logiciel) {
		this.numeroLicence = numeroLicence;
		this.log=logiciel;
	}

	public Logiciel getLog() {
		return log;
	}

	public int getNumeroLicence() {
		return numeroLicence;
	}
	
}
