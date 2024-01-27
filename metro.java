import java.util.*;
public class metro {
    public static void start(int balance){
        System.out.println("PRESS "+'\n'+ "1-->For Book Tickets"+'\n'+"2-->For Card Recharge"+'\n'+"3-->About Namma Metro"+'\n'+"4-->EXIT");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
                if(userChoice==1){
                    int cardBalanceUpdated = bookTicket(balance);
                }else if(userChoice==2){
                    int newCardBalance = rechargeCard(balance);
                }else if(userChoice==3){
                    System.out.println("Namma Metro (meaning Our Metro in Kannada), also known as Bengaluru Metro, is a rapid transit system serving the city of Bengaluru, India. It is the second longest operational metro network in India with an operational length of 73.75 kilometers just behind Delhi Metro. Upon its inauguration, it became the first underground metro system in South India. Namma Metro has a mix of underground, at grade, and elevated stations. Out of the 66 operational metro stations of Namma Metro as of October 2023, there are 57 elevated stations, eight underground stations and one at-grade station. The system runs on standard-gauge tracks.\r\n" + 
                    "Bengaluru Metro Rail Corporation Limited (BMRCL), a joint venture of Government of India and the State Government of Karnataka, is the agency for building, operating and expanding the Namma Metro network. Services operate daily between 05:00 and 24:00 running with a headway varying between 5-15 minutes. The trains initially began with three coaches but were later converted to six coaches as ridership grew. Power is supplied by 750V direct current through third rail. As of October 2023, the metro system has an average daily ridership of about 710,000 passengers.");
                    start(balance);
                }else if(userChoice==4){
                    System.exit(0);
                }else{
                    System.out.println("Invalid Input");
                }
        

        return;
    }

    public static int bookTicket(int balance){
        System.out.println("Please select the source station from the list(please enter only numbers)");
        System.out.println("1-->Nagasandra"+'\n'+"2-->Dasarahalli"+'\n'+"3-->Jalahhali Cross"+'\n'+"4-->Peenya"+'\n'+"5-->Goraguntepalya");
        Scanner sc = new Scanner(System.in);
        int src = sc.nextInt();

        System.out.println("Please select the Destination station from the list(please enter only numbers)");
        System.out.println("1-->Nagasandra"+'\n'+"2-->Dasarahalli"+'\n'+"3-->Jalahhali Cross"+'\n'+"4-->Peenya"+'\n'+"5-->Goraguntepalya");
        int dest = sc.nextInt();

        if(src==1&&dest==2||src==2&&dest==3||src==3&&dest==4||src==4&&dest==5||src==2&&dest==1||src==3&&dest==2||src==4&&dest==3||src==5&&dest==4){
            int ticketPrice = 15;
            System.out.println("The Ticket Price is:15rs");
            System.out.println("press 1 to continue for booking or press 0 to exit");
            int choice = sc.nextInt();
            int newBalance = balance-ticketPrice; 
            if(choice==1){
                if(balance>=ticketPrice){
                    System.out.println("Your ticket is confirmed.");
                    System.out.println("The amount deducted from your card is: "+ticketPrice+" and remaining balance is " + newBalance);
                    System.out.println("Happy journey,Please maintain a safe distance from the track");
                    System.out.println("For any queries please contact yathisha.15177@gmail.com");
                    return newBalance;
                }else{
                    System.out.println("The Balance is not sufficient to book your Ticket. Please Recharge your card");
                    System.out.println("Press 1 to recharge your card or 0 to exit");
                    int input = sc.nextInt();
                    if(input ==1 ){
                        int newAmount = recharge(balance);
                        bookTicket(newAmount);
                    }else if(input == 0){
                        System.exit(0);

                    }else{
                        System.out.println("Invalid selection");
                    }


                }
                
            }
        }else if(src==1&&dest==3||src==2&&dest==4||src==3&&dest==5||src==4&&dest==2||src==5&&dest==3||src==3&&dest==1){
            int ticketPrice = 25;
            System.out.println("The Ticket Price is:25rs");
            System.out.println("press 1 to continue for booking or press 0 to exit");
            int choice = sc.nextInt();
            int newBalance = balance-ticketPrice;
            if(choice==1){
                if(balance>=ticketPrice){
                    System.out.println("Your ticket is confirmed.");
                    System.out.println("The amount deducted from your card is: "+ticketPrice+" and remaining balance is " + newBalance);
                    System.out.println("Happy journey,Please maintain a distance from the track");
                    return newBalance;
                }else{
                    System.out.println("The Balance is not sufficient to book your Ticket. Please Recharge your card");
                    System.out.println("Press 1 to recharge your card or 0 to exit");
                    int input = sc.nextInt();
                    if(input ==1 ){
                        int newAmount = recharge(balance);
                        bookTicket(newAmount);
                    }else if(input == 0){
                        System.exit(0);

                    }else{
                        System.out.println("Invalid selection");
                    }
                }
                
            }
        }else if (src==1&&dest==4||src==2&&dest==5||src==4&&dest==1||src==5&&dest==2) {
            int ticketPrice = 35;
            System.out.println("The Ticket Price is 35 rs");
            System.out.println("press 1 to continue for booking or press 0 to exit");
            int choice = sc.nextInt();
            int newBalance = balance-ticketPrice;
            if(choice==1){
                if(balance>=ticketPrice){
                    System.out.println("Your ticket is confirmed.");
                    System.out.println("The amount deducted from your card is: "+ticketPrice+" and remaining balance is " + newBalance);
                    System.out.println("Happy journey,Please maintain a distance from the track");
                    return newBalance;
                }else{
                    System.out.println("The Balance is not sufficient to book your Ticket. Please Recharge your card");
                    System.out.println("Press 1 to recharge your card or 0 to exit");
                    int input = sc.nextInt();
                    if(input ==1 ){
                        int newAmount = recharge(balance);
                        bookTicket(newAmount);
                    }else if(input == 0){
                        System.exit(0);

                    }else{
                        System.out.println("Invalid selection");
                    }
                }
                
            }
        }else if (src==5&&dest==1||src==1&&dest==5) {
            int ticketPrice = 50;
            System.out.println("The Ticket Price is 50 rs");
            System.out.println("press 1 to continue for booking or press 0 to exit");
            int choice = sc.nextInt();
            int newBalance = balance-ticketPrice;
            if(choice==1){
                if(balance>=ticketPrice){
                    System.out.println("Your ticket is confirmed.");
                    System.out.println("The amount deducted from your card is: "+ticketPrice+" and remaining balance is " + newBalance);
                    System.out.println("Happy journey,Please maintain a distance from the track");
                    return newBalance;
                }else{
                    System.out.println("The Balance is not sufficient to book your Ticket. Please Recharge your card");
                    System.out.println("Press 1 to recharge your card or 0 to exit");
                    int input = sc.nextInt();
                    if(input ==1 ){
                        int newAmount = recharge(balance);
                        bookTicket(newAmount);
                    }else if(input == 0){
                        System.exit(0);
                    }else{
                        System.out.println("Invalid selection");
                    }
                }
                
            }
        }else if(src==1&&dest==1||src==2&&dest==2||src==3&&dest==3||src==4&&dest==4||src==5&&dest==5){
            System.out.println("You can't Travel from same station to same station");
            System.exit(0);
        }else{
            System.out.println("Please enter the correct source and destination station.");
            System.exit(0);
        }


        return balance;
    }

