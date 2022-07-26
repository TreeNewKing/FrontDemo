package com.example.qianduanlearn.pojo;

public class User implements Cloneable {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();//浅克隆直接修改可见性为public就可以了
//    }
// TODO 多次浅克隆=深克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
       User user= (User) super.clone();
       user.setCountry((Country) user.country.clone());
        return user;
    }

    private String name;
    private  int age;
    private  Country country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
