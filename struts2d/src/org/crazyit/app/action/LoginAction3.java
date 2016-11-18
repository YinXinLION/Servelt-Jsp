package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by yinxin on 16-11-17.
 */
public class LoginAction3 implements Action {
    private String user;
    private String pass;
    private  InputStream inputStream;
    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public InputStream getResult(){
        return inputStream;
    }
    public String execute()throws Exception{
        System.out.println(getUser()+getPass());
        if(getUser().equals("lion")&&getPass().equals("111")) {
            inputStream = new ByteArrayInputStream("登陆成功".getBytes("UTF-8"));
        }else {
            inputStream = new ByteArrayInputStream("登陆失败".getBytes("UTF-8"));
        }
        return SUCCESS;
    }

}
