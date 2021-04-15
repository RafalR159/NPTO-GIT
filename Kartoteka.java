package kartoteka.impl.Kartoteka;

import java.util.LinkedList;
import kartoteka.Osoba.Osoba;

public class Kartoteka {
	LinkedList<Osoba> kartoteka = new LinkedList<Osoba>();

	public void dodaj(Osoba do_dodania) {
		kartoteka.add(do_dodania);
	}

	public void usun(Osoba do_usuniecia) {
		if (czyZawiera(do_usuniecia))
			kartoteka.remove(do_usuniecia);
		else
			System.out.println("Taka osoba nie widnieje w kartotece");
	}

	public int rozmiar() {
		return kartoteka.size();
	}

	public boolean czyZawiera(Object do_sprawdzenia) {
		for (Osoba o : kartoteka) {
			if (o.equals_(do_sprawdzenia)) return true;
		}
		return false;
	}

	public Osoba pobierz(int indeks) {
		if (indeks == kartoteka.size())
			return kartoteka.get((kartoteka.size())-1);
		else
			return kartoteka.get(indeks-1);
	}

	public void finalize() {
		System.out.println("Wywolano proces 'garbage collector' przez 'System.gc'");
		System.gc();
	}	

}
