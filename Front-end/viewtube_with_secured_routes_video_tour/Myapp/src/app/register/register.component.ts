import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
 import { ConfirmedValidator } from './ConfirmedValidator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public registerForm= new FormGroup({});
  constructor(private form:FormBuilder,private route:Router,private http:HttpClient,private _snackBar: MatSnackBar) {
    this.registerForm=this.form.group({
      email:new FormControl('',[Validators.required,Validators.pattern('[a-z0-9]+@[a-z]+\.[a-z]{2,3}')]),
      password:new FormControl('',[Validators.required]),
      passwordConfirm:new FormControl('',[Validators.required]),
      checkBox:new FormControl('',)},{
         validator: ConfirmedValidator()
      });  
  }//constructor

    
 

  onRegister(){
      this.http.post<any>(' http://localhost:3000/Users',this.registerForm.value).subscribe(()=>{
         this._snackBar.open('User Registered', '', {
        duration: 5000
      })
        this.registerForm.reset();
        this.route.navigate(['/login']);
      },error=>{
        this._snackBar.open('Something Went Wrong!!', '', {
          duration: 5000
        })
      });
     
    }
  ngOnInit(): void {
  }

}