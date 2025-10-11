import java.util.Scanner;
public class Months {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Choose a month to know the holidays (eg.: November): ");
        String months = in.next();
        switch(months){
            case "January": 
                System.out.println("1st (Wed): New Year");
                System.out.println("6th (Mon): Guru Gobin Singh's Birthday");
                System.out.println("14th (Tue): Makar Sakranti");
                System.out.println("26th (Tue): Republic Day");
                break;

            case "February":
                System.out.println("2nd (Sun): Basant Panchami");
                System.out.println("12th (Wed): Guru Ravidas's Birthday");
                System.out.println("19th (Wed): Shivaji Jayanti");
                System.out.println("23rd (Sun): Swami Dayananda Saraswati Jayanti");
                System.out.println("26th (Wed): Maha Shivaratri");
                break;

            case "March":
                System.out.println("13th (Thu): Holika Dahan");
                System.out.println("14th (Fri): Holi");
                System.out.println("28th (Fri): Jamat-Ul-Vida");
                System.out.println("30th (Sun): Ugadi");
                System.out.println("31th (Mon): Id-ul-Fitr");
                break;
            
            case "April":
                System.out.println("6th (Sun): Ram Navami");
                System.out.println("10th (Thu): Mahavir  Jayanti");
                System.out.println("13th (Sun): Vaisakhi");
                System.out.println("14th (Mon): Dr. B. R. Ambedkar's Birthday");
                System.out.println("15th (Tue): Bihu");
                System.out.println("18th (Fri): Good Friday");
                System.out.println("20th (Sun): Easter Sunday");
                break;

            case "May":
                System.out.println("9th (Fri): Guru Rabindranath's Birthday");
                System.out.println("12th (Mon): Buddha Purnima");
                break;

            case "June":
                System.out.println("7th (Sat): Id-ul-Zuha(Bakrid)");
                System.out.println("27th (Fri): Rath Yatra");
                break;

            case "July":
                System.out.println("6th (Sun): Muharram");
                break;

            case "August":
                System.out.println("9th (Sat): Raksha Bandhan");
                System.out.println("15th (Fri): Independence Day");
                System.out.println("16th (Sat): Janmashtami");
                System.out.println("27th (Wed): Ganesh Chaturthi");
                break;

            case "September":
                System.out.println("5th (Fri): Onam");
                System.out.println("29th (Mon): Dussehra");
                System.out.println("30th (Tue): Dussehra");
                break;

            case "October":
                System.out.println("1st (Wed): Dussehra");
                System.out.println("2nd (Thu): Mahatma Gandhi's Birthday");
                System.out.println("7th (Tue): Maharishi Valmiki's Birthday");
                System.out.println("10th (Fri): Karva Chouth");
                System.out.println("20th (Mon): Diwali");
                System.out.println("22nd (Wed): Govardhan Puja");
                System.out.println("23rd (Thu): Bhai Duj");
                System.out.println("28th (Tue): Chhat Puja");
                break;

            case "November":
                System.out.println("5th (Wed): Guru Nanak's Birthday ");
                System.out.println("24th (Mon): Guru Teg Bahadur's Martyrdom Day");
                break;

            case "December":
                System.out.println("24th (Wed): Christmas Eve");
                System.out.println("25th (Thu): Christmas Day");
                break;

            default:
                System.out.println("Make sure the 1st letter of the month is capital and the spelling is correct.");
        }
    }
}
