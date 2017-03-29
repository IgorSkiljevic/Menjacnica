package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.InterfaceMenjacnica;
import kurs.Kurs;
import valuta.Valuta;

public class Menjacnica implements InterfaceMenjacnica {

	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKursValute(Valuta valuta, GregorianCalendar datum, double prodajni, double kupovni) {
		Kurs k = new Kurs();
		try {
			k.setDatum(datum);
			k.setKupovni(kupovni);
			k.setProdajni(prodajni);
			k.setSrednji();

			for (int i = 0; i < valute.size(); i++) {
				if (valute.get(i).equals(valuta)) {
					LinkedList<Kurs> kursevi = valute.get(i).getKursevi();
					kursevi.add(k);
					valute.get(i).setKursevi(kursevi);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public void obrisiKursValute(Valuta valuta, GregorianCalendar datum) {

		for (int i = 0; i < valute.size(); i++) {
			Valuta v = valute.get(i);

			if (v.equals(valuta)) {

				for (int j = 0; j < v.getKursevi().size(); j++) {
					Kurs kurs = v.getKursevi().get(j);

					if (kurs.getDatum().equals(datum)) {
						v.getKursevi().remove(j);
					}
				}
			}
		}
	}

	@Override
	public Kurs pronadjiIVratiKursValute(Valuta valuta, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta v = valute.get(i);

			if (v.equals(valuta)) {

				for (int j = 0; j < v.getKursevi().size(); j++) {
					Kurs kurs = v.getKursevi().get(j);

					if (kurs.getDatum().equals(datum)) {
						return kurs;
					}
				}
			}

		}

		return null;
	}

}
