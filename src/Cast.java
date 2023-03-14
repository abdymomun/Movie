public class Cast {
    private String actorFullName;
    private String role;


    public Cast(String actorFullName, String role) {
        this.actorFullName = actorFullName;
        this.role = role;
    }

    public String getActorFullName() {
        return actorFullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return " " +
                " Афтор " + actorFullName +
                " В роле: " + role +
                "в фильме" ;
    }
}
