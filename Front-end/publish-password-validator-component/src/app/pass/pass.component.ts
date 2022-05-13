import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../admin/login/login.component';


@Component({
  selector: 'app-pass',
  templateUrl: './pass.component.html',
  styleUrls: ['./pass.component.css']
})
export class PassComponent implements OnInit {
  clickme(a:string){

    let out=document.querySelector(".output")!;

    if(a.length>=this.min&&a.length<=this.max){
      out.innerHTML="perfect"
     // alert("perfect");
    }
      else if(a.length===0){
        out.innerHTML="blank"
      //alert("blank");
      }
      else{
        out.innerHTML=this.m1
      //alert()
      }

//console.log(this.m1);

      
  }
m=new LoginComponent
m1=this.m.msgval;
min=this.m.minval;
max=this.m.maxval;




  constructor() {

    
   }

  ngOnInit(): void {
  }

}
