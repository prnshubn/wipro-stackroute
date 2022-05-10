import { NgModule } from '@angular/core'
import { MasonryComponentComponent } from './masonry-component.component'
import { CommonModule } from '@angular/common'

@NgModule({
  declarations: [MasonryComponentComponent],
  imports: [CommonModule],
  exports: [MasonryComponentComponent],
})
export class MasonryComponentModule {}
