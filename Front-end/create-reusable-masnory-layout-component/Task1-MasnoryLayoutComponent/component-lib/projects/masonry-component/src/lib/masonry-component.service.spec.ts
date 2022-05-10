import { TestBed } from '@angular/core/testing';

import { MasonryComponentService } from './masonry-component.service';

describe('MasonryComponentService', () => {
  let service: MasonryComponentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MasonryComponentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
