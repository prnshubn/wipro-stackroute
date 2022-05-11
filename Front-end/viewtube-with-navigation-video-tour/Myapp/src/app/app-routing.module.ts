import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';
import { AuthGuard } from './guards/auth.guard';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { LiveComponent } from './studio/live/live.component';
import { UploadComponent } from './studio/upload/upload.component';
import { VideoContentComponent } from './video-content/video-content.component';

const routes:Routes=[
  {path: 'studio/upload',component:UploadComponent, canActivate:[AuthGuard]},
  {path:'',component:VideoContentComponent},
  {path:'studio/live',component:LiveComponent, canActivate:[AuthGuard]},
  {path: 'login', component:LoginComponent},
  {path: 'register', component:RegisterComponent}
];
@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }