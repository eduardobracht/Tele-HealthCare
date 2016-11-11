/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.VitalSign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 13180606
 */
public class VitalSignDAODTOderby implements VitalSignDAO {

    @Override
    public List<VitalSignDTO> buscarTodos() throws Exception {
        List<VitalSignDTO> vsList = new ArrayList<>();
        String sql = "select * from editoras";
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        VitalSignDTO vs = new VitalSignDTO();
                        vs.setRespiratoryRate(resultado.getInt("RespiratoryRate"));
                        vs.setHeartRate(resultado.getInt("HeartRate"));
                        vs.setBloodPressure(resultado.getInt("BloodPressure"));
                        vs.setWeight(resultado.getInt("Weight"));
                        vs.setTimestamp(resultado.getString("Timestamp"));
                        vs.setStatusReport(resultado.getString("StatusReport"));
                        vsList.add(vs);
                    }
                    return vsList;
                }
            }
        } catch (Exception e) {
            throw new Exception("Falha na busca", e);
        }
    }

    @Override
    public VitalSignDTO buscarPorCodigo(int codigo) throws Exception {
        String sql = "select * from editoras where codigo = ?";
        VitalSignDTO vs = null;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, codigo);
                try (ResultSet resultado = comando.executeQuery()) {
                    if (resultado.next()) {
                        vs = new VitalSignDTO();
                        vs.setRespiratoryRate(resultado.getInt("RespiratoryRate"));
                        vs.setHeartRate(resultado.getInt("HeartRate"));
                        vs.setBloodPressure(resultado.getInt("BloodPressure"));
                        vs.setWeight(resultado.getInt("Weight"));
                        vs.setTimestamp(resultado.getString("Timestamp"));
                        vs.setStatusReport(resultado.getString("StatusReport"));
                    }
                    return vs;
                }
            }
        } catch (Exception e) {
            throw new Exception("Falha na busca", e);
        }
    }

    @Override
    public void inserir(VitalSignDTO ed) throws Exception {
        String sql = "insert into editoras(codigo,nome) values(?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, ed.getCodigo());
                comando.setString(2, ed.getNome());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new Exception("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new Exception("Falha na inserção");
        }
    }

    @Override
    public void alterar(VitalSignDTO ed) throws Exception {
        String sql = "update editoras set nome=? where codigo=?";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setString(1, ed.getNome());
                comando.setInt(2, ed.getCodigo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new Exception("Falha na alteração", e);
        }
        if (resultado == 0) {
            throw new Exception("Falha na alteração");
        }
    }
    
}
