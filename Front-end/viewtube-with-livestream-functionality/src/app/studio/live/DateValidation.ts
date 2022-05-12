// import { AbstractControl,NG_VALIDATORS,Validators } from "@angular/forms";
// import { Directive,Input } from "@angular/core";

// @Directive({
//     selector:'[isLessThanStartDate]',
//     providers:[{provide:NG_VALIDATORS,useExisting:'DateValidation',multi:true}]
// })

// export class DateValidation implements Validators{
//     @Input('isLessThanStartDate')shouldbeless:any;
//     validate(Control:AbstractControl):{[key:string]: any} | null{
    
//         const sDate=new Date(this.shouldbeless);
//         const eDate=new Date(Control.value);
//         return (sDate>eDate)?{'StartDateIsMore':true}:null;
//     }
// }






import { AbstractControl } from "@angular/forms";

export function DateValidation(control:AbstractControl):{[key:string]:boolean}|null{
    const startDate=control.get('startDate');
    const endDate=control.get('endDate');
    console.log(startDate);
    return (startDate?.value<endDate?.value)?{'StartDateIsMore':true}:null;
}


