
public class ContaBancariaJava {

	private String id; //String é uma classe por (veja que é case sensitive)isso o uso de maiusculo
	private double saldo; //tipo primitiVO
	
	
	//o metodo pode sacer e não sacar
	//imagine a secretaria o metodo void você pede para fazer sem retorno//só faz 
	public void sacar(double valor){
		if(valor > 0 && saldo - valor >=0)
		saldo = saldo - valor;
		
	}
	
	public void depositar(double valor){
		if(valor>0) // não pode depositar valor negativo
		saldo = saldo + valor;
	}
	
	public void tranferir(double valor, ContaBancariaJava contaDestino){
		if(valor >0){
			this.sacar(valor); // o this mostra que estou usando um metodo desse mesmo objeto
			contaDestino.depositar(valor);
		
		}	
	}
	
	public double lerSaldo(){
		
		return saldo;
	}
	
	
}
