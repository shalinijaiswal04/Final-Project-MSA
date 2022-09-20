import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ShowPatientComponent } from './show-patient.component';


describe('ShowPatientComponent', () => {
  let component: ShowPatientComponent;
  let fixture: ComponentFixture<ShowPatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientModule,HttpClientTestingModule,FormsModule],
      providers:[HttpClient],
      declarations: [ ShowPatientComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowPatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
