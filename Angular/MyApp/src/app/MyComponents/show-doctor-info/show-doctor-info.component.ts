import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/api.service';
import { Doctor } from '../data/hospital';

@Component({
  selector: 'app-show-doctor-info',
  templateUrl: './show-doctor-info.component.html',
  styleUrls: ['./show-doctor-info.component.css']
})
export class ShowDoctorInfoComponent implements OnInit {
  doctorList : Doctor[]= []
  selectedDoctor :Doctor = new Doctor() 
  showTable =false
  constructor(private apiService :ApiService) { }

  ngOnInit(): void {
    this.apiService.getDoctors().subscribe(
      data => {
        this.doctorList=data
      }
    )
  }
  selectDoctor(){
    this.apiService.getDoctorById(this.selectedDoctor.doctorId).subscribe(
      data => {
        this.selectedDoctor=data
        this.showTable =true
      }
    )
  }

}
