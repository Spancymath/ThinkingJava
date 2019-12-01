package chapter06;

/**
 * 管理Connection对象
 */
public class ConnectionManager {

    private static int n = 10;

    private static int i;

    private static Connection[] connections = new Connection[n];

    public static Connection getConnection() {
        if (i == n) return null;
        return connections[i++];
    }
}
