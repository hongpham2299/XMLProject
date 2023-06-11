package eventManagement.models;

public class Participant {

    private String participantId;
    private String participantName;
    private String email;
    private String phone;
    private PaymentDetails paymentDetails;

    public Participant(){}

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantId='" + participantId + '\'' +
                ", participantName='" + participantName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", paymentDetails=" + paymentDetails +
                '}';
    }
}

