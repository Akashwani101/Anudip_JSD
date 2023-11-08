public class conditions {

    public static void main(String[] args) {
        
       //conditional statements
       //nested if-else
        int value = 35;
        int age = 20;
        if(age < value){
            System.out.println("You are not eligible to stand for PM's seat,");
           if(age > 18){
            System.out.println("But you can vote as a citizen");
           } else{
            System.out.println("Please wait untill your age will be 18 years.");
           }
        } else{
            System.out.println("You are eligible");
        }

        //while statement
        boolean name = true;
        while(name){
            System.out.println("Lets do it");
            break;
        }
 
        //for statement
        for(int i = 2 ; i <= age; i++){
            System.out.println("connecting...");
        }

        int[]num ={1, 2, 3};
        for(int as : num){
            System.out.println("redirecting..." + as);
        }

       //Switch cases
       int ageofyou = 18;
       switch(ageofyou){
        case 1 : if(ageofyou >= 18){
            System.out.println("You can vote");
            break;
        }
        case 2 : if(ageofyou < 18){
            System.out.println("You can't vote");
            break;
        }   
        default : {
            System.out.println("Please check youe eligibility");
            break;
        } 
       
       }

       //While case
       boolean accounBalance = true;
       while(accounBalance){
        System.out.println("You have money to purchase.");
        break;
       } 

       //do-while
       do{
        System.out.println("Printing is in progress...");
        break;
       } while(accounBalance);

       int ii=80;
       int jj=80;
       if(ii==jj){
        System.out.println("equals");
       }else{
        System.out.println("Not Equal");
       }
    }

    
}
