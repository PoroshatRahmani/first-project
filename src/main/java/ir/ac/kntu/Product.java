package ir.ac.kntu;

public class Product {
    private String name;
    private Branch branch;
    private Customer receiver;
    private City origin;
    private City destination;
    private int weight;
    private Date sendDate;
    private Date receiveDate;
    private SystemSend sendSystem;
    private SystemPost postSystem;
    private Condition condition;

    public Product(String name, Branch branch,Customer receiver, City origin, City destination,
                   int weight, Date sendDate, Date receiveDate, SystemSend sendSystem,
                   SystemPost postSystem) {
        this.name = name;
        this.branch = branch;
        this.receiver = receiver;
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.sendDate = sendDate;
        this.receiveDate = receiveDate;
        this.sendSystem = sendSystem;
        this.postSystem = postSystem;
        this.condition = Condition.Warehouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public SystemSend getSendSystem() {
        return sendSystem;
    }

    public void setSendSystem(SystemSend sendSystem) {
        this.sendSystem = sendSystem;
    }

    public SystemPost getPostSystem() {
        return postSystem;
    }

    public void setPostSystem(SystemPost postSystem) {
        this.postSystem = postSystem;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", branch=" + branch +
                ", receiver=" + receiver +
                ", origin=" + origin +
                ", destination=" + destination +
                ", weight=" + weight +
                ", sendDate=" + sendDate +
                ", receiveDate=" + receiveDate +
                ", sendSystem=" + sendSystem +
                ", postSystem=" + postSystem +
                ", condition=" + condition +
                '}';
    }
}

