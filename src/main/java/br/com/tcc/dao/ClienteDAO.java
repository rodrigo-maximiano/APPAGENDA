package br.com.tcc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tcc.entity.ClienteEntity;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 4:25 PM
 */
public interface ClienteDAO extends JpaRepository<ClienteEntity, Integer> , ClientDAOCuston{

}
