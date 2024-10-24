// Violating ISP: Robots don’t eat, but they are forced to implement eat()
// interface Worker {
//    void work();
//    void eat()}
// class HumanWorker implements Worker {
//    public void work() { /* work logic */ }
//    public void eat() { /* eat logic */ }
//}
//
//public class RobotWorker implements Worker {
//    public void work() { /* work logic */ }
//    public void eat() { throw new UnsupportedOperationException("Robots don't eat"); }
    // Refactored to follow ISP
public static void main(String[] args) {


    interface Workable {
        void work();
    }
    interface Eatable {
        void eat();
    }
    class HumanWorker implements Workable, Eatable {
        public void work() { /* work logic */ }

        public void eat() { /* eat logic */ }
    }
    class RobotWorker implements Workable {
        public void work() { /* work logic */ }
    }
}

