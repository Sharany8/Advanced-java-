import java.sql.*;

public class QueryCoffeeByD {
    public static void main(String[] args) {
        try (Connection con = CoffeeDB.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM coffee WHERE name LIKE 'D%'"
            );
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name") + " " +
                                   rs.getDouble("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}