import { TestBed } from '@angular/core/testing';

import { UnsavedFormsGuard } from './unsaved-forms.guard';

describe('UnsavedFormsGuard', () => {
  let guard: UnsavedFormsGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(UnsavedFormsGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
