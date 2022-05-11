import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormBuilder } from '@angular/forms';
import { TimeValidation } from './TimeValidation';
import {MatSnackBar} from '@angular/material/snack-bar';
@Component({
  selector: 'app-live',
  templateUrl: './live.component.html',
  styleUrls: ['./live.component.css']
})
export class LiveComponent implements OnInit {
  

  constructor(private fb: FormBuilder,private _snackBar: MatSnackBar) { 
    
  }
  startDate = new FormControl(new Date());
  endDate = new FormControl(new Date());
 
  minDate = new Date();

  ngOnInit(): void {
   
  }

  liveForm = this.fb.group({
    title: ['', [Validators.required]],
    startDate: ['', Validators.required],
    startTime: ['', [Validators.required,TimeValidation]],
    endTime: ['', [Validators.required,TimeValidation]],
    endDate: ['', Validators.required],
    eventDetails: ['', Validators.required],
    guest: ['', Validators.required],
  }, {});

  onSubmit() {
    this._snackBar.open('Your live stream has been schedule', '', {
      duration: 3000
  });
  this.liveForm.reset();
}


}
