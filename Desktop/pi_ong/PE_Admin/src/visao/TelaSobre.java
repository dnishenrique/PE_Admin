package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class view {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelSobre = new JPanel();
		tabbedPane.addTab("Sobre", null, panelSobre, null);
		panelSobre.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Programa desenvolvido para atendimento de organiza\u00E7\u00F5es n\u00E3o governamentais ligadas a assit\u00EAncia social, realizando cadastramento de fam\u00EDlias carentes, doa\u00E7\u00F5es e manuten\u00E7\u00E3o de atendimento das mesmas.");
		textPane.setBounds(10, 11, 409, 211);
		panelSobre.add(textPane);
		
		JPanel panelDesenvolvedores = new JPanel();
		tabbedPane.addTab("Desenvolvedores", null, panelDesenvolvedores, null);
		panelDesenvolvedores.setLayout(null);
		
		JTextPane txtpnDenisHenriquePesquisa = new JTextPane();
		txtpnDenisHenriquePesquisa.setText("Denis Henrique\r\nHugo Teodoro\r\nJ\u00FAlio Ces\u00E1rio\r\nLuana de Paula\r\nMaciel Oliveira\r\nMaycon Oliveira\r\nRodrigo da Cruz");
		txtpnDenisHenriquePesquisa.setBounds(10, 46, 168, 114);
		panelDesenvolvedores.add(txtpnDenisHenriquePesquisa);
		
		JTextPane txtpnEquipeSomos = new JTextPane();
		txtpnEquipeSomos.setText("Equipe - Somos Engenharia");
		txtpnEquipeSomos.setBounds(10, 15, 149, 20);
		panelDesenvolvedores.add(txtpnEquipeSomos);
		
		JPanel panelContato = new JPanel();
		tabbedPane.addTab("Contato", null, panelContato, null);
		panelContato.setLayout(null);
		
		JTextPane txtpnSeuNomeobrigatrio = new JTextPane();
		txtpnSeuNomeobrigatrio.setText("Seu nome (obrigat\u00F3rio)");
		txtpnSeuNomeobrigatrio.setBounds(10, 11, 140, 20);
		panelContato.add(txtpnSeuNomeobrigatrio);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 32, 409, 20);
		panelContato.add(textField);
		
		JTextPane txtpnSeuEmailobrigatrio = new JTextPane();
		txtpnSeuEmailobrigatrio.setText("Seu e-mail (obrigat\u00F3rio)");
		txtpnSeuEmailobrigatrio.setBounds(10, 63, 140, 20);
		panelContato.add(txtpnSeuEmailobrigatrio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 84, 409, 20);
		panelContato.add(textField_1);
		
		JTextPane txtpnAssunto = new JTextPane();
		txtpnAssunto.setText("Assunto");
		txtpnAssunto.setBounds(10, 115, 121, 20);
		panelContato.add(txtpnAssunto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 135, 409, 53);
		panelContato.add(textField_2);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(330, 199, 89, 23);
		panelContato.add(btnEnviar);
	}
}
