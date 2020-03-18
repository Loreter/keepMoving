package com.keep.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * HelloProperties
 * TODO
 * </p>
 *
 * @author: admin
 * @date: 2020/3/18
 */
@ConfigurationProperties(prefix = "keep.hello")// 关联配置文件
public class HelloProperties {


    // 配置文件中若未配置，默认为null

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
