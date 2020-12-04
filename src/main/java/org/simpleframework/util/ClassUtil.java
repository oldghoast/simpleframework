package org.simpleframework.util;

import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.Set;

@Slf4j
public class ClassUtil {
    /**
     * 获取包下类集合
     *
     * @param PackageName
     */
    public static Set<Class<?>> extractPackageClass(String PackageName) {
        //1.获取到类的加载器
        ClassLoader classLoader = getClassLoader();
        //2.通过类的加载器获取到加载的资源
        URL url = classLoader.getResource(PackageName.replace(".", "/"));
        if(url==null){
            log.warn("unable to retrieve anything from package");
            return null;
        }
        //3.依据不同的资源类型，采用不同的方式获取资源的集合

        return null;
    }

    /**
     * 获取ClassLoader
     *
     * @return
     */
    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
