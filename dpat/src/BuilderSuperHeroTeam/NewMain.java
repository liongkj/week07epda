/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderSuperHeroTeam;

import java.util.LinkedList;

/**
 *
 * @author xinquanteoh
 */
public class NewMain {

    public static void main(String[] args) {
        teamBuilder newTeam = new xmenBuilder();
        director dir = new director();
        dir.buildteam(newTeam);

        team team1 = newTeam.getTeam();
    }
}

class teammember {
}

class wolverine extends teammember {
}

class cyclops extends teammember {
}

class collosus extends teammember {
}

class Ironman extends teammember {
}

class Hulk extends teammember {
}

class Thor extends teammember {
}

class team {

    LinkedList<teammember> TeamMember = new LinkedList<teammember>();

    public void addMember(teammember t) {
        TeamMember.addLast(t);
    }
}

interface teamBuilder {

    public void addmember1();

    public void addmember2();

    public team getTeam();
}

class xmenBuilder implements teamBuilder {

    private team myteam;

    @Override
    public void addmember1() {
        myteam.addMember(new wolverine());
    }

    @Override
    public void addmember2() {
        myteam.addMember(new cyclops());
    }

    @Override
    public team getTeam() {
        return myteam;
    }

}

class AvengerBuilder implements teamBuilder {

    private team myteam;

    @Override
    public void addmember1() {
        myteam.addMember(new Thor());
    }

    @Override
    public void addmember2() {
        myteam.addMember(new Ironman());
    }

    @Override
    public team getTeam() {
        return myteam;
    }

}

class director {

    private teamBuilder TB;

    public void buildteam(teamBuilder t) {
        TB = t;
        TB.addmember1();
        TB.addmember2();
    }
}
