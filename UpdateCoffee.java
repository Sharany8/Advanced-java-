import java.sql.*;

public class UpdateCoffee {
    public static void main(String[] args) {
        try (Connection con = CoffeeDB.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE coffee SET name=?, price=? WHERE id=?"
            );
            ps.setString(1, "Cold Coffee");
            ps.setDouble(2, 180.0);
            ps.setInt(3, 101);

            ps.executeUpdate();
            System.out.println("Coffee updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}