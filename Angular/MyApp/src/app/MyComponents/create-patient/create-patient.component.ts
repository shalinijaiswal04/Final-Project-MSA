import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ApiService } from 'src/app/api.service';
import { Doctor, PatientForm } from '../data/hospital';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {
  patientForm : PatientForm = new PatientForm()
  doctorList : Doctor[]= []
  constructor(private apiService :ApiService, private _snackBar: MatSnackBar) {

   }

  ngOnInit(): void {
    this.apiService.getDoctors().subscribe(
      data => {
        this.doctorList=data
      }
    )

  }

  onSubmit(){
    this.apiService.savePatient(this.patientForm).subscribe(
      data =>{
        console.log(data)
        this.patientForm= new PatientForm();
        this.openSnackBar("Patient Registered Successfully")
    })
  }

  openSnackBar(message :string){
    this._snackBar.open(message,"",{duration:2000,});
    
  }
}
