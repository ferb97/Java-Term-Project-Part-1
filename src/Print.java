import java.util.List;

public class Print {
    public static void mainMenu(){
        System.out.println("Main Menu:");
        System.out.println("1 - Search Players");
        System.out.println("2 - Search Clubs");
        System.out.println("3 - Add Player");
        System.out.println("4 - Exit System");
        System.out.print("Select an option: ");
    }

    public static void subMenu1(){
        System.out.println("Player Searching Options:");
        System.out.println("1 - By Player Name");
        System.out.println("2 - By Club and Country");
        System.out.println("3 - By Position");
        System.out.println("4 - By Salary Range");
        System.out.println("5 - Country-wise player count");
        System.out.println("6 - Back to Main Menu");
        System.out.print("Select an option: ");

    }

    public static void invalidInput(){
        System.out.println("Invalid Input");
    }

    public static void playerListInfo(List<Player> playerList){
        for(Player p: playerList){
            System.out.println("Name: " + p.getName() + ", Country: " + p.getCountry() + ", Age: " + p.getAge() + ", Height: " + p.getHeight() + ", Club: " + p.getClub() + ", Position: " + p.getPosition() + ", Number: " + p.getNumber() + ", Weekly Salary: " + p.getWeeklySalary());
        }
    }

    public static void countrywisePlayerCount(List<Country> countryList){
        for(Country c: countryList){
            System.out.println(c.getName() + " - " + c.getPlayerCount());
        }
    }

    public static void subMenu2(){
        System.out.println("Club Searching Options:");
        System.out.println("1 - Player(s) with the maximum salary of a club");
        System.out.println("2 - Player(s) with the maximum age of a club");
        System.out.println("3 - Player(s) with the maximum height of a club");
        System.out.println("4 - Total yearly salary of a club");
        System.out.println("5 - Back to Main Menu");
        System.out.print("Select an option: ");
    }

    public static void clubNotFound(){
        System.out.println("No such club with this name");
    }

}
