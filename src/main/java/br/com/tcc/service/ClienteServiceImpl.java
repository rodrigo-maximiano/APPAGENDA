package br.com.tcc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.dao.ClienteRepository;
import br.com.tcc.entity.ClienteEntity;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 4:32 PM
 */

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void save(final String nome) {
        ClienteEntity c = new ClienteEntity();
        c.setNome(nome);
        clienteRepository.save(c);
    }
}
