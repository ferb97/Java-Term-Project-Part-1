import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        List<Player> playerList = FileOperation.readFromFile();
        List<Club> clubList = Build.buildUpClubList(playerList);
        List<Country> countryList = Build.buildUpCountryList(playerList);
        while(true) {
            Print.mainMenu();
            int num = Input.takeIntAsOption();
            if (num == 4) {
                break;
            } else if (num > 4) {
                Print.invalidInput();
            } else if (num == 1) {
                while (true) {
                    Print.subMenu1();
                    int num1 = Input.takeIntAsOption();
                    if (num1 == 1) {
                        System.out.print("Enter Player Name: ");
                        String player_name = Input.takeString();
                        List<Player> playerList1 = Search.searchByPlayerName(playerList, player_name);
                        Print.playerListInfo(playerList1);
                    } else if (num1 == 2) {
                        System.out.print("Enter Country Name: ");
                        String country_name = Input.takeString();
                        System.out.print("Enter Club Name: ");
                        String club_name = Input.takeString();
                        List<Player> playerList1 = Search.searchByClubAndCountry(playerList, club_name, country_name);
                        Print.playerListInfo(playerList1);
                    } else if (num1 == 3) {
                        System.out.print("Enter a position: ");
                        String position = Input.takeString();
                        List<Player> playerList1 = Search.searchByPosition(playerList, position);
                        Print.playerListInfo(playerList1);
                    } else if (num1 == 4) {
                        System.out.print("Enter Lower Bound of Salary: ");
                        double lower_bound = Input.takeDoubleAsLowerBoundSalary();
                        System.out.print("Enter Upper Bound of Salary: ");
                        double upper_bound = Input.takeDoubleAsUpperBoundSalary();
                        List<Player> playerList1 = Search.searchBySalaryRange(playerList, lower_bound, upper_bound);
                        Print.playerListInfo(playerList1);
                    } else if (num1 == 5) {
                        Print.countrywisePlayerCount(countryList);
                    } else if (num1 == 6) {
                        break;
                    } else {
                        Print.invalidInput();
                    }
                }
            } else if (num == 2) {
                while (true) {
                    Print.subMenu2();
                    int num2 = Input.takeIntAsOption();
                    if (num2 == 1) {
                        System.out.print("Enter Club Name: ");
                        String club_name = Input.takeString();
                        Club c = Search.searchClub(clubList, club_name);
                        if(c.getPlayerCount() == 0){
                           Print.clubNotFound();
                        }
                        List<Player> playerList1 = c.playersWithMaximumSalary();
                        Print.playerListInfo(playerList1);
                    } else if (num2 == 2) {
                        System.out.print("Enter Club Name: ");
                        String club_name = Input.takeString();
                        Club c = Search.searchClub(clubList, club_name);
                        if(c.getPlayerCount() == 0){
                            Print.clubNotFound();
                        }
                        List<Player> playerList1 = c.playersWithMaximumAge();
                        Print.playerListInfo(playerList1);
                    } else if (num2 == 3) {
                        System.out.print("Enter Club Name: ");
                        String club_name = Input.takeString();
                        Club c = Search.searchClub(clubList, club_name);
                        if(c.getPlayerCount() == 0){
                            Print.clubNotFound();
                        }
                        List<Player> playerList1 = c.playersWithMaximumHeight();
                        Print.playerListInfo(playerList1);
                    } else if (num2 == 4) {
                        System.out.print("Enter Club Name: ");
                        String club_name = Input.takeString();
                        Club c = Search.searchClub(clubList, club_name);
                        if(c.getPlayerCount() == 0){
                            Print.clubNotFound();
                        }
                        else {
                            System.out.print("Total Yearly Salary of " + club_name + " = ");
                            System.out.printf("%.1f\n", c.totalYearlySalary());
                        }
                    } else if (num2 == 5) {
                        break;
                    }
                    else {
                        Print.invalidInput();
                    }
                }
            } else if (num == 3) {
                Player p = AddPlayer.takeInput();
                if(!AddPlayer.checkPlayerName(playerList, p)){
                    System.out.println("Player name is not unique. Cannot add player");
                }
                else if(!AddPlayer.checkClubPlayerCount(clubList, p)){
                    System.out.println(p.getClub() + " has already 7 players. Cannot add player");
                }
                else if(!AddPlayer.checkNumber(clubList, p)){
                    System.out.println("Number " + p.getNumber() + " in " + p.getClub() + " is already taken. Cannot add player");
                }
                else{
                    System.out.println("Player added successfully");
                    playerList.add(p);
                    Update.updateClubList(clubList, p);
                    Update.updateCountryList(countryList, p);
                }
            }
        }
        FileOperation.writeToFile(playerList);
    }
}
