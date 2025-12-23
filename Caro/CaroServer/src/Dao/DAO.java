package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Admin
 */
public class DAO {
    protected Connection con;
    

    public DAO() {
        // ===== THÔNG TIN DATABASE =====
        final String DATABASE_NAME = "caro_game";      
        final String DB_IP = "26.78.106.147";         // IP máy chạy MySQL (server)
        final String JDBC_USER = "caro_user";          // user MySQL
        final String JDBC_PASSWORD = "123456";         // mật khẩu MySQL

        final String jdbcURL =
                "jdbc:mysql://" + DB_IP + ":3306/" + DATABASE_NAME
                + "?useSSL=false"
                + "&allowPublicKeyRetrieval=true"
                + "&serverTimezone=UTC";

        try {
            // Driver mới (bắt buộc)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối
            con = DriverManager.getConnection(jdbcURL, JDBC_USER, JDBC_PASSWORD);

            System.out.println("✅ Kết nối MySQL thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Kết nối MySQL thất bại");
        }
    }
}