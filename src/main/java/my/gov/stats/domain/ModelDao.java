package my.gov.stats.domain;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perf4j.aop.Profiled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Component("modelDao")
public class ModelDao {

    @Autowired
    private SessionFactory sessionFactory;

    List<ShortColumnModel> findShortColumns() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select * from ShortColumnModel");
        return (List<ShortColumnModel>) query.list();
    }

    List<MediumColumnModel> findMediumColumns() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select * from MediumColumnModel");
        return (List<MediumColumnModel>) query.list();
    }

    List<LongColumnModel> findLongColumns() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select * from LongColumnModel");
        return (List<LongColumnModel>) query.list();
    }

    @Profiled
    public ShortColumnModel findByShortColumnId(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select scm from ShortColumnModel scm where id = :id");
        query.setLong("id", id);
        return (ShortColumnModel) query.uniqueResult();
    }

    @Profiled
    public MediumColumnModel findByMediumColumnId(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select mcm from MediumColumnModel mcm where id = :id");
        query.setLong("id", id);
        return (MediumColumnModel) query.uniqueResult();
    }

    @Profiled
    public LongColumnModel findByLongColumnId(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select lcm from LongColumnModel lcm where id = :id");
        query.setLong("id", id);
        return (LongColumnModel) query.uniqueResult();
    }

    @Profiled
    public HugeColumnModel findByHugeColumnId(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select lcm from HugeColumnModel lcm where id = :id");
        query.setLong("id", id);
        return (HugeColumnModel) query.uniqueResult();
    }


    public void save(Serializable serializable) {
        Session session = sessionFactory.getCurrentSession();
        session.save(serializable);
    }

    public void warmUp() {
        Session session = sessionFactory.getCurrentSession();
        session.clear();
    }
}
