package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.Botonera;
import vista.comunes.PanelComboBox;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;

public class PanelPedirCitaOperacionPaciente extends JPanel {
PanelComboBox combo= null;
Botonera botonera;

	public PanelPedirCitaOperacionPaciente() {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblCitaAtencionPrimaria = new JLabel("CITA OPERACION");
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout(0, 0));
		PanelComboBox panelComboBox = new PanelComboBox("Paciente", "ID");
		panelComboBox.getComboBoxID().setBackground(SystemColor.activeCaption);
		panelComboBox.getComboBoxNombre().setBackground(SystemColor.activeCaption);
		panelComboBox.setBackground(new Color(240, 230, 140));
		panel.add(panelComboBox);
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblCirujano = new JLabel("Cirujano");
		lblCirujano.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblFechasDisponibles = new JLabel("Fechas Disponibles");
		lblFechasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JComboBox comboBox_2 = new JComboBox();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BorderLayout(0, 0));
		PanelMensaje panelMensaje = new PanelMensaje();
		panelMensaje.setBackground(new Color(240, 230, 140));
		panel_1.add(panelMensaje);
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCitaAtencionPrimaria)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechasDisponibles)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 549, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTipo)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblCirujano)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, 0, 366, Short.MAX_VALUE)))))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(115, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblCitaAtencionPrimaria)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo)
						.addComponent(lblCirujano)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(137)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechasDisponibles)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(115)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		setLayout(groupLayout);
		
		
	
	}
}
