package cc.openhome;

/**
 * Created by yinxin on 16-10-23.
 */
public class Message {
    public Message(String name,String text)
    {
        this.name = name;
        this.text = text;
    }
    public String name;
    public String text;
    public String getName(){
        return name;
    }
    public String getText(){
        return  text;
    }
}
