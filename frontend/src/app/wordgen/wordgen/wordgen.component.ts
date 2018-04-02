import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import { WordgenService } from '../wordgen.service';
import { Subscription } from 'rxjs/Subscription';
import { OnDestroy } from '@angular/core/src/metadata/lifecycle_hooks';
import { WordGenResponse } from '../model/WordGenResponse';
import { Observable } from 'rxjs/Observable';


@Component({
  selector: 'app-wordgen',
  templateUrl: './wordgen.component.html',
  styleUrls: ['./wordgen.component.css']
})
export class WordgenComponent implements OnDestroy {


  wordgenform:FormGroup;
  output$:Observable<WordGenResponse>;
  error$:Observable<string>;
  wordgenSubscription:Subscription;

  constructor(private wordgenService:WordgenService) {
    const  numericInputControl  = new FormControl('', [Validators.pattern(/^[0-9]*$/)]);
    this.wordgenform = new FormGroup({numericInput:numericInputControl});

    this.output$ = wordgenService.wordGenResponse$;
    this.error$= wordgenService.wordGenServiceError$;
   }



  getErrorMessage() {
    return this.wordgenform.get('numericInput').hasError('pattern') ? 'please enter only numeric value' : '';

  }

  get numericInput(){
    return this.wordgenform.get('numericInput');
  }
/**
  onChange(){
    this.output = '';
  }
*/
  onSubmit(){
    //this.output = '';
   this.wordgenSubscription = this.wordgenService.getWord(this.wordgenform.get('numericInput').value);
    //this.output = response.content;
   
  }

  ngOnDestroy(): void {
    this.wordgenSubscription.unsubscribe();
  }
}
