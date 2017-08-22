/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creationalbuilder;

import java.util.LinkedList;

/**
 *
 * @author emran
 */
public class builderDemo {
    
    public static void main(String[] args) {
        
        deviceBuilder myDevice = new laptopBuilder();
        director dir = new director();
        dir.buildDevice(myDevice);
        
        device d = myDevice.getDevice();
        
        d.listComp();
    }
   
}

class deviceComponent {
       
    String desc;

    public deviceComponent( String desc) {
        this.desc = desc;
    }    
    
}

class cpu extends deviceComponent {
    
    public cpu(String desc) {
        super(desc);
    }
    
}

class mem extends deviceComponent {
    
    public mem(String desc) {
        super(desc);
    }
    
}

class disk extends deviceComponent {
    
    public disk(String desc) {
        super(desc);
    }
    
}

class device {
  LinkedList<deviceComponent> comp = new   LinkedList<deviceComponent>();
   
  public void addComp(deviceComponent c){
      comp.addLast(c);
  }
  
  public void listComp(){
      for(deviceComponent c: comp){
          System.out.println(c.getClass().getSimpleName() + " : " + c.desc);
      }
  }
}

 interface deviceBuilder {
    
    public void addCPU();
    public void addMem();
    public void addDis();
    
    public device getDevice();
}

class laptopBuilder implements deviceBuilder {
    
    private device d = new device();

    @Override
    public void addCPU() {
        d.addComp(new cpu("i7"));
    }

    @Override
    public void addMem() {
        d.addComp(new mem("16gb"));
    }

    @Override
    public void addDis() {
        d.addComp(new disk("500ssd"));
    }

    @Override
    public device getDevice() {
        return d;
    }
    
    
    
}

class tabletBuilder implements deviceBuilder {
    
    private device d = new device();

    @Override
    public void addCPU() {
        d.addComp(new cpu("i7"));
    }

    @Override
    public void addMem() {
        d.addComp(new mem("16gb"));
    }

    @Override
    public void addDis() {
        d.addComp(new disk("500ssd"));
    }

    @Override
    public device getDevice() {
        return d;
    }
    
    
    
}

class director {
    
    private deviceBuilder db;
    
    public void buildDevice (deviceBuilder b){
        db = b;
        db.addCPU();
        db.addDis();
        db.addMem();
        
    }
}