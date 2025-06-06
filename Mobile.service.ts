import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // HttpClient for making requests
import { Observable } from 'rxjs'; // Observable for asynchronous calls

@Injectable({
  providedIn: 'root'
})
export class MobileService {
  private apiUrl = 'http://localhost:8080/api/mobiles'; // Your backend API URL

  constructor(private http: HttpClient) {}

  // Function to get mobile data from the API
  getMobiles(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
