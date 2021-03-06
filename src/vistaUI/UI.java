package vistaUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import vista.comunes.PanelCierreOperacion;
import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelInicio;
import vista.comunes.PanelMensaje;
import vistas.medico.PanelAltaMedico;
import vistas.medico.PanelAtenderCitaMedico;
import vistas.medico.PanelConsultaBajaMedico;
import vistas.paciente.PanelAltaPaciente;
import vistas.paciente.PanelBajaModificacionConsultaPaciente;
import vistas.paciente.PanelConsultarCitas;
import vistas.paciente.PanelPedirCitaOperacionPaciente;
import vistas.paciente.PanelPedirCitaPrimarioyEspecialistaPaciente;
import vistas.paciente.PanelVerHistorialPaciente;

public class UI extends JFrame {

	private JPanel contentPane;
	//PANELES
	//
	 protected PanelInicio inicio=new PanelInicio();
	//Paciente
	 protected PanelAltaPaciente altaPaciente=new PanelAltaPaciente("ALTA PACIENTE", true, true, true, true, true,false,false, "imagenes\\altaPaciente.png");
	 protected PanelBajaModificacionConsultaPaciente bajaPaciente=new PanelBajaModificacionConsultaPaciente("BAJA PACIENTE",false,false,false,false,false,true,true,"imagenes\\bajaPacente.png");
	 protected  PanelBajaModificacionConsultaPaciente consultaPaciente= new PanelBajaModificacionConsultaPaciente("CONSULTA PACINETE", false,false,false,false,false,true,false,"imagenes\\consultarPaciente.png");
	 protected  PanelBajaModificacionConsultaPaciente modificacionPaciente=new PanelBajaModificacionConsultaPaciente("MODIFICACION PACIENTE",false,false,true,true,false,true,true,"imagenes\\modificarPaciente.png");
	 protected  PanelConsultarCitas consultaCitaPaciente=new PanelConsultarCitas();
	 protected  PanelVerHistorialPaciente verHistotialPaciente=new PanelVerHistorialPaciente();
	 protected PanelPedirCitaPrimarioyEspecialistaPaciente citaPrimario= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ATENCION PRIMARIA","Medico",true,true);
	 protected PanelPedirCitaPrimarioyEspecialistaPaciente citaEspecialista= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ESPECIALISTA","Especialista",false,false);
	 protected PanelPedirCitaOperacionPaciente citaOperacion= new PanelPedirCitaOperacionPaciente();
	//Medico
	 protected PanelAltaMedico altaMedico= new PanelAltaMedico("ALTA MEDICO");
	 protected PanelConsultaBajaMedico bajaMedico= new PanelConsultaBajaMedico("BAJA MEDICO",true,"imagenes\\bajaDoctor.png");
	 protected PanelConsultaBajaMedico consultaMedico= new PanelConsultaBajaMedico("CONSULTA MEDICO",false,"imagenes\\consultaDoctor.png");
	 protected PanelAtenderCitaMedico atenderCitaMedico= new PanelAtenderCitaMedico();
	 //Operacion
	 protected PanelCierreOperacion cierreOperacion= new PanelCierreOperacion();
	 protected JTextField fecha;
	 protected JTextField hora;
	 protected JButton btnPasar;
	
	
	public UI() {
		setTitle("CLINICA EPYGAY");
		setMaximumSize(new Dimension(2047483647, 2047483647));

		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 50, 1200, 660);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 165, 32));
		contentPane.setForeground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		GroupLayout groupLayout = (GroupLayout) inicio.getLayout();
		groupLayout.setAutoCreateGaps(true);
		inicio.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		contentPane.add(inicio);
		//PACIENTE
		contentPane.add(altaPaciente,"PanelAltaPaciente");
		contentPane.add(bajaPaciente,"PanelBajaPaciente");
		contentPane.add(consultaPaciente,"PanelConsultaPaciente");
		contentPane.add(modificacionPaciente,"PanelModificacionPaciente");
		contentPane.add(citaPrimario,"PanelPedirCitaPrimarioPaciente");
		contentPane.add(citaEspecialista,"PanelPedirCitaEspecialistaPaciente");
		contentPane.add(citaOperacion,"PanelPedirCitaOperacionPaciente");
		contentPane.add(consultaCitaPaciente,"PanelConsultaCitaPaciente");
		contentPane.add(verHistotialPaciente,"PanelVerHistorialPaciente");
		
		//MEDICO
		contentPane.add(altaMedico,"PanelAltaMedico");
		contentPane.add(bajaMedico,"PanelBajaMedico");
		contentPane.add(consultaMedico,"PanelConsultaMedico");
		contentPane.add(atenderCitaMedico,"PanelAtenderCitaMedico");
		
		//OPERACION
		contentPane.add(cierreOperacion,"PanelCierreOperacion");
		
		
		JPanel panelinicio = new JPanel();
		panelinicio.setBackground(new Color(204, 204, 51));
		contentPane.add(panelinicio, "name_969325539976868");
		panelinicio.setLayout(new CardLayout(0, 0));

		JLabel lblClinicaEpyGay = new JLabel("CLINICA EPYGAY");
		lblClinicaEpyGay.setBackground(new Color(204, 204, 51));
		lblClinicaEpyGay.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblClinicaEpyGay.setHorizontalAlignment(SwingConstants.CENTER);
		panelinicio.add(lblClinicaEpyGay, "inicio");

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		menuBar.setBackground(new Color(218, 165, 32));
		menuBar.setForeground(new Color(0, 0, 0));
		setJMenuBar(menuBar);

		JMenu mnPaciente = new JMenu("   Paciente   ");
		mnPaciente.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		
		
		mnPaciente.setBackground(new Color(218, 165, 32));
		mnPaciente.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnPaciente);
