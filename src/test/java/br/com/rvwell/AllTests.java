/**
 * 
 */
package br.com.rvwell;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Raphael Van Well
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
