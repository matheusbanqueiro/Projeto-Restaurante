package Funcionarios;

import javax.swing.JOptionPane;

public class Limpeza extends Funcionario{
	
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void dadosFuncionario() {// MÉTODO PARA MOSTRAR OS DADOS DO FUNCIONÁRIO HERDADO E SOBREPOSTO DA SUPER CLASSE
		super.dadosFuncionario();
	}
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void mostrarEscala() {//MÉTODO ESCALA DA LIMPEZA HERDADO E SOBREPOSTO DA SUPER CLASSE
		
		
		JOptionPane.showMessageDialog(null, 
		  "\n -=-=-= ESCALA -=-=-="
		+ "\n -=-=-= Segunda-Feira : 10h às 22h"
		+ "\n -=-=-= Terça-Feira : 10h às 22h"
		+ "\n -=-=-= Quarta-Feira : 10h às 22h"
		+ "\n -=-=-= Quinta-Feira : 10h às 22h"
		+ "\n -=-=-= Sexta-Feira : 10h às 22h"
		+ "\n -=-=-= Sábado : 10h às 22h"
		+ "\n -=-=-= Domingo : FOLGA");
		
	}
}		
	