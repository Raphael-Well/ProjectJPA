/**
 * 
 */
package br.com.rvwell.services;

import br.com.rvwell.dao.IProdutoDAO;
import br.com.rvwell.domain.Produto;
import br.com.rvwell.services.generic.GenericService;

/**
 * @author Raphael Van Well
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
