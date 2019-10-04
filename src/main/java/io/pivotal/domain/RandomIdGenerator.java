package io.pivotal.domain;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

public class RandomIdGenerator implements IdentifierGenerator {

    public String generateId() {
        return UUID.randomUUID().toString();
    }

    
    
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return generateId();
	}
}
