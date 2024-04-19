import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaComponent } from './lista.component';

describe('ListaComponent', () => {
  let component: ListaComponent;
  let fixture: ComponentFixture<ListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('Debe renderizar 1 como posicion', async() => {
    component.carreras = [{
      posicion: 1,
      numero: 10,
      piloto: 'Pilot Test',
      auto: 'Test Car',
      vueltas: 5,
      tiempo: '12:50',
      grandPrix: 'Test Race',
    }];
    fixture.detectChanges();
  
    const compiled = fixture.debugElement.nativeElement;
    const posi = compiled.querySelector('tbody tr:first-child td:first-child');
    expect(posi.textContent).toContain('1');
  })
});
