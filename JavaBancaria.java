
public class ContaBancariaJava {

	private String id; //String � uma classe por (veja que � case sensitive)isso o uso de maiusculo
	private double saldo; //tipo primitiVO
	
	
	//o metodo pode sacer e n�o sacar
	//imagine a secretaria o metodo void voc� pede para fazer sem retorno//s� faz 
	public void sacar(double valor){
		if(valor > 0 && saldo - valor >=0)
		saldo = saldo - valor;
		
	}
	
	public void depositar(double valor){
		if(valor>0) // n�o pode depositar valor negativo
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
