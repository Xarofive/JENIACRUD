package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByName(String name) {
        return entityManager
                .createQuery("select u from Role u where u.role =?1", Role.class)
                .setParameter(1, name)
                .getSingleResult();

    }

    @Override
    public List<Role> listRoles() {
        Query query = entityManager.createQuery("from Role");
        return query.getResultList();
    }
}