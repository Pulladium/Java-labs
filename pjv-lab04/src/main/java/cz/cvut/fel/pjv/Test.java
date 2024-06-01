package cz.cvut.fel.pjv;

public class Test {
    
    public void start() {
        String password = "d2u2ua3";
        BruteForceAttacker attacker = new BruteForceAttacker();
        attacker.init(new char[]{'a', 'b', 'c', 'd', '2', '3', 'u'}, password);

        System.out.println("Trying to break password...");
        attacker.breakPassword(password.length());
        
        if (attacker.isOpened()) {
            System.out.println("[VAULT] opened, password is " + password);
        } else {
            System.out.println("[VAULT] is still closed");
        }
    }
}