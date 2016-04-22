package stockbroker9;

/**
 * Created by Matthew on 4/22/2016.
 */

import java.sql.*;

public class dbConnect {

    private static String custData;

    public static void db() {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            String url = "jdbc:mysql://localhost:3306/softwareengineering";
            conn = DriverManager.getConnection(url,"matthew","!@#$MAtt4885");

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            //Customer Inserts
            String customerSelect;
            String customerInsert = "";
            String customerInsertID = "";
            String customerInsertPhone = "";
            String customerCity = "";
            String customerState = "";
            String customerZip = "";
            String customerName = "";
            String customerPin = "";
            String customerCashBalance = "";
            String customerAddress = "";

            customerInsert = "INSERT INTO softwareengineering.customer VALUES (" + customerInsertID + "," + customerInsertPhone + ","
                    + customerCity + "," + customerState + "," + customerZip + "," + customerName + "," + customerName + "," + customerPin
                    + "," + customerCashBalance + "," + customerAddress + ");";

            //CommissionRate Inserts
            String commissionRate = "";

            String commissionRateInsert = "INSERT INTO softwareengineering.commissionrate VALUES (" + commissionRate + ");";


            ResultSet insertCust     = stmt.executeQuery(customerInsert);
            ResultSet insertCommRate = stmt.executeQuery(commissionRateInsert);

            insertCust.close();
            insertCommRate.close();
            stmt.close(); //closing sql statements
            conn.close(); //closing connection to server
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }
public static void setCommission(String commissionRate) {
        String insertCom = "INSERT INTO softwareengineering.commissionrate VALUES (" + commissionRate + ");";
        Connection setConn = null;
        try {
            setConn = DriverManager.getConnection("jdbc:mysql:localhost:3306", "root", "!@#$MAtt4885");
            Statement setConnStmt = setConn.createStatement();
            ResultSet setConnRS = setConnStmt.executeQuery(insertCom);
        } catch (java.sql.SQLException b) {
            b.printStackTrace();
            System.out.println("Could not connect to mysqldb");
        }
    }

public static String getCommission() {
    String commission = "";
    try {
        Connection comConn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "!@#$MAtt4885");
        Statement comStmt = comConn.createStatement();
        ResultSet getCom = comStmt.executeQuery("SELECT comRate from softwareengineering.commissionrate;");
        if (getCom.next())
            commission = getCom.getString(1);
        return commission;
    } catch (java.sql.SQLException a) {
        a.printStackTrace();
        System.out.println("Could not retrieve commission rate from mysql db..");
    }
    return commission;
}


    public static void setCustData(String custData) {
        dbConnect.custData = custData;
        String[] csvSplit = new String[9];
        csvSplit = dbConnect.custData.split(",");
    }
}




//STEP 5: Extract data from result set
            /*
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            } */
//STEP
//
//
// 6: Clean-up environment