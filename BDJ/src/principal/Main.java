package principal;

import java.sql.SQLException;

import control.controlAcc;
import modelo.*;
import vistas.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		controlAcc con = new controlAcc(new inicioS(),new RegS(),new ventanaprincipal(),new Entidad());
		
	}
}
