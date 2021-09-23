package dad.holamundo.awt;

import java.awt.*;

public class HolaMundo {

	public static void main(String[] args) {
		
		//creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquï¿½ saldrï¿½ el saludo");
		saludoLabel.setBounds(20, 20, 120, 50); //x, y, ancho, alto
		
		//creamos el botï¿½n para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(e -> saludarLabel.setText("¡¡¡Hola Mundo!!!"));
		//TODO poner un evento al botón
		
		//panel (contenedor) que contiene la etiqueta y el boton
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Si lo dejas null lo centra en pantalla
		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose(); // cerrar la ventana 
			}
		});
		
		frame.add(rootPanel);
		frame.setVisible(true);
	}

}
