package com.keep.hello;

/**
 * <p>
 * HelloService
 * TODO
 * </p>
 *
 * @author: admin
 * @date: 2020/3/18
 */

public class HelloService {

    // 注入配置类

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    // 具体业务

    public String sayHello(String name) {

        return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }
}
