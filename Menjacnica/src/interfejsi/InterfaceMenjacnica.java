package interfejsi;

import java.util.GregorianCalendar;

import kurs.Kurs;
import valuta.Valuta;

public interface InterfaceMenjacnica {

	public void dodajKursValute(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni);

	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum);

	public Kurs pronadjiIVratiKursValute(Valuta valuta, GregorianCalendar datum);
}
