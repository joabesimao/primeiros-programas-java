package programa.simao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		super("ccccccccc");

		this.montaLayout();
		
		this.setVisible(true); // Deixa a tela visível
		this.setSize(500,300); // deixa a tela com o tamanho 300 x 300
	}
	
	private void montaLayout() {
//		Container interno = this.getContentPane(); //Cria a tela principal
//        interno.setLayout(new BorderLayout()); // Adiciona um layout de norte, sul, leste oeste no frame principal
//       
//        JPanel painel = new JPanel(); // cria um subpainel              
//        montaPainel(painel); // função abaixo que adiciona os botões ao painel
//        interno.add(painel); // adiciona o painel à tela principal
//        
//		JButton botaoSalvar= new JButton("SALVAR"); // Cria um botão com o nome salvar
//		interno.add(botaoSalvar, BorderLayout.SOUTH);
//		
//		adicionaAcao(botaoSalvar);
//        
		JButton button = new JButton("Button 1 (PAGE_START)");
		Container pane = this.getContentPane();
		pane.add(button, BorderLayout.PAGE_START);

		//Make the center component big, since that's the
		//typical usage of BorderLayout.
		button = new JButton("Button 2 (CENTER)");
		button.setPreferredSize(new Dimension(200, 100));
		pane.add(button, BorderLayout.CENTER);

		button = new JButton("Button 3 (LINE_START)");
		pane.add(button, BorderLayout.LINE_START);

		button = new JButton("Long-Named Button 4 (PAGE_END)");
		pane.add(button, BorderLayout.PAGE_END);

		button = new JButton("5 (LINE_END)");
		pane.add(button, BorderLayout.LINE_END);
	}

	private void montaPainel(JPanel painel) {
		painel.setLayout(new GridLayout(5,5)); // adiciona um painel de grade 2 por 2
		
		JTextField campoNome = new JTextField(); // Cria um campo de texto
		JPasswordField campoSenha = new JPasswordField(); // Cria um campo de senha
		JLabel labelNome = new JLabel("jo0abe"); // Cria uma label de texto
		//JLabel labelSenha = new JLabel("Senha"); // ,,,

		// adiciona os componentes no painel
        painel.add(labelNome);
    	painel.add(campoNome);
    	//painel.add(labelSenha);
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
	

