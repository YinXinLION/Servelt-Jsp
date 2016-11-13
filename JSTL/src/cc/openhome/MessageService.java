package cc.openhome;


import java.io.Serializable;

/**
 * Created by yinxin on 16-10-23.
 */
public class MessageService implements Serializable{
    private Message[] fakeMessages;
    public MessageService(){
        fakeMessages = new Message[3];
        fakeMessages[0] = new Message("caterpillar","caterpillar's message!");
        fakeMessages[1] = new Message("momor","momor's message!");
        fakeMessages[2] = new Message("hamimi","hamimi's message!");
    }
    public Message[] getMessages(){
        return fakeMessages;
    }
}
