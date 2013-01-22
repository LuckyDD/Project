package V1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataAccessObject
{
    private String path;
    private Connection con;
    private ResultSet rs;
    private ResultSetMetaData rsm;
    private Vector<Object> rowData, columnData;
    Statement st;
            
    public static void main (String []a) {
   
}
    public DataAccessObject()
    {
        try
        {
            path = System.getProperty("user.dir");

          //  sun.jdbc.odbc.JdbcOdbcDriver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=test.mdb
            con = DriverManager.getConnection("jdbc:odbc:driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + System.getProperty("user.dir") + "/Database1.mdb");

            
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet executeQuery ( String query )throws SQLException
    {
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);                       
        rs = st.executeQuery(query);          
        rsm = rs.getMetaData();

        return rs;
    }

    public void executeUpdate( String query ) throws SQLException
    {
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);            
        st.executeUpdate(query);
    }
    
    public PreparedStatement getPreparedStatement(String query)
    {
        try {
            return con.prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public Vector getData()
    {
        try
        {
            rowData = new Vector();
            while (rs.next())
            {
                columnData = new Vector();
                for (int i = 1; i <= rsm.getColumnCount(); i++)
                {
                    columnData.add(rs.getString(i));
                }
                rowData.add(columnData);
            }
            
            System.out.println("Nama table: " + rsm.getTableName(1));
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowData;
    }

    public void close()
    {
        try
        {
            con.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPath()
    {
        return path;
    }
}
