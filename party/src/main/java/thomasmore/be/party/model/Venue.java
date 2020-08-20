package thomasmore.be.party.model;

public class Venue {
    private int id;
    private String venueName;
    private boolean infoAvailableMaxNumberOfPersons=false;
    private int maxNumberOfPersons=0;
    private boolean areOwnDrinksAllowed=false;
    private boolean isFoodPossible=false;
    private String linkMoreInfo;

    public Venue(int id, String venueName, boolean infoAvailableMaxNumberOfPersons, int maxNumberOfPersons, boolean areOwnDrinksAllowed, boolean isFoodPossible, String linkMoreInfo) {
        this.id = id;
        this.venueName = venueName;
        this.infoAvailableMaxNumberOfPersons = infoAvailableMaxNumberOfPersons;
        this.maxNumberOfPersons = maxNumberOfPersons;
        this.areOwnDrinksAllowed = areOwnDrinksAllowed;
        this.isFoodPossible = isFoodPossible;
        this.linkMoreInfo = linkMoreInfo;
    }
    public Venue(int id, String venueName, boolean areOwnDrinksAllowed, boolean isFoodPossible, String linkMoreInfo) {
        this.id = id;
        this.venueName = venueName;
        this.areOwnDrinksAllowed = areOwnDrinksAllowed;
        this.isFoodPossible = isFoodPossible;
        this.linkMoreInfo = linkMoreInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public boolean isInfoAvailableMaxNumberOfPersons() {
        return infoAvailableMaxNumberOfPersons;
    }

    public void setInfoAvailableMaxNumberOfPersons(boolean infoAvailableMaxNumberOfPersons) {
        this.infoAvailableMaxNumberOfPersons = infoAvailableMaxNumberOfPersons;
    }

    public int getMaxNumberOfPersons() {
        return maxNumberOfPersons;
    }

    public void setMaxNumberOfPersons(int maxNumberOfPersons) {
        this.maxNumberOfPersons = maxNumberOfPersons;
        this.infoAvailableMaxNumberOfPersons = true;
    }

    public boolean isOwnDrinkAllowed() {
        return areOwnDrinksAllowed;
    }

    public void setAreOwnDrinksAllowed(boolean areOwnDrinksAllowed) {
        this.areOwnDrinksAllowed = areOwnDrinksAllowed;
    }

    public boolean isFoodPossible() {
        return isFoodPossible;
    }

    public void setFoodPossible(boolean foodPossible) {
        isFoodPossible = foodPossible;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", venueName='" + venueName + '\'' +
                ", infoAvailableMaxNumberOfPersons=" + infoAvailableMaxNumberOfPersons +
                ", maxNumberOfPersons=" + maxNumberOfPersons +
                ", areOwnDrinksAllowed=" + areOwnDrinksAllowed +
                ", isFoodPossible=" + isFoodPossible +
                ", linkMoreInfo='" + linkMoreInfo + '\'' +
                '}';
    }
}
