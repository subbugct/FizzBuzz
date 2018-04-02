import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { WordGenResponse } from './model/WordGenResponse';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { map, switchMap, catchError } from 'rxjs/operators';


@Injectable()
export class WordgenService {

  private wordGenResponseSubject = new BehaviorSubject<WordGenResponse>(null);

  private wordGenServiceError = new BehaviorSubject<string>(null);

  public wordGenResponse$ = this.wordGenResponseSubject.asObservable();
  public wordGenServiceError$ = this.wordGenServiceError.asObservable();
  
  constructor(private http: HttpClient) { }


  getWord(input:string) {
    const queryParams = new HttpParams().set('val',input);
    return this.http.get<WordGenResponse>(environment.WORD_GEN_URL,{params:queryParams}).subscribe(
      (response) => { this.wordGenResponseSubject.next(response); 
      this.wordGenServiceError.next(null)},
      (error=> {
        this.wordGenResponseSubject.next(null);
        this.wordGenServiceError.next(error.message)})
  );
  }

  
}
