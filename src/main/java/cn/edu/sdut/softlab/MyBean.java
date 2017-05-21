package cn.edu.sdut.softlab;

import javax.faces.bean.ManagedBean;

/**
 * Created by subaochen on 17-5-21.
 */
@ManagedBean
public class MyBean {
    public String sayHello() {
        return "hello from myBean";
    }
}
