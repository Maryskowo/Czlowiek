
public class Adres {

	String ulica;
	String miejscowość;
	int dom;
	int mieszkanie;
	
	public Adres(int A, int B){
		miejscowość = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = A;
		mieszkanie = B;
	}
	
	public Adres(){
		miejscowość = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = 5;
		mieszkanie = 8;
	}
	
	void ulica(String A){
		ulica = A;
	}
	void miejscowość(String A){
		miejscowość = A;
	}
	void dom(int A){
		dom = A;
	}
	void mieszkanie(int A){
		mieszkanie = A;
	}
}