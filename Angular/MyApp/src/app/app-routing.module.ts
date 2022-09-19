import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateDoctorComponent } from './MyComponents/create-doctor/create-doctor.component';
import { CreatePatientComponent } from './MyComponents/create-patient/create-patient.component';
import { HospitalComponent } from './MyComponents/hospital/hospital.component';
import { ShowDoctorInfoComponent } from './MyComponents/show-doctor-info/show-doctor-info.component';
import { ShowPatientComponent } from './MyComponents/show-patient/show-patient.component';

const routes: Routes = [
  // {path:"", redirectTo:"hospital"},
  {path:"hospital",title:"Hospital",component:HospitalComponent},
  {path:"create-doctor",title:"Create Doctor",component:CreateDoctorComponent},
  {path:"create-patient",title:"Create Patient",component:CreatePatientComponent},
  {path:"show-patient",title:"Show Patient",component:ShowPatientComponent},
  {path:"show-doctor",title:"Show Doctor",component:ShowDoctorInfoComponent},
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
