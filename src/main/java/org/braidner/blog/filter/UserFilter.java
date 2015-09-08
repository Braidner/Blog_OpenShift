package org.braidner.blog.filter;

import org.braidner.blog.entity.enums.OAuthProvider;
import org.braidner.blog.repository.filter.SearchFilter;

/**
 * Created by Braidner on 9/4/2015.
 */
public class UserFilter implements SearchFilter {
    private Long id;
    private String login;
    private String password;
    private String provider;
    private String oauthId;

    public UserFilter() {
    }

    public UserFilter(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public UserFilter(String login, String password, OAuthProvider provider, String oauthId) {
        this.login = login;
        this.password = password;
        this.provider = provider.name();
        this.oauthId = oauthId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }
}
