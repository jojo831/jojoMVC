package org1.coding.demo.springmvc.DAO.DAOImpl;

import org.codingpedia.demo.rest.JPAEntity.testEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org1.coding.demo.springmvc.DAO.TestDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by mason on 2017/5/26.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TestDAOImpl implements TestDAO {

    private static final Logger logger = LoggerFactory.getLogger(TestDAOImpl.class);

    @PersistenceContext(unitName = "demoRestPersistence")
    private EntityManager entityManager;

    @Qualifier("entityManagerFactory")
    @Autowired
    EntityManagerFactory factory;

    @Override
    public List<testEntity> getPodcasts1() {
        //added by jojo
        String sqlString = "SELECT p FROM testEntity p";
        TypedQuery<testEntity> query = entityManager.createQuery(sqlString, testEntity.class);

        return query.getResultList();
    }


//    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void saveBoardURL(String combineURL, String sqlQuery) throws Exception {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        testEntity te = new testEntity();
        te.setSql_language(sqlQuery);
        te.setInsertionDate(new Date());
        te.setLink_on_url(combineURL);
        te.setUrl_description("this is jojo's test~~~");
        entityManager.persist(te);
        entityManager.getTransaction().commit();

    }
}

