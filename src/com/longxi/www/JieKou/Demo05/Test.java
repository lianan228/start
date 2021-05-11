package com.longxi.www.JieKou.Demo05;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        TableTennisCoachSportMan tableTennisCoachSportMan = new TableTennisCoachSportMan();
        tableTennisCoachSportMan.setName("王浩");
        tableTennisCoachSportMan.setAge(30);
        System.out.println(tableTennisCoachSportMan.getName()+tableTennisCoachSportMan.getAge());
        tableTennisCoachSportMan.eat();
        tableTennisCoachSportMan.study();
        tableTennisCoachSportMan.speakEnglish();

        //王浩30
        //乒乓球运动员吃饭
        //乒乓球运动员学习乒乓球
        //乒乓球运动员说英语


        BasketballCoach basketballCoach = new BasketballCoach();
        basketballCoach.setName("珑玺");
        basketballCoach.setAge(20);
        System.out.println(basketballCoach.getName()+basketballCoach.getAge());
        basketballCoach.teach();
        basketballCoach.eat();
        //珑玺20
        //篮球教练教篮球
        //篮球教练吃饭

    }
}
