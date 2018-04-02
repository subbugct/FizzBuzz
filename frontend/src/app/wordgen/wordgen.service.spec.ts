import { TestBed, inject } from '@angular/core/testing';

import { WordgenService } from './wordgen.service';

describe('WordgenService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [WordgenService]
    });
  });

  it('should be created', inject([WordgenService], (service: WordgenService) => {
    expect(service).toBeTruthy();
  }));
});
