package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        NewJFrame n2=new NewJFrame();//建立一個視窗
        NewJPanel p2=new NewJPanel(n2);//建立一個面板，並將視窗傳入
        n2.add(p2);//視窗中新增面板p2
        n2.setVisible(true);//顯示視窗
    }
}
