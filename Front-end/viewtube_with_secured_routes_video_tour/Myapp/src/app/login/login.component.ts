import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public LoginForm= new FormGroup({});
  constructor(private form:FormBuilder,private route:Router,private http:HttpClient,private _snackBar: MatSnackBar,private auth:AuthService) {
    this.LoginForm=this.form.group({
      email:new FormControl('',[Validators.required,Validators.pattern('[a-z0-9]+@[a-z]+\.[a-z]{2,3}')]),
      password:new FormControl('',[Validators.required]),
      })
  }

  ngOnInit(): void {
  }
onLogin(){
  this.http.get<any>(' http://localhost:3000/Users').subscribe(res=>{
    const user=res.find((a:any)=>{
        return (a.email===this.LoginForm.value.email && a.password===this.LoginForm.value.password);
    });
    if(user){
      this.LoginForm.reset();
      this._snackBar.open('User Logged In', '', {
        duration: 5000
      })
      this.auth.isLoggedIn=true;
      this.route.navigate(['/']);
    }
    else{
      this._snackBar.open('Invalid Email/Password', '', {
        duration: 4000
      })
      this.LoginForm.reset();
      this.LoginForm.controls['email'].setErrors(null);
      this.LoginForm.controls['password'].setErrors(null);
    }
  },error=>{
    this._snackBar.open('Something Went Wrong', '', {
      duration: 4000
    })
  });
}

}