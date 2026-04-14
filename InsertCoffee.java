import java.sql.*;

public class InsertCoffee {
    public static void main(String[] args) {
        try (Connection con = CoffeeDB.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO coffee(id, name, price) VALUES (?, ?, ?)"
            );
            ps.setInt(1, 101);
            ps.setString(2, "Dark Roast");
            ps.setDouble(3, 150.0);

            ps.executeUpdate();
            System.out.println("Coffee inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}