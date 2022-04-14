package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		super("Sistema de Digita��o");

		this.montaLayout();
		
		this.setVisible(true); // Deixa a tela vis�vel
		this.setSize(300,300); // deixa a tela com o tamanho 300 x 300
	}
	
	private void montaLayout() {
		Container interno = this.getContentPane(); //Cria a tela principal
        interno.setLayout(new BorderLayout()); // Adiciona um layout de norte, sul, leste oeste no frame principal
       
        JPanel painel = new JPanel(); // cria um subpainel              
        montaPainel(painel); // fun��o abaixo que adiciona os bot�es ao painel
        interno.add(painel); // adiciona o painel � tela principal
        
		JButton botaoSalvar= new JButton("Salvar"); // Cria um bot�o com o nome salvar
		interno.add(botaoSalvar, BorderLayout.SOUTH);
		
		adicionaAcao(botaoSalvar);
        
	}

	private void montaPainel(JPanel painel) {
		painel.setLayout(new GridLayout(2,2)); // adiciona um painel de grade 2 por 2
		
		JTextField campoNome = new JTextField(); // Cria um campo de texto
		JPasswordField campoSenha = new JPasswordField(); // Cria um campo de senha
		JLabel labelNome = new JLabel("Nome"); // Cria uma label de texto
		JLabel labelSenha = new JLabel("Senha"); // ,,,

		// adiciona os componentes no painel
        painel.add(labelNome);
    	painel.add(campoNome);
    	painel.add(labelSenha);
		painel.add(campoSenha);
				
	}
	
	private void adicionaAcao(JButton botaoSalvar) {
		botaoSalvar.addActionListener(new ActionListener() { // adiciona uma a��o ao bot�o quando clicado.
			@Override
			public void actionPerformed(ActionEvent e) {
				//mostraCaixaDeDialogo(); // mostra a caixa de dialogo
			}
		});		
	}
	


	}
	

