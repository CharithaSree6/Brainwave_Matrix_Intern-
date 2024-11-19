import java.util.Scanner;

class automatch{
    public static void main(String[] args) {
        int deb,cread,bal;
        bal=120000;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for debit --");
        System.out.println("press 2 for credit--");
        System.out.println("press 3 for checking balance--");
        System.out.println("---select any option---");
        int o=input.nextInt();
        switch (o) {
            case 1:
            System.out.println("enter amount to be debited");
            deb = input.nextInt();
            if(deb<=bal){
                bal = bal-deb;
                System.out.println("Amount debited successfully!!");

            }else{
                System.out.println("Insufficient balanced!!");

            }
            break;
            case 2:
            System.out.println("Enter amount to be credited: \n ");
            cread = input.nextInt();
            bal = bal+ cread;
            System.out.println("Transaction successfull!!\n");
            break;
            case 3:
            System.out.println(bal);
            break;
            case 4:
            System.exit(0);
        }        
    }
}