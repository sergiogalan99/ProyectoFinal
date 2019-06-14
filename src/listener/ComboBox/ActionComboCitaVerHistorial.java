package listener.ComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;

import control.logica.Item;
import facade.Facade;
import vista.comunes.PanelDatosPersonales;
import vistas.controlador.ControladorPanelDatosPersonales;
import vistas.controlador.ControladorPanelPedirCitaPacienteVerHistorialCitas;
import vistas.paciente.PanelConsultarCitas;
import vistas.paciente.PanelVerHistorialPaciente;

public class ActionComboCitaVerHistorial implements FocusListener,ActionListener{


		private JComboBox comboID, comboNombre;
		private Facade facade;
		private PanelVerHistorialPaciente panel;
		private ControladorPanelPedirCitaPacienteVerHistorialCitas controlador;

		public ActionComboCitaVerHistorial( JComboBox comboNombre,JComboBox comboID, Facade facade,
				ControladorPanelPedirCitaPacienteVerHistorialCitas controlador, PanelVerHistorialPaciente panel) {
			this.comboID = comboID;
			this.comboNombre = comboNombre;
			this.facade = facade;
			this.panel = panel;
			this.controlador = controlador;
		}

		@Override
		public void focusGained(FocusEvent arg0) {
			comboNombre.removeAllItems();
			comboID.removeAllItems();
		
			HashMap<Long, String> mapa = facade.obtnerMapaPaciente();
			for (Map.Entry<Long, String> entry : mapa.entrySet()) {
				comboNombre.addItem(new Item(entry.getKey(), String.valueOf(entry.getKey())));
				comboID.addItem(new Item(entry.getKey(), entry.getValue()));
		
			}
		}

		@Override
		public void focusLost(FocusEvent arg0) {

		}

		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JComboBox combo=(JComboBox)arg0.getSource();
			if(null!=combo.getSelectedItem()&&comboID.getItemCount()>0&&comboNombre.getItemCount()>0) {
			Item item= (Item) combo.getSelectedItem();
			comboNombre.setSelectedIndex(combo.getSelectedIndex());
			comboID.setSelectedIndex(combo.getSelectedIndex());
			controlador.rellenarTablaCita(panel, facade.obtenerCita(String.valueOf(item.getId())));
			}
		}

	}



