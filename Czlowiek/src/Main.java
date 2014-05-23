
public class Main {

	public static void main(String[] args) {

		Adres random2 = new Adres(3, 15);
		Data random3 = new Data(1999, 10, 11);
		Osoba random = new Osoba(1111111111, random2, random3);
		//random.nazwisko = "";
		//random.pesel = ;
		random.imie = "frajer";
		random2.ulica = "Krzywa";
		random.wypisz();
		//random2.wypisz();
	}

}
