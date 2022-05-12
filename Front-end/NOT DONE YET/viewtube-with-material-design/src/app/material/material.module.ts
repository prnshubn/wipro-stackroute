import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatSliderModule } from '@angular/material/slider';
import {MatChipsModule} from '@angular/material/chips';
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatToolbarModule} from '@angular/material/toolbar'
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import {MatRippleModule} from '@angular/material/core';
import {MatBadgeModule} from '@angular/material/badge';

const MaterialComponents=[
  MatSliderModule,
  MatChipsModule,
  MatCardModule,
  MatGridListModule,
  MatToolbarModule,
  MatIconModule,
  MatInputModule,
  MatTooltipModule,
  MatSidenavModule,
  MatListModule,
  MatRippleModule,
  MatBadgeModule
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ],
  exports:[MaterialComponents]
})
export class MaterialModule { }
