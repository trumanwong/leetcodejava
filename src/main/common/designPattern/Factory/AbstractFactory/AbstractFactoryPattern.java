package designPattern.Factory.AbstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Rectangle 的对象
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape1.draw();

        //获取形状为 Square 的对象
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape2.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Green 的对象
        Color color1 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color1.fill();

        //获取颜色为 Blue 的对象
        Color color2 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color2.fill();
    }
}

/*
* 创建形状接口
* */
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

/*
* 创建颜色接口
* */
interface Color {
    void fill();
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}

class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}

/*
* 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * */
class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}