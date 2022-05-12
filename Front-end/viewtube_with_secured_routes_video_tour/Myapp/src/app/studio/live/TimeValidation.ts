import { AbstractControl } from "@angular/forms";

export function TimeValidation(control:AbstractControl):{[key:string]:boolean}|null{
    const startDate=control.get('startDate');
    const endDate=control.get('endDate');
    console.log(startDate);
    return (startDate?.value<endDate?.value)?{'StartDateIsMore':true}:null;
    
}