package org.example.mybatis.proxy;

import org.example.mybatis.cfg.Mapper;
import org.example.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

public class MapperProxy implements InvocationHandler {
    //map的key是全限定类名加方法名
    private Map<String, Mapper> maps;
    private Connection connection;

    public MapperProxy(Map<String, Mapper> maps, Connection connection) {
        this.maps = maps;
        this.connection = connection;
    }

    /**
     * 用于对方法进行增强，调用selectList方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.获取方法名
        String name = method.getName();
        //2.获取方法所在类的名称
        String classname = method.getDeclaringClass().getName();
        //3.组合key
        String key = classname+"."+name;
        //4.获取mappers中的Mapper对象
        Mapper mapper = maps.get(key);
        //5.判断是否有mapper
        if (mapper==null){
            throw new IllegalArgumentException("传入的参数有误");
        }
        //6.调用工具类执行查询所有
        return new Executor().selectList(mapper,connection);
    }
}
