package programa.simao;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClassTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ClassTest() {
		super();
		
		this.montaLayout();
		this.setVisible(true);
		this.setSize(300,300);
	}

	private void montaLayout() {
		Container interno = this.getContentPane();
		interno.setLayout(new BorderLayout());
		
		JPanel painel = new JPanel();
		montaPainel(painel);
		interno.add(painel);
		
		JButton botaoSalvar = new JButton("salvar");
		interno.add(botaoSalvar, BorderLayout.SOUTH);
		
		adicionaAcao(botaoSalvar);
		
		
		
		
	}

	private void adicionaAcao(JButton botaoSalvar) {
		// TODO Auto-generated method stub
		
	}

	private void montaPainel(JPanel painel) {
		// TODO Auto-generated method stub
		
	}
}
