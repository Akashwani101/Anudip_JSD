class iPhone6 {
    void makeCalls(){
        System.out.println("Calling functionality.......");
    }
}

// Getting feature of previous iPhone model
class iPhone10 extends iPhone6{

    void unlockPhoneByFaceId(){
        System.out.println("Unlocking phone by face Id.......");
    }

}
// Getting feature of previous iPhone10
class iPhone12 extends iPhone10{
	
    public static void main(String[] args) {
        iPhone12 iPhone = new iPhone12();
        iPhone.makeCalls();  // feature reused of iPhone 6 for iPhone 12
        iPhone.unlockPhoneByFaceId(); // feature reused of iPhone 10 for iPhone 12
        iPhone.supportFor5GNetwork(); // additional feature
    }
    void supportFor5GNetwork(){
        	System.out.println("5G network support.......");
    	}
    

}