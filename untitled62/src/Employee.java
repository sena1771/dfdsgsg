import java.util.ArrayList;

class Employee extends  Branch {

    private int employee_id;
    private String employee_name;
    private String employee_branch;
    private int branch_id;

    public Employee(int employee_id, String employee_name,int branch_id,String employee_branch) {
        super(branch_id,employee_branch);
        this.setId(employee_id);
        this.setName(employee_name);
        this.setEmployee_branch(employee_branch);
        this.setBranch_id(branch_id);

    }

    static void display_customer(ArrayList<Customer> customerArrayList) {
        System.out.println("\n--------------Customer List---------------\n");
        System.out.println(String.format("%-10s%-20s", "ID", "Name"));
        for (Customer a : customerArrayList) {
            System.out.println(String.format("%-10s%-20s", a.getCustomer_id(), a.getCustomer_name()));
        }
    }

    public int getId() {
        return employee_id;
    }

    public void setId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return employee_name;
    }

    public void setName(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_branch() {
        return employee_branch;
    }

    public void setEmployee_branch(String employee_branch) {
        this.employee_branch = employee_branch;
    }

    @Override
    public int getBranch_id() {
        return branch_id;
    }

    @Override
    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }
}

