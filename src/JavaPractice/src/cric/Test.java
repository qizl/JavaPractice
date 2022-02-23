package cric;

import cric.tp18.StringTest;
import util.DbUtil;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {

    }

    /*
     * Cric教程练习
     */
    private static void cricTest() throws SQLException {
        // tp01 HelloWorld
//        HelloWorld.part3Read();

        // tp02 Java语法基础
//        var tp2 = new Tp2();
//        tp2.testIf(true);
//        tp2.testFor(10);
//        tp2.testArray(5);

        // tp03 对象与类
//        var tp3 = new Tp3();
//        tp3.sayHi();

//        var student = new Student(1, "Tom", 19);
//        student.print();
//        student.addAge();
//        student.print();

        // tp04 继承
//        var parent = new Parent(1, "papa");
//        parent.print();
//
//        var child = new Child(1, "son", 16);
//        child.print();
//        child.printChild();

        // tp05 包与接口
//        var human = new Human();
//        human.happy();

        // tp11 异常处理
//        var exceptionTest = new ExceptionTest();
//        exceptionTest.throwAException();

        // tp12 Java线程
//        var t1 = new ThreadTest("t1");
//        var t2 = new ThreadTest("t2");
//        t1.start();
//        t2.start();

//        var t = new Timer();
//        var task = new TimerTest();
//        t.schedule(task, 0, 1000);
//
//        var dateFormatTest = new DateFormatTest();
//        dateFormatTest.simpleDateFormat();
//        dateFormatTest.dateFomart();

        // tp13 Java输入输出流
//        var fileTest = new FileTest();
//        fileTest.copyFile();

//        var file = new File("doc\\test\\write.txt");
//        if (file.exists())
//            file.delete();
//        for (var i = 0; i < 100; i++)
//            fileTest.writeText(file, "hello" + i + "~");

        // tp15 Java数据库编程JDBC(1)
//        var jdbcTest = new JDBCTest();
//        jdbcTest.run();
//        jdbcTest.insert("aqiang");

        // tp16 Java数据库编程JDBC(2)
//        var dbUtil = new DbUtil();
//        var sqlUpdate = "update users set createtime=getdate() where name='zhangsan3'";
//        var r = dbUtil.update(sqlUpdate);
//        System.out.println("数据更新" + (r ? "成功" : "失败") + "！");

//        var sqlRead = "select * from users order by createtime";
//        var resultSet = dbUtil.read(sqlRead);
//        System.out.println("数据查询完成！");

        // tp17 网络编程
        // tp18 常用工具类
        var stringTest = new StringTest();
        stringTest.test();
    }
}
