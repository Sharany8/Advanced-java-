import java.sql.*;

public class DeleteCoffee {
    public static void main(String[] args) {
        try (Connection con = CoffeeDB.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM coffee WHERE id=?"
            );
            ps.setInt(1, 101);

            ps.executeUpdate();
            System.out.println("Coffee deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}