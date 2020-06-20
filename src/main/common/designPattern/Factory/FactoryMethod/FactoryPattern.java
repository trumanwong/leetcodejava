package designPattern.Factory.FactoryMethod;

abstract class Product {
    public abstract void Show();
}

class ProductA extends Product {

    @Override
    public void Show() {
        System.out.println("Product A");
    }
}

class ProductB extends Product {
    @Override
    public void Show() {
        System.out.println("Product B");
    }
}

abstract class ProductFactory {
    public abstract Product CreateFactory();
}

class ProductAFactory extends ProductFactory {

    @Override
    public Product CreateFactory() {
        return new ProductA();
    }
}

class ProductBFactory extends ProductFactory {

    @Override
    public Product CreateFactory() {
        return new ProductB();
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        ProductAFactory factoryA = new ProductAFactory();
        factoryA.CreateFactory().Show();
    }
}