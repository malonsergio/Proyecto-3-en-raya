package vista;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FormInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelFondo;
	private JTextField txtJugador1;
	private JTextField txtJugador2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInicio frame = new FormInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormInicio() {
	
		setResizable(false);
		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		PanelFondo = new JPanel();
		PanelFondo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			PanelFondo.requestFocus();
			}
		});
		PanelFondo.setBackground(new Color(14, 19, 49));
		PanelFondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelFondo);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(401, 10, 39, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			System.exit(0);
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);	
			}
		});
		PanelFondo.setLayout(null);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
		PanelFondo.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3 EN RAYA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.BOLD, 36));
		lblNewLabel_1.setBounds(34, 34, 368, 41);
		PanelFondo.add(lblNewLabel_1);
		
		txtJugador1 =  new JTextField();
		txtJugador1.setFocusable(false);
		txtJugador1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtJugador1.getText().equals("JUGADOR 1")) {
					txtJugador1.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
			txtJugador1.setText("JUGADOR 1");
			}
		});
		txtJugador1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
				txtJugador1.setBorder(borde);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			txtJugador1.setBorder(null);	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txtJugador1.setFocusable(true);
			}
		});
		txtJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		txtJugador1.setText("JUGADOR 1");
		txtJugador1.setForeground(new Color(101, 175, 245));
		txtJugador1.setFont(new Font("SansSerif", Font.BOLD, 28));
		txtJugador1.setBounds(100, 100, 230, 40);
		PanelFondo.add(txtJugador1);
		txtJugador1.setColumns(10);
			
		txtJugador2 = new JTextField();
		txtJugador2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtJugador2.getText().equals("JUGADOR 2")) {
					txtJugador2.setText(null);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtJugador2.setText("JUGADOR 2");
			}
		});
		txtJugador2.setFocusable(false);
		txtJugador2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			Border borde = BorderFactory.createLineBorder(new Color(165,40,174),2);
			txtJugador2.setBorder(borde);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			txtJugador2.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			txtJugador2.setFocusable(true);
			}
		});
		txtJugador2.setText("JUGADOR 2");
		txtJugador2.setHorizontalAlignment(SwingConstants.CENTER);
		txtJugador2.setForeground(new Color(202, 105, 220));
		txtJugador2.setFont(new Font("SansSerif", Font.BOLD, 28));
		txtJugador2.setColumns(10);
		txtJugador2.setBounds(100, 160, 230, 40);
		PanelFondo.add(txtJugador2);
	}
}
