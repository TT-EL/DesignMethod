package org.example.P8AbstractFactory.factory;

public abstract class Factory {

    /**
     * 生成工厂实例
     * <p><strong>这里生成的是具体工厂的实例，但返回的类型是抽象工厂的类型</strong></p>
     *
     * @param className 具体工厂类名，这里是继承了抽象工厂的具体工厂的类
     * @return 抽象工厂类型
     */
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Fount:" + className);
        } catch (InstantiationException e) {
            System.out.println("new Instance failed.");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return factory;
    }

    // 声明一系列抽象方法，生成零件和产品，交给具体工厂来实现

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
