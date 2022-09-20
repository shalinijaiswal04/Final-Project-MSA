import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HospitalComponent } from './MyComponents/hospital/hospital.component';
import { ShowPatientComponent } from './MyComponents/show-patient/show-patient.component';
import { CreatePatientComponent } from './MyComponents/create-patient/create-patient.component';
import { ShowDoctorInfoComponent } from './MyComponents/show-doctor-info/show-doctor-info.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreateDoctorComponent } from './MyComponents/create-doctor/create-doctor.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatSnackBarModule } from '@angular/material/snack-bar';


@NgModule({
  declarations: [
    AppComponent,
    HospitalComponent,
    ShowPatientComponent,
    CreatePatientComponent,
    ShowDoctorInfoComponent,
    CreateDoctorComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatSnackBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
