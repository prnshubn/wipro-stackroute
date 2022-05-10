import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { MasonryComponentModule } from 'masonry-component'
import { AppRoutingModule } from './app-routing.module'
import { AppComponent } from './app.component'

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, AppRoutingModule, MasonryComponentModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
