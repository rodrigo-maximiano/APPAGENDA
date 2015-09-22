package br.com.tcc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 3:28 PM
 */

@Repository
public class ClienteDAOImpl implements ClientDAOCuston{

    @PersistenceContext
    private EntityManager entityManager;

}
