package Token_System;

public class Main {
   
    
        public static void main(String[] args) {
            
    
            // Create three user threads
            TokenGenerator user1 = new TokenGenerator();
            TokenGenerator user2 = new TokenGenerator();
            TokenGenerator user3 = new TokenGenerator();
    
            // Start all user threads simultaneously
            user1.start();
            user2.start();
            user3.start();
        }
    }

