/**
 * This class shows an example of an anonymous class called Dog. Anonymous
 * classes must use interfaces.
 *
 * @author Brian McVeigh
 */
package anonymousclassexample;

/**
 *
 * @author brianmcveigh
 */
public class DogAnonymousClass {
    
    /**
     * This is the interface that is required for the anonymous class.
     */
    interface Dog {
        public String speak();
        public void sit();
        public void rollOver();
        public String come();
        public void reset();
        public String getResults();
    }
    
    // Below is our anonymous class.
    Dog dog = new Dog() {
        private boolean isSitting = false;
        private boolean isRolledOver = false;
        
        /**
         * Make the dog speak.
         * 
         * @return String
         */
        @Override
        public String speak() {
            return "Woof, woof!";
        }

        /**
         * Make the dog sit.
         */
        public void sit() {
            this.isSitting = true;
        }

        /**
         * Make the dog roll over.
         */
        @Override
        public void rollOver() {
            this.isRolledOver = true;
        }

        /**
         * Make the dog come.
         * 
         * @return String
         */
        @Override
        public String come() {
            return "Gallop, gallop!";
        }

        /**
         * Reset the Dog object to default settings.
         */
        @Override
        public void reset() {
            isSitting = false;
            isRolledOver = false;
        }

        /**
         * Get the status of the dog.
         * 
         * @return String
         */
        @Override
        public String getResults() {
            String output = "Dog status:\n\n";
            
            output += "Is dog sitting?: " + this.isSitting + "\n";
            output += "Is dog rolled over?: " + this.isRolledOver + "\n";
            
            return output;
        }
    };
    
    /**
     * Make the dog do commands he probably does not want to do.
     */
    public void bossDogAround() {
        // Make the dog speak.
        System.out.println(this.dog.speak());
        
        // Ask the dog to do some commands.
        this.dog.rollOver();
        this.dog.come();
        
        // Display the dog's results.
        System.out.println(this.dog.getResults());
    }
}
