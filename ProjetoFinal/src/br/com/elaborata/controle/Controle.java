/**
 * 
 */
package br.com.elaborata.controle;

import java.sql.SQLException;
import java.util.List;

import br.com.elaborata.modelo.Usuario;
import br.com.elaborata.modelo.dao.UsuarioDAO;

/**
 * @author aluno
 *
 */
public class Controle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Usuario usuario = new Usuario("a","a","a");
		Usuario usuario2 = new Usuario("a", "b", "b");
		Usuario usuario3 = new Usuario("b", "b", "b");
		
		UsuarioDAO dao = new UsuarioDAO();
		
//		try {
//			dao.inserir(usuario);
////			dao.inserir(usuario2);
////			dao.inserir(usuario3);
////			
//		} catch (SQLException e) {
////			e.printStackTrace();
//		}
		
		try {
			
			List<Usuario> list = dao.pesquisar("");
			
			for (Usuario usuario4 : list) {
				
				System.out.println(usuario4);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
