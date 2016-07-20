package thegenuinegourav.jsonparser;

public class Celebs {

    private String name;
    private String followers;
    private String profession;
    public Celebs() {
        // TODO Auto-generated constructor stub
    }

    public Celebs(String name, String followers, String profession, String country,
                  String height, String spouse, String children, String image) {
        super();
        this.name = name;
        this.followers = followers;
        this.profession = profession;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfollowers() {
        return followers;
    }

    public void setfollowers(String followers) {
        this.followers = followers;
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String profession) {
        this.profession = profession;
    }

}

