import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WordgenComponent } from './wordgen/wordgen.component';
import { AppMaterialsModule } from '../app-materials/app-materials.module';
import {ReactiveFormsModule} from '@angular/forms'
import {HttpClientModule} from '@angular/common/http';
import {WordgenService} from './wordgen.service';
@NgModule({
  imports: [
    CommonModule, AppMaterialsModule,ReactiveFormsModule,HttpClientModule
  ],
  exports:[WordgenComponent],
  declarations: [WordgenComponent],
  providers:[WordgenService]
})
export class WordgenModule { }
