import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private Player[] playerArray;
    private int playerCount;

    public Club(){
        playerArray = new Player[7];
        playerCount = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addPlayer(Player p){
        playerArray[playerCount] = p;
        playerCount++;
    }

    public int getPlayerCount(){
        return playerCount;
    }

    public Player[] getPlayerArray(){
        return playerArray;
    }

    public List<Player> playersWithMaximumSalary(){
        double max_salary = 0;
        Player[] playerArray = getPlayerArray();
        int playerCount = getPlayerCount();
        List<Player> playerList1 = new ArrayList();
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getWeeklySalary() > max_salary){
                max_salary = playerArray[i].getWeeklySalary();
            }
        }
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getWeeklySalary() == max_salary){
                playerList1.add(playerArray[i]);
            }
        }
        return playerList1;
    }

    public List<Player> playersWithMaximumAge(){
        int max_age = 0;
        Player[] playerArray = getPlayerArray();
        int playerCount = getPlayerCount();
        List<Player> playerList1 = new ArrayList();
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getAge() > max_age){
                max_age = playerArray[i].getAge();
            }
        }
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getAge() == max_age){
                playerList1.add(playerArray[i]);
            }
        }
        return playerList1;
    }

    public List<Player> playersWithMaximumHeight(){
        double max_height = 0;
        Player[] playerArray = getPlayerArray();
        int playerCount = getPlayerCount();
        List<Player> playerList1 = new ArrayList();
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getHeight() > max_height){
                max_height = playerArray[i].getHeight();
            }
        }
        for(int i = 0; i < playerCount; i++){
            if(playerArray[i].getHeight() == max_height){
                playerList1.add(playerArray[i]);
            }
        }
        return playerList1;
    }

    public double totalYearlySalary(){
        double totalSalary = 0;
        Player[] playerArray = getPlayerArray();
        int playerCount = getPlayerCount();
        for(int i = 0; i < playerCount; i++){
            totalSalary = totalSalary + playerArray[i].getWeeklySalary() * 52;
        }
        return totalSalary;
    }

}
