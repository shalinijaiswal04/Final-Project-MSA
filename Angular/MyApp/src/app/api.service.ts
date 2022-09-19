import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor, DoctorForm, Patient, PatientForm } from './MyComponents/data/hospital';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private PATIENT_BASEURL : string ="http://localhost:9092"
  private DOCTOR_BASEURL : string ="http://localhost:9091"
  constructor(private httpClient: HttpClient) { 

  }
  getDoctors(){
    return this.httpClient.get<Doctor[]>(this.DOCTOR_BASEURL+"/doctors")
  }
  savePatient(patientForm :PatientForm){
    let headers = new HttpHeaders({
      "Content-Type" :"application/json"
    })
    return this.httpClient.post<Patient>(this.PATIENT_BASEURL+"/patient/create",JSON.stringify(patientForm),{headers})
  }
  getDoctorById(id : number){
    return this.httpClient.get<Doctor>(this.DOCTOR_BASEURL+"/doctors/id/"+id)
  }
  getPatientById(id : number){
    return this.httpClient.get<Patient>(this.PATIENT_BASEURL+"/patient/id/"+id)
  }

  saveDoctor(doctorForm :DoctorForm){
    let headers = new HttpHeaders({
      "Content-Type" :"application/json"
    })
    return this.httpClient.post<Doctor>(this.DOCTOR_BASEURL+"/doctors/create",JSON.stringify(doctorForm),{headers})
  }
}
