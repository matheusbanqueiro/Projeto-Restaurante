package Funcionarios;

import javax.swing.JOptionPane;

public class Cozinheiro extends Funcionario {
	
	

	@Override //SOBREPOSTO DA SUPER CLASSE
	public void dadosFuncionario() { // MÉTODO PARA MOSTRAR OS DADOS DO FUNCIONÁRIO HERDADO E SOBREPOSTO DA SUPER CLASSE
		super.dadosFuncionario();
	}
	
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void mostrarEscala() { //MÉTODO ESCALA DO COZINHEIRO HERDADO E SOBREPOSTO DA SUPER CLASSE
		
		
		JOptionPane.showMessageDialog(null,
		"\n -=-=-= ESCALA -=-=-="
		+ "\n -=-=-= Segunda-Feira : 06h às 22h"
		+ "\n -=-=-= Terça-Feira : 06h às 22h"
		+ "\n -=-=-= Quarta-Feira : 06h às 22h"
		+ "\n -=-=-= Quinta-Feira : 06h às 00h"
		+ "\n -=-=-= Sexta-Feira : 06h às 13h"
		+ "\n -=-=-= Sábado : 06h às 02h"
		+ "\n -=-=-= Domingo : 06h às 03h");
	}

}
	
	
		
	