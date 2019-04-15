package Utn.classes;

import java.sql.*;

public class Conectar {
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "VikingosVsEspartanos";
    String user = "root";
    String pass = "";

    public Conectar() {
    }

    public void guardarGanadores(String query) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, user, pass);
            Statement stt = null;
            stt = conn.createStatement();
            stt.executeUpdate(query);

        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getGanadores() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, user, pass);
            PreparedStatement stt = null;
            stt = conn.prepareStatement("select * from ganadores;");
            ResultSet rs = stt.executeQuery();
            while (rs.next()) {
                System.out.println("\nNombre:"+rs.getString("nombre"));
                System.out.println("Cantidad tomada:"+rs.getString("bebida_en_cuerpo"));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
