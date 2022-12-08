package Funcionarios;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario{

	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void dadosFuncionario() {// MÉTODO PARA MOSTRAR OS DADOS DO FUNCIONÁRIO HERDADO E SOBREPOSTO DA SUPER CLASSE
		super.dadosFuncionario();
	}
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void mostrarEscala() { //MÉTODO ESCALA DO GERENTE HERDADO E SOBREPOSTO DA SUPER CLASSE
		
		
		JOptionPane.showMessageDialog(null,
		 "\n -=-=-= ESCALA -=-=-="
		+ "\n -=-=-= Segunda-Feira : FOLGA"
		+ "\n -=-=-= Terça-Feira : 06h às 00h"
		+ "\n -=-=-= Quarta-Feira : FOLGA"
		+ "\n -=-=-= Quinta-Feira : 06h às 00h"
		+ "\n -=-=-= Sexta-Feira : FOLGA"
		+ "\n -=-=-= Sábado :  06h às 00h"
		+ "\n -=-=-= Domingo : FOLGA");
		
	}
}
