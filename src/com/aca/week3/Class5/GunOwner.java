/*
public class GunOwner {
    private final String ownerName;
    private final Gun gun;

    public GunOwner(String ownerName, Gun gun) {
        // either here check, or in equals method
        if(ownerName == null || gun == null) {
            throw new RuntimeException();
        }
        this.ownerName = ownerName;
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Owner name: " + ownerName + "/ Gun: " + gun.toString();
    }
    public boolean equals(final Object o) {
        if( o == null) {
            return false;
        }
        if( !(o instanceof GunOwner)){
            return false;
        }
        GunOwner gunOwner = (GunOwner) o;
        return this.gun.equals(gunOwner.gun) &&
                this.ownerName.equals(gunOwner.ownerName);
    }


}


 */
