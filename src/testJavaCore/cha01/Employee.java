package testJavaCore.cha01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

    public static final int RECORD_SIZE = 96;
    public static final int NAME_SIZE = 80;

    private String name;
    private int salary;
    private int year;
    private int month;
    private int day;
    private Date hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(year, month, day);
        this.hireDay = calendar.getTime();
    }

    public Employee() {
    }
}
