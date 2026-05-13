package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBCon {

        private static DBCon instance;
        private Connection con;
        private String login, motPass;

        private DBCon(String login, String motPass) {
            this.login = login;
            this.motPass = motPass;
            connect();
        }
        public static void init(String user, String password) {
            if (instance == null) {
                instance = new DBCon(instance.login, instance.motPass);
            }
        }
        public static DBCon getInstance() {
            return instance;
        }
        private void connect() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/vente",
                        login, motPass
                );

            } catch (ClassNotFoundException e) {
                System.out.println("driver non charge");
            } catch (SQLException e) {
                System.out.println("impossible d'acceder à la BD " + e.getMessage());
            }
        }
        public void close() {
            if (instance != null) {
                try {
                    instance.con.close();
                } catch (SQLException e) {
                    System.out.println("impossible de fermer la connexion " + e.getMessage());
                }
                login = null;
                motPass = null;
            }
        }

        public Connection getCon() {
            return con;
        }
    }







