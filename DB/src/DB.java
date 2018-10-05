
import java.sql.*;                                         

import java.io.*;

public class DB {

static String url;

public static void main(String[] args) {

Connection conn = null;

        Statement stmt = null;

        PreparedStatement pstmt = null;

        ResultSet rs = null;

        try
        {
        Class.forName("com.mysql.jdbc.Driver").newInstance(); // JDBC 드라이버 로드

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basicjsp", "jspid", "jsppass");//URL,UID,PWD        

            if(conn==null){

                System.out.println("연결실패");

            }else
            {

                System.out.println("연결성공");
            
            }

        }catch(ClassNotFoundException ce){

            ce.printStackTrace();            

        }catch(SQLException se){

            se.printStackTrace();    

        }catch(Exception e){

            e.printStackTrace();

        }finally{

            try{ // 연결 해제(한정돼 있으므로)

                if(rs!=null){        rs.close();            }

                if(pstmt!=null){    pstmt.close();        }

                if(stmt!=null){    stmt.close();        }

                if(conn!=null){    conn.close();        }

            }catch(SQLException se2){

                se2.printStackTrace();

                }

            }

        }

}