import java.util.ArrayList;
import java.util.List;

public class Build {
    public static List<Club> buildUpClubList(List<Player> playerList){
        List<Club> clubList = new ArrayList();
        for(Player p: playerList){
            boolean b = false;
            for(int i = 0; i < clubList.size(); i++){
                Club c = clubList.get(i);
                if(c.getName().equalsIgnoreCase(p.getClub())){
                    b = true;
                    c.addPlayer(p);
                    break;
                }
            }
            if(!b){
                Club c = new Club();
                c.setName(p.getClub());
                c.addPlayer(p);
                clubList.add(c);
            }
        }
        return clubList;
    }

    public static List<Country> buildUpCountryList(List<Player> playerList){
        List<Country> countryList = new ArrayList();
        for(Player p: playerList){
            boolean b = false;
            for(int i = 0; i < countryList.size(); i++){
                Country c = countryList.get(i);
                if(c.getName().equalsIgnoreCase(p.getCountry())){
                    b = true;
                    c.increasePlayerCount();
                    break;
                }
            }
            if(!b){
                Country c = new Country();
                c.setName(p.getCountry());
                c.increasePlayerCount();
                countryList.add(c);
            }
        }
        return countryList;
    }

}
