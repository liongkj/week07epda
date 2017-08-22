/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderFactorysuperheroteam;

import java.util.LinkedList;

/**
 *
 * @author xinquanteoh
 */
public class Main {

    public static void main(String[] args) {

        director dir = new director();
        teamBuilder newTeam = new xmenBuilder("w", "w");
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
    private String member1,member2;
    
    public xmenBuilder(String member_1, String member_2){
        this.member1 = member_1;
        this.member2 = member_2;
    }

    @Override
    public void addmember1() {
        myteam.addMember(MemberFactory.getMember(member1));
    }

    @Override
    public void addmember2() {
        myteam.addMember(MemberFactory.getMember(member2));
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

class MemberFactory{
    private static teammember m;
    
    public static teammember getMember(String member){
        if(member == "w"){
            m = new wolverine();
        }
        return m;
    }
}