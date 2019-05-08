package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import DAOsDTOs.*;
import controladores.*;
import interfaces.Crud;
import stack.StackArray;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;

public class MainInterface extends JFrame implements ActionListener {
	
	//-----------------CONSTANTS--------------------------------------
	public final static String AUTOBUS="AUTOBUS";
	public final static String CENTRO_DE_ESTUDIO="CENTRO_DE_ESTUDIO";
	public final static String ESTUDIANTE="ESTUDIANTE";
	public final static String GRUPO_AUTOBUSES="GRUPO_AUTOBUSES";
	public final static String GRUPO_PARADAS="GRUPO_PARADAS";
	public final static String MATRICULA="MATRICULA";
	public final static String PARADA="PARADA";
	public final static String PROGRAMA="PROGRAMA";
	public final static String SUSCRIPCION_AUTOBUSES="SUSCRIPCION_AUTOBUSES";
	
	
	//-----------------DECLARED VARIABLES--------------------------------------
	private JTextField textField6;
	private JTextField textField5;
	private JTextField textField2;
	private JTextField textField4;
	private JTextField textField3;
	private JTextField textField1;
	private JTextField textField7;	
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	
	private JLabel imgLabel;
	
	private JButton insertButton;
	private JButton deleteButton;
	private JButton updateButton;
	private JButton findAllButton;
	private JButton findIdButton;
	
	private Button autobusButton;
	private Button centroEstudioButton;
	private Button estudianteButton;
	private Button grupoAutobusesButton;
	private Button grupoParadasButton;
	private Button matriculaButton;
	private Button paradaButton;
	private Button programaButton;
	private Button SuscripcionAutobuesButton;
	
	private JScrollPane scrollPane;
	
	private JPanel coverPanel;
	private JPanel formPanel;
	
	private JMenuBar menuBar;
		
	private AutobusController autobusController;
	private CentroEstudioController centroEstudioController;
	private EstudianteController estudianteController;
	private GrupoAutobusesController grupoAutobusesController;
	private GrupoParadasController grupoParadasController;
	private MatriculaController matriculaController;
	private ParadaController paradaController;
	private ProgramaController programaController;
	private SuscripcionAutobusesController suscripcionAutobusesController;
	
	private String currentTable;
	private JTable dataTable;

