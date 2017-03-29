package menjacnica;

import java.util.GregorianCalendar;

import interfejsi.InterfaceMenjacnica;
import kurs.Kurs;
import valuta.Valuta;

public class Menjacnica implements InterfaceMenjacnica{

	@Override
	public void dodajKursValute(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronadjiIVratiKursValute(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
