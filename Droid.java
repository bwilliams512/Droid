/*
This a Codecademy Learn Java Project.
I learned how to build some droids.
*/
package bwilliams512.droid;

public class Droid {
  
  // decalare an instance field
  int batteryLevel;
  String name;

  // toString method
  public String toString() {
    return "Hello, my name is " + name + ".";
  }

  // performTask method
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
    System.out.println("Battery level is: " + batteryLevel);
  }

  // constructor method
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  // energyReport method
  public void energyReport(){
     System.out.println(name + "'s'" + " current battery level is: " + batteryLevel);
   }

  // energyTransfer method
  public void energyTransfer(Droid receiver, int energyNum) {
    batteryLevel = batteryLevel - energyNum;
    receiver.batteryLevel = receiver.batteryLevel + energyNum;
    System.out.println(name + " transferred " + energyNum + "% energy to " + receiver.name + " and now " + name + "'s battery level is " + batteryLevel + "%. " + receiver.name + "'s battery level is now " + receiver.batteryLevel + "%.");
  }

  // main method
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("lifting");
    codey.performTask("loading");
    
    Droid jack = new Droid("Jack");
    System.out.println(jack);
    jack.performTask("delivering");
    
    // you can call battery level current status
    // uncomment code below
    //codey.energyReport();
    //jack.energyReport();

    // you can call battery level transfer
    // you can switch names and change number
    // uncomment code below
    //codey.energyTransfer(jack, 10);
  }
}

