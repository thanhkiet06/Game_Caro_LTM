package util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {

    // Hash khi đăng ký
    public static String hash(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt(10));
    }

    // Check khi đăng nhập
    public static boolean check(String rawPassword, String hashedPassword) {
        return BCrypt.checkpw(rawPassword, hashedPassword);
    }
}