	/**
	 * Create the application.
	 */
	public MainInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Gestor de informacion");
		setBounds(100, 100, 1090, 539);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);		
				
		Image img= new ImageIcon("/home/jssv/Escritorio/WorkSpaceTemp/proyectoEstructurasDeDatos/data/img/bus.png.jpg").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(950,700, Image.SCALE_SMOOTH));
		
		dataTable = new JTable();
			
		autobusButton = new Button("Autobus");
		autobusButton.addActionListener(this);
		
		centroEstudioButton = new Button("Centro de estudio");
		centroEstudioButton.addActionListener(this);
		
		estudianteButton = new Button("Estudiante");
		estudianteButton.addActionListener(this);
		
		grupoAutobusesButton = new Button("Grupo de autobuses");
		grupoAutobusesButton.addActionListener(this);
		
		grupoParadasButton = new Button("Grupo de paradas");
		grupoParadasButton.addActionListener(this);
		
		matriculaButton = new Button("Matricula");
		matriculaButton.addActionListener(this);
		
		paradaButton = new Button("Parada");
		paradaButton.addActionListener(this);
		
		programaButton = new Button("Programa");
		programaButton.addActionListener(this);
		
		SuscripcionAutobuesButton = new Button("Suscripcion  autobuses");
		SuscripcionAutobuesButton.addActionListener(this);
		
			formPanel = new JPanel();
			formPanel.setForeground(Color.BLACK);
			formPanel.setBackground(Color.LIGHT_GRAY);
			formPanel.setBounds(0, 0, 1090, 495);
			formPanel.setLayout(null);
			
			textField1 = new JTextField();
			textField1.setBounds(217, 35, 106, 20);
			textField1.setColumns(10);
			
			textField2 = new JTextField();
			textField2.setBounds(555, 35, 106, 20);
			textField2.setColumns(10);
			
			textField3 = new JTextField();
			textField3.setBounds(905, 35, 106, 20);
			textField3.setColumns(10);
			
			textField4 = new JTextField();
			textField4.setBounds(217, 103, 106, 20);
			textField4.setColumns(10);
			
			textField5 = new JTextField();
			textField5.setBounds(555, 103, 106, 20);
			textField5.setColumns(10);
			
			textField6 = new JTextField();
			textField6.setBounds(905, 103, 106, 20);
			textField6.setColumns(10);
			
			textField7 = new JTextField();
			textField7.setColumns(10);
			textField7.setBounds(217, 175, 106, 20);
			
			label1 = new JLabel("");
			label1.setBounds(61, 41, 191, 14);
			
			label2 = new JLabel("");
			label2.setBounds(382, 41, 186, 14);
			
			label3 = new JLabel("");
			label3.setBounds(701, 35, 196, 14);
			
			label4 = new JLabel("");
			label4.setBounds(61, 109, 138, 14);
			
			label5 = new JLabel("");
			label5.setBounds(382, 109, 186, 14);
			
			label6 = new JLabel("");
			label6.setBounds(701, 103, 138, 14);
			
			label7 = new JLabel("");
			label7.setBounds(61, 181, 138, 14);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 295, 1013, 159);
			
		insertButton = new JButton("Insert");				
		insertButton.addActionListener(this);
		insertButton.setBounds(152, 253, 89, 23);
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(this);
		deleteButton.setBounds(296, 253, 89, 23);
		
		updateButton = new JButton("Update");
		updateButton.addActionListener(this);
		updateButton.setBounds(481, 253, 89, 23);
		
		findAllButton = new JButton("Find All");
		findAllButton.addActionListener(this);
		findAllButton.setBounds(666, 253, 89, 23);
		
		findIdButton = new JButton("Find by Id");
		findIdButton.addActionListener(this);
		
		coverPanel = new JPanel();
		coverPanel.setBounds(0, 0, 1090, 495);
		coverPanel.setLayout(null);
		
		imgLabel = new JLabel("");
		imgLabel.setIcon(img2);
		imgLabel.setBounds(82, 0, 1049, 487);
		
		
		getContentPane().add(coverPanel);
		coverPanel.add(imgLabel);
		findIdButton.setBounds(811, 253, 89, 23);
		getContentPane().add(formPanel);
		formPanel.add(textField1);
		formPanel.add(textField2);
		formPanel.add(textField3);
		formPanel.add(textField4);
		formPanel.add(textField5);
		formPanel.add(textField6);
		formPanel.add(textField7);
		formPanel.add(label1);
		formPanel.add(label2);
		formPanel.add(label3);
		formPanel.add(label4);
		formPanel.add(label5);
		formPanel.add(label6);
		formPanel.add(label7);
		formPanel.add(scrollPane);
		formPanel.add(insertButton);
		formPanel.add(deleteButton);
		formPanel.add(updateButton);
		formPanel.add(findAllButton);
		formPanel.add(findIdButton);				
		menuBar.add(autobusButton);
		menuBar.add(centroEstudioButton);
		menuBar.add(estudianteButton);
		menuBar.add(grupoAutobusesButton);
		menuBar.add(grupoParadasButton);
		menuBar.add(matriculaButton);
		menuBar.add(paradaButton);
		menuBar.add(programaButton);
		menuBar.add(SuscripcionAutobuesButton);
		
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{		
		if( event.getSource() == autobusButton ) {
			coverPanel.setVisible(false);
			currentTable = AUTOBUS;
			label1.setText("Id autobus:");
			label2.setText("Id centro de estudio:");
			label3.setText("Matricula:");
			label4.setText("Numero de asientos:");
			label5.setText("Nombre compañia:");		
			label3.setVisible(true);
			label4.setVisible(true);
			label5.setVisible(true);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(true);
			textField4.setVisible(true);
			textField5.setVisible(true);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id autobus", "Id centro de estudio", "Matricula", "Numero de asientos", "Compañia"
				}
			));
			dataTable.getColumnModel().getColumn(0).setPreferredWidth(90);
			dataTable.getColumnModel().getColumn(1).setPreferredWidth(138);
			dataTable.getColumnModel().getColumn(2).setPreferredWidth(123);
			dataTable.getColumnModel().getColumn(3).setPreferredWidth(61);
			dataTable.getColumnModel().getColumn(4).setPreferredWidth(110);
			scrollPane.setViewportView(dataTable);

		}
		else if( event.getSource() == centroEstudioButton ) {
			coverPanel.setVisible(false);
			currentTable = CENTRO_DE_ESTUDIO;
			label1.setText("Id Centro de estudio:");
			label2.setText("Nombre:");
			label3.setText("Direccion:");			
			label3.setVisible(true);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(true);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo centro de estudio",  "Nombre", "Direccion"
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);
				dataTable.getColumnModel().getColumn(2).setPreferredWidth(123);
				scrollPane.setViewportView(dataTable);
		}
		else if( event.getSource() == estudianteButton ) {
			coverPanel.setVisible(false);
			currentTable = ESTUDIANTE;	
			label1.setText("Id Estudiante:");			
			label2.setText("Id Programa:");
			label3.setText("Nombre:");
			label4.setText("Apellido:");
			label5.setText("Direccion:");
			label3.setVisible(true);
			label4.setVisible(true);
			label5.setVisible(true);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(true);
			textField4.setVisible(true);
			textField5.setVisible(true);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo estudiante", "Programa", "Nombre", "Apellido", "Direccion" 
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);
				dataTable.getColumnModel().getColumn(2).setPreferredWidth(123);
				dataTable.getColumnModel().getColumn(3).setPreferredWidth(61);
				dataTable.getColumnModel().getColumn(4).setPreferredWidth(80);

				scrollPane.setViewportView(dataTable);
		}
		else if( event.getSource() == grupoAutobusesButton ) {
			coverPanel.setVisible(false);
			currentTable = GRUPO_AUTOBUSES;
			label1.setText("Id Centro de estudio:");
			label2.setText("Id Autobus:");				
			label3.setVisible(false);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(false);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo centro de estudio", "Codigo autobus" 
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);					
				scrollPane.setViewportView(dataTable);
		}
		else if( event.getSource() == grupoParadasButton ) {
			coverPanel.setVisible(false);
			currentTable = GRUPO_PARADAS;			
			label1.setText("Id Parada:");
			label2.setText("Id Autobus:");				
			label3.setVisible(false);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(false);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo parada", "Codigo autobus" 
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);					
				scrollPane.setViewportView(dataTable);
		}
		else if( event.getSource() == matriculaButton ) {
			coverPanel.setVisible(false);
			currentTable = MATRICULA;			
			label1.setText("Id Centro de estudio:");
			label2.setText("Id Estudiante:");				
			label3.setVisible(false);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(false);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo centro de estudio", "Codigo estudiante" 
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);					
				scrollPane.setViewportView(dataTable);

		}
		else if( event.getSource() == paradaButton ) {
			coverPanel.setVisible(false);
			currentTable = PARADA;			
			label1.setText("Id Parada:");
			label2.setText("Direccion:");				
			label3.setVisible(false);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(false);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo parada", "Calle" 
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);					
				scrollPane.setViewportView(dataTable);

		}
		else if( event.getSource() == programaButton ) {
			coverPanel.setVisible(false);
			currentTable = PROGRAMA;			
			label1.setText("Id Programa:");
			label2.setText("Nombre Programa:");
			label3.setText("Numero de creditos:");
			label3.setVisible(true);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(true);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo programa", "Nombre", "Creditos"
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);
				dataTable.getColumnModel().getColumn(2).setPreferredWidth(128);	
				scrollPane.setViewportView(dataTable);

		}
		else if( event.getSource() == SuscripcionAutobuesButton ) {
			coverPanel.setVisible(false);
			currentTable = SUSCRIPCION_AUTOBUSES;			
			label1.setText("Id Estudiante:");
			label2.setText("Id Centro de estudio:");
			label3.setText("Id Autobus:");
			label3.setVisible(true);
			label4.setVisible(false);
			label5.setVisible(false);				
			label6.setVisible(false);
			label7.setVisible(false);
			textField3.setVisible(true);
			textField4.setVisible(false);
			textField5.setVisible(false);
			textField6.setVisible(false);
			textField7.setVisible(false);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
			textField6.setText("");
			textField7.setText("");			
			dataTable.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo estudiante", "Codigo centro de estudio", "Codigo autobus"
					}
				));
				dataTable.getColumnModel().getColumn(0).setPreferredWidth(110);
				dataTable.getColumnModel().getColumn(1).setPreferredWidth(128);
				dataTable.getColumnModel().getColumn(2).setPreferredWidth(128);	
				scrollPane.setViewportView(dataTable);
		}
		else if( event.getSource() == insertButton)
		{
			try 
			{
				if(currentTable==AUTOBUS)
				{
					autobusController = new AutobusController();
					autobusController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), textField3.getText(), Integer.parseInt(textField4.getText()), textField5.getText());
					autobusController.insert();
				}
				else if(currentTable == CENTRO_DE_ESTUDIO)
				{
					centroEstudioController = new CentroEstudioController();
					centroEstudioController.createDto(Integer.parseInt(textField1.getText()), textField2.getText(), textField3.getText());
					centroEstudioController.insert();
				}
				else if(currentTable == ESTUDIANTE)
				{
					estudianteController = new EstudianteController();
					estudianteController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), textField3.getText(), textField4.getText(), textField5.getText());
					estudianteController.insert();
				}
				else if(currentTable == GRUPO_AUTOBUSES)
				{
					grupoAutobusesController = new GrupoAutobusesController();
					grupoAutobusesController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					grupoAutobusesController.insert();
				}
				else if(currentTable == GRUPO_PARADAS)
				{
					grupoParadasController = new GrupoParadasController();
					grupoParadasController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					grupoParadasController.insert();
				}
				else if(currentTable == MATRICULA)
				{
					matriculaController = new MatriculaController();
					matriculaController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					matriculaController.insert();
				}
				else if(currentTable == PARADA)
				{
					paradaController = new ParadaController();
					paradaController.createDto(Integer.parseInt(textField1.getText()), textField2.getText());
					paradaController.insert();
				}
				else if(currentTable == PROGRAMA)
				{
					programaController = new ProgramaController();
					programaController.createDto(Integer.parseInt(textField1.getText()), textField2.getText(), Integer.parseInt(textField3.getText()));
					programaController.insert();
				}
				else if(currentTable == SUSCRIPCION_AUTOBUSES)
				{
					suscripcionAutobusesController = new SuscripcionAutobusesController();
					suscripcionAutobusesController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
					suscripcionAutobusesController.insert();
				}
			}
			catch(Exception error) {
				JOptionPane.showMessageDialog(null, "Verifique los campos " + "\n" + "Error: " + error.getMessage());
			}
		}
		else if( event.getSource() == deleteButton)
		{
			try 
			{
				if(currentTable==AUTOBUS)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					autobusController = new AutobusController();
					autobusController.createDtoId(id);
					autobusController.delete();
				}
				else if(currentTable == CENTRO_DE_ESTUDIO)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					centroEstudioController = new CentroEstudioController();
					centroEstudioController.createDtoId(id);
					centroEstudioController.delete();
				}
				else if(currentTable == ESTUDIANTE)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					estudianteController = new EstudianteController();
					estudianteController.createDtoId(id);
					estudianteController.delete();
				}
				else if(currentTable == GRUPO_AUTOBUSES)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a eliminar"));
					grupoAutobusesController = new GrupoAutobusesController();
					grupoAutobusesController.createDtoId(id,id2);
					grupoAutobusesController.delete();
				}
				else if(currentTable == GRUPO_PARADAS)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a eliminar"));
					grupoParadasController = new GrupoParadasController();
					grupoParadasController.createDtoId(id,id2);
					grupoParadasController.delete();
				}
				else if(currentTable == MATRICULA)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a eliminar"));
					matriculaController = new MatriculaController();
					matriculaController.createDtoId(id,id2);
					matriculaController.delete();
				}
				else if(currentTable == PARADA)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));					
					paradaController = new ParadaController();
					paradaController.createDtoId(id);
					paradaController.delete();
				}
				else if(currentTable == PROGRAMA)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					programaController = new ProgramaController();
					programaController.createDtoId(id);
					programaController.delete();
				}
				else if(currentTable == SUSCRIPCION_AUTOBUSES)
				{
					int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a eliminar"));
					int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a eliminar"));
					int id3 = Integer.parseInt(JOptionPane.showInputDialog("Id3 del objeto a eliminar"));
					suscripcionAutobusesController = new SuscripcionAutobusesController();
					suscripcionAutobusesController.createDto(id,id2, id3);
					suscripcionAutobusesController.delete();
				}
			}
			catch(Exception error) {
				JOptionPane.showMessageDialog(null, "Tipo de dato no esperado, verifique" + "\n" + "Error: " + error.getMessage());
			}
			
		}
		else if( event.getSource() == updateButton)
		{
			try 
			{
				if(currentTable==AUTOBUS)
				{
					autobusController = new AutobusController();
					autobusController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), textField3.getText(), Integer.parseInt(textField4.getText()), textField5.getText());
					autobusController.update();
				}
				else if(currentTable == CENTRO_DE_ESTUDIO)
				{
					centroEstudioController = new CentroEstudioController();
					centroEstudioController.createDto(Integer.parseInt(textField1.getText()), textField2.getText(), textField3.getText());
					centroEstudioController.update();
				}
				else if(currentTable == ESTUDIANTE)
				{
					estudianteController = new EstudianteController();
					estudianteController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), textField3.getText(), textField4.getText(), textField5.getText());
					estudianteController.update();
				}
				else if(currentTable == GRUPO_AUTOBUSES)
				{
					grupoParadasController = new GrupoParadasController();
					grupoParadasController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					grupoParadasController.update();
				}
				else if(currentTable == GRUPO_PARADAS)
				{
					grupoParadasController = new GrupoParadasController();
					grupoParadasController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					grupoParadasController.update();
				}
				else if(currentTable == MATRICULA)
				{
					matriculaController = new MatriculaController();
					matriculaController.createDto(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
					matriculaController.update();
				}
				else if(currentTable == PARADA)
				{
					paradaController = new ParadaController();
					paradaController.createDto(Integer.parseInt(textField1.getText()), textField2.getText());
					paradaController.update();
				}
				else if(currentTable == PROGRAMA)
				{
					programaController = new ProgramaController();
					programaController.createDto(Integer.parseInt(textField1.getText()), textField2.getText(), Integer.parseInt(textField3.getText()));
					programaController.update();
				}
				else if(currentTable == SUSCRIPCION_AUTOBUSES)
				{
					suscripcionAutobusesController = new SuscripcionAutobusesController();
					suscripcionAutobusesController.createDto(Integer.parseInt(textField1.getText()),Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
					suscripcionAutobusesController.update();
				}
			}
			catch(Exception error)
			{
				JOptionPane.showMessageDialog(null, "Verifique los campos " + "\n" + "Error: " + error.getMessage());
			}
			
		}
		else if( event.getSource() == findAllButton)
		{
			if(currentTable==AUTOBUS)
			{
				autobusController = new AutobusController();
				autobusController.createDtoEmpty();
				StackArray<Crud> list = autobusController.findAll();
				
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						autobusController.setDto((AutobusDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = autobusController.getDto().get_codigo_autobus();
						fila[1] = autobusController.getDto().get_codigo_centro_estudio();
						fila[2] = autobusController.getDto().get_matricula();
						fila[3] = autobusController.getDto().get_num_asientos();
						fila[4] = autobusController.getDto().get_nombre_compañia();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
				
			}
			else if(currentTable == CENTRO_DE_ESTUDIO)
			{
				centroEstudioController = new CentroEstudioController();
				centroEstudioController.createDtoEmpty();
				StackArray<Crud> list = centroEstudioController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						centroEstudioController.setDto((CentroDeEstudioDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = centroEstudioController.getDto().get_codigo_centro_estudio();
						fila[1] = centroEstudioController.getDto().get_nombre();
						fila[2] = centroEstudioController.getDto().get_direccion();						
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
			}
			else if(currentTable == ESTUDIANTE)
			{
				estudianteController = new EstudianteController();
				estudianteController.createDtoEmpty();
				StackArray<Crud> list = estudianteController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						estudianteController.setDto((EstudianteDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = estudianteController.getDto().get_codigo_estudiante();
						fila[1] = estudianteController.getDto().get_programa();
						fila[2] = estudianteController.getDto().get_nombre();
						fila[3] = estudianteController.getDto().get_apellido();
						fila[4] = estudianteController.getDto().get_direccion();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
			}
			else if(currentTable == GRUPO_AUTOBUSES)
			{
				grupoAutobusesController = new GrupoAutobusesController();
				grupoAutobusesController.createDtoEmpty();
				StackArray<Crud> list = grupoAutobusesController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
									
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						grupoAutobusesController.setDto((GrupoAutobusesDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = grupoAutobusesController.getDto().get_codigo_centro_estudio();
						fila[1] = grupoAutobusesController.getDto().get_codigo_autobus();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
				
			}
			else if(currentTable == GRUPO_PARADAS)
			{
				grupoParadasController= new GrupoParadasController();
				grupoParadasController.createDtoEmpty();
				StackArray<Crud> list = grupoParadasController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						grupoParadasController.setDto((GrupoParadasDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = grupoParadasController.getDto().get_codigo_parada();
						fila[1] = grupoParadasController.getDto().get_codigo_autobus();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
				
			}
			else if(currentTable == MATRICULA)
			{
				matriculaController= new MatriculaController();
				matriculaController.createDtoEmpty();
				StackArray<Crud> list = matriculaController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						matriculaController.setDto((MatriculaDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = matriculaController.getDto().get_codigo_centro_estudio();
						fila[1] = matriculaController.getDto().get_codigo_estudiante();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
			}
			else if(currentTable == PARADA)
			{
				paradaController= new ParadaController();
				paradaController.createDtoEmpty();
				StackArray<Crud> list = paradaController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						paradaController.setDto((ParadaDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = paradaController.getDto().get_codigo_parada();
						fila[1] = paradaController.getDto().get_calle();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
			}
			else if(currentTable == PROGRAMA)
			{
				programaController= new ProgramaController();
				programaController.createDtoEmpty();
				StackArray<Crud> list = programaController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						programaController.setDto((ProgramaDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = programaController.getDto().get_codigo_programa();
						fila[1] = programaController.getDto().get_nombre_programa();
						fila[2] = programaController.getDto().get_numero_creditos();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
					
				}
			}
			else if(currentTable == SUSCRIPCION_AUTOBUSES)
			{
				suscripcionAutobusesController= new SuscripcionAutobusesController();
				suscripcionAutobusesController.createDtoEmpty();
				StackArray<Crud> list = suscripcionAutobusesController.findAll();
				DefaultTableModel dm = (DefaultTableModel) dataTable.getModel();
				while( dm.getRowCount()>0) {
					dm.removeRow(0);
				}
				
				
				try {
					
					for(int i = 0; i < list.getSize() ; i++)
					{
						suscripcionAutobusesController.setDto((SuscripcionAutobusesDTO)list.pop());
						
						int numCols =  dataTable.getModel().getColumnCount();
						Object[] fila = new Object[numCols];
						
						fila[0] = suscripcionAutobusesController.getDto().get_codigo_estudiante();
						fila[1] = suscripcionAutobusesController.getDto().get_codigo_centro_estudio();
						fila[2] = suscripcionAutobusesController.getDto().get_codigo_autobus();
						( (DefaultTableModel) dataTable.getModel()).addRow(fila);
						
					}
					
					
				}
				catch (Exception e1){
					
				}
			}
		}
		else if( event.getSource() == findIdButton)
		{
			if(currentTable==AUTOBUS)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				autobusController = new AutobusController();
				autobusController.createDtoId(id);					
				autobusController.setDto((AutobusDTO) autobusController.findById());
				textField1.setText(""+autobusController.getDto().get_codigo_autobus());
				textField2.setText(""+autobusController.getDto().get_codigo_centro_estudio());
				textField3.setText(""+autobusController.getDto().get_matricula());
				textField4.setText(""+autobusController.getDto().get_num_asientos());
				textField5.setText(""+autobusController.getDto().get_nombre_compañia());
			}	
			else if(currentTable == CENTRO_DE_ESTUDIO)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				centroEstudioController = new CentroEstudioController();
				centroEstudioController.createDtoId(id);					
				centroEstudioController.setDto((CentroDeEstudioDTO) centroEstudioController.findById());
				textField1.setText(""+centroEstudioController.getDto().get_codigo_centro_estudio());
				textField2.setText(""+centroEstudioController.getDto().get_nombre());
				textField3.setText(""+centroEstudioController.getDto().get_direccion());					
			}
			else if(currentTable == ESTUDIANTE)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				estudianteController = new EstudianteController();
				estudianteController.createDtoId(id);					
				estudianteController.setDto((EstudianteDTO) estudianteController.findById());
				textField1.setText(""+estudianteController.getDto().get_codigo_estudiante());
				textField2.setText(""+estudianteController.getDto().get_programa());
				textField3.setText(""+estudianteController.getDto().get_nombre());
				textField4.setText(""+estudianteController.getDto().get_direccion());
				textField5.setText(""+estudianteController.getDto().get_apellido());
			}
			else if(currentTable == GRUPO_AUTOBUSES)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a buscar"));
				grupoAutobusesController = new GrupoAutobusesController();
				grupoAutobusesController.createDtoId(id,id2);					
				grupoAutobusesController.setDto((GrupoAutobusesDTO) grupoAutobusesController.findById());
				textField1.setText(""+grupoAutobusesController.getDto().get_codigo_centro_estudio());
				textField2.setText(""+grupoAutobusesController.getDto().get_codigo_autobus());					
			}
			else if(currentTable == GRUPO_PARADAS)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a buscar"));
				grupoParadasController = new GrupoParadasController();
				grupoParadasController.createDtoId(id,id2);					
				grupoParadasController.setDto((GrupoParadasDTO) grupoParadasController.findById());
				textField1.setText(""+grupoParadasController.getDto().get_codigo_parada());
				textField2.setText(""+grupoParadasController.getDto().get_codigo_autobus());	
			}
			else if(currentTable == MATRICULA)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a buscar"));
				matriculaController = new MatriculaController();
				matriculaController.createDtoId(id,id2);					
				matriculaController.setDto((MatriculaDTO) matriculaController.findById());
				textField1.setText(""+matriculaController.getDto().get_codigo_centro_estudio());
				textField2.setText(""+matriculaController.getDto().get_codigo_estudiante());
			}
			else if(currentTable == PARADA)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));					
				paradaController = new ParadaController();
				paradaController.createDtoId(id);					
				paradaController.setDto((ParadaDTO) paradaController.findById());
				textField1.setText(""+paradaController.getDto().get_codigo_parada());
				textField2.setText(""+paradaController.getDto().get_calle());
			}
			else if(currentTable == PROGRAMA)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));					
				programaController = new ProgramaController();
				programaController.createDtoId(id);					
				programaController.setDto((ProgramaDTO) programaController.findById());
				textField1.setText(""+programaController.getDto().get_codigo_programa());
				textField2.setText(""+programaController.getDto().get_nombre_programa());
				textField2.setText(""+programaController.getDto().get_numero_creditos());
			}
			else if(currentTable == SUSCRIPCION_AUTOBUSES)
			{
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id del objeto a buscar"));
				int id2 = Integer.parseInt(JOptionPane.showInputDialog("Id2 del objeto a buscar"));
				int id3 = Integer.parseInt(JOptionPane.showInputDialog("Id3 del objeto a buscar"));
				suscripcionAutobusesController = new SuscripcionAutobusesController();
				suscripcionAutobusesController.createDto(id,id2,id3);					
				suscripcionAutobusesController.setDto((SuscripcionAutobusesDTO) suscripcionAutobusesController.findById());
				textField1.setText(""+suscripcionAutobusesController.getDto().get_codigo_estudiante());
				textField2.setText(""+suscripcionAutobusesController.getDto().get_codigo_centro_estudio());
				textField2.setText(""+suscripcionAutobusesController.getDto().get_codigo_estudiante());
			}
		
		}
	}
	

}
