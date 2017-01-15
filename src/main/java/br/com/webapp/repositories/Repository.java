package br.com.webapp.repositories;

import java.io.Serializable;

/**
 * Created by odilon on 14/01/17.
 */
public interface Repository<T, ID extends Serializable>{

    public void salvar(T entidade);

    public T buscarPorId(ID id);
}
