package org.horrorcore.repository;

import org.horrorcore.config.DatabaseConnection;
import org.horrorcore.entity.Sub;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubRepository {
    private final Connection connection;

    //We have given the connection object to the repository for use
    public SubRepository() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public Sub save(Sub sub) {
        String sql = "INSERT INTO subs(sub_name, sub_type, cost) VALUES (?,?,?)";

        try(PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, sub.getSubName());
            ps.setString(2, sub.getSubType());
            ps.setDouble(3, sub.getCost());

            int row = ps.executeUpdate();

            if (row > 0) {
                System.out.println("NEW SUB ADDED");

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        sub.setSubId(rs.getLong(1));// first column in generated keys
                    }
                }
            }
            return sub;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return sub;
    }

    public List<Sub> findAll() {
        String sql = "SELECT * FROM subs";
        List<Sub> subs = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()){
                Sub sub = new Sub();
                sub.setSubId(rs.getLong("sub_id"));
                sub.setSubName(rs.getString("sub_name"));
                sub.setSubType(rs.getString("sub_type"));
                sub.setCost(rs.getDouble("cost"));
                subs.add(sub);
            }

        }catch (SQLException e){
            System.err.println(e.getMessage());
        } return subs;
    }


    public Sub findById(Long id) {
        String sql = "SELECT * FROM subs WHERE sub_id = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setLong(1, id);

            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()) {
                    Sub sub = new Sub();
                    sub.setSubId(rs.getLong("sub_id"));
                    sub.setSubName(rs.getString("sub_name"));
                    sub.setSubType(rs.getString("sub_type"));
                    sub.setCost(rs.getDouble("cost"));
                    return sub;
                }else {
                    return null; // not found
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }



    public void update(Sub sub) {
        String sql = "UPDATE subs SET sub_name=?, sub_type=?, cost=? WHERE sub_id=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, sub.getSubName());
            ps.setString(2, sub.getSubType());
            ps.setDouble(3, sub.getCost());
            ps.setLong(4, sub.getSubId());

            int row = ps.executeUpdate();

            if(row > 0) {
                System.out.println("Sub updated!");
            }else{
                System.out.println("No sub sound with id " + sub.getSubId());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



    public void delete(Long id) {
        String sql = "DELETE FROM subs WHERE sub_id=?";
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setLong(1, id);
            int row = ps.executeUpdate();

            if ( row > 0 ){
                System.out.println("Sub deleted!");
            }else{
                System.out.println("No sub sound with id " + id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

