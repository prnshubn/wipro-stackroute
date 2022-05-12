import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'viewTube';
  public loggedIn:boolean=false;
  constructor(private auth:AuthService){
    this.loggedIn=this.auth.isLoggedIn;
  }
  logout(){
    this.auth.isLoggedIn=false;
  }

}