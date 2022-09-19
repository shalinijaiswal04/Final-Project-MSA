export class Patient {
    patientId!: number
    patientAge !: number
    patientName!: string
    visitedDoctor!: Doctor
    dateOfVisit!: Date
    doctorPrescription !: String

}
export class PatientForm {
    patientName!: string
    patientAge !: number
    visitedDoctor!: string
    dateOfVisit!: Date
    doctorPrescription !: String

}
export class Doctor {
    doctorId!: number
    doctorName!: string
    doctorAge!: string
    doctorGender!: string
    specialist !:string
    totalPatient !: number

}
export class DoctorForm {
    doctorName!: string
    doctorAge!: string
    doctorGender!: string
    specialist !:string


}
