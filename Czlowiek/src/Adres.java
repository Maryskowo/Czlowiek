
public class Adres {

	String ulica;
	String miejscowoœæ;
	int dom;
	int mieszkanie;
	
	public Adres(int A, int B){
		miejscowoœæ = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = A;
		mieszkanie = B;
	}
	
	public Adres(){
		miejscowoœæ = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = 5;
		mieszkanie = 8;
	}
	
	void ulica(String A){
		ulica = A;
	}
	void miejscowoœæ(String A){
		miejscowoœæ = A;
	}
	void dom(int A){
		dom = A;
	}
	void mieszkanie(int A){
		mieszkanie = A;
	}
}