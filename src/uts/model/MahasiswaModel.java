/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uts.entity.Mahasiswa;

/**
 *
 * @author hary
 */
public class MahasiswaModel {
    private Connection connection;
    
    public MahasiswaModel(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Mahasiswa mahasiswa) throws SQLException{
        String sql = "INSERT INTO "
                + "mahasiswa("
                    + "nim, "
                    + "nama, "
                    + "jenis_kelamin, "
                    + "kota"
                + ") "
            + "VALUES ("
                + "?, "
                + "?, "
                + "?, "
                + "?"
            + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNim());
        statemen.setString(2, mahasiswa.getNama());
        statemen.setString(3, mahasiswa.getJenis_kelamin());
        statemen.setString(4, mahasiswa.getAlamat());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void update(Mahasiswa mahasiswa) throws SQLException{
        String sql = " UPDATE "
                        + " mahasiswa "
                     + " SET "
                        + "nama = ?, "
                        + "jenis_kelamin = ?, "
                        + "kota = ?"
                     + " WHERE "
                         + "nim = ?"
                     ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNama());
        statemen.setString(2, mahasiswa.getJenis_kelamin());
         statemen.setString(3, mahasiswa.getAlamat());
        statemen.setString(4, mahasiswa.getNim());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void delete(Mahasiswa mahasiswa) throws SQLException{
        String sql = 
                "DELETE FROM "
                    + "mahasiswa "
                + "WHERE "
                    + "nim = ?"
                ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, mahasiswa.getNim());
        statemen.executeUpdate();
        statemen.close();
    }
    
  
}
