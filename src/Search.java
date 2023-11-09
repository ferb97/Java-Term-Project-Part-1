import java.util.ArrayList;
import java.util.List;

public class Search {
    public static List<Player> searchByPlayerName(List<Player> playerList, String s){
        List<Player> playerList1 = new ArrayList();
        for(Player p: playerList){
            if(p.getName().equalsIgnoreCase(s)){
                playerList1.add(p);
            }
        }
        if(playerList1.size() == 0){
            System.out.println("No such player with this name");
        }
        return playerList1;
    }

    public static List<Player> searchByClubAndCountry(List<Player> playerList, String club_name, String country_name){
        List<Player> playerList1 = new ArrayList();
        for(Player p: playerList){
            if(p.getCountry().equalsIgnoreCase(country_name) && club_name.equalsIgnoreCase("ANY")){
                playerList1.add(p);
            }
            else if(p.getCountry().equalsIgnoreCase(country_name) && club_name.equalsIgnoreCase(p.getClub())){
                playerList1.add(p);
            }
        }
        if(playerList1.size() == 0){
            System.out.println("No such player with this country and club");
        }
        return playerList1;
    }

    public static List<Player> searchByPosition(List<Player> playerList, String position){
        List<Player> playerList1 = new ArrayList();
        for(Player p: playerList){
            if(p.getPosition().equalsIgnoreCase(position)){
                playerList1.add(p);
            }
        }
        if(playerList1.size() == 0){
            System.out.println("No such player with this position");
        }
        return playerList1;
    }

    public static List<Player> searchBySalaryRange(List<Player> playerList, Double lower_bound, Double upper_bound){
        List<Player> playerList1 = new ArrayList();
        for(Player p: playerList){
            if(lower_bound <= p.getWeeklySalary() && p.getWeeklySalary() <= upper_bound){
                playerList1.add(p);
            }
        }
        if(playerList1.size() == 0){
            System.out.println("No such player with this weekly salary range");
        }
        return playerList1;
    }

    public static Club searchClub(List<Club> clubList, String club_name) {
        Club c1 = new Club();
        for (Club c : clubList) {
            if (c.getName().equalsIgnoreCase(club_name)) {
                c1 = c;
                break;
            }
        }
        return c1;
    }
}
