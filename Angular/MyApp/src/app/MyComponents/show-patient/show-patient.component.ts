import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/api.service';
import { Patient } from '../data/hospital';

@Component({
  selector: 'app-show-patient',
  templateUrl: './show-patient.component.html',
  styleUrls: ['./show-patient.component.css']
})
export class ShowPatientComponent implements OnInit {

  showTable =false
  patient: Patient = new Patient()
  id?: number
  constructor(private apiService :ApiService) { }

  ngOnInit(): void {
  }

  toggleShowTable(){
    if(this.id !=undefined)
    this.apiService.getPatientById(this.id).subscribe(data => {
      this.patient=data
      this.showTable =true
    })

  }

}
