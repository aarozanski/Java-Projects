package com.example.week_8;
import java.sql.*;

class Bookstore {
    private static final String URL =
            "jdbc:sqlite:C:/Users/kalas/sql/example.db";
    public static void main(String[] args) {
        Bookstore app = new Bookstore();
// Add a new book
        app.addBook("Effective Java", "Joshua Bloch", 39.99);
// Retrieve all books
        app.getAllBooks();
    }
    // Method to establish a connection
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
    // Method to add a book
    public void addBook(String title, String author, double price) {
        String sql = "INSERT INTO books (title, author, price)
        VALUES (?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setDouble(3, price);
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new book was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting book: " +
                    e.getMessage());
        }
    }
    // Method to retrieve all books
    public void getAllBooks() {
        String sql = "SELECT * FROM books";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Books available in the bookstore:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", Author: " + rs.getString("author") +
                        ", Price: $" + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving books: " +
                    e.getMessage());
        }
    }
}