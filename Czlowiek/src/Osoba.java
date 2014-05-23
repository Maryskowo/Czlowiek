
public class Osoba {
	String nazwisko;
	String imie;
	double pesel;
	Adres adres;
	Data data;
	
	public Osoba(double A, Adres B, Data C){
		nazwisko = "Kowalski";
		pesel = A;
		adres = B;
		data = C;
	}
	
	public Osoba(String C, double A, Adres B, Data D){
		imie = C;
		nazwisko = "Kowalski";
		pesel = A;
		adres = B;
		data = D;
	}
	
	public Osoba(String C, String D, double A, Adres B, Data E){
		imie = D;
		nazwisko = C;
		pesel = A;
		adres = B;
		data = E;
	}
	
	
	void wypisz(){
		if(data.rok > 2014){
			System.out.println("Ta osoba jeszcze siê nie zrespi³a");
		}
		else if(data.rok == 2014 && data.miesi¹c > 5){
			System.out.println("Ta osoba jeszcze siê nie zrespi³a");
		}
		else if(data.rok == 2014 && data.miesi¹c == 5 && data.dzieñ > 6){
			System.out.println("Ta osoba jeszcze siê nie zrespi³a");
		}
		else{
			System.out.println("Nazwisko: "+nazwisko+"\nImiê: "+imie+"\nPesel: "+pesel+"\nMiejscowoœæ: "+adres.miejscowoœæ+"\nUlica: "+adres.ulica+"\nNumer domu: "+adres.dom+"\nNumer mieszkania: "+adres.mieszkanie);
			System.out.println("Data urodzenia: "+data.rok+"."+data.miesi¹c+"."+data.dzieñ);
		}

		
	}
	
	void imie(String A){
		imie = A;
	}
	void nazwisko(String A){
		nazwisko = A;
	}
	void pesel(double A){
		pesel = A;
	}
}
