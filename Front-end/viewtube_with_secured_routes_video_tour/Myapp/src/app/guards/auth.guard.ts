import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from '../services/auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  // constructor(private router:Router){}
  //   canActivate(){
  //     if(false)
  //     return true;
  //     else{
  //       this.router.navigate(['/login'])
  //       return false;
  //     }
     
  //   }
    constructor(private router:Router,private auth:AuthService){}
    canActivate()
     {
           
           if(this.auth.isLoggedIn)
                 return true;
           else{
            this.router.navigate(['/login']);
            return false;  
          }
                   
    }

  
  
 
  
}
