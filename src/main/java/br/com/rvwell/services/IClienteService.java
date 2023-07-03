/**
 * 
 */
package br.com.rvwell.services;

import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.DAOException;
import br.com.rvwell.services.generic.IGenericService;

/**
 * @author Raphael Van Well
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
