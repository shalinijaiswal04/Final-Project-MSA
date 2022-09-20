import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CreateDoctorComponent } from './create-doctor.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatSnackBar } from '@angular/material/snack-bar';
describe('CreateDoctorComponent', () => {
  let component: CreateDoctorComponent;
  let fixture: ComponentFixture<CreateDoctorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      // imports:[HttpClientTestingModule,ReactiveFormsModule],
      imports:[HttpClientModule,HttpClientTestingModule,MatSnackBarModule,FormsModule],
      providers:[HttpClient,MatSnackBar],
      declarations: [ CreateDoctorComponent ]
    })
    .compileComponents(); 

    fixture = TestBed.createComponent(CreateDoctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
