class Branch  {
    private int branch_id;
    private   String branch_name;

    public Branch(int branch_id,String branch_name) {
        this.branch_name = branch_name;
        this.branch_id=branch_id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
}
