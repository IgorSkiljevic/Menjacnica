package kurs;

import java.util.GregorianCalendar;

public class Kurs {

	private double kupovni;
	private double prodajni;
	private double srednji;
	private GregorianCalendar datum;

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) throws Exception {
		if (kupovni > 0) {
			this.kupovni = kupovni;
		} else {
			throw new Exception("kupovni mora biti veci od nule");
		}
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) throws Exception {
		if (prodajni > 0) {
			this.prodajni = prodajni;
		} else {
			throw new Exception("prodajni mora biti veci od nule");
		}
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) throws Exception {
		if (kupovni > 0 && prodajni > 0) {
			this.srednji = (kupovni + prodajni) / 2;
		} else {
			throw new Exception("Ne moguce podesiti srednji, prodajni ili kupovni lose uneseni");
		}
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) throws Exception {
		if (datum != null) {
			this.datum = datum;
		} else {
			throw new Exception("Los unos datuma");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kurs [kupovni=" + kupovni + ", prodajni=" + prodajni + ", srednji=" + srednji + ", datum=" + datum
				+ "]";
	}

}
