package control;
import vistas.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.sql.*;
import modelo.*;
public class controlAcc {
	private inicioS vistaIn;
	private ventanaprincipal vp;
	private RegS reg;
	private Entidad en;

	public controlAcc(inicioS vistaIn, RegS reg, ventanaprincipal vp,Entidad en) throws SQLException{
		this.reg = reg;
		this.vistaIn = vistaIn;
		this.vistaIn.getEntrar().addActionListener(Comparar());
		this.vistaIn.setVisible(true);
		this.vp = vp;
		this.vp.AñadirRegistro().addActionListener(AgregarReg());
		this.vp.Buscar().addActionListener(Seek());
		this.en = en;
	}


	private ActionListener Seek() throws SQLException {
		ActionListener M = ewt ->{
			String buscar = "Select*from alumnos where NumControl = ?";
			
			try {
	
				Connection	conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela",this.reg.getUsuario(), String.valueOf(this.reg.getContraseña()));
				PreparedStatement ps = conexion.prepareStatement(buscar);
				ps.setString(1, this.en.nControl);
				ResultSet resul = ps.executeQuery();
				if(resul.next()){
				this.vp.getInfo().setText("Nombre: " + resul.getString(2) + "\n"+
											"Numero de control: " + resul.getString(1)+"\n"+
											"Carrera: " + resul.getString(3)+"\n"+
											"Semestre: " + resul.getString(4));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		};
		return M;
	}


	private ActionListener AgregarReg() {
		ActionListener D = ewt ->{
			String Nombre, NControl,Carrera,Semestre;
			Nombre = this.vp.getNombre().getText().trim();
			NControl = this.vp.getControl().getText().trim();
			Carrera = this.vp.getCarrera().getText().trim();
			Semestre = this.vp.getSem().getText().trim();
			
			if(Nombre.equals("")|NControl.equals("")|Carrera.equals("")|Semestre.equals("")){
				JOptionPane.showMessageDialog(null, "CAMPOS OBLIGATORIOS");
				
			}else{
			
			this.en.setNombre(Nombre);this.en.setnControl(NControl);this.en.setCarrera(Carrera);this.en.setSemestre(Semestre);
			
		try{
			
			String añadir = "Insert into alumnos (NumControl,Nombre,Carrera,Semestre)values(?,?,?,?)";
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela",this.reg.getUsuario(), String.valueOf(this.reg.getContraseña()));
			PreparedStatement ps = conexion.prepareStatement(añadir);
			 ps.setString(1, this.en.nControl);
			 ps.setString(2, this.en.nombre);
			 ps.setString(3, this.en.carrera);
			 ps.setString(4, this.en.semestre);
			 ps.execute();
			}catch(SQLException e){		
				e.printStackTrace();
			}
			}
		};
		return D;
	}


	private ActionListener Comparar() {
		ActionListener J = ewt -> {
		  String User = this.vistaIn.getUsuario().getText().trim();
		 char[] Pass = this.vistaIn.getContraseña().getPassword();
		 if(User.equals("")| Pass.equals("")){
			 JOptionPane.showMessageDialog(null, "Campos vacios!");
		 }else{
			this.reg.setUsuario(User);
			this.reg.setContraseña(Pass);
		try{
			
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", this.reg.getUsuario(),String.valueOf(this.reg.getContraseña()));
		vp.setVisible(true);
		vistaIn.dispose();
		JOptionPane.showMessageDialog(null, "Bienvenido "+User);
		}catch(Exception JG){
			JOptionPane.showMessageDialog(null, "Usuario no identificado","Error en la conexión", JOptionPane.ERROR_MESSAGE);
		}
		 }	
};
return J;
}
}