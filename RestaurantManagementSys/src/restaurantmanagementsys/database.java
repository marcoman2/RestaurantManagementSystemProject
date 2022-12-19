/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsys;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MarcoMan
 * Subscribe our Channel for support --> https://www.youtube.com/@marcomanchannel
 */
public class database {

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // CONNECT YOUR DATABASE
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restaurant", "root", "");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
