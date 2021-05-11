package com.longxi.www.JieKou.Demo05;

public class TableTennisCoach extends Coach implements English{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("乒乓球教练吃饭");
    }
    @Override
    public void teach(){
        System.out.println("乒乓球教练教乒乓球");
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球员说英语");
    }
}
