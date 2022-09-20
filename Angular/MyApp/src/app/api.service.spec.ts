import { TestBed } from '@angular/core/testing';

import { ApiService } from './api.service';
import { HttpClientModule, HttpClient } from '@angular/common/http'; 
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { FormsModule } from '@angular/forms';

 

describe('ApiService', () => {
  let service: ApiService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientModule,HttpClientTestingModule,FormsModule],
      providers:[HttpClient],
      
    })
    .compileComponents();

    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
