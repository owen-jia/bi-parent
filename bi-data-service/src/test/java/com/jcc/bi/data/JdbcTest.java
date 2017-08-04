package com.jcc.bi.data;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

public class JdbcTest {

    Connection test2() throws SQLException {
        OracleDataSource oracleDataSource = new OracleDataSource();
        oracleDataSource.setURL("jdbc:oracle:thin:@//120.55.42.117:1251/jucaicat");
        oracleDataSource.setUser("bi");
        oracleDataSource.setPassword("bi123");

        Connection connection = oracleDataSource.getConnection();
        return connection;
    }

    Connection test1() throws Exception {
        Class.forName("oracle.jdbc.replay.OracleDataSourceImpl").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@120.55.42.117:1251:jucaicat","bi","bi123");
        return connection;
    }

    void test() throws Exception{
        Connection connection = test2();

        PreparedStatement preparedStatement = connection.prepareStatement("select name from AAA");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println("name:"+resultSet.getString(1));
        }
    }

    public static void main(String[] args){

        try {
            new JdbcTest().test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
