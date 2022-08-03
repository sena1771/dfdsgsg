

class Transportation  {
    private String transportation_name;
    private int transportation_id;
    private String transportation_branch;

    public Transportation(int transportation_id,String transportation_name,String transportation_branch) {
        this.setTransportation_id(transportation_id);
        this.setTransportation_branch(transportation_branch);
        this.setTransportation_name(transportation_name);
    }


    public String getTransportation_name() {
        return transportation_name;
    }

    public void setTransportation_name(String transportation_name) {
        this.transportation_name = transportation_name;
    }

    public int getTransportation_id() {
        return transportation_id;
    }

    public void setTransportation_id(int transportation_id) {
        this.transportation_id = transportation_id;
    }

    public String getTransportation_branch() {
        return transportation_branch;
    }

    public void setTransportation_branch(String transportation_branch) {
        this.transportation_branch = transportation_branch;
    }
}
