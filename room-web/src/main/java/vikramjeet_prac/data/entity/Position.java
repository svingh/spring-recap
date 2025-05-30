package vikramjeet_prac.data.entity; 

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString(){
        switch(this){
            case HOUSEKEEPING:
                return "houseKeeping";
            
            case FRONT_DESK:
                return "FRONT_DESK";
            
            case SECURITY:
                return "SECURITY";
            
            case CONCIERGE:
                return "CONCIERGE";
        }
        return "";
    }
}
