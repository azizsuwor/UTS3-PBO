package kelas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection connect_db;
    private final String host = "localhost";
    private final String db = "tokokita_202357201024";
    private final String user = "root";
    private final String password = "";
    private final String port = "3306";
    private final String url = "jdbc:mysql://" + host + ":" + port + "/" + db;

    public Connection connectDb() {
        try {
            connect_db = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil.");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connect_db;
    }
}
