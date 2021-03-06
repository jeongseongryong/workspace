package step27.ex3;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory3 implements FactoryBean {
  String tireMaker;
  String name;
  
  public String getTireMaker() {
    return tireMaker;
  }

  public void setTireMaker(String tireMaker) {
    this.tireMaker = tireMaker;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private Car createLamborghini() {
    
    Engine e1 = new Engine(8, 4);

    Tire[] tireList = {
        new Tire(tireMaker, 13),
        new Tire(tireMaker, 13),
        new Tire(tireMaker, 13),
        new Tire(tireMaker, 13)
    };

    Car c1 = new Car();
    c1.setModel("람보르기니");
    c1.setCc(5000);
    c1.setEngine(e1);
    c1.setTires(tireList);
    
    return c1;
  }

  private Car createFerrari() {
    
    Engine e2 = new Engine(16, 8);

    Tire[] tireList2 = {
        new Tire(tireMaker, 15),
        new Tire(tireMaker, 15),
        new Tire(tireMaker, 15),
        new Tire(tireMaker, 15)
    };

    Car c2 = new Car();
    c2.setModel("페라리");
    c2.setCc(7000);
    c2.setEngine(e2);
    c2.setTires(tireList2);
    
    return c2;
  }

  @Override
  public Object getObject() throws Exception {
    switch (this.name) {
    case "람보르기니" : return createLamborghini();
    case "페라리" : return createFerrari();
    default : return null;
    
    }
  }

  @Override
  public Class getObjectType() {
    return Car.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }

}
