// Violating LSP: Penguin can't fly, but it inherits from Bird
//public class Bird {
//    public void fly() { /* fly implementation */ }
//}
//
//public class Penguin extends Bird {
//    @Override
//    public void fly() { throw new UnsupportedOperationException("Penguins can't fly"); }
//}

// Refactored to follow LSP
public static void main(String[] args) {


     abstract class liskov { /* Common Bird properties */
    }

    class FlyingBird extends liskov {
        public void fly() { /* fly implementation */ }
    }
    class Penguin extends liskov { /* No fly method, as Penguins don't fly */
    }
}