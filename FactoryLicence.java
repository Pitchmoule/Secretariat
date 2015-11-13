package ressources;

public class FactoryLicence {
	private static FactoryLicence factoryLicence = null;
	
	
	private FactoryLicence(){
		super();
	}
	
	
	public static FactoryLicence getFactoryLicence(){
		if(factoryLicence==null){
		FactoryLicence.factoryLicence= new FactoryLicence();
		}
		return FactoryLicence.factoryLicence;
	}
	
	public Licence createLicence(int licence1,Logiciel logiciel1){
		Licence licence = new Licence(licence1,logiciel1);
		return licence;
	}	
}
