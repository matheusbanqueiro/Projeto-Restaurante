package Meu;
import javax.swing.JOptionPane;

public class Produto {
	
	private double total; //VARIAVEL "total" CRIADA PARA RECEBER O VALOR DO PRATO + VALOR DA BEBIDA ESCOLHIDA DO CLIENTE
	
	private double numPratos; //VARIAVEL CRIADA PARA RECEBER O NUMERO DO PRATO QUE O CLIENTE QUER
	private int escolhaPratos; //VARIAVEL CRIADA PARA RECEBER A ESCOLHA DO CLIENTE SE QUER OU NÃO O PRATO DO DIA 
	
	private double numBebidas; //VARIAVEL CRIADA PARA RECEBER O NUMERO DA BEBIDA QUE O CLIENTE QUER
       
       public void tabelaPratos() {
		
		
		this.numPratos = Double.parseDouble(JOptionPane.showInputDialog
				
				("\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
				+ "\n= = = = = = = = = = =      PRATOS PRINCIPAIS       = = = = = = = = = = =\n"
				+ "\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n"
				+ "\n[1] Arroz, Feijão, carne, Batata Frita e salada  => R$ : R$ 10 reais\n"
				+ "\n[2] Arroz, Feijão, frango, Batata assada e salada  => R$ : R$ 20 reais\n"
				+ "\n[3] Macarrão, Feijão, bisteca e salada  => R$ : R$ 30 reais\n"
				+ "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= =-=-=-\n"
				+ "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= =-=-=-\n"));
	
	}
	
	public void tabelaBebidas() {
		
				this.numBebidas = Double.parseDouble(JOptionPane.showInputDialog 
				
				("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
				+"\n* * * * * * * * * * * * * * * * * * * * * * * * *     BEBIDAS     * * * * * * * * * * * * * * * * * * * * * * * * *\n"
				+"\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
				+"\n* * * * * * * * * * * *  * * * * [1] SUCO DE LARANJA ==> R$ : 20 reais * * * * * * * * * * * *  * * * * *\n"
		 		+"\n* * * * * * * * * * * *  * * * * * [2] SUCO DE UVA ==> R$ : 20 reais * * * * * * * * * * * *  * * * * *\n"
		 		+"\n* * * * * * * * * * * *  * * * * * [3] REFRIGERANTES ==> R$ : 10 reais * * * * * * * * * * * *  * * * * *\n"
		 		+"\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
		 		+"\n* * * * * * * * * * * *  * * * * * * * * * * * * * * [4] NÃO * * * * * ** * * * * * * * * * * * * * * *  * * * * *\n"));
				
				AmarzenandoPedido();//APENAS MENSAGEM DE PEDIDO ARMAZENADO
				fim(); // MÉTODO PARA APRECER O QUE O USUÁRIO PEDIU
				Cliente cliente = new Cliente();//INSTANCIANDO CLASSE CLIENTE
	   			cliente.infoCadastro();// COMEÇARÁ A PEDIR INFORMAÇÕES APÓS CLIENTE DECIDIR A BEBIDA
	} 
	
