package org.braidner.blog.entity.config;

import java.io.Serializable;

/**
 * Created by Braidner on 9/8/2015.
 */
public interface Auditable extends Serializable {
    Long getId();
    String getDetail();
}
