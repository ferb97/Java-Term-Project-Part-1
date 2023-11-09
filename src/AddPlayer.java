import java.util.List;

public class AddPlayer {

    public static Player takeInput(){
        System.out.print("Enter Player Name: ");
        String name = Input.takeString();
        System.out.print("Enter Country: ");
        String country = Input.takeString();
        System.out.print("Enter Age: ");
        int age = Input.takeIntAsAge();
        System.out.print("Enter Height: ");
        double height = Input.takeDoubleAsHeight();
        System.out.print("Enter Club: ");
        String club = Input.takeString();
        System.out.print("Enter Position: ");
        String position;
        while (true) {
            position = Input.takeString();
            if (position.equalsIgnoreCase("Goalkeeper"))
                break;
            else if (position.equalsIgnoreCase("Defender"))
                break;
            else if (position.equalsIgnoreCase("Midfielder"))
                break;
            else if (position.equalsIgnoreCase("Forward"))
                break;
            else
                Print.invalidInput();
            System.out.print("Enter Position: ");
        }
        System.out.print("Enter Number: ");
        int number = Input.takeIntAsNumber();
        System.out.print("Enter Weekly Salary: ");
        double weeklySalary = Input.takeDoubleAsWeeklySalary();
        Player p = new Player(name, country, age, height, club, position, number, weeklySalary);
        return p;
    }

    public static boolean checkPlayerName(List<Player> playerList, Player p1){
        for(Player p: playerList){
            if(p.getName().equalsIgnoreCase(p1.getName()))
                return false;
        }
        return true;
    }

    public static boolean checkClubPlayerCount(List<Club> clubList, Player p){
        for(Club c: clubList){
            if(c.getName().equalsIgnoreCase(p.getClub())){
                if(c.getPlayerCount() == 7)
                    return false;
                break;
            }
        }
        return true;
    }

    public static boolean checkNumber(List<Club> clubList, Player p){
        Player[] playerArray = new Player[7];
        int playerCount = 0;
        boolean b = false;
        for(Club c: clubList){
            if(c.getName().equalsIgnoreCase(p.getClub())){
                playerArray = c.getPlayerArray();
                b = true;
                playerCount = c.getPlayerCount();
                break;
            }
        }
        if(!b)
            return true;
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getNumber() == p.getNumber())
                return false;
        }
        return true;
    }
}
