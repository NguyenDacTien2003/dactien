import java.util.Scanner;
public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;//default amount

    public void input(){
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("Nhap ma cua ban : ");
            customerCode = ip.nextLine();
            System.out.println("Nhap ten cua ban: ");
            customerName = ip.nextLine();
            System.out.println("Nhap so tai khoan  cua ban: ");
            accNumber = ip.nextInt();
            System.out.println("Nhap tien cua ban: ");
            amount = ip.nextLong();
        } while (accNumber<100000 || accNumber > 101000|| customerCode.length() < 5 );
    }

    public void depositAndWithdraw(){
        long money;
        int type;
        Scanner ip = new Scanner(System.in);
        System.out.println("Ban muon dich vu gi:");
        System.out.println("0.Nap tien \n  1.Rut tien");
        type = ip.nextInt();
        System.out.println("Nhap tien: ");
        money = ip.nextLong();
        if (type == 0){
            System.out.println("So tien gui "+ money+ " thành so tien cua ban");
            System.out.println("Success");
            amount = money + amount;
            System.out.println("So tien cua ban;: "+ amount);
        }

        if (type == 1){
            if (money > amount){
                System.out.println("Khong du tien");
            }
            else if (money <= amount) {
                System.out.println("Ban chon rut "+ money +" tu so tien cua ban");
                System.out.println("Success");
                amount = amount - money;
                System.out.println("So tien: "+ amount);
            }
        }

        System.out.println("******************************");
    }

    @Override
    public String toString() {
        return "Account: \nCode: "+ customerCode+"\nName: "+customerName+"\nAccount number: "+accNumber+"\nAmount: "+amount;
    }
}