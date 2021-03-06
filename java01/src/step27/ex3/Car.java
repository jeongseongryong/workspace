package step27.ex3;

import java.util.Arrays;
import java.util.Map;

public class Car {
  String model;
  int cc;
  Engine engine;
  Tire[] tires;
  Map<String,Object> options;
  
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", cc=" + cc + ", engine=" + engine + ", tires=" + Arrays.toString(tires)
        + ", options=" + options + "]";
  }

  public Car() {
    System.out.println("Car()");
    this.model = "기본자동차";
    this.cc = 900;
  }
  
  public Car(String model, int cc) {
    System.out.println("Car(String, int)");
    this.model = model;
    this.cc = cc;
  }
  
  public Car(String model, int cc, Engine engine) {
    System.out.println("Car(String, int, engine)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
  }
  
  public Car(String model, int cc, Engine engine, Tire[] tires) {
    System.out.println("Car(String, int, engine)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
    this.tires = tires;
  }
  
  public Car(String model, int cc, Engine engine, Tire[] tires, Map options) {
    System.out.println("Car(String, int, engine)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
    this.tires = tires;
    this.options = options;
  }
  
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
  public int getCc() {
    return cc;
  }
  
  public void setCc(int cc) {
    this.cc = cc;
  }
  
  public Engine getEngine() {
    return engine;
  }
  
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  public Tire[] getTires() {
    return tires;
  }
  
  public void setTires(Tire[] tires) {
    this.tires = tires;
  }
  
  public Map<String, Object> getOptions() {
    return options;
  }
  
  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }
  
  
  
  
}
