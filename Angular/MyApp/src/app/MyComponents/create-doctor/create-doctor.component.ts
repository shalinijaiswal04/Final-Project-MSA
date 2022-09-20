import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ApiService } from 'src/app/api.service';
import { DoctorForm } from '../data/hospital';

@Component({
  selector: 'app-create-doctor',
  templateUrl: './create-doctor.component.html',
  styleUrls: ['./create-doctor.component.css']
})
export class CreateDoctorComponent implements OnInit {

  doctorForm : DoctorForm= new DoctorForm()
  constructor(private apiService :ApiService ,private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    
  }
  onSubmit(){
    this.apiService.saveDoctor(this.doctorForm).subscribe(
      data =>{
        console.log(data)
        this.doctorForm=new DoctorForm();
        this.openSnackBar("Doctor Registered Successfully")
    })
  }
  openSnackBar(message :string){
    this._snackBar.open(message,"",{duration:10000,});
    
  }

}
