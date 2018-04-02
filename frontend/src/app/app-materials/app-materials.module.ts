import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule,MatInputModule,MatFormFieldModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
@NgModule({
  imports: [
    CommonModule,MatButtonModule,MatInputModule,MatFormFieldModule,NoopAnimationsModule
  ],
  exports: [MatButtonModule,MatInputModule,MatFormFieldModule,NoopAnimationsModule],
  declarations: []
})
export class AppMaterialsModule { }
