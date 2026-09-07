package desafioFaculdade;

public class inverterNumeros {

	public static void main(String[] args) {
		variaveis v = new variaveis();
		v.inverter = (v.numeros /100);
		v.dezena = ((v.numeros / 10) % 10);
		v.unidade = (v.numeros % 10 );
		
		v.resultado = (v.unidade * 100)+ (v.dezena * 10) + v.inverter;
		
		System.out.println(""+v.resultado);
		
	}

}
