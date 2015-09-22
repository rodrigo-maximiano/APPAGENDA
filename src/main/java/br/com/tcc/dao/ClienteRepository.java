package br.com.tcc.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.entity.ClienteEntity;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/27/15 10:56 AM
 */

public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {

}
