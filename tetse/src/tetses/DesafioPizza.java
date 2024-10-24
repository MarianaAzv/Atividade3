package tetses;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;

public class DesafioPizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesafioPizza frame = new DesafioPizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DesafioPizza() {
		setTitle("Pizzaria QuantoMaisBaratoMelhor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 215, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 222, 225));
		panel.setBounds(10, 32, 176, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxMilho = new JCheckBox("MilhoR$11");
		chckbxMilho.setBounds(12, 5, 145, 23);
		panel.add(chckbxMilho);
		
		JCheckBox chckbxCalabresa = new JCheckBox("CalabresaR$20");
		chckbxCalabresa.setBounds(12, 32, 145, 23);
		panel.add(chckbxCalabresa);
		
		JCheckBox chckbxPeperone = new JCheckBox("PeperoneR$25");
		chckbxPeperone.setBounds(12, 58, 145, 23);
		panel.add(chckbxPeperone);
		
		JCheckBox chckbxFranco = new JCheckBox("FrancoR$16");
		chckbxFranco.setBounds(12, 110, 145, 23);
		panel.add(chckbxFranco);
		
		JCheckBox chckbxDaCasa = new JCheckBox("Da CasaR$30");
		chckbxDaCasa.setBounds(11, 84, 146, 23);
		panel.add(chckbxDaCasa);
		
		JCheckBox chckbxPortuguesa = new JCheckBox("PortuguesaR$17");
		chckbxPortuguesa.setBounds(12, 188, 145, 23);
		panel.add(chckbxPortuguesa);
		
		JCheckBox chckbx4Queijos = new JCheckBox("4QueijosR$15");
		chckbx4Queijos.setBounds(12, 162, 145, 23);
		panel.add(chckbx4Queijos);
		
		JCheckBox chckbxVegetariana = new JCheckBox("VegetarianaR$12");
		chckbxVegetariana.setBounds(12, 136, 145, 23);
		panel.add(chckbxVegetariana);
		
		JCheckBox chckbxEspanhola = new JCheckBox("EspanholaR$14");
		chckbxEspanhola.setBounds(12, 214, 145, 23);
		panel.add(chckbxEspanhola);
		
		JCheckBox chckbxMarguarita = new JCheckBox("MarguaritaR$10");
		chckbxMarguarita.setBounds(12, 240, 151, 23);
		panel.add(chckbxMarguarita);
		
		JComboBox combo = new JComboBox();
		
		combo.addItem(chckbxMilho);
		combo.addItem(chckbxCalabresa);
		combo.addItem(chckbxPeperone);
		combo.addItem(chckbxDaCasa);
		combo.addItem(chckbxPortuguesa);
		combo.addItem(chckbx4Queijos);
		combo.addItem(chckbxVegetariana);
		combo.addItem(chckbxEspanhola);
		combo.addItem(chckbxMarguarita);
		
		
		
		
		
		JLabel lblSaborPizza = new JLabel("Sabor Pizza");
		lblSaborPizza.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSaborPizza.setBounds(52, 11, 102, 14);
		contentPane.add(lblSaborPizza);
		
		JRadioButton rdbtnSemBordas = new JRadioButton("Sem borda-R$0.00");
		rdbtnSemBordas.setBounds(232, 149, 139, 23);
		contentPane.add(rdbtnSemBordas);
		
		JRadioButton rdbtnComBordas = new JRadioButton("Com borda-R$2.00");
		rdbtnComBordas.setBounds(232, 175, 139, 23);
		contentPane.add(rdbtnComBordas);
		
		JLabel lblBordas = new JLabel("Bordas");
		lblBordas.setFont(new Font("Verdana", Font.BOLD, 12));
		lblBordas.setBounds(285, 128, 46, 14);
		contentPane.add(lblBordas);
		
		JLabel lblREtirada = new JLabel("Retirada");
		lblREtirada.setFont(new Font("Verdana", Font.BOLD, 12));
		lblREtirada.setBounds(276, 205, 95, 14);
		contentPane.add(lblREtirada);
		
		JComboBox comboBoxRetirar = new JComboBox();
		comboBoxRetirar.setModel(new DefaultComboBoxModel(new String[] {"Tele Entrega", "Retirar no local"}));
		comboBoxRetirar.setBounds(251, 230, 120, 22);
		contentPane.add(comboBoxRetirar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(221, 222, 225));
		panel_1.setBounds(196, 28, 214, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdicionais = new JLabel("Adicionais- Sem limites");
		lblAdicionais.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdicionais.setBounds(23, 0, 181, 14);
		panel_1.add(lblAdicionais);
		
		JCheckBox chckbxADMaionese = new JCheckBox("Maionese");
		chckbxADMaionese.setBounds(6, 21, 97, 23);
		panel_1.add(chckbxADMaionese);
		
		JCheckBox chckbxADKetchup = new JCheckBox("Ketchup");
		chckbxADKetchup.setBounds(6, 47, 97, 23);
		panel_1.add(chckbxADKetchup);
		
		JCheckBox chckbxADMostarda = new JCheckBox("Mostarda");
		chckbxADMostarda.setBounds(111, 21, 97, 23);
		panel_1.add(chckbxADMostarda);
		
		JCheckBox chckbxADMolho = new JCheckBox("Molho");
		chckbxADMolho.setBounds(111, 47, 97, 23);
		panel_1.add(chckbxADMolho);
		
		JLabel lblADValor = new JLabel("Valor cada: R$1.00");
		lblADValor.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblADValor.setBounds(63, 79, 124, 14);
		panel_1.add(lblADValor);
		
		JButton btnValorFinal = new JButton("Valor Final");
		btnValorFinal.setBounds(232, 263, 149, 46);
		contentPane.add(btnValorFinal);
	}
}
