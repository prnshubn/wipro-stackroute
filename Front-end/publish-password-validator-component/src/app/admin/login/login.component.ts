import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  msg = 'Password does not match the specified criteria';
  min = 8
  max = 20

  
   get msgval()  {
    return this.msg
  }
  get minval()  {
    return this.min
  }
  get maxval()  {
    return this.max
  }

  
  constructor() { }

  ngOnInit(): void {
  }

}
