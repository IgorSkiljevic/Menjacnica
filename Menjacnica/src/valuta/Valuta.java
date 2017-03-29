package valuta;

import java.util.LinkedList;

import kurs.Kurs;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) throws Exception {
		if (naziv != null && !naziv.isEmpty()) {
			this.naziv = naziv;
		} else {
			throw new Exception("Los unos naziva");
		}
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) throws Exception {
		if (skraceniNaziv != null && !skraceniNaziv.isEmpty()) {
			this.skraceniNaziv = skraceniNaziv;
		} else {
			throw new Exception("Los unos skracenog naziva");
		}
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) throws Exception {
		if (kursevi != null) {
			this.kursevi = kursevi;
		} else {
			throw new Exception("Lose uneti kursevi");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + "]";
	}

}
