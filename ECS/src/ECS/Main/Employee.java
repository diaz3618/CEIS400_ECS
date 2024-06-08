/**
 *
 * @author Nicholas Allen, Daniel F Diaz Santiago
 */

package ECS.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {

    // --- Variables ---
    public static int empID;
    private String empPass;
    public static String empFirstName;
    public static String empLastName;
    public static String empEmail;
    public static String empAddress;
    public static String empCity;
    public static String empState;
    public static String empZip;
    public static String empPhone;
    public static String empSkills;

    // Database variables
    private static final String DB_URL = "jdbc:mysql://localhost:3306/CEIS400_group_project";
    private static final String DB_USER = "groupc";
    private static final String DB_PASSWORD = "oI209[^X`XHF";
    private static Connection connection = null;

    // Contructor
    Employee(int _empID, String _empFirstName, String _empLastName, String _empPass, String _empAddress, String _empCity, String _empState, String _empZip, String _empPhone, String _empEmail, String _empSkills) {
        this.empID = _empID;
        this.empFirstName = _empFirstName;
        this.empLastName = _empLastName;
        this.empPass = _empPass;
        this.empAddress = _empAddress;
        this.empCity = _empCity;
        this.empState = _empState;
        this.empZip = _empZip;
        this.empPhone = _empPhone;
        this.empEmail = _empEmail;
        this.empSkills = _empSkills;
    }

    // Constructor
    Employee() {
    }

    // Database (MySQL) connection
    static {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // --- Functions ---
    // Add Employee (new hire)
    public static void addEmp(Employee emp) {
        String sql = "INSERT INTO Employee (empID, FirstName, LastName, empPassword, empAddress, empCity, empState, empZip, empPhone, empEmail, empSkills) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, emp.empID);
            pstmt.setString(2, emp.empFirstName);
            pstmt.setString(3, emp.empLastName);
            pstmt.setString(4, emp.empPass);
            pstmt.setString(5, emp.empAddress);
            pstmt.setString(6, emp.empCity);
            pstmt.setString(7, emp.empState);
            pstmt.setString(8, emp.empZip);
            pstmt.setString(9, emp.empPhone);
            pstmt.setString(10, emp.empEmail);
            pstmt.setString(11, emp.empSkills);
            pstmt.executeUpdate();
            System.out.println("Employee added successfully.");
            notifyEmp(true); // Email notification - successful addition
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // MySQL error code for duplicate entry
                // ** Add a warning dialog **
                System.out.println("Employee ID already exists.");
            } else {
                e.printStackTrace();
            }
        } finally {
            closeConnection();
        }
    }

    // Terminate Employee
    public static void terminateEmp(int empID) {
        String sql = "DELETE FROM Employee WHERE empID = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, empID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                notifyEmp(false); // Email notification - successful termination
            } else {
                // ** Add a warning dialog **
                System.out.println("Employee ID " + empID + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    // Notify Employee (send email)
    // ** if action == false, send notification of termination **
    // ** if action == true, send notification for added **
    private static void notifyEmp(boolean action) {
        // Implement email notification logic here
        if(!action) {
            System.out.println("Employee Terminated\nEmail notification sent to " + empFirstName + " " + empLastName + " (Email: " + empEmail + ")");
        } System.out.println("Employee Added\nEmail notification sent to " + empFirstName + " " + empLastName + " (Email: " + empEmail + ")");
    }

    // Close the connection when the application is done
    private static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Connection closed");
    }

    public static void main(String[] args) {
        //Employee newEmp = new Employee(1, "First","Last", "password123", "1234 Fake St", "El Paso", "TX", "79926", "555-123-4567", "emp@email.com", "Skill1");
        //addEmp(newEmp);
        //notifyEmp(newEmp.empName);
        //terminateEmp(1);
    }
}
