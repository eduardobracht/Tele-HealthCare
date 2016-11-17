/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.VitalSign;

import java.util.List;

/**
 *
 * @author Daniel Machado, Eduardo Mallmann, Leandro Oliveira
 */
public interface VitalSignDAO {
	List<VitalSignDTO> buscarTodos() throws Exception;
	VitalSignDTO buscarPorCodigo(int codigo) throws Exception;
	void inserir(VitalSignDTO vs) throws Exception;
	void alterar(VitalSignDTO vs) throws Exception;
}