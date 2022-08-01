import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NotFoundErrComponent } from './not-found-err.component';

describe('NotFoundErrComponent', () => {
  let component: NotFoundErrComponent;
  let fixture: ComponentFixture<NotFoundErrComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NotFoundErrComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NotFoundErrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
