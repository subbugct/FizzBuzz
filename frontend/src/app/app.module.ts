import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { WordgenModule } from './wordgen/wordgen.module';



@NgModule({
  declarations: [
    AppComponent
    
  ],
  imports: [
    BrowserModule, WordgenModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
