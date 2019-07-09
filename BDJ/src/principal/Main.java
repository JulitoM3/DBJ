package principal;

import control.controlAcc;
import modelo.RegS;
import vistas.inicioS;

public class Main {

	public static void main(String[] args) {
		controlAcc con = new controlAcc(new inicioS(),new RegS());
		System.out.println("Hola");
	}
}