    public static int recharge(int balance){
        System.out.println("Your Card Balance is "+ balance);
        System.out.println("Enter the Amount to add to the Card");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("Enter your Card Password");
        String password = sc.next();
        if(password.equals("Yathi1234")){
            int newCardAmount = balance+amount;
            System.out.println("Your amount is added successfully");
            System.out.println("New Balance is "+ newCardAmount); 
            // start(newCardAmount);
            return newCardAmount;
        }else{
            System.out.println("Incorrect Password,Please Enter the correct Password");
            return recharge(balance);
        }
        
    }

    public static int rechargeCard(int balance){
        System.out.println("Your Card Balance is "+ balance);
        System.out.println("Enter the Amount to add to the Card");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("Enter your Card Password");
        String password = sc.next();
        if(password.equals("Yathi1234")){
            int newCardAmount = balance+amount;
            System.out.println("Your amount is added successfully");
            System.out.println("New Balance is "+ newCardAmount); 
            start(newCardAmount);
            return newCardAmount;
        }else{
            System.out.println("Incorrect Password,Please Enter the correct Password");
            return recharge(balance);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello,Welcome to Namma Metro" +'\n'+ "Please Enter Your Card Number:");
        int cardNumber = sc.nextInt();
        System.out.println("Please Enter your Password:");
        String password = sc.next();

        if(cardNumber==243848066){
            if(password.equals("Yathi1234")) {
                String name = "Yathisha";
                int cardNo = cardNumber;
                int cardBalance = 250;
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Hello "+name+ ", Welcome Back to Namma Metro");
                System.out.println("Your Name is "+ name);
                System.out.println("Your Crad Number is "+ cardNo);
                System.out.println("Your Card Balance is "+ cardBalance);
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("How can I Help You Today "+ name + " ?");
                start(cardBalance);
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("This card is not found");
        }
    }
}
