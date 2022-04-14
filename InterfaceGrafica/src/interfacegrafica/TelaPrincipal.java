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
		super("Sistema de Digitação");

		this.montaLayout();
		
		this.setVisible(true); // Deixa a tela visível
		this.setSize(300,300); // deixa a tela com o tamanho 300 x 300
	}
	
	private void montaLayout() {
		Container interno = this.getContentPane(); //Cria a tela principal
        interno.setLayout(new BorderLayout()); // Adiciona um layout de norte, sul, leste oeste no frame principal
       
        JPanel painel = new JPanel(); // cria um subpainel              
        montaPainel(painel); // função abaixo que adiciona os botões ao painel
        interno.add(painel); // adiciona o painel à tela principal
        
		JButton botaoSalvar= new JButton("Salvar"); // Cria um botão com o nome salvar
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
		botaoSalvar.addActionListener(new ActionListener() { // adiciona uma ação ao botão quando clicado.
			@Override
			public void actionPerformed(ActionEvent e) {
				//mostraCaixaDeDialogo(); // mostra a caixa de dialogo
			}
		});		
	}
	


	}
	

