package org.crazyit.app.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.crazyit.app.action.LoginAction;

import java.util.Date;

/**
 * Created by yinxin on 16-11-16.
 */
public class SimpleInterceptor extends AbstractInterceptor {
    //拦截器的名字
    private String name;
    //为该拦截器设置名字的setter方法
    public void setName(String name){
        this.name = name;
    }
    public String intercept(ActionInvocation invocation) throws Exception {
        // 取得被拦截的Action实例
        LoginAction action = (LoginAction)invocation.getAction();
        // 打印执行开始的时间
        System.out.println(name + " 拦截器的动作---------" +
                "开始执行登录Action的时间为：" + new Date());
        // 取得开始执行Action的时间
        long start = System.currentTimeMillis();
        // 执行该拦截器的后一个拦截器
        // 如果该拦截器后没有其他拦截器，则直接执行Action的被拦截方法
        String result = invocation.invoke();
        // 打印执行结束的时间
        System.out.println(name + " 拦截器的动作---------" +
                "执行完登录Action的时间为：" + new Date());
        long end = System.currentTimeMillis();
        System.out.println(name + " 拦截器的动作---------" +
                "执行完该Action的时间为" + (end - start) + "毫秒");
        return result;
    }
}
