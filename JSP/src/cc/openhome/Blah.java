package cc.openhome;

import java.util.Date;

/**
 * Created by yinxin on 16-10-20.
 */
public class Blah {
    private String username;
    private Date date;
    private String txt;
    public Blah(){

    }
    public Blah(String username,Date date,String txt){
        this.username = username;
        this.date = date;
        this.txt = txt;
    }

    public String getUsername()
    {
        return username;
    }
    public Date getDate(){
        return date;
    }
    public String getTxt(){
        return txt;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setTxt(String txt){
        this.txt = txt;
    }
}
