import { Component, OnInit } from '@angular/core';
import { CreateDoctorComponent } from '../create-doctor/create-doctor.component';
import { CreatePatientComponent } from '../create-patient/create-patient.component';
import { ShowDoctorInfoComponent } from '../show-doctor-info/show-doctor-info.component';
import { ShowPatientComponent } from '../show-patient/show-patient.component';

@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit {
  tabs = [{ caption: 'Show Doctor Information', content: ShowDoctorInfoComponent, active:true, url:"show-doctor", name:"Who all doctor are available?" },
  { caption: 'Show Patient Information', content: ShowPatientComponent, active:false, url:"show-patient", name:"Which Pateint are you searching for ?" },
  { caption: 'Create Doctor', content: CreateDoctorComponent, active:false, url:"create-patient", name:"Create Your Docotor" },
  { caption: 'Create Patient', content:CreatePatientComponent, active:false, url:"create-patient", name:"Create Your Patient" },
];
  container: any;
  cardHeader:string = "";

  constructor() { }

  component:any 
  ngOnInit(): void {
    this.updateContent(this.tabs[0])
  }
  updateContent(tab: any) {
    this.container = tab.content
    this.tabs.forEach(element => {
      element.active=false
    });
    tab.active=true
    this.cardHeader = tab.name;
    console.log("current tab->",tab)
  }

}


