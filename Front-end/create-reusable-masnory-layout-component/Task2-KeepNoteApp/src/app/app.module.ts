import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { CommonModule } from '@angular/common'
import { AppComponent } from './app.component'
import { MasonryComponentModule } from '@aquibazhar/masonry-component'
import { AddNoteComponent } from './components/add-note/add-note.component'
import { FormsModule } from '@angular/forms'

@NgModule({
  declarations: [AppComponent, AddNoteComponent],
  imports: [BrowserModule, MasonryComponentModule, CommonModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
