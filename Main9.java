/*Hospital Management

Classes:

Patient
Doctor
Appointment

Display appointment details.

Concept: Association */
// Patient Class
class Patient1{
    String name="Dhaniya";
}
class Doctor1{
    String name="Dr.Ranjith";
}
class Appointment1 {
    void display(Patient1 patient,Doctor1 doctor) {
        System.out.println("Appointment Details");
        System.out.println("Patient Name:"+patient.name);
        System.out.println("Doctor Name: "+doctor.name);
    }
}
public class Main9 {
    public static void main(String[] args) {
        Patient1 patient=new Patient1();
        Doctor1 doctor=new Doctor1();
        Appointment1 appointment=new Appointment1();
        appointment.display(patient, doctor);
    }
}