package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import beans.Utilisateur;
public class UtilisateurDao 
{
	private static int lastId = 1;
	private static ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	private static String jdbcURL = "jdbc:mysql://localhost:3306/jee?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "";
    private static final String SELECT_ALL_USERS = "select * from users";


	/*
	static {
		utilisateurs.add(new Utilisateur(1,"Gueye","Raky","Kyra","passer"));
		utilisateurs.add(new Utilisateur(1,"Faye","Mama","Mum","repasser"));

	}
	*/
    private static Connection getConnection() {
    	Connection connection = null;
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
    	}
    	catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return connection;
    }
	public static ArrayList<Utilisateur> lister(){
		ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    	try (Connection connection = getConnection()){
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			
	    		System.out.println(preparedStatement);
	    		ResultSet rs = preparedStatement.executeQuery();
	    		
			while (rs.next()) {
    			int id = rs.getInt("id");
    			String nom = rs.getString("nom");
    			String prenom = rs.getString("prenom");
    			String login = rs.getString("login");
    			String password = rs.getString("password");
    			
    			utilisateurs.add(new Utilisateur(id, nom, prenom, login,password));

			}
			}
	    	
	    		catch(SQLException e) {
	    			printSQLException(e);
	    		}
	    		return utilisateurs;
	    	}
	public static boolean ajouter(Utilisateur utilisateur) {
		try {

			String req = "INSERT INTO users(nom,prenom,login,password)" + "VALUES (?, ?,?,?)";
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(req);
			preparedStatement.setString(1,utilisateur.getNom());
			preparedStatement.setString(2,utilisateur.getPrenom());
			preparedStatement.setString(3,utilisateur.getLogin());
			preparedStatement.setString(4,utilisateur.getPassword());

			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}


	public static boolean supprimer(int id) {
		try {
			String req = "DELETE FROM users WHERE  id=?";
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(req);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean modifier(Utilisateur user) {
		try {
			String req = "UPDATE users set nom=?,prenom=?,login=?,password=? where id=?";
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(req);
			preparedStatement.setString(1,user.getNom());
    			preparedStatement.setString(2,user.getPrenom());
    			preparedStatement.setString(3,user.getLogin());
    			preparedStatement.setString(4,user.getPassword());
    			preparedStatement.setInt(5,user.getId());
			   preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	public static  Utilisateur get(int id) {
		for(Utilisateur utilisateur : utilisateurs) {
			if(utilisateur.getId()== id) {
				return utilisateur;
			}
		}
		return null;
		
	}
	
    private  static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