	public void PratoDoDia() { //MÉTODO CRIADO PARA O PRATO DO DIA
		
		 total = 10;
		
        String PratoDoDia = "* * * * PRATO DO DIA: Arroz, Feijão, Bife, Batata Frita e salada * * * *"
        				+ "\n* * * * BEBIDA: Suco de Laranja * * * *\n"
        				+ "\n -=-=-=-=-=- POR APENAS : R$ 10 reais -=-=-=-=-=-";
        			
        
        int escolhaPrato = JOptionPane.showConfirmDialog(null, PratoDoDia + "\n\n = = = = = = DESEJA PEDIR O PRATO DO DIA? = = = = = = \n");
        
        
        if (escolhaPrato == 0) { //DESEJA PEDIR O PRATO DO DIA? SIM
        	
				AmarzenandoPedido();//APENAS MENSAGEM DE PEDIDO ARMAZENADO
				escolhaFormaDeagamento(); // MÉTODO CRIADO PARA ESCOLHER A FORMA DE PAGAMENTO
				Cliente cliente = new Cliente(); //INSTANCIANDO CLASSE CLIENTE
	   			cliente.infoCadastro(); // COMEÇARÁ A PEDIR INFORMAÇÕES CASO O CLIENTE QUEIRA O PRATO DO DIA
	  
	   
        	} else if (escolhaPrato == 1) {//DESEJA PEDIR O PRATO DO DIA? NÃO
	   
	        	Produto p = new Produto(); //INSTANCIANDO A CLASSE PRODUTO
	        	p.tabelaPratos();// CASO O USUÁRIO NÃO QUEIRA O PRATO DO DIA IRÁ MOSTRAR OPÇÕES DE PRATOS A MAIS
	        	p.tabelaBebidas();// CASO O USUÁRIO NÃO QUEIRA O PRATO DO DIA IRÁ MOSTRAR OPÇÕES DE BEBIDA A MAIS
        	
        	} else { //CASO QUEIRA CANCELAR "PEDIDO CANCELADO"
		
        		JOptionPane.showMessageDialog(null,"PEDIDO CANCELADO!","CANCELADO",+ JOptionPane.ERROR_MESSAGE);
	}
}

	
	public void AmarzenandoPedido() { // MÉTODO APENAS PARA EXIBIR MENSAGEM "ARMAZENANDO PEDIDOS"
		
		JOptionPane.showMessageDialog(null, "-=-=-=-=-=-=-=  ARMAZENANDO PEDIDOS  -=-=-=-=-=-=-=");
	}
								
	public void fim() {
		
		// CONDIÇÕES PARA VERIFICAR A ESCOLHA DO CLIENTE
		// PRIMEIRO DEFINIR **   PRATO1  E AS OUTRAS BEBIDAS   ***
		
		if(this.numPratos == 1 && this.numBebidas == 1) {
			
			double prato1 = 10, bebida1 = 20;
			total = prato1 + bebida1;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [1] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 10 reais" +
			"\n-=-=-= BEBIDA: [1] SUCO DE LARANJA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 1 && this.numBebidas == 2) {
			
			double prato1 = 10, bebida2 = 20;
			total = prato1 + bebida2;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [1] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 10 reais" +
			"\n-=-=-= BEBIDA: [2] SUCO DE UVA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total); 
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 1 && this.numBebidas == 3) {
			
			double prato1 = 10, refrigerante = 10;
			total = prato1 + refrigerante;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [1] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 10 reais" +
			"\n-=-=-= BEBIDA: [3] REFRIGERANTES ==> R$ : 10 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if (this.numPratos == 1 && this.numBebidas == 4) {
			
			total = 10;
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [1] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 10 reais"
					+"\n-=-=-= BEBIDA: null" +
					"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
		}
		
		// SEGUNDO DEFINIR **   PRATO2  E AS OUTRAS BEBIDAS   ***
		
		if(this.numPratos == 2 && this.numBebidas == 1) {
			
			double prato2 = 20, bebida1 = 20;
			total = prato2 + bebida1;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [2] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 20 reais" +
			"\n-=-=-= BEBIDA: [1] SUCO DE LARANJA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 2 && this.numBebidas == 2) {
			
			double prato2 = 20, bebida2 = 20;
			total = prato2 + bebida2;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [2] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 20 reais" +
			"\n-=-=-= BEBIDA: [2] SUCO DE UVA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 2 && this.numBebidas == 3) {
			
			double prato2 = 20, bebida3 = 10;
			total = prato2 + bebida3;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [2] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 20 reais" +
			"\n-=-=-= BEBIDA: [3] REFRIGERANTES ==> R$ : 10 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 2 && this.numBebidas == 4){
			
			total = 20;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [2] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 20 reais"
					+"\n-=-=-= BEBIDA: null" +
					"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
		}	
		
		// TERCEIRO DEFINIR ***   PRATO3 E AS OUTRAS BEBIDAS   ***
		
		if(this.numPratos == 3 && this.numBebidas == 1) {
			
			double prato3 = 30, bebida1 = 20;
			total = prato3 + bebida1;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [3] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 30 reais" +
			"\n-=-=-= BEBIDA: [1] SUCO DE LARANJA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 3 && this.numBebidas == 2) {
			
			double prato3 = 30, bebida2 = 20;
			total = prato3 + bebida2;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [3] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 30 reais" +
			"\n-=-=-= BEBIDA: [2] SUCO DE UVA ==> R$ : 20 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 3 && this.numBebidas == 3) {
			
			double prato3 = 30, bebida3 = 10;
			total = prato3 + bebida3;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [3] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 30 reais" +
			"\n-=-=-= BEBIDA: [3] REFRIGERANTES ==> R$ : 10 reais" +
			"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			
		} else if(this.numPratos == 3 && this.numBebidas == 4){
			
			total = 30;
			
			JOptionPane.showMessageDialog(null,"-=-=-= PRATO: [3] Arroz, Feijão, frango, Batata Frita e salada  => R$ : R$ 30 reais"
					+"\n-=-=-= BEBIDA: null" +
					"\n\n-=-=-= TOTAL:" + total);
			escolhaFormaDeagamento();
			}
	}
	
