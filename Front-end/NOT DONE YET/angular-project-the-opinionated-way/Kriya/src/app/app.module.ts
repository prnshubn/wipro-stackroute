import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BoardComponent } from './board/board.component';
import { ListComponent } from './list/list.component';
import { CardComponent } from './card/card.component';
import { FadeinDirective } from './fadein.directive';
import { FilterPipe } from './filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    BoardComponent,
    ListComponent,
    CardComponent,
    FadeinDirective,
    FilterPipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
