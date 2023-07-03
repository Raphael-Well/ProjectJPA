/**
 * 
 */
package br.com.rvwell.dao.jpa;

import br.com.rvwell.dao.generic.jpa.GenericJpaDAO;
import br.com.rvwell.domain.jpa.ProdutoJpa;

/**
 * @author Raphael Van Well
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
