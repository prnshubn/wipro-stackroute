import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EditMetricsFormComponent } from './edit-metrics-form/edit-metrics-form.component';
import { AuthGuard } from './guards/auth.guard';
import { UnsavedFormsGuard } from './guards/unsaved-forms.guard';
import { MetricsFormComponent } from './metrics-form/metrics-form.component';
import { TokenFormComponent } from './token-form/token-form.component';

const routes: Routes = [
  {
    path: "",
    component: DashboardComponent
  },
  {
    path: "token-form",
    component: TokenFormComponent
  },
  {
    path: "metrics-form",
    component: MetricsFormComponent, 
    canDeactivate:[UnsavedFormsGuard],
    canActivate:[AuthGuard],
  },
  {
    path: "edit-metrics/:id",
    component: EditMetricsFormComponent, 
    canDeactivate:[UnsavedFormsGuard],
    canActivate:[AuthGuard],
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
