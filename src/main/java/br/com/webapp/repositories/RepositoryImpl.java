package br.com.webapp.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by odilon on 14/01/17.
 */
public class RepositoryImpl<T, ID extends Serializable> implements Repository<T, ID> {

    @PersistenceContext
    EntityManager entityManager;

    private Class<T> classeEntidade;

    @SuppressWarnings("unchecked")
    public RepositoryImpl() {
        this.classeEntidade = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Override
    public void salvar(T entidade) {
        entityManager.merge(entidade);
    }

    @Override
    public T buscarPorId(ID id) {
        return entityManager.find(classeEntidade, id);
    }

}
