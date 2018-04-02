import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WordgenComponent } from './wordgen.component';

describe('WordgenComponent', () => {
  let component: WordgenComponent;
  let fixture: ComponentFixture<WordgenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WordgenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WordgenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
