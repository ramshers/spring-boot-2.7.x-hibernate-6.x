package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void run(String... args) throws Exception {
		
		/*I want to use JPA Criteria API, some thing like below with RIGHT JOIN - hoping it works in Hibernate 6.x. A try is worth it given my project requirement. */
		
		/*
		em.getCriteriaBuilder();
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = cb.createQuery(Tuple.class);
        Root<Packages> root = query.from(Packages.class);
        Join rightJoin = root.join("plist", JoinType.RIGHT);
        
        query.where(cb.between(rightJoin.get("someId"), 1, 10));
        
        List<Tuple> result = em.createQuery(query).getResultList();
        
        result.forEach(t -> System.out.println(t.get(0)));

		 */
	}

}
