package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx12 {
        private boolean inStable;
        public void Horse(boolean inStable) {
            this.inStable = inStable;
        }
        @Override
        protected void finalize() {
            try {
                if (!inStable) {
                    System.out.println("Error: A horse is out of its stable!");
                }
            } catch (Throwable throwable) {
            }
        }
        public static void main(String[] args) {
            // Create a Horse object
            InitializationCleanupEx12 horse = new InitializationCleanupEx12(false);
            System.gc();
        }
}
