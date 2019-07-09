package control;
import vistas.inicioS;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vistas.inicioS;
import modelo.RegS;
public class controlAcc {
	private inicioS vistaIn;
	private RegS reg;
	int veces ;
	public controlAcc(inicioS vistaIn, RegS reg){
		this.vistaIn = vistaIn;
		this.reg = reg;
		this.vistaIn.getEntrar().addActionListener(Comparar());
		this.vistaIn.setVisible(true);
	}

	private ActionListener Comparar() {
		ActionListener J = ewt -> {
		String Usuario = this.vistaIn.getUsuario().getText().trim();
		char[] Contraseña = this.vistaIn.getContraseña().getPassword();
		
		if (Usuario.equals("Usuario1") | Contraseña.equals("ITIZ")){
			JOptionPane.showMessageDialog(null, "Bienvenido");
		}else if(Usuario.equals("") | Contraseña.equals("")| veces<=3){
			JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
				veces++;
		}else if(veces >= 3){
			JOptionPane.showMessageDialog(null, "Contacte al correo L161080043@iztapalapa.tecnm.mx o profesor de POO","INFORMACION",JOptionPane.ERROR_MESSAGE);
		}
			
};
return J;
}
}