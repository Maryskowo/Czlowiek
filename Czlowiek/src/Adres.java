
public class Adres {

	String ulica;
	String miejscowo��;
	int dom;
	int mieszkanie;
	
	public Adres(int A, int B){
		miejscowo�� = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = A;
		mieszkanie = B;
	}
	
	public Adres(){
		miejscowo�� = "Warszawa";
		ulica = "Aleje Jerozolimskie";
		dom = 5;
		mieszkanie = 8;
	}
	
	void ulica(String A){
		ulica = A;
	}
	void miejscowo��(String A){
		miejscowo�� = A;
	}
	void dom(int A){
		dom = A;
	}
	void mieszkanie(int A){
		mieszkanie = A;
	}
}