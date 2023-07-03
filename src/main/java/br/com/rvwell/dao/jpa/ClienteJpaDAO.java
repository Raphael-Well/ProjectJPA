/**
 * 
 */
package br.com.rvwell.dao.jpa;

import br.com.rvwell.dao.generic.jpa.GenericJpaDAO;
import br.com.rvwell.domain.jpa.ClienteJpa;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
