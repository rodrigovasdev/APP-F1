import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ServicioAppService } from './servicio-app.service';

describe('ServicioAppService', () => {
  let service: ServicioAppService;

  beforeEach(() => {
    TestBed.configureTestingModule({
    imports: [HttpClientTestingModule],

    });
    service = TestBed.inject(ServicioAppService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
