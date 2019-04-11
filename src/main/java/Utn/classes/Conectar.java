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

    public void query(String query) {
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
}
