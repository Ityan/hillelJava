package com.hillel.java.database;

import java.sql.*;

/**
 * Created by Igor on 10.07.2015.
 */
public class ProductDbDao implements Dao<Product> {

    private final ResultSet resultSet;
    private Connection connection;

    public ProductDbDao() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        String connectionString = "jdbc:postgresql://localhost:5432/postgres";

        try {
            connection = DriverManager.getConnection(connectionString, "postgres", "postgres");
            String sql = "SELECT name, category, price, icon FROM store";

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCurrent() {
        try {
            resultSet.deleteRow();
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    @Override
    public void insert(Product product) {
        try {
            resultSet.moveToInsertRow();

            updateResultSet(product);
            resultSet.insertRow();
            //resultSet.moveToCurrentRow();
            resultSet.last();
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    private void updateResultSet(Product product) {
        try {
            resultSet.updateString(1, product.getName());
            resultSet.updateString(2, product.getCategory());
            resultSet.updateInt(3, product.getPrice());
            if (product.getPrice() != null) {
                resultSet.updateBytes(4, product.getImage());
            } else {
                resultSet.updateNull(4);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCurrent(Product product) {
        try {
            updateResultSet(product);
            resultSet.updateRow();
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    @Override
    public Product getPrevious() {
        try {
            if (resultSet.previous()) {
                return readFromResultSet();
            } else {
                return null;
            }
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    @Override
    public Product getNext() {
        try {
            if (resultSet.next()) {
                return readFromResultSet();
            } else {
                return null;
            }
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    private Product readFromResultSet() {
        try {
            String name = resultSet.getString(1);
            String category = resultSet.getString(2);
            int price = resultSet.getInt(3);
            byte[] image = resultSet.getBytes(4);

            return new Product(name, category, price, image);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
