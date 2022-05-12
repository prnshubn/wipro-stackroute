import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { VideoContentComponent } from './video-content/video-content.component';
import { ChipsBarComponent } from './chips-bar/chips-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material/material.module';
import { HeaderComponent } from './header/header.component';


@NgModule({
  declarations: [
    AppComponent,
    VideoContentComponent,
    ChipsBarComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,MaterialModule    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
