import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ShowDoctorInfoComponent } from './show-doctor-info.component';

describe('ShowDoctorInfoComponent', () => {
  let component: ShowDoctorInfoComponent;
  let fixture: ComponentFixture<ShowDoctorInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientModule,HttpClientTestingModule,FormsModule],
      providers:[HttpClient],
      declarations: [ ShowDoctorInfoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowDoctorInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
