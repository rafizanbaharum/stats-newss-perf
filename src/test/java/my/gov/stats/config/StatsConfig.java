package my.gov.stats.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Configuration
@ComponentScan({"my.gov.stats", "my.gov.stats"})
@PropertySource("classpath:app.properties")
@EnableTransactionManagement
public class StatsConfig {

    @Bean
    public SessionFactory sessionFactory() {
        return new LocalSessionFactoryBuilder(dataSource())
                .scanPackages("my.gov.stats")
                .addProperties(hibernateProperties())
                .buildSessionFactory();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager(sessionFactory());
        return hibernateTransactionManager;
    }

    @Bean
    public Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
        properties.put("hibernate.show_sql", "false");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.format_sql", "true");
        properties.put("javax.persistence.validation.mode", "none");

        //properties.put("hibernate.connection.pool_size", "1");
        //properties.put("hibernate.format_sql", "true");
        //properties.put("hibernate.use_sql_comments", "true");
        //properties.put("hibernate.c3p0.min_size", "5");
        //properties.put("hibernate.c3p0.max_size", "20");
        //properties.put("hibernate.c3p0.timeout", "300");
        //properties.put("hibernate.c3p0.max_statements", "50");
        //properties.put("hibernate.c3p0.idle_test_period", "3000");
        //properties.put("hibernate.cache.use_second_level_cache", "true");
        //properties.put("hibernate.cache.region.factory_class","org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory");
        //properties.put("hibernate.cache.use_query_cache", "true");
        //properties.put("hibernate.cache.use_minimal_puts", "true");
        //properties.put("hibernate.max_fetch_depth", "10");
        return properties;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUsername("minerva");
        dataSource.setPassword("abc123");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(5);
        dataSource.setMaxWait(5000);
        return dataSource;
    }
}
