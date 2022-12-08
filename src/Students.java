public class Students {
    private String id;
    private String fullname;
    private String address;
    private String email;
    private String phoneNumber;

    public Students() {
    }

    public Students(String id, String fullname, String address, String email, String phoneNumber) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public void gotoSchool(){
        System.out.println("Tôi đang đi học và tôi tên là :"+fullname);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
