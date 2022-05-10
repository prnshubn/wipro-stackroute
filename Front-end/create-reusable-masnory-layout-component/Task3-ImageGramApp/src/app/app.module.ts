import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { MasonryComponentModule } from '@aquibazhar/masonry-component'
import { AppComponent } from './app.component'

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, MasonryComponentModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
