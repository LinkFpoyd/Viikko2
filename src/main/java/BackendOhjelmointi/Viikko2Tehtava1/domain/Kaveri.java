package BackendOhjelmointi.Viikko2Tehtava1.domain;

public class Kaveri {
	
	private String etunimi, sukunimi;

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public Kaveri(String etunimi, String sukunimi) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
	}

	@Override
	public String toString() {
		return "Kaveri [etunimi=" + etunimi + ", sukunimi=" + sukunimi + "]";
	}

}
