package com.example.tengfei.day12_reflection;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.lang.reflect.*;

/**
 * @author by tengfei on 2020/6/20.
 * @description：
 */
public class TestClassCtor {

    private String name;

    private static  String age= "22";

    public TestClassCtor() {
        this.name = "tengfei";
    }

    public TestClassCtor(int a) {
    }

    public TestClassCtor(int a, String b) {
        name = b;
    }

    private TestClassCtor(int a, double c) {
    }

    private String doSomeThing(String hha){
        System.out.println("++++"+hha);
        return "haahhahaahah";
    }

    private static void work(){
        System.out.println("执行静态私有方法work");
    }


    public static void main(String[] args) {


        try {
            Class clazz = Class.forName("com.example.tengfei.day12_reflection.TestClassCtor");
            Class[] classes = {int.class,String.class};
            Constructor constructor = clazz.getDeclaredConstructor(classes);
            Object o =  constructor.newInstance(1,"haha");

            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);


            field.set(o,"fsdfasff");

            System.out.println(((TestClassCtor)o).name);

            Field ageField  = clazz.getDeclaredField("age");
            ageField.setAccessible(true);
//            Object object = ageField.get(null);
            ageField.set(o,"44");
            System.out.println(TestClassCtor.age);

//            System.out.println(TestClassCtor)o.name);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
