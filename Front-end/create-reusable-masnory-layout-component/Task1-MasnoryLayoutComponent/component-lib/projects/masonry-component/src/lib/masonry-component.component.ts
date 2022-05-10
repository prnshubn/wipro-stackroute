import { Component, OnInit, Input } from '@angular/core'

@Component({
  selector: 'masonry-component',
  template: `
    <div
      [ngStyle]="{
        'width.%': totalWidth,
        'column-count': noOfColumns,
        'column-gap.px': gutter,
        'column-width.px': columnWidth
      }"
      class="container"
    >
      <ng-content></ng-content>
    </div>
  `,
  styles: [],
})
export class MasonryComponentComponent implements OnInit {
  constructor() {}
  @Input() noOfColumns!: number
  @Input() columnWidth!: number
  @Input() totalWidth!: number
  @Input() gutter!: number
  @Input() data!: any
  ngOnInit(): void {}
}
