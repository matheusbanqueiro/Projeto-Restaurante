package Meu;
import javax.swing.JOptionPane;
import Funcionarios.Funcionario;

public class Restaurante {
	
	private int pratosDaSemana;// VÁRIAVEL CRIADA PARA SABER A ESCOLHA DO CLIENTE 
	private int codigoFuncionario = 23052000;// VARIAVEL RECEBE O CÓDIGO QUE O FUNCIONARIO DEVE DIGITAR PARA PASSAR NA VERIFICAÇÃO
	
	public void boasVindas(){
		
		JOptionPane.showMessageDialog(null," = = = Bem-Vindo(a) ao nosso Restaurante! = = = ");
		
		double verificacao = Double.parseDouble(JOptionPane.showInputDialog("[1]Cliente\n[Código de Funcionário]"));
		
			if ( verificacao == 1) {//SE FOR CLIENTE
			
		this.pratosDaSemana = JOptionPane.showConfirmDialog(null, "Deseja conhecer nosso prato do dia?");
		
			if (this.pratosDaSemana == 0) { //DESEJA CONHECER NOSSO PRATO DO DIA? SIM
				
				Produto p = new Produto(); //INSTANCIANDO UMA CLASSE PRODUTO 
				p.PratoDoDia(); // APARECERÁ O PRATO DO DIA
				
			} else if (this.pratosDaSemana == 1) { //DESEJA CONHECER NOSSO PRATO DO DIA? NÃO
				
				Produto p = new Produto(); //INSTANCIANDO UMA CLASSE PRODUTO 
				p.tabelaPratos(); //APARECERÁ PRATOS 
				p.tabelaBebidas();// APARECERÁ AS BEBIDAS
				
			} else { //CASO QUEIRA CANCELAR APARECE "PEDIDO CANCELADO"
				JOptionPane.showMessageDialog(null,"   =*=*=*=   ATÉ MAIS   =*=*=*=   ","CANCELADO",+ JOptionPane.ERROR_MESSAGE);
			}
       
       } else if (verificacao == getCodigoFuncionario()) { // SE FOR CLIENTE E COLOCAR O CÓDIGO CORRETO
    	   
    	   Funcionario f = new Funcionario(); // INSTANCIANDO CLASSE FUNCIONARIO
    	   f.dadosFuncionario();// MÉTODO PARA PEGAR OS DADOS DO FUNCIONARIO
    	   
       } else { //CASO COLOQUE O CÓDIGO ERRADO
    	   
    	   JOptionPane.showMessageDialog(null,"   =*=*=*=   APENAS FUNCIONÁRIOS PODEM ACESSAR ESSA PARTE	   =*=*=*=   ","ERRO!",+ JOptionPane.ERROR_MESSAGE);
       }
	}

	public int getPratosDaSemana() {
		return pratosDaSemana;
	}

	public void setPratosDaSemana(int pratosDaSemana) {
		this.pratosDaSemana = pratosDaSemana;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	
	
}

