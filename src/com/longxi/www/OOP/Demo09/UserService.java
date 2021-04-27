package com.longxi.www.OOP.Demo09;

public interface UserService {
    //接口中的所有定义其实都是抽象的
    void run();

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
