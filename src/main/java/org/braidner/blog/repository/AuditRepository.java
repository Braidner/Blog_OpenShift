package org.braidner.blog.repository;

import org.braidner.blog.entity.Audit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Braidner on 9/8/2015.
 */
@Repository
@Transactional
public class AuditRepository extends AbstractRepository {

    public Audit findAudit(Long id) {
        return findEntity(Audit.class, id);
    }

}
