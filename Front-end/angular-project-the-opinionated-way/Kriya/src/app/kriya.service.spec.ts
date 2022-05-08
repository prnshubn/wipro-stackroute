import { TestBed } from '@angular/core/testing';

import { KriyaService } from './kriya.service';

describe('KriyaService', () => {
  let service: KriyaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(KriyaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
