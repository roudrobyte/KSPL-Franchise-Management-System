public class Franchise {
    public String teamName;
    public int squadMem;
    public double teamBudget;
    public String[] playerName;
    public double playerVal;
    public int[] jerseyNum;
    public int count = 0;

    public void initializeFranchise(String name, int sqCount, double budget) {
        teamName = name;
        squadMem = sqCount;
        teamBudget = budget;

        jerseyNum = new int[squadMem];
        playerName = new String[squadMem];

    }
    public void teamDetails(){
        System.out.println("Team: "+teamName);
        System.out.println("Budget: $"+teamBudget);
        System.out.println("Squad Status: "+count+"/"+squadMem+" players");
        if(count>0){
            System.out.println("Rosters: ");
            for(int i=0;i<squadMem;i++){
                if(playerName[i]==null){
                    continue;
                }
                else {
                    System.out.println((i + 1) + ". " + playerName[i] + " (Jersey: " + jerseyNum[i] + ")");
                }
            }
        }
        else{
            System.out.println("No players signed yet.");
        }
    }
    public void signPlayer(String pName, int jNum, double pBudget){

        if(count >= squadMem){
            System.out.println("Cannot sign " + pName + ": Squad is full!");
            return;
        }

        for(int i = 0; i < count; i++){
            if(jerseyNum[i] == jNum){
                System.out.println("Cannot sign " + pName + ": Jersey #" + jNum + " is already taken!");
                return;
            }
        }

        if(pBudget > teamBudget){
            System.out.println("Cannot sign " + pName + ": Insufficient budget!");
            return;
        }

        playerName[count] = pName;
        jerseyNum[count] = jNum;
        teamBudget -= pBudget;
        count++;

        System.out.println(pName + " has joined the squad!");
    }
    public void increaseBudget(double budget){
        teamBudget+=budget;
        System.out.println(teamName+" budget increased by $"+budget);
    }
}
