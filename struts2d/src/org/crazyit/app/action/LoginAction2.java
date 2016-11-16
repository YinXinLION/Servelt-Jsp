package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * Created by yinxin on 16-11-16.
 */
public class LoginAction2 implements Action {
    private String user;
    private String pass;

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String execute(){
        ActionContext.getContext().getSession().put("user",getUser());
        return SUCCESS;
    }
}
