import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';
import { LiveComponent } from './studio/live/live.component';
import { UploadComponent } from './studio/upload/upload.component';
import { VideoContentComponent } from './video-content/video-content.component';

const routes:Routes=[
  {path: 'studio/upload',component:UploadComponent},
  {path:'',component:VideoContentComponent},
  {path:'studio/live',component:LiveComponent},
];
@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }