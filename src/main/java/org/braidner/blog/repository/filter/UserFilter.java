package org.braidner.blog.repository.filter;

import org.braidner.blog.entity.enums.OAuthProvider;

/**
 * Created by Braidner on 9/8/2015.
 */
public class UserFilter implements SearchFilter {
    private String login;
    private String password;
    private OAuthProvider provider;
    private String oauthId;

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

    public OAuthProvider getProvider() {
        return provider;
    }

    public void setProvider(OAuthProvider provider) {
        this.provider = provider;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }
}