	public void escolhaFormaDeagamento() { // MÉTODO CRIADO PARA O CLIENTE DECIDIR A FORMA DE PAGAMENTO
		
		double escolhaForma = Double.parseDouble(JOptionPane.showInputDialog(" * * * ESCOLHA A FORMA DE PAGAMENTO * * * "
				+ "\n\n* * * [1]PIX => 5% DE DESCONTO"
				+ "\n* * * [2]CARTÃO DE DEBITO => 10% DE DESCONTO"
				+ "\n* * * [3]DINHEIRO => 8% DE DESCONTO"
				+ "\n* * * [4]CARTÃO DE CRÉDITO => 10% DE JUROS"));
		
		if (escolhaForma == 1) { // SE O CLIENTE ESCOLHER 1 -> CALCULO PARA RETIRAR 5% DO VALOR TOTAL 
			
			total = total - (total * 5/100);
			JOptionPane.showMessageDialog(null,"-=-=-= TOTAL A PAGAR: " + total);
 		
		} else if (escolhaForma == 2) {// SE O CLIENTE ESCOLHER 2 -> CALCULO PARA RETIRAR 5% DO VALOR TOTAL 
			
			total = total - (total * 10/100);
			JOptionPane.showMessageDialog(null,"-=-=-= TOTAL A PAGAR: " + total);
			
		} else if (escolhaForma == 3) {// SE O CLIENTE ESCOLHER 3 -> CALCULO PARA RETIRAR 5% DO VALOR TOTAL 
			
			total = total - (total * 8/100);
			JOptionPane.showMessageDialog(null,"-=-=-= TOTAL A PAGAR: " + total);
			
		} else {// SE O CLIENTE ESCOLHER 4 -> CALCULO PARA RETIRAR 5% DO VALOR TOTAL 
			
			total = total + (total * 10/100);
			JOptionPane.showMessageDialog(null,"-=-=-= TOTAL A PAGAR: " + total);
		}
		
	}
	
	// MÉTODOS GET E SET
	public double getNumPratos() {
		return numPratos;
	}
	public void setNumPratos(double numPratos) {
		this.numPratos = numPratos;
	}
	public int getEscolhaPratos() {
		return escolhaPratos;
	}
	public void setEscolhaPratos(int escolhaPratos) {
		this.escolhaPratos = escolhaPratos;
	}
	public double getNumBebidas() {
		return numBebidas;
	}
	public void setNumBebidas(double numBebidas) {
		this.numBebidas = numBebidas;
	}
	

}