package org.braidner.blog.entity;

import org.braidner.blog.entity.enums.OAuthProvider;
import org.hibernate.annotations.*;

import javax.persistence.Entity;

/**
 * Created by Braidner on 9/4/2015.
 */
@Entity
@FilterDefs({
        @FilterDef(name = User.FILTER_BASIC_LOGIN, parameters = {
                @ParamDef(name = "login", type = "string"),
                @ParamDef(name = "password", type = "string")
        }),
        @FilterDef(name = User.FILTER_OAUTH_LOGIN, parameters = {
                @ParamDef(name = "provider", type = "string"),
                @ParamDef(name = "oauthId", type = "string")
        }),
})
@Filters({
        @Filter(name = User.FILTER_BASIC_LOGIN, condition = "login = :login and password = :password"),
        @Filter(name = User.FILTER_OAUTH_LOGIN, condition = "oauth_provider = :provider and oauth_id = :oauthId")
})
public class User extends BaseEntity {
    public static final String FILTER_BASIC_LOGIN = "FILTER_BASIC_LOGIN";
    public static final String FILTER_OAUTH_LOGIN = "FILTER_OAUTH_LOGIN";

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String oauthId;
    private OAuthProvider provider;
}
