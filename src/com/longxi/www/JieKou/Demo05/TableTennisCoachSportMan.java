package com.longxi.www.JieKou.Demo05;

public class TableTennisCoachSportMan extends SportMan implements English{
    public TableTennisCoachSportMan() {
    }

    public TableTennisCoachSportMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }
    @Override
    public void speakEnglish(){
        System.out.println("乒乓球运动员说英语");
    }
}
