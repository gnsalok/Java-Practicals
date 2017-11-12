package com.company;

import java.sql.*;

/**
 * Created by Alok-PC on 09-Nov-17.
 */

public class Employee {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    //connection string
    private String strCon =
            "jdbc:sqlserver://localhost;database=Employee;user=sa;password=Admin@123;integrated security=true;";


    private String strJDBC =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Employee() throws ClassNotFoundException, SQLException {
        Class.forName(strJDBC);
        con = DriverManager.getConnection(strCon);
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM tblEmployee where Salary>5000");

        System.out.print("ID\tNAME\tGender\tSalary\tDEPARTMENTID");
        System.out.println("");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t" + rs.getString(2) +
                            "\t"+rs.getString(3)+"\t"+
                    + rs.getInt(4) + "\t" + rs.getInt(5) + "\t"
                    );
            System.out.println("");
        }
        st.close();
        con.close();
    }
}