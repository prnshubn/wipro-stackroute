import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MasonryComponentComponent } from './masonry-component.component';

describe('MasonryComponentComponent', () => {
  let component: MasonryComponentComponent;
  let fixture: ComponentFixture<MasonryComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MasonryComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MasonryComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
