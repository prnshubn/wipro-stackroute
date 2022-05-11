import { Component, Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanDeactivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { EditMetricsFormComponent } from '../edit-metrics-form/edit-metrics-form.component';
import { MetricsFormComponent } from '../metrics-form/metrics-form.component';

@Injectable({
  providedIn: 'root'
})
export class UnsavedFormsGuard implements CanDeactivate<MetricsFormComponent|EditMetricsFormComponent> {
  canDeactivate(components : MetricsFormComponent|EditMetricsFormComponent){
    if(components.metricsForm.pristine==false)
        return window.confirm("Are you sure you want to quit ?");
    else
      return true;
  }
  
}
