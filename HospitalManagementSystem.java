package WK_7;

/**
 * Person is the parent class that stores common details
 * of patients and doctors.
 */
class Person {
    String personID;
    String name;
    int age;
    String gender;

    /**
     * Constructor for Person class
     */
    public Person(String personID, String name, int age, String gender) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Displays personal details
     */
    public void viewPersonalDetails() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

/**
 * Patient class represents a patient in the hospital.
 */
class Patient extends Person {
    String patientID;

    /**
     * Constructor for Patient class
     */
    public Patient(String personID, String name, int age, String gender, String patientID) {
        super(personID, name, age, gender);
        this.patientID = patientID;
    }

    /**
     * Books an appointment with a doctor
     */
    public void bookAppointment(Doctor doctor) {
        System.out.println(name + " booked an appointment with Dr. " + doctor.name);
    }
}

/**
 * Doctor class represents a doctor in the hospital.
 */
class Doctor extends Person {
    String doctorID;
    String department;

    /**
     * Constructor for Doctor class
     */
    public Doctor(String personID, String name, int age, String gender,
                  String doctorID, String department) {
        super(personID, name, age, gender);
        this.doctorID = doctorID;
        this.department = department;
    }

    /**
     * Doctor sees patient details
     */
    public void seePatientDetails(Patient patient) {
        System.out.println("Doctor is viewing details of " + patient.name);
    }

    /**
     * Doctor prescribes treatment
     */
    public void prescribeTreatment(Treatment treatment) {
        System.out.println("Treatment prescribed: " + treatment.description);
    }
}

/**
 * Appointment class stores appointment details.
 */
class Appointment {
    String appointmentID;
    String date;
    String time;

    /**
     * Constructor for Appointment
     */
    public Appointment(String appointmentID, String date, String time) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
    }

    /**
     * Displays appointment details
     */
    public void viewAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}

/**
 * Treatment class stores treatment information.
 */
class Treatment {
    String treatmentID;
    String description;

    /**
     * Constructor for Treatment
     */
    public Treatment(String treatmentID, String description) {
        this.treatmentID = treatmentID;
        this.description = description;
    }

    /**
     * Displays treatment details
     */
    public void viewTreatmentDetails() {
        System.out.println("Treatment: " + description);
    }
}

/**
 * Main class to test Hospital Management System.
 */
public class HospitalManagementSystem {

    /**
     * Main method
     */
    public static void main(String[] args) {

        Doctor d1 = new Doctor("D01", "Dr. Alex", 40, "Male", "DOC100", "Cardiology");
        Patient p1 = new Patient("P01", "Emma", 22, "Female", "PAT200");
        Treatment t1 = new Treatment("T01", "Pain relief medicine");

        p1.bookAppointment(d1);
        d1.seePatientDetails(p1);
        d1.prescribeTreatment(t1);
    }
}
