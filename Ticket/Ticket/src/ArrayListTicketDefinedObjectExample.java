import java.util.ArrayList;
import java.util.List;
class Ticket {
    private String Vephim;
    private int time;
    private int day;

    public Ticket(String vephim, int time, int day) {
        this.Vephim = vephim;
        this.time = time;
        this.day = day;
    }

    public String getVephim() {
        return Vephim;
    }

    public void setVephim(String vephim) {
        this.Vephim = vephim;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
    public class ArrayListTicketDefinedObjectExample{
        public static void main(String [] args  )   {
            List<Ticket> tickets = new ArrayList<>();
            tickets.add(new Ticket("Nguoi lon", 9 , 15 ));
            tickets.add(new Ticket("Tre em", 10 , 16));
            tickets.add(new Ticket("Nguoi Gia", 11 , 17 ));

            tickets.forEach(Ticket ->{
                System.out.println("Ve xem phim : " + Ticket.getVephim() + " , Gio chieu phim (gio) : " + Ticket.getTime() + " , Ngay chieu trong thang 5 Nam 2022 ; " + Ticket.getDay()  );
            });
        }
    }
















