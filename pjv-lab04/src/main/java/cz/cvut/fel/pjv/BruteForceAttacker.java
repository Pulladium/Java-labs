package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

    int sizeOfPassword;

    @Override
    public void breakPassword(int sizeOfPassword) {
        this.sizeOfPassword = sizeOfPassword;
        bruteForce("", getCharacters(), 0);
    }



    private void bruteForce(String password, char[] characters, int length) {
        if(length == this.sizeOfPassword){
//            System.out.println(password);
            if(super.isOpened()){
                return;
            }else {
//                System.out.println("trying: " + password);
                if (tryOpen(password.toCharArray())) {
//                    System.out.println("hacked");

                }
                return;
            }

        }
        for (char character : characters) {
            String newPass = password + character;
            bruteForce(newPass, characters, length + 1);
        }
    }
    
}
