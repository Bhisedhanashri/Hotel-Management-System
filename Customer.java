package oops1;


public class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        setName(name);
        setEmail(email);
        setPhone(phone);
    }

    public String getName() { return name; }
    public void setName(String name) { if(!name.isEmpty()) this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { if(email.contains("@")) this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { if(phone.length()>=10) this.phone = phone; }

    @Override
    public String toString() {
        return name + " | Email: " + email + " | Phone: " + phone;
    }
}