//ALTA PACIENTE
		JMenuItem mntmAlta = new JMenuItem("Alta");
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaPaciente");
			}
		});
		mntmAlta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmAlta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmAlta);
//BAJA PACIENTE
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelBajaPaciente");
			}
		});
		mntmBaja.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBaja.setFont(new Font("Alef", Font.BOLD, 20));
		mntmBaja.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmBaja);
	
//MODIFICACION PACIENTE
		JMenuItem mntmModificacion = new JMenuItem("Modificacion");
		mntmModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelModificacionPaciente");
			}
		});
		mntmModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmModificacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmModificacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmModificacion);
//CONSULTA PACIENTE 
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelConsultaPaciente");
			}
		});
		mntmConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsulta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsulta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsulta);

		JMenuItem mntmPedirCitaPrimaria = new JMenuItem("Pedir Cita Primaria");
		mntmPedirCitaPrimaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaPrimarioPaciente");
				
			}
		});
		mntmPedirCitaPrimaria.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaPrimaria.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaPrimaria.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaPrimaria);

		JMenuItem mntmPedirCitaEspecialista = new JMenuItem("Pedir Cita Especialista");
		mntmPedirCitaEspecialista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaEspecialistaPaciente");
			}
		});
		mntmPedirCitaEspecialista.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaEspecialista.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaEspecialista.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaEspecialista);

		JMenuItem mntmPedirOperacion = new JMenuItem("Pedir Operacion");
		mntmPedirOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelPedirCitaOperacionPaciente");
				
			}
		});
		mntmPedirOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirOperacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirOperacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirOperacion);

		JMenuItem mntmConsultarCitas = new JMenuItem("Consultar citas");
		mntmConsultarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelConsultaCitaPaciente");
			}
		});
		mntmConsultarCitas.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsultarCitas.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsultarCitas.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsultarCitas);

		JMenuItem mntmVerHistorial = new JMenuItem("Ver Historial");
		mntmVerHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelVerHistorialPaciente");
			}
		});
		mntmVerHistorial.setHorizontalAlignment(SwingConstants.CENTER);
		mntmVerHistorial.setFont(new Font("Alef", Font.BOLD, 20));
		mntmVerHistorial.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmVerHistorial);

		JMenu mnMedico = new JMenu("   Medico   ");
		mnMedico.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		
		mnMedico.setBackground(new Color(139, 0, 139));
		mnMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mnMedico.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnMedico);

		JMenuItem mntmAlta_1 = new JMenuItem("Alta");
		mntmAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaMedico");
			}
		});
		mntmAlta_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlta_1.setBackground(new Color(102, 102, 255));
		mntmAlta_1.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAlta_1);

		JMenuItem mntmBaja_1 = new JMenuItem("Baja");
		mntmBaja_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelBajaMedico");
			}
		});
		mntmBaja_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBaja_1.setBackground(new Color(102, 102, 255));
		mntmBaja_1.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmBaja_1);

		JMenuItem mntmAtenderCita = new JMenuItem("Atender cita");
		mntmAtenderCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelAtenderCitaMedico");
			}
		});
		
		JMenuItem menuItemConsulta = new JMenuItem("Consulta");
		menuItemConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelConsultaMedico");
			}
		});
		menuItemConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		menuItemConsulta.setFont(new Font("Alef", Font.BOLD, 22));
		menuItemConsulta.setBackground(new Color(102, 102, 255));
		mnMedico.add(menuItemConsulta);
		mntmAtenderCita.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAtenderCita.setBackground(new Color(102, 102, 255));
		mntmAtenderCita.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAtenderCita);

		JMenu mnOperacion = new JMenu("   Operacion   ");
		mnOperacion.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		mnOperacion.setBackground(new Color(139, 69, 19));
		mnOperacion.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnOperacion);

		JMenuItem mntmCerrarOperacion = new JMenuItem("Cerrar Operacion");
		mntmCerrarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelCierreOperacion");
			}
		});
		mntmCerrarOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmCerrarOperacion.setBackground(new Color(255, 204, 153));
		mntmCerrarOperacion.setFont(new Font("Alef", Font.BOLD, 22));
		mnOperacion.add(mntmCerrarOperacion);
		
		hora = new JTextField();
		hora.setForeground(new Color(0, 0, 0));
		hora.setBackground(new Color(210, 180, 140));
		hora.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(0, 0, 0)));
		hora.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		fecha = new JTextField();
		fecha.setForeground(new Color(0, 0, 0));
		fecha.setBackground(new Color(210, 180, 140));
		fecha.setBorder(new MatteBorder(1, 2, 1, 0, (Color) new Color(0, 0, 0)));
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		fecha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		fecha.setEditable(false);
		menuBar.add(fecha);
		fecha.setColumns(10);
		hora.setFont(new Font("Tahoma", Font.BOLD, 22));
		hora.setEditable(false);
		menuBar.add(hora);
		hora.setColumns(10);
		
		 //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat(" dd / MM / YYYY ");
        fecha.setText(formato.format(sistFecha));
        
        JPanel panel = new JPanel();
        menuBar.add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        btnPasar = new JButton("PASAR");
        
        btnPasar.setForeground(new Color(255, 255, 255));
        panel.add(btnPasar, BorderLayout.CENTER);
        btnPasar.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnPasar.setBackground(new Color(165, 42, 42));
        //HORA
        Timer tiempo=new Timer(100, new UI.horas());
        tiempo.start();
 
	}
	private void asociarPanel(String string) {
		((CardLayout)contentPane.getLayout()).show(contentPane,string);
	}


	
	//PACIENTE
	
	public PanelDatosPersonales getPanelDatosPersonalesAltaPaciente() {
		return altaPaciente.getPanelDatosPersonales();
	}
	public PanelDatosPersonales getPanelDatosPersonalesModificacionPaciente() {
		return modificacionPaciente.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesBajaPaciente() {
		return bajaPaciente.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesConsultaPaciente() {
		return consultaPaciente.getPanelDatosPersonales();
	}

	public JComboBox getComboBoxIdBajaPaciente() {
		return bajaPaciente.getComboBoxId();
	}
	public JComboBox getComboBoxNombreBajaPaciente() {
		return bajaPaciente.getComboBoxNombre();
	}
	
	public JComboBox getComboBoxIdModificacionPaciente() {
		return modificacionPaciente.getComboBoxId();
	}

	public JComboBox getComboBoxNombreModificacionPaciente() {
		return modificacionPaciente.getComboBoxNombre();
	}
	
	public JComboBox getComboBoxIdConsultaPaciente() {
		return consultaPaciente.getComboBoxId();
	}
	public JComboBox getComboBoxNombreConsultaPaciente() {
		return consultaPaciente.getComboBoxNombre();
	}
	
	public JComboBox getComboBoxIdCitaPrimeariaPaciente() {
		return citaPrimario.getPanelPedirCitaPacienteid();
	}
	public JComboBox getComboBoxNombreCitaPrimeariaPaciente() {
		return citaPrimario.getPanelPedirCitaPacienteNombre();
	}

	 
	//DOCTOR
	
	public PanelDatosPersonales getPanelDatosPersonalesConsultaDoctor() {
		return consultaMedico.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesBajaDoctor() {
		return bajaMedico.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPesonalesAltaDoctor() {
		return altaMedico.getPanelDatosPersonales();
	}
	
	

	public JComboBox getComboBoxIdBajaDoctor() {
		return bajaMedico.getComboId();
	}

	public JComboBox getComboBoxNombreBajaDoctor() {
		return bajaMedico.getComboNombre();
	}
	public JComboBox getComboBoxIdConsultaDoctor() {
		return consultaMedico.getComboId();
	}

	public JComboBox getComboBoxNombreConsultaDoctor() {
		return consultaMedico.getComboNombre();
	}
	
	
	public JComboBox getComboBoxIdCitaPrimaria() {
		return citaPrimario.getPanelPedirCitaPacienteNombre();
	}
	public JComboBox getComboBoxNombreCitaPrimaria() {
		return citaPrimario.getPanelPedirCitaPacienteid();
	}
	public JComboBox getComboBoxNombreCiaPrimariaDoctor() {
		return citaPrimario.getPanelPedirCitaPacienteNombreDoctor();
	}
	public JComboBox getComboBoxIdCiaPrimariaDoctor() {
		return citaPrimario.getPanelPedirCitaPacienteIDDoctor();
	}
	public JComboBox getComboBoxIdCitaEspecialista() {
		return citaEspecialista.getPanelPedirCitaPacienteNombre();
	}
	public JComboBox getComboBoxNombreCitaEspecialista() {
		return citaEspecialista.getPanelPedirCitaPacienteid();
	}
	public JComboBox getComboBoxNombreCiaEspecialistaDoctor() {
		return citaEspecialista.getPanelPedirCitaPacienteNombreDoctor();
	}
	public JComboBox getComboBoxIdCiaEspecialistaDoctor() {
		return citaEspecialista.getPanelPedirCitaPacienteIDDoctor();
	}
	
	public JComboBox getComboBoxNombreConsultarCitas() {
		return consultaCitaPaciente.getComboBoxConsultarCitasNombrePaciente();
	}
	public JComboBox getComboBoxIDConsultarCitas() {
		return consultaCitaPaciente.getComboBoxConsultarCitasIdPaciente();
	}
	public PanelConsultarCitas getPanelConsultarCitas() {
		return consultaCitaPaciente;
	}
	
	public JComboBox getComboBoxIDHistorial() {
		return verHistotialPaciente.getComboBoxIDHistorial();
	}

	public JComboBox getComboBoxNombreHistorial() {
		return verHistotialPaciente.getComboBoxNombreHistorial();
	}
	public JComboBox getComboBoxIdCirujanoPaciente() {
		return citaOperacion.getPanelComboBoxId();
	}
	public JComboBox getComboBoxNombreCirujanoPaciente() {
		return citaOperacion.getPanelComboBoxNombre();
	}
	public JComboBox getComboBoxIdCirujano() {
		return citaOperacion.getComboBoxIdCirujanoNuevo();
	}
	public JComboBox getComboBoxNombreCirujano() {
		return citaOperacion.getComboBoxNombreCirujanoNuevo();
	}
	

	
	public PanelVerHistorialPaciente getPanelVerHistorial() {
		return verHistotialPaciente;
	}
	 class horas implements ActionListener{

	        public void actionPerformed(ActionEvent e){
	            Date sistHora=new Date();
	            String pmAm="hh:mm:ss a";
	            SimpleDateFormat format=new SimpleDateFormat(pmAm);
	            Calendar hoy=Calendar.getInstance();
	            hora.setText(String.format(format.format(sistHora),hoy));


	        }
	 }
	
	
}
