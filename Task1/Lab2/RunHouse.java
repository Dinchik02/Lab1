
public class RunHouse {

	public static void main(String[] args) {
		House [] houseMass = { 
			new	House ("Pushkina", "Duplex", "2a", 1, "100m2", 2, 4, "2015-2060"),
			new	House ("Pushkina", "Duplex", "1a", 1, "100m2", 1, 5, "2015-2060"),	
			new	House ("Odesska", "Condominium", "3b", 2, "60m2", 4, 2, "2000-2030"),
			new	House ("Odesska", "Condominium", "3a", 2, "70m2", 4, 3, "2000-2030"),
			new	House ("Gogolya", "House", "16", 3, "180m2", 1, 6, "2013-2080"),
			new	House ("Gogolya", "Apartment block", "1a", 6, "100m2", 1, 5, "2015-2060"),	
			new	House ("Univesity", "Apartment block", "18b", 4, "65m2", 8, 3, "2000-2030"),
			new	House ("Univesity", "Apartment block", "21a", 5, "110m2", 12, 4, "2000-2030"),	
		};
		
		System.out.println(houseMass[1].toString());

	}

}
