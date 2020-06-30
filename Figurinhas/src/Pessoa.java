
public class Pessoa {
	
	String nome;
	int numFigurinhas; /*Atributo numFigurinhas*/
	
	void receber (int numFigurinhas) {       /*Parametro numFigurinhas*/
		this.numFigurinhas += numFigurinhas; /*this.numFigurinhas esta referenciando ao atributo e não ao parametro*/ 
		                                     /* o this.numFigurinhas = this.numFigurinhas + numFigurinhas    */
	}
	
	void dar (int numFigurinhas, Pessoa p) {
		this.numFigurinhas -= numFigurinhas;
		//p.numFigurinhas += numFigurinhas;
		p.receber(numFigurinhas);
	}
}
