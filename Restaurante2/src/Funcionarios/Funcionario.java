package Funcionarios;

import javax.swing.JOptionPane;

public class Funcionario{
	
	protected int bonificacao;
	protected String nome;
	protected String cpf;
	
	
		public void dadosFuncionario() {
		
		this.nome = JOptionPane.showInputDialog("= = = Qual o seu nome? = = = ");
		JOptionPane.showMessageDialog(null, "Olá "+ getNome());
		
		this.cpf = JOptionPane.showInputDialog("= = = Qual o seu CPF? = = = ");
		
		double respoCargo = Double.parseDouble(JOptionPane.showInputDialog("= = = Qual o seu cargo na empresa?? = = = "
																			+ "\n\n= = = [1] Cozinheiro = = ="
																			+ "\n= = = [2] Atendente = = ="
																			+ "\n= = = [3] Limpeza = = ="
																			+ "\n= = = [4] Gerente = = ="));
		
		if (respoCargo == 1) { // SE O FUNCIONARIO TENHA O CARGO DE COZINHEIRO
			
			String atuacao = "Cozinheiro"; // VARÁVEL PARA RECEBER O CARGO
			
			JOptionPane.showMessageDialog(null, "*=*=* Nome: "+ getNome() //MOSTRAR O NOME DO FUNCIONÁRIO
			+"\n*=*=* CPF: " + getCpf()// MOSTRAR O CPF DO FUNCIONÁRIO
			+"\n*=*=* ATUAÇÃO: " + atuacao);//MOSTRAR A ATUAÇÃO DO FUNCIONÁRIO
			
			Cozinheiro cozinheiro= new Cozinheiro();// INSTÂNCIANDO A CLASSE COZINHEIRO
			cozinheiro.mostrarEscala();//MOSTRANDO A ESCOLA DO COZINHEIRO
			salarioEBonificacao();//SALÁRIO DELE SEM E COM A BONIFICAÇÃO
			
			//MOSTRANDO INFORMAÇÕES SOBRE O FINANCEIRO DO COZINHEIRO
			JOptionPane.showMessageDialog(null, "*=*=* Salario: R$ 10.0000" 
			+"\n*=*=* BONIFICAÇÃO: 15%" 
			+"\n*=*=* SALÁRIO TOTAL: " 	+ salarioCozinheiro);
			
		} else if (respoCargo == 2) { // SE O FUNCIONARIO TENHA O CARGO DE ATENDENTE
			
			String atuacao = "Atendente"; // VARÁVEL PARA RECEBER O CARGO
			
			JOptionPane.showMessageDialog(null, "*=*=* Nome: "+ getNome() 
			+"\n*=*=* CPF: " + getCpf() 
			+"\n*=*=* ATUAÇÃO: " + atuacao);
			
			Atendente a = new Atendente();
			a.mostrarEscala();
			salarioEBonificacao();
			
			JOptionPane.showMessageDialog(null, "*=*=* Salario: R$ 5.0000"
			+"\n*=*=* BONIFICAÇÃO: 5%" 
			+"\n*=*=* SALÁRIO TOTAL: " 	+ salarioAtendente);
			
			
		} else if (respoCargo == 3){ // SE O FUNCIONARIO TENHA O CARGO DE LIMPEZA
			
			String atuacao = "Limpeza";
			
			JOptionPane.showMessageDialog(null, "*=*=* Nome: "+ getNome()
			+"\n*=*=* CPF: " + getCpf()
			+"\n*=*=* ATUAÇÃO: " + atuacao);
			
			Limpeza p = new Limpeza();
			p.mostrarEscala();
			salarioEBonificacao();
			
			JOptionPane.showMessageDialog(null, "*=*=* Salario: R$ 7.0000"
			+"\n*=*=* BONIFICAÇÃO: 10%" 
			+"\n*=*=* SALÁRIO TOTAL: " 	+ salarioLimpeza);
			
		} else { // SE O FUNCIONARIO TENHA O CARGO DE GERENTE
			
			String atuacao = "Gerente";
			
			JOptionPane.showMessageDialog(null, "*=*=* Nome: "+ getNome()
			+"\n*=*=* CPF: " + getCpf()
			+"\n*=*=* ATUAÇÃO: " + atuacao);
			
			Gerente g = new Gerente();
			g.mostrarEscala();
			salarioEBonificacao();
			
			JOptionPane.showMessageDialog(null, "*=*=* Salario: R$ 20.0000"
			+"\n*=*=* BONIFICAÇÃO: 20%" 
			+"\n*=*=* SALÁRIO TOTAL: " 	+ salarioGerente);
		}
		
		}
		
		
		double salarioCozinheiro = 10000; // VÁRIAVEL CRIADA PARA RECEBER O SALARIO COM E SEM BONIFICAÇÃO  (COZINHEIRO)
		double salarioAtendente = 5000;// VÁRIAVEL CRIADA PARA RECEBER O SALARIO COM E SEM BONIFICAÇÃO  (ATENDENTE)
		double salarioLimpeza = 7000;// VÁRIAVEL CRIADA PARA RECEBER O SALARIO COM E SEM BONIFICAÇÃO  (LIMPEZA)
		double salarioGerente = 20000;// VÁRIAVEL CRIADA PARA RECEBER O SALARIO COM E SEM BONIFICAÇÃO  (GERENTE)
	
		public void salarioEBonificacao() {// MÉTODO PARA REALIZAR O CÁLCULO DOS VALORES (SALÁRIO + BONIFICAÇÃO)
			
			salarioAtendente = salarioAtendente + (salarioAtendente * 0.05);
			salarioLimpeza = salarioLimpeza + (salarioLimpeza * 0.10);
			salarioCozinheiro = salarioCozinheiro + ( salarioCozinheiro * 0.15);
			salarioGerente = salarioGerente + ( salarioGerente * 0.20);
			
		}
		
		public void mostrarEscala() { //MÉTODO CRIADO PARA MOSTRAR A ESCALA
			
			JOptionPane.showMessageDialog(null, "*=*=* Nome: "+ getNome()
					+"\n*=*=* CPF: " + getCpf()
					+ "\n\n -=-=-= ESCALA -=-=-="
					+ "\n -=-=-= Segunda-Feira : 09h às 22h"
					+ "\n -=-=-= Terça-Feira : 09h às 22h"
					+ "\n -=-=-= Quarta-Feira : 08h às 22h"
					+ "\n -=-=-= Quinta-Feira : 06h às 00h"
					+ "\n -=-=-= Sexta-Feira : 10h às 13h"
					+ "\n -=-=-= Sábado : FOLGA"
					+ "\n -=-=-= Domingo : FOLGA");
		}
		
	
	//MÉTODOS GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
 	
		
}
