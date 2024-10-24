
// Violating DIP: Switch is tightly coupled to LightBulb
//public class LightBulb {
//    public void turnOn() { /* turn on bulb */ }
//}
//
//public class Switch {
//    private LightBulb bulb = new LightBulb();
//    public void operate() { bulb.turnOn(); }
//}

// Refactored to follow DIP
public static void main(String[] args) {


    interface Switchable {
        void turnOn();
    }

     class LightBulb implements Switchable {
        public void turnOn() { /* turn on bulb */ }
    }

     class Switch {
        private Switchable device;

        public Switch(Switchable device) {
            this.device = device;
        }

        public void operate() {
            device.turnOn();
        }
    }

}