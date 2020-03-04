package by.belhard.G20.lessons.lesson11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {


    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/igor?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";


    private static final String query = "insert into employees value (null,'67z','2018-01-05',1200,1)";


    public void initDBConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        Statement statement = connection.createStatement();

        boolean executeResult = statement.execute(query);
        System.out.println(executeResult);
    }

}
