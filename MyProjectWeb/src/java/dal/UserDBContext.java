package dal;

import java.util.ArrayList;
import model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thangPC
 */
public class UserDBContext extends DBContext<User> {

    public User get(String username, String password) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        User user = null;
        try {
            String sql = "SELECT * FROM [user] WHERE [username] = ? AND [password] = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            rs = stm.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
              
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stm != null) stm.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }

    @Override
    public ArrayList<User> all() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public User get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void insert(User model) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(User model) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(User model) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
