package structural.composite;

public class Company {
    public static void main( final String[] args ) {

        TeamMember teamMember = new TeamMember("Mehmet","1234");
        TeamMember teamMember1 = new TeamMember("Hasan","12345");
        TeamMember teamMember2 = new TeamMember("Ali","123467");


        TeamManager teamManager1 = new TeamManager();
        TeamManager teamManager2 = new TeamManager();
        TeamManager ceo = new TeamManager();

        teamManager1.addTeamMember(teamMember);

        teamManager2.addTeamMember(teamMember1);
        teamManager2.addTeamMember(teamMember2);

        ceo.addTeamMember(teamManager1);
        ceo.addTeamMember(teamManager2);

        ceo.printInformations();


    }

}
