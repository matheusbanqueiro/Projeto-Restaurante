package Meu;
import java.util.Random;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{

	private int entrega;
	private String endereco;
	
	public void infoCadastro() { // MÉTODO CRIADO PARA PEGAR AS INFORMAÇÕES DO CLIENTE PARA FAZER O CADASTRO
		
		
		this.nome = JOptionPane.showInputDialog("= = = Qual o seu nome? = = = ");
		JOptionPane.showMessageDialog(null, "Sr(a) "+ getNome() + " ,precisamos de mais informações para finalizar seu pedido");
	
		this.cpf = JOptionPane.showInputDialog("= = = Qual o seu CPF? = = = ");
		this.numero = Double.parseDouble(JOptionPane.showInputDialog("= = = Número para Contato: = = = "));
		
		formasDeAdquirir(); // INICIA O MÉTODO PARA DECIDIR A FORMA DE ENTREGA
	}	
	
	public void formasDeAdquirir() { // MÉTODO CRIADO PARA O CLIENTE DECIDIR SE QUER PARA ENTREGA OU NÃO
		
		this.entrega = JOptionPane.showConfirmDialog(null, "= = = Para entrega? = = =");
		
		if(this.entrega == 0) { //PARA ENTREGA? SIM
			
			this.endereco = JOptionPane.showInputDialog("= = = Digite seu endereço: = = = ");
			finalizacaoEntrega();//CASO QUEIRA PRA VIAGEM 
			
			
		} else if (this.entrega == 1) {//PARA ENTREGA? NÃO
			
			finalizacaoRetirada();//CASO QUEIRA RETIRAR NO ESTABELECIMENTO
			
		} else { // CASO APERTE CANCELAR "PEDIDO CANCELADO"
			
			JOptionPane.showMessageDialog(null,"PEDIDO CANCELADO!","CANCELADO",+ JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void finalizacaoRetirada() {// MÉTODO CRIADO PARA OS CLIENTES QUE QUEIRÃO IR ATÉ O LOCAL RETIRAR
		
		String nossoEndereco = "Rua Lorenço Fagundes";//VARIAVEL COM NOME DE UMA RUA FICTICIA
		
		JOptionPane.showMessageDialog(null,"*** PEDIDO FINALIZADO COM SUCESSO! ***"
				+"\n*** Nome: "+ getNome()
				+"\n*** CPF: "+ getCpf()
				+"\n*** NÚMERO PARA CONTATO: "+ getNumero()
				+"\n*** ENDEREÇO PARA RETIRAR: "+ nossoEndereco
				+"\n*** TEMPO: 10min"
				+"\n*** CÓDIGO DO PEDIDO: " + geradorCodigoPedido()); //METODO DE GERAR CODIGO DO PEDIDO
	}
	public void finalizacaoEntrega() {// MÉTODO CRIADO PARA OS CLIENTES QUE QUEIRÃO RECEBER NA SUA CASA
		
		JOptionPane.showMessageDialog(null,"*** PEDIDO FINALIZADO COM SUCESSO! ***"
			+"\n*** Nome: "+ getNome()
			+"\n*** CPF: "+ getCpf()
			+"\n*** NÚMERO PARA CONTATO: "+ getNumero()
			+"\n*** SERÁ ENTREGUE: "+ this.endereco
			+"\n*** TEMPO: 10min"
			+ "\n*** CÓDIGO DO PEDIDO: " + geradorCodigoPedido());
	}
	
	public int geradorCodigoPedido() {//METODO DE GERAR O CODIGO DO PEDIDO
		
		 Random codigo = new Random();
			 
		int numero = codigo.nextInt(1000);
	
		return numero;
		
		}

	// MÉTODOS GET E SET HERDADOS DE PESSOA
	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	@Override
	public double getNumero() {
		return super.getNumero();
	}

	@Override
	public void setNumero(double numero) {
		super.setNumero(numero);
	}

	public int getEntrega() {
		return entrega;
	}

	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
