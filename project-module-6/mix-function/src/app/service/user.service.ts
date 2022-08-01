import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  //SPRING BACK END
  ApiUrl_8080 = `${environment.API_URL_8080}`;

  constructor(private httpClient: HttpClient) {
  }

  saveUser(user: User): Observable<void> {
    return this.httpClient.post<void>(this.ApiUrl_8080 + '/create', user);
  }

  public findById(id: number): Observable<User> {
    return this.httpClient.get<User>(`${this.ApiUrl_8080}/${id}`);
  }
}
