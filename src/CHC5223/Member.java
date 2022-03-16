package CHC5223;

import CHC5223.IMember;

public class Member implements IMember {

    private String name;

    private String affiliation;

    public Member() {
    }

    public Member(String name, String affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAffiliation() {
        return affiliation;
    }

    @Override
    public String toString() {
        return "CHC5223.Member{" +
                "name='" + name + '\'' +
                ", affiliation='" + affiliation + '\'' +
                '}';
    }
}
