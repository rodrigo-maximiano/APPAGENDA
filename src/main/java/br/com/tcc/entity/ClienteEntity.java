package br.com.tcc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 3:36 PM
 */

@Entity(name = ClienteEntity.ENTITY_NAME)
@Table(name = ClienteEntity.TABLE_NAME)
public class ClienteEntity implements Serializable {

    public static final String TABLE_NAME = "CLIENTE";
    public static final String ENTITY_NAME = "cliente";

    private Integer id;
    private String nome;

    // construtor
    public ClienteEntity() {
    }

    @Id
    @GeneratedValue
    @Column
    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    @Column
    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}
