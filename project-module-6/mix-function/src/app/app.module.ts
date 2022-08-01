import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserDetailComponent } from './component/user-detail/user-detail.component';
import { ServiceRequiredComponent } from './component/service-required/service-required.component';
import {HttpClientModule} from "@angular/common/http";
import { NotFoundErrComponent } from './component/not-found-err/not-found-err.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    UserDetailComponent,
    ServiceRequiredComponent,
    NotFoundErrComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
