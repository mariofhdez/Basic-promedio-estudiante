import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromedioEstudiante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField matematicas;
	private JTextField ingles;
	private JTextField historia;
	private JTextField artes;
	private JTextField informatica;
	private JTextField fisicaQuimica;
	private JTextField lenguaje;
	private JTextField deportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PromedioEstudiante frame = new PromedioEstudiante();
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
	public PromedioEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("PROMEDIO ESTUDIANTE");
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblTitulo.setBounds(88, 11, 252, 32);
		contentPane.add(lblTitulo);

		JLabel lblEstudiante = new JLabel("Ingrese el nombre del estudiante:");
		lblEstudiante.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEstudiante.setBounds(10, 54, 202, 20);
		contentPane.add(lblEstudiante);

		txtNombre = new JTextField();
		txtNombre.setBounds(222, 54, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblMatemticas = new JLabel("Matemáticas:");
		lblMatemticas.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMatemticas.setBounds(10, 97, 100, 20);
		contentPane.add(lblMatemticas);

		JLabel lblIngls = new JLabel("Inglés:");
		lblIngls.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIngls.setBounds(10, 128, 100, 20);
		contentPane.add(lblIngls);

		JLabel lblHistoria = new JLabel("Historia:");
		lblHistoria.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHistoria.setBounds(10, 159, 100, 20);
		contentPane.add(lblHistoria);

		JLabel lblArtes = new JLabel("Artes:");
		lblArtes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblArtes.setBounds(10, 190, 100, 20);
		contentPane.add(lblArtes);

		JLabel lblDeportes = new JLabel("Deportes:");
		lblDeportes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDeportes.setBounds(222, 190, 100, 20);
		contentPane.add(lblDeportes);

		JLabel lblLenguaje = new JLabel("Lenguaje");
		lblLenguaje.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLenguaje.setBounds(222, 159, 100, 20);
		contentPane.add(lblLenguaje);

		JLabel lblFsica = new JLabel("Física y Química:");
		lblFsica.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFsica.setBounds(222, 128, 100, 20);
		contentPane.add(lblFsica);

		JLabel lblInformtica = new JLabel("Informática:");
		lblInformtica.setFont(new Font("Arial", Font.PLAIN, 12));
		lblInformtica.setBounds(222, 97, 100, 20);
		contentPane.add(lblInformtica);

		matematicas = new JTextField();
		matematicas.setColumns(10);
		matematicas.setBounds(126, 97, 86, 20);
		contentPane.add(matematicas);

		ingles = new JTextField();
		ingles.setColumns(10);
		ingles.setBounds(126, 128, 86, 20);
		contentPane.add(ingles);

		historia = new JTextField();
		historia.setColumns(10);
		historia.setBounds(126, 159, 86, 20);
		contentPane.add(historia);

		artes = new JTextField();
		artes.setColumns(10);
		artes.setBounds(126, 190, 86, 20);
		contentPane.add(artes);

		informatica = new JTextField();
		informatica.setColumns(10);
		informatica.setBounds(332, 97, 86, 20);
		contentPane.add(informatica);

		fisicaQuimica = new JTextField();
		fisicaQuimica.setColumns(10);
		fisicaQuimica.setBounds(332, 128, 86, 20);
		contentPane.add(fisicaQuimica);

		lenguaje = new JTextField();
		lenguaje.setColumns(10);
		lenguaje.setBounds(332, 159, 86, 20);
		contentPane.add(lenguaje);

		deportes = new JTextField();
		deportes.setColumns(10);
		deportes.setBounds(332, 190, 86, 20);
		contentPane.add(deportes);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(332, 221, 89, 23);
		contentPane.add(btnRegistrar);

		JLabel lblResultado = new JLabel("¡Bienvenido!");
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblResultado.setBounds(10, 255, 408, 20);
		contentPane.add(lblResultado);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double notas[] = new double[8];
				
				notas[0] = Double.parseDouble((matematicas.getText().equals("")) ? "0" : matematicas.getText());
				notas[1] = Double.parseDouble((ingles.getText().equals("")) ? "0" : ingles.getText());
				notas[2] = Double.parseDouble((historia.getText().equals("")) ? "0" : historia.getText());
				notas[3] = Double.parseDouble((artes.getText().equals("")) ? "0" : artes.getText());
				notas[4] = Double.parseDouble((informatica.getText().equals("")) ? "0" : informatica.getText());
				notas[5] = Double.parseDouble((lenguaje.getText().equals("")) ? "0" : lenguaje.getText());
				notas[6] = Double.parseDouble((fisicaQuimica.getText().equals("")) ? "0" : fisicaQuimica.getText());
				notas[7] = Double.parseDouble((deportes.getText().equals("")) ? "0" : deportes.getText());
				
				double sum = 0;
				for(int i = 0; i < notas.length; i++) {
					sum = sum + notas[i];
				}
				double prom = sum / notas.length;
				
				lblResultado.setText("El estudiante "+txtNombre.getText()+" tiene un promedio de "+prom);
				
			}
		});
	}

}
