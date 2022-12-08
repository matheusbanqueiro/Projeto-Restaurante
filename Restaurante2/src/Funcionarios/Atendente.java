package Funcionarios;

import javax.swing.JOptionPane;

public class Atendente extends Funcionario{
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void dadosFuncionario() { // MÉTODO PARA MOSTRAR OS DADOS DO FUNCIONÁRIO HERDADO E SOBREPOSTO DA SUPER CLASSE
		super.dadosFuncionario();
	}
	
	@Override //SOBREPOSTO DA SUPER CLASSE
	public void mostrarEscala() { //MÉTODO ESCALA DO ATENDENTE HERDADO E SOBREPOSTO DA SUPER CLASSE
		
		
		JOptionPane.showMessageDialog(null,
		 "\n -=-=-= ESCALA -=-=-="
		+ "\n -=-=-= Segunda-Feira : 07h às 22h"
		+ "\n -=-=-= Terça-Feira : FOLGA"
		+ "\n -=-=-= Quarta-Feira : 08h às 21h"
		+ "\n -=-=-= Quinta-Feira : 08h às 03h"
		+ "\n -=-=-= Sexta-Feira : 00h às 07h"
		+ "\n -=-=-= Sábado :  FOLGA"
		+ "\n -=-=-= Domingo : FOLGA");
		
	}
			

}
