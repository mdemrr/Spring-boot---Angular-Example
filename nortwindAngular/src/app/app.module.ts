import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponent } from './components/product/product.component';

import {ProductService} from "./services/product.service";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule
  ],
  providers: [
   // ProductService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
