/**
 * 
 */
package br.com.elaborata.threads.concorrencia;

/**
 * @author Roque Junior
 *
 */
public class ControleCaixa implements Runnable {

	private Conta conta = new Conta();
	
	
	public static void main(String[] args) {
		ControleCaixa caixa = new ControleCaixa();
		
		//Criar uma thread para cada funcionario que vai sacar dinheiro
		Thread jorge = new Thread(caixa, "Jorge");
		Thread manoel = new Thread(caixa, "Manoel");
		Thread larissa = new Thread(caixa, "Larissa");
		Thread jose = new Thread(caixa, "José");
		Thread joao = new Thread(caixa, "João");
		
		//iniciar threads
		jorge.start();
		manoel.start();
		larissa.start();
		jose.start();
		joao.start();
		
	}
	
	
	@Override
	public void run() {
		
		//chamando o método para controle dos saques
		controleConta(1000.00);
		
		if(conta.getSaldo() <= 0) {
			System.out.println("O dinheiro acabou");
		}

	}
	
	public synchronized void controleConta(Double valorSaque) {
		//Verificar se o saldo é suficiente para o saque
		if(conta.getSaldo() >= valorSaque) {
			System.out.println(Thread.currentThread().getName() + 
					" irá sacar dinheiro - SALDO ATUAL: R$ " +
					conta.getSaldo());
			try {
				//para de executar por 500 milisegundos
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Saca a quantia solicitada
			conta.sacar(valorSaque);
			
			System.out.println(Thread.currentThread().getName() + 
					" sacou R$ " +
					valorSaque +
					" SALDO ATUAL: R$ " +
					conta.getSaldo());
		} else {
			System.out.println(Thread.currentThread().getName() + 
					" não conseguiu sacar o valor R$ " +
					valorSaque +
					" SALDO ATUAL: R$ " +
					conta.getSaldo());
		}
	}

}
