package ifsp.dsw;
//Stefany Tam e Eduarda Vitória

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public DAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
     
    public boolean insertSalesman(Salesman salesman) throws SQLException {
        String sql = "INSERT INTO Salesman (name, city, commission) VALUES (?, ?, ?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, salesman.getName());
        statement.setString(2, salesman.getCity());
        statement.setFloat(3, salesman.getCommission());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
    public List<Salesman> listAllSalesman() throws SQLException {
        List<Salesman> listSalesman = new ArrayList<>();
         
        String sql = "SELECT * FROM Salesman";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int salesman_id = resultSet.getInt("salesman_id");
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            float commission = resultSet.getFloat("commission");
             
            Salesman salesman = new Salesman(salesman_id, name, city, commission);
            listSalesman.add(salesman);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listSalesman;
    }
    
    public boolean insertCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO Customer (cust_name, city, grade) VALUES (?, ?, ?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, customer.getCust_name());
        statement.setString(2, customer.getCity());
        statement.setFloat(3, customer.getGrade());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
    public List<Customer> listAllCustomer() throws SQLException {
        List<Customer> listCustomer = new ArrayList<>();
         
        String sql = "SELECT * FROM Customer";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int customer_id = resultSet.getInt("customer_id");
            String cust_name = resultSet.getString("cust_name");
            String city = resultSet.getString("city");
            int grade = resultSet.getInt("grade");
             
            Customer customer = new Customer(customer_id, cust_name, city, grade);
            listCustomer.add(customer);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCustomer;
    }
    
    public boolean insertOrders(Orders orders) throws SQLException {
        String sql = "INSERT INTO Orders (purch_amt, ord_date, customer_id, salesman_id) VALUES (?, ?, ?, ?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setFloat(1, orders.getPurch_amt());
        statement.setDate(2, new java.sql.Date(orders.getOrd_date().getTime()));
        statement.setInt(3, orders.getCustomer_id());
        statement.setInt(4, orders.getSalesman_id());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
    public List<Orders> listAllOrders() throws SQLException {
        List<Orders> listOrders = new ArrayList<>();
         
        String sql = "SELECT * FROM Orders";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int ord_no = resultSet.getInt("ord_no");
            float purch_amt = resultSet.getFloat("purch_amt");
            Date ord_date = resultSet.getDate("ord_date");
            int customer_id = resultSet.getInt("customer_id");
            int salesman_id = resultSet.getInt("salesman_id");
             
            Orders orders = new Orders(ord_no, purch_amt, ord_date, customer_id, salesman_id);
            listOrders.add(orders);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listOrders;
    }
     
 
}
